package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ===");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        System.out.println("Department inserted successfully! New id: " + newDepartment.getId());

        System.out.println("=== TEST 2: department findById ===");
        System.out.println(departmentDao.findById(1));

        System.out.println("=== TEST 3: department update ===");
        Department department = departmentDao.findById(8);
        department.setName("Tools");
        departmentDao.update(department);
        System.out.println("Update completed!");
    }

}
