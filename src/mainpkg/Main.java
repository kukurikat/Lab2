package mainpkg;
import Class.Student;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void printByFaculty(ArrayList<Student> students, String faculty) {
        for (Student s : students) {
            if (s.getValue(8).equalsIgnoreCase(faculty)) {
               System.out.println(s.toString());
            }
        }
    }
    public static void printByYear(ArrayList<Student> students, int year) {
        for (Student s : students) {
            String date = s.getValue(5);
            int birthYear = Integer.parseInt(date.substring(6, 10));
            if (birthYear > year) {
                System.out.println(s.toString());
            }
        }
    }
    public static void printByGroup(ArrayList<Student> students, String group) {
        for (Student s : students) {
            if (s.getValue(10).equalsIgnoreCase(group)) {
                System.out.println(s.toString());
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int id=0;
        while(true){
            System.out.println("Оберіть яку дію бажаєте виконати(1 - додати студента 2 - змінити інформацію про студента 3 - вивести всіх студентів 4 - Виветси студентів за критерієм 5-вихід )");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    scanner.nextLine(); // очистка буфера
                    System.out.println("Введіть прізвище:");
                    String surname = scanner.nextLine();
                    System.out.println("Введіть ім'я:");
                    String name = scanner.nextLine();
                    System.out.println("Введіть по батькові:");
                    String lastname = scanner.nextLine();
                    String datebrth;
                    while (true) {
                        System.out.println("Введіть дату народження (формат dd.mm.yyyy):");
                        datebrth = scanner.nextLine();
                        if (datebrth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                            break;
                        } else {
                            System.out.println("Невірний формат! Спробуйте ще раз.");
                        }
                    }
                    String phonenum;
                    while (true) {
                        System.out.println("Введіть телефон (10 цифр):");
                        phonenum = scanner.nextLine();
                        if (phonenum.matches("\\d{10}")) {
                            break; // правильний номер
                        } else {
                            System.out.println("Телефон має містити рівно 10 цифр! Спробуйте ще раз.");
                        }
                    }
                    System.out.println("Введіть адресу:");
                    String address = scanner.nextLine();

                    System.out.println("Введіть факультет:");
                    String faculty = scanner.nextLine();
                    System.out.println("Введіть курс:");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // очистка буфера
                    System.out.println("Введіть групу:");
                    String group = scanner.nextLine();

                    // Створюємо об’єкт студента
                    Student newStudent = new Student(id, surname, name, lastname,
                            datebrth, address, phonenum, faculty, year, group);
                    id++;
                    // Додаємо в ArrayList
                    students.add(newStudent);

                    System.out.println("Студент доданий!");
                    break;
                case 2:
                    System.out.println("Введіть id студента:");
                    int ids=scanner.nextInt();
                    for(Student s : students){
                        if (Integer.parseInt(s.getValue(1))==ids){
                            boolean chk=true;
                                while(chk){
                                    System.out.println("Бажаєте внести зміни до студенту "+s.getValue(2)+"(1-так будь-яке інше число -ні");
                                    int m=scanner.nextInt();
                                    if(m==1){
                                        s.setValue();
                                    }
                                    else{
                                        chk=false;
                                    }

                            }
                        }
                    }
                    break;
                case 3:
                    for(Student s : students){
                        System.out.println(s.toString());
                    }
                    break;
                case 4:
                    System.out.println("Оберіть за яким критерієм ви бажаєте вивести список студентів (1-факультет 2-курс 3-група)");
                    int l = scanner.nextInt();
                    scanner.nextLine(); // очистка буфера
                    switch (l) {
                        case 1:
                            System.out.println("Введіть факультет:");
                            String fac = scanner.nextLine();
                            printByFaculty(students, fac);
                            break;
                        case 2:
                            System.out.println("Введіть рік. Будуть виведені студенти, які народилися після нього:");
                            int y = scanner.nextInt();
                            printByYear(students, y);
                            break;
                        case 3:
                            System.out.println("Введіть групу:");
                            String grp = scanner.nextLine();
                            printByGroup(students, grp);
                            break;
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
}
