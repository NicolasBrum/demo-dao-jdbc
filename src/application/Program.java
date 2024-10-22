package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"books");
        System.out.println(obj);

        Seller s = new Seller(20,"nicolas","nickormy@gmail.com",new Date(2024,5,19),200.0,obj);
        System.out.println(s);
    }
}
