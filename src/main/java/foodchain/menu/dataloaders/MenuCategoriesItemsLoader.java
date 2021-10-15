package foodchain.menu.dataloaders;

import java.util.List;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

public class MenuCategoriesItemsLoader {

    public void loadStaticMenuCategoriesItems(NamedParameterJdbcTemplate namedParameterJdbcTemplate, LoaderFileCSVData csvFileLoader) throws Exception{
        List batchInstances = null;
        List<String[]> lineTokens = null;
        String sql = " insert into menu_category_items(cat_item_name, menu_category_id, menu_catagory_name, item_price, signature_price, in_deal) values " +
                "(:categoryItemName, :menuCategoryId, :menuCatagoryName, :itemPrice, :signaturePrice, :inDeal) ";

        try (Stream<String> dataLines = Files.lines(Paths.get("C:\\Work\\mock-data\\subway-mock-data\\men-category_items_upload.csv"))) {
            lineTokens = dataLines.map(line -> line.split(",")).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        synchronized(csvFileLoader) {
            csvFileLoader.setLoaderType(LoaderTypes.MenuCategoriesItems.toString());
            csvFileLoader.setLoaderFiletokens(lineTokens);
            batchInstances = csvFileLoader.loadBatchData();
            SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(batchInstances.toArray());
            namedParameterJdbcTemplate.batchUpdate(sql, parameters);
        }
    }//eom

    public void loadStaticMenuCategoryItemNutrition(NamedParameterJdbcTemplate namedParameterJdbcTemplate, LoaderFileCSVData csvFileLoader) throws Exception{
        List batchInstances = null;
        List<String[]> lineTokens = null;
        String sql = " insert into menu_category_item_nutrition(cat_item_id, cat_item_name, serving_size, calories, total_fat, sodium, carbohydrates, protien) values " +
                "(:categoryItemId, :categoryItemName, :servingSize, :calories, :totalFat, :sodium, :carbohydrates, :protien) ";

        try (Stream<String> dataLines = Files.lines(Paths.get("C:\\Work\\mock-data\\subway-mock-data\\menu_category_item_nutrition_upload.csv"))) {
            lineTokens = dataLines.map(line -> line.split(",")).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        synchronized(csvFileLoader) {
            csvFileLoader.setLoaderType(LoaderTypes.MenuCategoryItemNutrition.toString());
            csvFileLoader.setLoaderFiletokens(lineTokens);
            batchInstances = csvFileLoader.loadBatchData();
            SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(batchInstances.toArray());
            namedParameterJdbcTemplate.batchUpdate(sql, parameters);
        }
    }

    public void loadStaticMenuCategoriesItemsSet(NamedParameterJdbcTemplate namedParameterJdbcTemplate, LoaderFileCSVData csvFileLoader) throws Exception{
        List batchInstances = null;
        List<String[]> lineTokens = null;
        String sql = " insert into menu_category_items_set(menu_category_name, cat_item_id, cat_item_name) values (:menuCategoryName, :categoryItemId, :categoryItemName)";

        try (Stream<String> dataLines = Files.lines(Paths.get("C:\\Work\\mock-data\\subway-mock-data\\men-category_item_set_upload.csv"))) {
            lineTokens = dataLines.map(line -> line.split(",")).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        synchronized(csvFileLoader) {
            csvFileLoader.setLoaderType(LoaderTypes.MenuCategoriesItemsSet.toString());
            csvFileLoader.setLoaderFiletokens(lineTokens);
            batchInstances = csvFileLoader.loadBatchData();
            SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(batchInstances.toArray());
            namedParameterJdbcTemplate.batchUpdate(sql, parameters);
        }
    }

    public void loadStaticMenuCategoriesItemsSetToppingTypes(NamedParameterJdbcTemplate namedParameterJdbcTemplate, LoaderFileCSVData csvFileLoader) throws Exception{
        List batchInstances = null;
        List<String[]> lineTokens = null;
        String sql = " insert into menu_category_items_set_topping_types(cat_item_topping_type, cat_item_topping_description) VALUES (:cat_item_topping_type, :cat_item_topping_description) ";

        try (Stream<String> dataLines = Files.lines(Paths.get("D:\\my-data\\java\\mock-data\\subway-mock-data\\menu_category_items_set_topping_types.csv"))) {
            lineTokens = dataLines.map(line -> line.split(",")).collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
        }

        synchronized(csvFileLoader) {
            csvFileLoader.setLoaderType(LoaderTypes.MenuCategoriesItemsSetToppingTypes.toString());
            csvFileLoader.setLoaderFiletokens(lineTokens);
            batchInstances = csvFileLoader.loadBatchData();
            SqlParameterSource[] parameters = SqlParameterSourceUtils.createBatch(batchInstances.toArray());
            namedParameterJdbcTemplate.batchUpdate(sql, parameters);
        }
    }


}
