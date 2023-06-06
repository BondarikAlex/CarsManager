import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCar {
    private static ArrayList<Car> carsList = new ArrayList<>();
    private static ArrayList<Car> searchCarsList = new ArrayList<>();
    private static ArrayList<Car> sortCarsList = new ArrayList<>();
    private static Car car;

    public static ArrayList<Car> sortBrand(ArrayList<Car> list) {
        Car tempBrand;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < (list.size() - 1); j++) {
                if (list.get(j).getBrand().charAt(0) < list.get(j - 1).getBrand().charAt(0)) {
                    tempBrand = list.get(j - 1);//0
                    list.remove(j-1);
                    list.add(j-1,list.get(j));
                    list.remove(j);
                    list.add(j,tempBrand);
                }
            }

        }
        return list;
    }
    public static ArrayList<Car> sortPrice(ArrayList<Car> list) {
        Double tempPrice;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < (list.size() - 1); j++) {
                if (list.get(j).getPrice() < list.get(j - 1).getPrice()) {
                    tempPrice = list.get(j - 1).getPrice();//0
                    list.get(j - 1).setPrice(list.get(j).getPrice());
                    list.get(j).setPrice(tempPrice);
                }
            }

        }
        return list;
    }

    public static ArrayList<Car> priceRange(ArrayList<Car> list, Double aPoint, Double bPoint) {
        if (aPoint > bPoint) {
            Double temp = aPoint;
            aPoint = bPoint;
            bPoint = temp;
        }
        for (Car el : list
        ) {
            if (el.getPrice() > aPoint && el.getPrice() < bPoint) {
                searchCarsList.add(el);
            }

        }
        return searchCarsList;
    }

    public static void clearArrayList(ArrayList<Car> list) {
        list.clear();
        if (list.isEmpty()) {
            System.out.println("list of clear");
        }
    }

    public static ArrayList<Car> findBrandCar(ArrayList<Car> list, String findBrand) {
        for (Car el : list
        ) {
            if (el.getBrand().equals(findBrand)) {
                searchCarsList.add(el);
            }
        }
        return searchCarsList;
    }

    public static Car lowPrice(ArrayList<Car> list, Double carHighPrice) {
        for (Car el : list) {
            if (el.getPrice() < carHighPrice) {
                car = el;
                carHighPrice = el.getPrice();
            }
        }
        return car;
    }

    public static Car highPrice(ArrayList<Car> list) {
        for (Car el : list) {
            if (el.getPrice() > 0) {
                car = el;
            }
        }
        return car;
    }

    public static ArrayList<Car> add11Car() {
        carsList.add(new Car("BMW", "e34", 1996, 5000));
        carsList.add(new Car("BMW", "i8", 2014, 140000));
        carsList.add(new Car("BMW", "x5 f15", 2015, 70000));
        carsList.add(new Car("Volvo", "xc60", 2019, 90000));
        carsList.add(new Car("Volvo", "xc90", 2019, 80000));
        carsList.add(new Car("Volvo", "v70", 1998, 7000));
        carsList.add(new Car("Ford", "f250", 2012, 40000));
        carsList.add(new Car("Ford", "Puma", 1998, 6000));
        carsList.add(new Car("Geely", "Okavango", 2022, 70000));
        carsList.add(new Car("Audi", "100", 1992, 5000));
        carsList.add(new Car("Bentley", "Bentayga 1", 2019, 320000));
        return carsList;
    }

    public static ArrayList<Car> getCarsList() {
        return carsList;
    }

    public static ArrayList<Car> getSearchCarsList() {
        return searchCarsList;
    }

    public static Car getCar() {
        return car;
    }


}
