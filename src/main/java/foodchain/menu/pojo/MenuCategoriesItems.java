package foodchain.menu.pojo;

public class MenuCategoriesItems {

    private String categoryItemName;
    private Integer menuCategoryId;
    private String menuCategoryName;
    private Float itemPrice;
    private Float signaturePrice;
    private Integer inDeal;

    public MenuCategoriesItems() {
    }

    public MenuCategoriesItems(String categoryItemName, Integer menuCategoryId, String menuCategoryName, Float itemPrice, Float signaturePrice, Integer inDeal) {
        this.categoryItemName = categoryItemName;
        this.menuCategoryId = menuCategoryId;
        this.menuCategoryName = menuCategoryName;
        this.itemPrice = itemPrice;
        this.signaturePrice = signaturePrice;
        this.inDeal = inDeal;
    }

    public String getCategoryItemName() {
        return categoryItemName;
    }
    public void setCategoryItemName(String categoryItemName) {
        this.categoryItemName = categoryItemName;
    }
    public Integer getMenuCategoryId() {
        return menuCategoryId;
    }
    public void setMenuCategoryId(Integer menuCategoryId) {
        this.menuCategoryId = menuCategoryId;
    }
    public String getMenuCategoryName() {
        return menuCategoryName;
    }
    public void setMenuCategoryName(String menuCategoryName) {
        this.menuCategoryName = menuCategoryName;
    }
    public Float getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }
    public Float getSignaturePrice() {
        return signaturePrice;
    }
    public void setSignaturePrice(Float signaturePrice) {
        this.signaturePrice = signaturePrice;
    }
    public Integer getInDeal() {
        return inDeal;
    }
    public void setInDeal(Integer inDeal) {
        this.inDeal = inDeal;
    }}
