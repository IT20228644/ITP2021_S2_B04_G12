package lk.sliit.hotel.controller.kitchenController;



import lk.sliit.hotel.dto.kitchen.MenusiteDTO;
import lk.sliit.hotel.entity.kitchen.MenuSiteItem;
import lk.sliit.hotel.service.custom.KitchenMenusiteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class KitchenMenusiteController {

    @Autowired
    KitchenMenusiteServices kitchenMenusiteServices;

    //Show menusiteNewdata form page
    @GetMapping("/kitchenMenusite")
    public String showMenusiteForm(Model model){
        MenuSiteItem menuSiteItem = new MenuSiteItem();
        MenusiteDTO menusiteDTO = new MenusiteDTO();
        model.addAttribute("MenuItem",menuSiteItem);
        model.addAttribute("menusiteDTO", menusiteDTO);
        model.addAttribute("menuSiteMenuType", KitchenUtil.menuSiteMenuType);
        return "kitchenMenusite";
    }

    //view home page
    @GetMapping("/kitchenMenusiteShow")
    public String viewMenenusiteShowPage(Model model){
        List<MenusiteDTO> menuItem = kitchenMenusiteServices.listAll();
        model.addAttribute("MenuItem", menuItem);
        return "kitchenMenusiteShow";
    }

    //Add MenuSiteItem
    @PostMapping("/kitchenMenusiteShow")
    public String addNew(Model model, @ModelAttribute MenusiteDTO foodItemDTO) {

        try {
            MenusiteDTO foodItemDTO2 = kitchenMenusiteServices.findHighestId();
            MenusiteDTO foodItemDTO1 = null;
            try {
                foodItemDTO1 = kitchenMenusiteServices.findFoodItemById(foodItemDTO.getMenusId());
            }catch (NullPointerException d){
                int maxId = (foodItemDTO2.getMenusId());
                if (foodItemDTO.getMenusId()==(maxId)) {
                    foodItemDTO.setMenusId((maxId));
                } else {
                    maxId++;
                    foodItemDTO.setMenusId((maxId));
                }
            }
        } catch (NullPointerException e){
            foodItemDTO.setMenusId(1);
        }

//        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        kitchenMenusiteServices.addMenuSiteItem(foodItemDTO);
        return "redirect:/kitchenMenusiteShow";
    }






//    //update MenuSiteItem
//    @RequestMapping(method = RequestMethod.PUT, value = "/menusiteItems/{menusId}")
//    public void updateMenusiteItem(@PathVariable int menusId,@RequestBody MenuSiteItem menuSiteItem)
//    {
//        kitchenMenusiteServices.updateMenuSiteItem(menusId,menuSiteItem);
//    }

//    //Delete MenusiteItems
//
//    public void DeleteMenusiteItem(@PathVariable int menusId) {
//        kitchenMenusiteServices.deleteMenusiteItem(menusId);
//    }

    @GetMapping("/delete/{menusId}")
    public String deleteProduct(@PathVariable(name = "menusId") int menusId) {
        kitchenMenusiteServices.deleteMenuSiteItem(menusId);
        return "redirect:/kitchenMenusiteShow";
    }






//    //create MenusiteItems
//    @PostMapping("/add")
//    public MenuSiteItem createMenuSiteItem(@RequestBody MenuSiteItem MenuSitedata){
//        return ktchensiteReposatary.save(MenuSitedata);
//    }
//    //get MenusiteItem by id
//    @GetMapping("/getid/{menusId}")
//    public ResponseEntity<MenuSiteItem> getMenusiteItemById(value="menusId")Integer menusId{
//
//    }
//
//    @PutMapping("/update")
//    public String updateUser(@RequestBody MenuSiteItem newMenusiteData){
//        return kitchenMenusiteServices.updateMenusiteItem(newMenusiteData);

    }



