package magaz;

import magaz.sportgoods_.Boots;
import magaz.sportgoods_.Dress;

/**
 * Created by java on 19.01.2018.
 */
public class MagazRunner {
    private static Boots booots;//создаем экземпляр обуви
    private static Boots boootsBig2;
    private static Dress dress;
    private static Shop shop;
    public static void main(String[] args) {
       // Shop shop = new Shop();
    shop=new Shop();
        Boots anotherBoots=new Boots(12,"Carval",12)

//        Boots booots=new Boots(23,"Nike",100);//создаем экземпляр обуви
//        Boots boootsBig2=new Boots(15,"AlexBoots",50);
//        Dress dress = new Dress(15,"Bershka",95);

//        shop.setDress(dress);
//        shop.setSportBoots(booots);
//        shop.setSportBoots(boootsBig2);
//        //перезаписало цену бутс
        initGoods(anotherBoots,dress);//method for three object
      //  System.out.println(booots.getBrend());
        addBootsToTheShop(shop, booots, dress);


//        System.out.println(shop.getSportBoots().getPrice());//смотрим цену обуви в магазине/
//        System.out.println(boootsBig2.getPrice());//смотрим просто цену 2
//        System.out.println(shop.getSportBoots().getPrice());
//        System.out.println(shop.getSportBoots().getBrend()+"  , size is"+shop.getSportBoots().getSize());
//        System.out.println(shop.getSportBoots().getBrend()+"  , dress brand"+shop.getDress().getBrend());


    }

    private static void initGoods(Boots b,Dress dr) {
        booots = new Boots(23, "Nike", 100);//создаем экземпляр обуви
        boootsBig2 = new Boots(15, "AlexBoots", 50);
        dress = new Dress(15, "Bershka", 95);
    }

    private static void addBootsToTheShop(Shop shop, Boots booots, Dress dress) {
        if (shop != null) {
            if (booots != null && dress != null){
                shop.setDress(dress);
                shop.setSportBoots(booots);
                System.out.println(shop.getSportBoots().getBrend());//выводит только если шоп создан
        }
    }
}
}
