package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        try{

            // Teste findById
            SellerDao sellerDao = DaoFactory.createSellerDao();
            Seller seller = sellerDao.findById(3);
            System.out.println(seller);

            System.out.println("-------------------");

            // Teste findByDepartment
            List<Seller> list = sellerDao.findByDepartment(new Department(1,"Computers"));
            for(Seller s : list){
                System.out.println(s);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
