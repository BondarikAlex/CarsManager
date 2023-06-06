public class Main {
    public static void main(String[] args) {
        System.out.println( "Show list car : "+ManagerCar.add11Car().toString());
        System.out.println("High prise "+ManagerCar.highPrice(ManagerCar.getCarsList()));
        System.out.println("Low prise "+ManagerCar.lowPrice(ManagerCar.getCarsList(),ManagerCar.getCar().getPrice()));
        System.out.println("Search brand ! ");
        System.out.println(ManagerCar.findBrandCar(ManagerCar.getCarsList(),"BMW"));
        ManagerCar.clearArrayList(ManagerCar.getSearchCarsList());
        System.out.println(ManagerCar.priceRange(ManagerCar.getCarsList(),0d,10000d));
        System.out.println("Sort Price of Cars"+ManagerCar.sortPrice(ManagerCar.getCarsList()));
        System.out.println("Sort Brand of Cars"+ManagerCar.sortBrand(ManagerCar.getCarsList()));

    }
}
