package foodchain.menu.pojo;;

public class MenuCategoriesItemsSet
{
    private Integer menuCategoryItemsSetSeq;
    private String menuCategoryName;
    private Integer categoryItemId;
    private String categoryItemName;

    public Integer getMenuCategoryItemsSetSeq() {
        return menuCategoryItemsSetSeq;
    }
    public void setMenuCategoryItemsSetSeq(Integer menuCategoryItemsSetSeq) {
        this.menuCategoryItemsSetSeq = menuCategoryItemsSetSeq;
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
