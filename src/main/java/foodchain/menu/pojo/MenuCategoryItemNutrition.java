package foodchain.menu.pojo;

public class MenuCategoryItemNutrition {
    private Integer categoryItemId;
    private String categoryItemName;
    private Float servingSize;
    private Float calories;
    private Float totalFat;
    private Float sodium;
    private Float carbohydrates;
    private Float protien;

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

}
