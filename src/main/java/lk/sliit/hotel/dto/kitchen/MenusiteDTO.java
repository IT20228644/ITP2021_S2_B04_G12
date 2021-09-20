package lk.sliit.hotel.dto.kitchen;

public class MenusiteDTO {

    private int menusId;

    private String menuname;
    private String menutype;
    private String typeitem;
    private String descrip;
    private double unitPrice;
    private String mpicture;


    public MenusiteDTO(int menusId, String menuname, String menutype, String typeitem, String descrip, double unitPrice, String mpicture) {
        this.setMenusId(menusId);
        this.setMenuname(menuname);
        this.setMenutype(menutype);
        this.setTypeitem(typeitem);
        this.setDescrip(descrip);
        this.setUnitPrice(unitPrice);
        this.setMpicture(mpicture);

    }

    public MenusiteDTO(int menusId) {
        this.setMenusId(menusId);
    }
    public MenusiteDTO(){

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

    public String getMpicture() {return mpicture;}

    public void setMpicture(String mpicture) {this.mpicture = mpicture;}

    public double getUnitPrice() {return unitPrice;}

    public void setUnitPrice(double unitPrice) {this.unitPrice = unitPrice;}

    @Override
    public String toString(){
        return "MenusiteDTO{" +
                "menusId" + menusId + '\'' +
                "menuname" + menuname + '\'' +
                "menutype" + menutype + '\'' +
                "typeitem" + typeitem + '\'' +
                "descrip" + descrip + '\'' +
                "mpicture" + mpicture + '\'' +
                "unitPrice" + unitPrice + '\'' +
                '}';



    }
}
