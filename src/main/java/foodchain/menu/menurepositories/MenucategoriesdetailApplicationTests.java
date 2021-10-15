package foodchain.menu.menurepositories;

import foodchain.menu.configuration.PersistenceJPAConfig;
import foodchain.menu.dataloaders.LoaderFileCSVData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest
@ContextConfiguration(classes = PersistenceJPAConfig.class)
//@ComponentScan({"foodchain.menu.configuration", "foodchain.menu.menucategoriesdetail", "foodchain.menu.entitymenubeans"})
//@EnableJpaRepositories("foodchain.menu.menurepositories")
public class MenucategoriesdetailApplicationTests {

    @Autowired
    LoaderFileCSVData csvFileLoader;
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    MenuCategoryItemsRepository menuCategoryItemsRepository;

    Logger log = LoggerFactory.getLogger(MenucategoriesdetailApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @BeforeAll
    static void initAll(){
        System.out.println(" Testing MenuCategoryItemsRepository ........");
    }

    @Test
    public void menuCategoryItemsRepfindAllTest(){
        int size = menuCategoryItemsRepository.findAll().size();
        log.info(String.valueOf("****"+size+"****"));
    }


}
