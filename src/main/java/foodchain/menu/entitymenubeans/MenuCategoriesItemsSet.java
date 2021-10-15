package foodchain.menu.entitymenubeans;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="menu_category_items_set")
public class MenuCategoriesItemsSet {

    @Id
    @Column(name = "menu_category_items_set_seq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuCategoryItemsSetSeq;
    @Column(name = "menu_category_name")
    private String menuCategoryName;
    @Column(name = "cat_item_id")
    private Integer categoryItemId;
    @Column(name = "cat_item_name")
    private String categoryItemName;

    public MenuCategoriesItemsSet() {
    }

    public MenuCategoriesItemsSet(String menuCategoryName, Integer categoryItemId, String categoryItemName) {
        this.menuCategoryName = menuCategoryName;
        this.categoryItemId = categoryItemId;
        this.categoryItemName = categoryItemName;
    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuCategoriesItemsSet that = (MenuCategoriesItemsSet) o;
        return menuCategoryItemsSetSeq.equals(that.menuCategoryItemsSetSeq) &&
                menuCategoryName.equals(that.menuCategoryName) &&
                categoryItemId.equals(that.categoryItemId) &&
                categoryItemName.equals(that.categoryItemName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(menuCategoryItemsSetSeq, menuCategoryName, categoryItemId, categoryItemName);
    }

    @Override
    public String toString() {
        return "MenuCategoriesItemsSet{" +
                "menuCategoryItemsSetSeq=" + menuCategoryItemsSetSeq +
                ", menuCategoryName='" + menuCategoryName + '\'' +
                ", categoryItemId=" + categoryItemId +
                ", categoryItemName='" + categoryItemName + '\'' +
                '}';
    }
}
