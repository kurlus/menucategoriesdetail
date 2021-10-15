package foodchain.menu.entitymenubeans;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "menu_category_item_nutrition")
public class MenuCategoryItemNutrition
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "menu_category_nutrition_id")
    private Integer menuCategoryNutId;
    @Column(name="cat_item_id")
    private Integer categoryItemId;
    @Column(name="cat_item_name")
    private String categoryItemName;
    @Column(name="serving_size")
    private Float servingSize;
    @Column(name="calories")
    private Float calories;
    @Column(name="total_fat")
    private Float totalFat;
    @Column(name="sodium")
    private Float sodium;
    @Column(name="carbohydrates")
    private Float carbohydrates;
    @Column(name="protien")
    private Float protien;

    public Integer getMenuCategoryNutId() {
        return menuCategoryNutId;
    }
    public void setMenuCategoryNutId(Integer menuCategoryNutId) {
        this.menuCategoryNutId = menuCategoryNutId;
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
    public Float getServingSize() {
        return servingSize;
    }
    public void setServingSize(Float servingSize) {
        this.servingSize = servingSize;
    }
    public Float getCalories() {
        return calories;
    }
    public void setCalories(Float calories) {
        this.calories = calories;
    }
    public Float getTotalFat() {
        return totalFat;
    }
    public void setTotalFat(Float totalFat) {
        this.totalFat = totalFat;
    }
    public Float getSodium() {
        return sodium;
    }
    public void setSodium(Float sodium) {
        this.sodium = sodium;
    }
    public Float getCarbohydrates() {
        return carbohydrates;
    }
    public void setCarbohydrates(Float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
    public Float getProtien() {
        return protien;
    }
    public void setProtien(Float protien) {
        this.protien = protien;
    }

    public MenuCategoryItemNutrition(){
    }
    public MenuCategoryItemNutrition(Integer categoryItemId, String categoryItemName, Float servingSize, Float calories, Float totalFat, Float sodium, Float carbohydrates, Float protien) {
        this.categoryItemId = categoryItemId;
        this.categoryItemName = categoryItemName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.totalFat = totalFat;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.protien = protien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuCategoryItemNutrition that = (MenuCategoryItemNutrition) o;
        return categoryItemId.equals(that.categoryItemId) &&
                categoryItemName.equals(that.categoryItemName) &&
                Objects.equals(servingSize, that.servingSize) &&
                Objects.equals(calories, that.calories) &&
                Objects.equals(totalFat, that.totalFat) &&
                Objects.equals(sodium, that.sodium) &&
                Objects.equals(carbohydrates, that.carbohydrates) &&
                Objects.equals(protien, that.protien);
    }
    @Override
    public int hashCode() {
        return Objects.hash(categoryItemId, categoryItemName, servingSize, calories, totalFat, sodium, carbohydrates, protien);
    }
    @Override
    public String toString() {
        return "MenuCategoryItemNutrition{" +
                "menuCategoryNutId=" + menuCategoryNutId +
                ", categoryItemId=" + categoryItemId +
                ", categoryItemName='" + categoryItemName + '\'' +
                ", servingSize=" + servingSize +
                ", calories=" + calories +
                ", totalFat=" + totalFat +
                ", sodium=" + sodium +
                ", carbohydrates=" + carbohydrates +
                ", protien=" + protien +
                '}';
    }

}
