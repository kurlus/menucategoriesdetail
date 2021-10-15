package foodchain.menu.pojo;

public class MenuCategoriesItemsDet {
    private String menuCategoryName;
    private Integer categoryItemId;
    private String categoryItemName;

    public MenuCategoriesItemsDet(){}

    public MenuCategoriesItemsDet(String menuCategoryName, Integer categoryItemId, String categoryItemName) {
        this.menuCategoryName = menuCategoryName;
        this.categoryItemId = categoryItemId;
        this.categoryItemName = categoryItemName;
    }

    public String getMenuCategoryName() {
        return menuCategoryName;
    }
    public void setMenuCategoryName(String menuCategoryName) {
        this.menuCategoryName = menuCategoryName;
    }
    public Integer getCategoryItemId() {
        return categoryItemId;
    }
    public void setCategoryItemId(Integer categoryItemId) {
        this.categoryItemId = categoryItemId;
    }
    public String getCategoryItemName() {
        return categoryItemName;
    }
    public void setCategoryItemName(String categoryItemName) {
        this.categoryItemName = categoryItemName;
    }
}
