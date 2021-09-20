package lk.sliit.hotel.service.custom;

import com.sliit.KitchenMenuHotel.dto.kitchenDTO.MenusiteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KitchenMenusiteServices {

//    List<MenuSiteItem> findAllMenuSiteItems();
//
//    MenuSiteItem updateMenuSiteItem(int menusId, MenuSiteItem newMenusiteData);

    void addMenuSiteItem(MenusiteDTO menuSiteItem);

    void deleteMenuSiteItem(int menusId);

    List<MenusiteDTO> listAll();


    MenusiteDTO findHighestId();

    MenusiteDTO findFoodItemById(int itemId);
}
