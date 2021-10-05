package lk.sliit.hotel.entity.kitchen;

import lk.sliit.hotel.entity.restaurant.onlineOrder.RestaurantOnlineOrderDetails;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class MenuSiteItem {

    @Id
    private int menusId;


    private String menuname;

    private String menutype;

    private String typeitem;

    private String descrip;

    private double unitPrice;

    private String mpicture;

    @OneToMany(mappedBy = "foodItem", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    private List<RestaurantOnlineOrderDetails> restaurantOnlineOrderDetails = new ArrayList<>();


    public MenuSiteItem(int menusId, String menuname, String menutype, String typeitem, String descrip, double unitPrice, String mpicture) {
        this.menusId = menusId;
        this.menuname = menuname;
        this.menutype = menutype;
        this.typeitem = typeitem;
        this.descrip = descrip;
        this.unitPrice = unitPrice;
        this.mpicture = mpicture;
    }
    public MenuSiteItem(){

    }

    public int getMenusId() {return menusId;}

    public void setMenusId(int menusId) {this.menusId = menusId;}

    public String getMenuname() {return menuname;}

    public void setMenuname(String menuname) {this.menuname = menuname;}

    public String getMenutype() {return menutype;}

    public void setMenutype(String menutype) {this.menutype = menutype;}

    public String getTypeitem() {return typeitem;}

    public void setTypeitem(String typeitem) {this.typeitem = typeitem;}

    public String getDescrip() {return descrip;}

    public void setDescrip(String descrip) {this.descrip = descrip;}

    public double getUnitPrice() {return unitPrice;}

    public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}

    public String getMpicture() {return mpicture;}

    public void setMpicture(String mpicture) {this.mpicture = mpicture;}
}
