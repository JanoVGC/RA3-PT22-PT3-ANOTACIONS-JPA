package es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.main;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Person;
import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Student;
import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Car;
import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Vehicle;
import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Plane;
import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Motorcycle;
import es.ilerna.M0486.ra3.pt22.pt3.anotacions.jpa.domain.Teacher;


public class Main {

    private static List<Person> people = new ArrayList<>();
    private static List<Vehicle> vehicles = new ArrayList<>();
    public static void main(String[] args) {

        Session session = null;
        Transaction transaction = null;
        Scanner sc = new Scanner(System.in);

        int opcio;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1) Fase 1: Crear dades de prova");
            System.out.println("2) Fase 2: Treure vehicles de persones");
            System.out.println("3) Fase 3: Actualitzar un vehicle");
            System.out.println("0) Sortir");
            System.out.print("Escull una opció: ");

            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    fase1();
                    break;
                case 2:
                    fase2();
                    break;
                case 3:
                    fase3();
                    break;
                case 0:
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Opció incorrecta.");
            }

        } while (opcio != 0);

        sc.close();

        HibernateSession.getSessionFactory().close();

    }

    private static void fase1() {

        Session session = HibernateSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {

            // Estudiants
            Student student_1 = new Student();
            student_1.setName("Anna");
            student_1.setSurname("Lopez");
            student_1.setPhoneNumber(111111111);
            student_1.setStudentCode("STU001");

            Student student_2 = new Student();
            student_2.setName("Jordi");
            student_2.setSurname("Martinez");
            student_2.setPhoneNumber(222222222);
            student_2.setStudentCode("STU002");

            Student student_3 = new Student();
            student_3.setName("Clara");
            student_3.setSurname("Sanchez");
            student_3.setPhoneNumber(333333333);
            student_3.setStudentCode("STU003");


            // profes
            Teacher teacher_1 = new Teacher();
            teacher_1.setName("Joan");
            teacher_1.setSurname("Perez");
            teacher_1.setPhoneNumber(444444444);
            teacher_1.setTeacherCode("TEA001");

            Teacher teacher_2 = new Teacher();
            teacher_2.setName("Maria");
            teacher_2.setSurname("Gomez");
            teacher_2.setPhoneNumber(555555555);
            teacher_2.setTeacherCode("TEA002");

            Teacher teacher_3 = new Teacher();
            teacher_3.setName("Pere");
            teacher_3.setSurname("Ruiz");
            teacher_3.setPhoneNumber(666666666);
            teacher_3.setTeacherCode("TEA003");


            // vehicles
            // coches
            Car car_1 = new Car();
            car_1.setBrand("Toyota");
            car_1.setYear(2000);
            car_1.setPrice(18000);
            car_1.setDoors(5);
            car_1.setSeats(5);
            car_1.setPerson(student_1);

            Car car_2 = new Car();
            car_2.setBrand("Ford");
            car_2.setYear(2019);
            car_2.setPrice(15000);
            car_2.setDoors(3);
            car_2.setSeats(4);
            car_2.setPerson(student_2);


            // avions
            Plane plane_1 = new Plane();
            plane_1.setBrand("Cessna");
            plane_1.setYear(2015);
            plane_1.setPrice(120000);
            plane_1.setTailNumber(111111);
            plane_1.setAutopilot(true);
            plane_1.setPerson(teacher_1);

            Plane plane_2 = new Plane();
            plane_2.setBrand("Boeing");
            plane_2.setYear(2010);
            plane_2.setPrice(900000);
            plane_1.setTailNumber(222222);
            plane_2.setAutopilot(false);
            plane_2.setPerson(student_3);


            // motos
            Motorcycle motorcycle_1 = new Motorcycle();
            motorcycle_1.setBrand("Yamaha");
            motorcycle_1.setYear(2021);
            motorcycle_1.setPrice(9000);
            motorcycle_1.sethasHasSideCar(true);
            motorcycle_1.setPerson(student_2);

            Motorcycle motorcycle_2 = new Motorcycle();
            motorcycle_1.setBrand("Harley-Davidson");
            motorcycle_1.setYear(2018);
            motorcycle_1.setPrice(20000);
            motorcycle_1.sethasHasSideCar(true);
            motorcycle_1.setPerson(teacher_3);


            // persist --> guarda la nova entitat de l'objecte a la base de dades
            session.persist(student_1);
            session.persist(student_2);
            session.persist(student_3);

            session.persist(teacher_1);
            session.persist(teacher_2);
            session.persist(teacher_3);

            session.persist(car_1);
            session.persist(car_2);

            session.persist(plane_1);
            session.persist(plane_2);

            session.persist(motorcycle_1);
            session.persist(motorcycle_2);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void fase2() {

        Session session = HibernateSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {
            Vehicle vehicle = session.get(Vehicle.class, 1); // es fa una lectura READ on el vehicle amb l'id 1 es recupera

            // actualitzacio UPDATE on es treu la relació del vehicle amb la persona
            if (vehicle != null) {
                vehicle.setPerson(null);
            }

            transaction.commit();

            System.out.println("Fase 2 completada correctament!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
        }
    }

    private static void fase3() {

        Session session = HibernateSession.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            session.close();
        }

    }















}








