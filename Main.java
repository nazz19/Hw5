public class Main  {
    public static void main(String[] args) {
        Jeans mangoJeans = new Jeans("Mango",2000d,27);
        Jeans maxmaJeans = new Jeans("Maxma",150d,26);
        Tshirt tshirt = new Tshirt("Tshirt",1000d);
       ClothesShop clothesShop = new ClothesShop();
       clothesShop.add(mangoJeans);
       clothesShop.add(maxmaJeans);
       clothesShop.add(tshirt);
       clothesShop.sell(mangoJeans);
       clothesShop.printAllProducts();
    }
}
