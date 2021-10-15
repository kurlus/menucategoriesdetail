package foodchain.menu.entitymenubeans;

import java.util.Objects;
import java.io.Serializable;

public class CategoryItemsEmbeddableKey implements Serializable
{
    private Integer categoryItemId;
    private String categoryItemName;

    public CategoryItemsEmbeddableKey(){
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
        CategoryItemsEmbeddableKey that = (CategoryItemsEmbeddableKey) o;
        return Objects.equals(categoryItemId, that.categoryItemId) &&
                Objects.equals(categoryItemName, that.categoryItemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryItemId, categoryItemName);
    }

    @Override
    public String toString() {
        return "CategoryItemsEmbeddableKey{" +
                "categoryItemId=" + categoryItemId +
                ", categoryItemName='" + categoryItemName + '\'' +
                '}';
    }

}
