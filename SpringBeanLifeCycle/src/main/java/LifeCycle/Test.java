package LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentDao dao = context.getBean("dao",StudentDao.class);
        dao.selectAll();
        context.close();
        context.registerShutdownHook();// execute just before main method ends. So can be put above the usage of context as well.
    }
}
