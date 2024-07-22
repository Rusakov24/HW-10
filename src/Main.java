public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");

        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\nЗадание 2");

        String small = fullName;
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + small.toUpperCase());

        System.out.println("\nЗадание 3");

        String fullNameReplaced = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameReplaced);


    }
}


