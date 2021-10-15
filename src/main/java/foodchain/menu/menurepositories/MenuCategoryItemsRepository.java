package foodchain.menu.menurepositories;

import foodchain.menu.entitymenubeans.MenuCategoryItems;
import foodchain.menu.entitymenubeans.CategoryItemsEmbeddableKey;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MenuCategoryItemsRepository extends JpaRepository<MenuCategoryItems, CategoryItemsEmbeddableKey>
{
}
