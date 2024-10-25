package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
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

            System.out.println("--------------------");

            // Teste findAll
            List<Seller> list2 = sellerDao.findAll();
            for(Seller s : list2){
                System.out.println(s);
            }

            System.out.println("-------------------");

            /*// Teste insert
            Seller s = new Seller(null,"Smad Cremes","smadcremes@gmail.com",new Date(2000,10,20),250.0,new Department(4,null));
            sellerDao.insert(s);
            System.out.println("novo id:" + s.getId());

            System.out.println("-------------------");*/

            // Teste update
            Seller s1 = sellerDao.findById(14);
            s1.setName("Joso Gomes");
            s1.setEmail("josogomes@gmail.com");
            sellerDao.update(s1);

            System.out.println("-------------------");

            // Teste delete
            sellerDao.deleteById(15);
            System.out.println("update completed");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
