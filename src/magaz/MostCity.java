package magaz;

/**
 * Created by java on 23.01.2018.
 */
public class MostCity {
    private int shopCountInShoMass = 10;
    private Shop[] shopMass;



    public MostCity() {
        this.shopMass = new Shop[shopCountInShoMass];//создаем магазин
    }

    


    public Shop[] getShopMass() {
        return shopMass;
    }

    public void setShopMass(Shop[] shopMass) {
        this.shopMass = shopMass;
    }


    public void addShopToShopMass(Shop shop) {
        for (int i=0;i< shopMass.length;i++) {//идем по массиву и добавляем магазин в пустое место
            if (shopMass[i]==null) {
              //  System.out.println("Adding");
                shopMass[i] = shop;
                break;
            }
        }

    }

    public void showAllShops() {
        for (Shop shop : this.shopMass) {
            if (shop != null) {
                System.out.println(shop.getName());
            }
        }
    }

    public void showOneShop(Shop shop){//берем магазин
        for(Shop sh:this.shopMass){
            if(sh!=null&&sh==shop){
                System.out.println(sh.getName());
            }
        }
    }

    public void showOneShop(String name){//берем магазин
        for(Shop sh:this.shopMass){
            if(sh!=null&&sh.getName()==name){
                System.out.println(sh.getName());
            }
        }
    }







}
