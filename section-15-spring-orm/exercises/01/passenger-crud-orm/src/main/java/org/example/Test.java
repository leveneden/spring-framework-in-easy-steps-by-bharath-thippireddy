package org.example;

import org.example.dao.PassengerDao;
import org.example.entity.Passenger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            PassengerDao dao = springContext.getBean("simplePassengerDao", PassengerDao.class);

            dao.deleteAll();

            System.out.println("Creating Nashandra ...");
            Passenger nashandra = new Passenger().setId(1).setFirstName("Nashandra").setLastName("of Dark");
            dao.create(nashandra);
            System.out.println("Created " + dao.read(1));

            System.out.println("Creating Elana ...");
            Passenger elana = new Passenger().setId(2).setFirstName("Elana").setLastName("of Dark");
            dao.create(elana);
            System.out.println("Created " + dao.read(2));

            System.out.println("Creating Nadalia ...");
            Passenger nadalia = new Passenger().setId(3).setFirstName("Nadalia").setLastName("of Dark");
            dao.create(nadalia);
            System.out.println("Created " + dao.read(3));

            System.out.println("Creating Alsanna ...");
            Passenger alsana = new Passenger().setId(4).setFirstName("Alsanna").setLastName("of Dark");
            dao.create(alsana);
            System.out.println("Created " + dao.read(4));

            System.out.println("Creating Manus ...");
            Passenger manus = new Passenger().setId(5).setFirstName("Manus").setLastName("of Dark");
            dao.create(manus);
            System.out.println("Created " + dao.read(5));

            System.out.println("Fixing up Manus's Last name");
            manus.setLastName("of The Abyss");
            dao.update(manus);
            System.out.println("Updated " + dao.read(5));

            System.out.println("Creating Petrus ...");
            Passenger petrus = new Passenger().setId(6).setFirstName("Petrus").setLastName("of Thorolund");
            dao.create(petrus);
            System.out.println("Created " + dao.read(6));

            System.out.println("Discovering how Petrus really is ...");
            System.out.println("Killing Petrus ...");
            dao.delete(petrus);
            System.out.println("Petrus will enjoy his new life as a hollow");

            System.out.println("All of our remaining creatures:");
            for (Passenger passenger: dao.readAll()) {
                System.out.println("- " + passenger.getFirstName() + " " + passenger.getLastName());
            }
        }
    }
}
