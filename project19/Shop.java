package project19;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<String> assortment = new ArrayList();
    public Shop() {
        assortment.add("phone");
        assortment.add("TV");
        assortment.add("Headphones");
        assortment.add("Notebook");
        System.out.println("Assortment : "+assortment);
        System.out.println("To buy something, enter your name, Inn, and product index");
    }
    public void data(){
        System.out.println("Entre your Full Name : ");
        Scanner one = new Scanner(System.in);
        String text = one.nextLine();
        System.out.println("Entre your INN: ");
        Scanner two = new Scanner(System.in);
         String numb = two.nextLine();
         int num= Integer.parseInt(numb);
        int count =0;
        while(num!=0){
            count++;
            num/=10;
        }
        if(count==10){
            System.out.println("Correct!");
        }else{System.out.println("Not enough numbers");}

    }
    public void buy(){
        System.out.println(" enter product index: ");
        Scanner four = new Scanner(System.in);
       String ind = four.nextLine();
        int index= Integer.parseInt(ind);
        assortment.remove(index - 1);
        System.out.println("Purchase is complete!");
        System.out.println("Assortment : "+assortment);

    }
}