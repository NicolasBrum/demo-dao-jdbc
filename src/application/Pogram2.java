package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Pogram2 {
    public static void main(String[] args) {
        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        // Teste findById
        Department dep = depDao.findById(9);
        System.out.println(dep);

        System.out.println("---------------");

        // Teste findAll
        List<Department> deps = depDao.findAll();
        for (Department d : deps) {
            System.out.println(d);
        }

        System.out.println("---------------");

        // Teste deleteById
        depDao.deleteById(5);

        System.out.println("---------------");

        // Teste update
        Department dep2 = depDao.findById(10);
        if (dep2 != null) {
            dep2.setName("Songs");
            depDao.update(dep2);
        }

        System.out.println("---------------");

        // Teste insert
        Department dep3 = new Department(null,"Songs");
        depDao.insert(dep3);
    }
}
