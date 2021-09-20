package lk.sliit.hotel.service.custom.impl;

import com.sliit.KitchenMenuHotel.dao.kitchen.KtchensiteReposatary;
import com.sliit.KitchenMenuHotel.dto.kitchenDTO.MenusiteDTO;
import com.sliit.KitchenMenuHotel.entity.MenuSiteItem;
import com.sliit.KitchenMenuHotel.services.KitchenMenusiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KitchenMenusiteServiceImpl implements KitchenMenusiteServices {

    @Autowired
    private KtchensiteReposatary ktchensiteReposatary;


//    @Override
//    public List<MenuSiteItem> findAllMenuSiteItems() {
//        //database search
//        //return all data of Kitchen Menu site Item
//        List<MenuSiteItem> allMenusiteItem = (List<MenuSiteItem>) ktchensiteReposatary.findAll();
//        return allMenusiteItem;
//    }
//
//    @Override
//    public MenuSiteItem updateMenuSiteItem(int menusId, MenuSiteItem newMenusiteData) {
//        return ktchensiteReposatary.save(newMenusiteData);
//    }


    @Override
    public void deleteMenuSiteItem(int menusId) {
        ktchensiteReposatary.delete(menusId);
    }

    @Override
    public List<MenusiteDTO> listAll() {
        Iterable<MenuSiteItem> menuSiteItems = ktchensiteReposatary.findAll();//call to crud repo
        List<MenusiteDTO> foodItemDTOList = new ArrayList<>();

        for (MenuSiteItem item : menuSiteItems) {
            foodItemDTOList.add(new MenusiteDTO(
                    item.getMenusId(),
                    item.getMenuname(),
                    item.getMenutype(),
                    item.getTypeitem(),
                    item.getDescrip(),
                    item.getUnitPrice(),
                    item.getMpicture()));
        }
        return foodItemDTOList;
    }




    @Override
    public void addMenuSiteItem(MenusiteDTO menusiteDTO) {
        ktchensiteReposatary.save(new MenuSiteItem
                (menusiteDTO.getMenusId(),
                        menusiteDTO.getMenuname(),
                        menusiteDTO.getMenutype(),
                        menusiteDTO.getTypeitem(),
                        menusiteDTO.getDescrip(),
                        menusiteDTO.getUnitPrice(),
                        menusiteDTO.getMpicture()));
    }

    @Override
    public MenusiteDTO findHighestId() {
        MenuSiteItem lastItem = null;
        try {
            lastItem = ktchensiteReposatary.findTopByOrderByMenusIdDesc();
        } catch (Exception e) {
        }
        return new MenusiteDTO(lastItem.getMenusId());
    }

    @Override
    public MenusiteDTO findFoodItemById(int itemId) {
        MenuSiteItem menuSiteItem= ktchensiteReposatary.findOne(itemId);
        MenusiteDTO menuDTO = new MenusiteDTO(menuSiteItem.getMenusId(),
                menuSiteItem.getMenuname(),
                menuSiteItem.getMenutype(),
                menuSiteItem.getTypeitem(),
                menuSiteItem.getDescrip(),
                menuSiteItem.getUnitPrice(),
                menuSiteItem.getMpicture());
        return menuDTO;
    }

}
