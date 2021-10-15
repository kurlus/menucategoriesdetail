package foodchain.menu.dataloaders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import foodchain.menu.pojo.*;
import java.util.List;
import java.util.Vector;

public class LoaderFileCSVData {
    private String loaderType;
    private List<String[]> loaderFiletokens;

    private static Logger log = LoggerFactory.getLogger(LoaderFileCSVData.class);

    public LoaderFileCSVData() {
    }

    public List loadBatchData() throws Exception {
        List batchinstances = new Vector();
        if (this.loaderType.compareToIgnoreCase("MenuCategoriesItems") == 0) {
            for (String[] line : loaderFiletokens) {
                MenuCategoriesItems bean = new MenuCategoriesItems();

                bean.setCategoryItemName(line[0].trim());
                bean.setMenuCategoryId(Integer.valueOf(line[1].trim()));
                bean.setMenuCategoryName(line[2].trim());
                bean.setItemPrice(Float.valueOf(line[3].trim()));
                bean.setSignaturePrice(Float.valueOf(line[4].trim()));
                bean.setInDeal(Integer.valueOf(line[5].trim()));

                batchinstances.add(bean);
            }
        }
        else if (this.loaderType.compareToIgnoreCase("MenuCategoryItemNutrition") == 0){
            for (String[] line : loaderFiletokens) {
                MenuCategoryItemNutrition bean = new MenuCategoryItemNutrition();

                bean.setCategoryItemId(Integer.valueOf(line[0].trim()));
                bean.setCategoryItemName(line[1].trim());
                bean.setServingSize(Float.valueOf(line[2].trim()));
                bean.setCalories(Float.valueOf(line[3].trim()));
                bean.setTotalFat(Float.valueOf(line[4].trim()));
                bean.setSodium(Float.valueOf(line[5].trim()));
                bean.setCarbohydrates(Float.valueOf(line[6].trim()));
                bean.setProtien(Float.valueOf(line[7].trim()));

                batchinstances.add(bean);
            }
        }
        else if (this.loaderType.compareToIgnoreCase("MenuCategoriesItemsSet") == 0){
            for (String[] line : loaderFiletokens) {
                MenuCategoriesItemsSet bean = new MenuCategoriesItemsSet();

                bean.setMenuCategoryName(line[0].trim());
                bean.setCategoryItemId(Integer.valueOf(line[1].trim()));
                bean.setCategoryItemName(line[2].trim());

                batchinstances.add(bean);
            }
        }
        else if (this.loaderType.compareToIgnoreCase("MenuCategoriesItemsSetToppingTypes") == 0){
            for (String[] line : loaderFiletokens) {
                MenuCategoriesItemsSetToppingTypes bean = new MenuCategoriesItemsSetToppingTypes();

                bean.setCategoryItemToppingType(line[0].trim());
                bean.setCategoryItemToppingDesc(line[1].trim());

                batchinstances.add(bean);
            }
        }
        else {
            log.info(" No valid loader type found......");
        }

        return batchinstances;
    }

    public String getLoaderType() {
        return loaderType;
    }
    public void setLoaderType(String loaderType) {
        this.loaderType = loaderType;
    }
    public List<String[]> getLoaderFiletokens() {
        return loaderFiletokens;
    }
    public void setLoaderFiletokens(List<String[]> loaderFiletokens) {
        this.loaderFiletokens = loaderFiletokens;
    }
}
