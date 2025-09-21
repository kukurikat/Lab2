package Class;
import java.util.Scanner;

    public class Student {
        Scanner scanner = new Scanner(System.in);
        private int id, year;
        private  String name, surname, lastname, datebrth, group, faculty, phonenum, address;

        public Student(int id, String surname, String name, String lastname, String datebrth,
        String address, String phonenum, String faculty, int year, String group){
            this.id = id;
            this.surname = surname;
            this.name = name;
            this.lastname = lastname;
            this.datebrth = datebrth;
            this.address = address;
            this.phonenum = phonenum;
            this.faculty = faculty;
            this.year = year;
            this.group = group;
        }

        public void setValue(){
            scanner.nextLine();
            System.out.println("Введіть яке поле ви бажаєте змінити (2 - Прізвище,3 - Ім'я,4 - По батькові,5 - Дата народження,6 - Адреса,7 - Телефон,8 - Факультет,9 - Курс,10 - Група.)");
            int n = scanner.nextInt();
            scanner.nextLine();
            String var;
            int ivar;
            switch (n){
                case 2:
                    System.out.println("Введіть нове прізвище:");
                    var = scanner.nextLine();
                    this.surname = var;
                    break;
                case 3:
                    System.out.println("Введіть нове ім'я:");
                    var = scanner.nextLine();
                    this.name = var;
                    break;
                case 4:
                    System.out.println("Введіть нове по батькові:");
                    var = scanner.nextLine();
                    this.lastname = var;
                    break;
                case 5:
                    System.out.println("Введіть нову дату народження:");
                    var = scanner.nextLine();
                    this.datebrth = var;
                    break;
                case 6:
                    System.out.println("Введіть нову адресу:");
                    var = scanner.nextLine();
                    this.address = var;
                    break;
                case 7:
                    System.out.println("Введіть новий телефон:");
                    var = scanner.nextLine();
                    this.phonenum = var;
                    break;
                case 8:
                    System.out.println("Введіть новий факультет:");
                    var = scanner.nextLine();
                    this.faculty = var;
                    break;
                case 9:
                    System.out.println("Введіть новий курс:");
                    ivar = scanner.nextInt();
                    this.year = ivar;
                    break;
                case 10:
                    System.out.println("Введіть нову групу:");
                    var = scanner.nextLine();
                    this.group = var;
                    break;
                default:
                    System.out.println("Невірний вибір!");
                    break;
            }
        }
        public void getValue(){
            System.out.println("ID: " + id);
            System.out.println("Прізвище: " + surname);
            System.out.println("Ім'я: " + name);
            System.out.println("По батькові: " + lastname);
            System.out.println("Дата народження: " + datebrth);
            System.out.println("Адреса: " + address);
            System.out.println("Телефон: " + phonenum);
            System.out.println("Факультет: " + faculty);
            System.out.println("Курс: " + year);
            System.out.println("Група : " + group);
        }
        public String getValue(int var) {
            switch (var) {
                case 1: return String.valueOf(id);
                case 2: return surname;
                case 3: return name;
                case 4: return lastname;
                case 5: return datebrth;
                case 6: return address;
                case 7: return phonenum;
                case 8: return faculty;
                case 9: return String.valueOf(year);
                case 10: return group;
                default: return "Невідоме поле";
            }
        }
        @Override
        public String toString() {
            return "Студент {" +
                    "ID=" + id +
                    ", Прізвище='" + surname + '\'' +
                    ", Ім'я='" + name + '\'' +
                    ", По батькові='" + lastname + '\'' +
                    ", Дата народження='" + datebrth + '\'' +
                    ", Адреса='" + address + '\'' +
                    ", Телефон='" + phonenum + '\'' +
                    ", Факультет='" + faculty + '\'' +
                    ", Курс=" + year +
                    ", Група='" + group + '\'' +
                    '}';
        }

    }

