package jDBCTemplate;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static java.lang.System.out;

public class jDBCShould {
    @Test
    void name() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("jDBCContext.xml");

        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");

        /*
        int status=dao.saveEmployee(new Employee(103,"Amit",35000));
        out.println(status);

        Boolean result = dao.saveEmployeeByPreparedStatement(new Employee(108, "Amit", 35000));
        out.println(result);
        */

        /*
        int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
        System.out.println(status);
        */

        /*
        Employee e=new Employee();
        e.setId(102);
        int status=dao.deleteEmployee(e);
        System.out.println(status);
        */

        List<Employee> list01=dao.getAllEmployees();
        for(Employee employee01:list01)
            out.println(employee01);
        /*
        List<Employee> list02=dao.getAllEmployeesRowMapper();
        for(Employee employee02:list02)
            System.out.println(employee02);
         */

        //EmpDAO ndao=(EmpDAO)ctx.getBean("nedao");
        //ndao.saveEmployee(new Employee(23,"sonoo",50000));
    }

}

