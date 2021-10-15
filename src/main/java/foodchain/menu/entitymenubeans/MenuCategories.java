package foodchain.menu.entitymenubeans;

import javax.persistence.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;
import java.io.Externalizable;

@Entity(name="menu_categories")
public class MenuCategories implements Externalizable
{
    @Column(name="menu_category_id")
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer menuCategoryId;
    @Column(name="menu_category_name", unique = true)
    private String menuCategoryName;
    @Column(name="description")
    private String menuDescription;

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

    public String getMenuDescription() {
        return menuDescription;
    }
    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(menuCategoryId);
        out.writeObject(menuCategoryName);
        out.writeObject(menuDescription);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        menuCategoryId = in.readInt();
        menuCategoryName = (String) in.readObject();
        menuDescription = (String) in.readObject();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuCategories that = (MenuCategories) o;
        return Objects.equals(menuCategoryId, that.menuCategoryId) &&
                Objects.equals(menuCategoryName, that.menuCategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuCategoryId, menuCategoryName);
    }

    @Override
    public String toString() {
        return "MenuCategories{" +
                "menuCategoryId=" + menuCategoryId +
                ", menuCategoryName='" + menuCategoryName + '\'' +
                ", menuDescription='" + menuDescription + '\'' +
                '}';
    }

}
