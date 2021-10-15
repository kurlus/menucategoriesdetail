package foodchain.menu.entitymenubeans;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "menu_category_items")
@Table(name = "menu_category_items")
@IdClass(CategoryItemsEmbeddableKey.class)
public class MenuCategoryItems {
    @Id
    @Column(name = "cat_item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryItemId;
    @Id
    @Column(name = "cat_item_name")
    private String categoryItemName;
    @Column(name = "menu_category_id")
    private Integer menuCategoryId;
    @Column(name = "menu_category_name")
    private String menuCategoryName;
    @Column(name = "item_price")
    private Float itemPrice;
    @Column(name = "signature_price")
    private Float signaturePrice;
    @Column(name = "item_extras_available")
    private Integer itemExtrasAvailable;
    @Column(name = "item_customizable")
    private Integer itemCustomizable;
    @Column(name = "item_in_deal")
    private Integer inDeal;
    @Column(name = "item_ingredient_desc")
    private String itemIngredientDesc;
    @Column(name = "item_description")
    private String itemDescription;
    @Column(name = "item_pic_name")
    private String itemPicName;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "menu_category_id",referencedColumnName = "menu_category_id",
                    updatable = false, insertable = false),
            @JoinColumn(name = "menu_category_name",referencedColumnName = "menu_category_name",
                    updatable = false, insertable = false)
    })
    @NotNull
    MenuCategories menuCategory;

    public MenuCategoryItems() {
    }

    public MenuCategoryItems(String categoryItemName, Integer menuCategoryId, String menuCategoryName,
                             Float itemPrice, Float signaturePrice, Integer itemExtrasAvailable, Integer itemCustomizable, Integer inDeal, String itemIngredientDesc, String itemDescription, String itemPicName) {
        this.categoryItemName = categoryItemName;
        this.menuCategoryId = menuCategoryId;
        this.menuCategoryName = menuCategoryName;
        this.itemPrice = itemPrice;
        this.signaturePrice = signaturePrice;
        this.itemExtrasAvailable = itemExtrasAvailable;
        this.itemCustomizable = itemCustomizable;
        this.inDeal = inDeal;
        this.itemIngredientDesc = itemIngredientDesc;
        this.itemDescription = itemDescription;
        this.itemPicName = itemPicName;
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
    public Integer getItemExtrasAvailable() {
        return itemExtrasAvailable;
    }
    public void setItemExtrasAvailable(Integer itemExtrasAvailable) {
        this.itemExtrasAvailable = itemExtrasAvailable;
    }
    public Integer getItemCustomizable() {
        return itemCustomizable;
    }
    public void setItemCustomizable(Integer itemCustomizable) {
        this.itemCustomizable = itemCustomizable;
    }
    public Integer getInDeal() {
        return inDeal;
    }
    public void setInDeal(Integer inDeal) {
        this.inDeal = inDeal;
    }
    public String getItemIngredientDesc() {
        return itemIngredientDesc;
    }
    public void setItemIngredientDesc(String itemIngredientDesc) {
        this.itemIngredientDesc = itemIngredientDesc;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public String getItemPicName() {
        return itemPicName;
    }
    public void setItemPicName(String itemPicName) {
        this.itemPicName = itemPicName;
    }
    public MenuCategories getMenuCategory() {
        return menuCategory;
    }
    public void setMenuCategory(MenuCategories menuCategory) {
        this.menuCategory = menuCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuCategoryItems that = (MenuCategoryItems) o;
        return categoryItemId.equals(that.categoryItemId) &&
                categoryItemName.equals(that.categoryItemName) &&
                menuCategoryId.equals(that.menuCategoryId) &&
                menuCategoryName.equals(that.menuCategoryName) &&
                Objects.equals(itemPrice, that.itemPrice) &&
                Objects.equals(signaturePrice, that.signaturePrice) &&
                Objects.equals(itemExtrasAvailable, that.itemExtrasAvailable) &&
                Objects.equals(itemCustomizable, that.itemCustomizable) &&
                Objects.equals(inDeal, that.inDeal) &&
                Objects.equals(itemIngredientDesc, that.itemIngredientDesc) &&
                Objects.equals(itemDescription, that.itemDescription) &&
                Objects.equals(itemPicName, that.itemPicName) &&
                menuCategory.equals(that.menuCategory);
    }
    @Override
    public int hashCode() {
        return Objects.hash(categoryItemId, categoryItemName, menuCategoryId, menuCategoryName, itemPrice, signaturePrice, itemExtrasAvailable, itemCustomizable, inDeal, itemIngredientDesc, itemDescription, itemPicName, menuCategory);
    }

    @Override
    public String toString() {
        return "MenuCategoryItems{" +
                "categoryItemId=" + categoryItemId +
                ", categoryItemName='" + categoryItemName + '\'' +
                ", menuCategoryId=" + menuCategoryId +
                ", menuCategoryName='" + menuCategoryName + '\'' +
                ", itemPrice=" + itemPrice +
                ", signaturePrice=" + signaturePrice +
                ", itemExtrasAvailable=" + itemExtrasAvailable +
                ", itemCustomizable=" + itemCustomizable +
                ", inDeal=" + inDeal +
                ", itemIngredientDesc='" + itemIngredientDesc + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPicName='" + itemPicName + '\'' +
                ", menuCategory=" + menuCategory +
                '}';
    }
}
