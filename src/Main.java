public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("\nЗадание 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("\nЗадание 3");

        String firstName1 = "Семён";
        String middleName1 = "Семёнович";
        String lastName1 = "Иванов";
        String fullName2 = lastName1 + " " + firstName1 + " " + middleName1;

        String fullNameReplaced = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameReplaced);


    }
}


