package lk.sliit.hotel.dao.kitchenDAO;


import lk.sliit.hotel.entity.kitchen.MenuSiteItem;
import org.springframework.data.repository.CrudRepository;


public interface KtchensiteReposatary extends CrudRepository<MenuSiteItem, Integer> {

    MenuSiteItem findTopByOrderByMenusIdDesc();

    //get All menuItem
    //findById
    //delete
    //update
    //custom query


}
