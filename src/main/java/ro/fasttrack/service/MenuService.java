package ro.fasttrack.service;

import ro.fasttrack.domaine.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

public static void main(String[] args) throws IOException {

//        List<Product> orderList = new ArrayList<>();
        List<Product> menuItemList = new ArrayList<>();

        menuItemList.add(new Product("Coca-cola", 2.2,"carobonated"));
        menuItemList.add(new Product("Fanta", 2.3,"carobonated"));
        menuItemList.add(new Product("Cappy", 2.5,"carobonated"));

        System.out.println("   ");
        menuItemList.add(new Product("Espresso",3.3,"coffe from Columbia "));
        menuItemList.add(new Product("Cappuccino", 5.5,  "coffe from Egipt and milk natural"));
        menuItemList.add(new Product("Latte Macchiato", 4.4,  "coffe from USA and alomd milk"));


        System.out.println("   ");
        menuItemList.add(new Product("Stew meat", 12.3,  "let your mouth water"));
        menuItemList.add(new Product("Potatoes ", 56.5,  "let your mouth water"));
        menuItemList.add(new Product("Vegetarian food", 15.4,  "let your mouth water"));

        System.out.println("   ");
        menuItemList.add(new Product("Pancakes", 15.4, "very good"));
        menuItemList.add(new Product("Mix fruit", 17.4,  "very good"));
        menuItemList.add(new Product("Apple cake", 15.6, "very good"));


//        int userCommandKey = 0;
////        do {
////            System.out.println(" " +
////                    "1. Adauga Produs \n " +
////                    "2. Vizualizeaza comanda \n " +
////                    "3. Plaseaza comanda \n " +
////                    "4. Cheama ospatar \n " +
////                    "5. Cere Nota \n " +
////                    "6. Zona feedback \n " +
////                    "7. Exit");
////
//        userCommandKey = readInputValue();
//        switch (userCommandKey) {
//        case 1:
//        System.out.println("Alege produsul din meniu folosind numarul produsului");
////                    createOrder();
//        break;
//        case 2:
//        System.out.println("Comanda dumneavoastra:");
//        break;
//        case 3:
//        System.out.println("Plaseaza comnda");
//        break;
//        case 4:
//        System.out.println("Cheama ospatar");
//        break;
//        case 5:
//        System.out.println("Cere nota");
//        break;
//        case 6:
//        System.out.println("Zona de feeadback");
//        break;
//        }
////        } while (userCommandKey < 7);
//
//
       }
//
//public static int readInputValue() {
//        Scanner sc = new Scanner(System.in);
//        int numb = sc.nextInt();
//        return numb;
//        }

//    public static void createOrder() {
//        int menuItemID = 0;
//        do {
//            menuItemID = readInputValue();
//            switch (menuItemID) {
//                case 0:
//                    break;
//                default:
//                    if(menuItemList.get(menuItemID - 1).isPerQuantity()) {
//                        System.out.println("Adauga numarul de portii");
//                        int portions = readInputValue();
//                        Product product = menuItemList.get(menuItemID - 1);
//                        product.setPortions(portions);
//                        orderList.add(product);
////                         orderList.add(menuItemList.get(menuItemID - 1));
//
//                    } else {
//                        orderList.add(menuItemList.get(menuItemID - 1));
//                    }
//                    System.out.println("Adauga alt produs sau 0 ca sa te intorci la meniul anterior");
//                    break;
//            }
//        } while (menuItemID > 0);

}
