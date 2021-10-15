package foodchain.menu.configuration;

import java.util.Properties;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

import com.google.common.base.Preconditions;

import foodchain.menu.dataloaders.LoaderFileCSVData;

@Configuration
@EnableTransactionManagement
@ComponentScan({"foodchain.menu.configuration", "foodchain.menu.menucategoriesdetail", "foodchain.menu.entitymenubeans"})
@EnableJpaRepositories("foodchain.menu.menurepositories")
@PropertySource("classpath:application.properties")
public class PersistenceJPAConfig {
    @Autowired
    private Environment env;
    private static final Logger log = LoggerFactory.getLogger(PersistenceJPAConfig.class);

    @Bean
    @Qualifier("datasource")
    public DataSource appDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(Preconditions.checkNotNull(env.getProperty("spring.datasource.driver-class-name")));
        dataSource.setUrl(Preconditions.checkNotNull(env.getProperty("spring.datasource.url")));
        dataSource.setUsername(Preconditions.checkNotNull(env.getProperty("spring.datasource.username")));
        dataSource.setPassword(Preconditions.checkNotNull(env.getProperty("spring.datasource.password")));

        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier("datasource") DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan(new String[]{"foodchain.menu.configuration", "foodchain.menu.entitymenubeans", "foodchain.menu.menurepositories"});

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties());

        return em;
    }

    @Bean
    public PlatformTransactionManager transactionManager(@Qualifier("datasource") DataSource dataSource) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory(dataSource).getObject());
        return transactionManager;
    }

    @Bean
    @Scope("singleton")
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(@Qualifier("datasource") DataSource dataSource){
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    @Qualifier("csvFileLoader")
    public LoaderFileCSVData getLoaderFileCSVDataProcessor() {
        return new LoaderFileCSVData();
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTransalation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    Properties hibernateProperties() {
        final Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
        hibernateProperties.setProperty("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
        hibernateProperties.setProperty("hibernate.showsql", "true");
        hibernateProperties.setProperty("hibernate.format_sql", "true");

        return hibernateProperties;
    }

}
