import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Employee[] employee = new Employee[10];

    private static void displaysAllInformation() {
            employee[0] = new Employee("Иванов Константин Михайлович", 2, 123423);
            employee[1] = new Employee("Саулин Михаил Петрович", 1, 85451);
            employee[2] = new Employee("Золотцев Илья Васильевич", 2, 98654);
            employee[3] = new Employee("Ларин Михаил Олегович", 3, 100765);
            employee[4] = new Employee("Михайлов Сергей Генадьевич", 5, 67590);
            employee[5] = new Employee("Селезнев Дмитрий Иванович", 1, 98421);
            employee[6] = new Employee("Можайский Олег Дмитриевич", 4, 107562);
            employee[7] = new Employee("Майоров Михаил Антонович", 5, 145341);
            employee[8] = new Employee("Безруков Артем Евгеньевич", 3, 89789);
            employee[9] = new Employee("Черных Артем Дмитриевич", 4, 89352);

    }

    public static void main(String[] args) {
        displaysAllInformation();
        prints();
        System.out.println("Сумма зарплат за месяц: " + calculatesTheAmountOfSalaries());
        System.out.println(removesAnEmployeeWithMinimumWage());
        System.out.println(removesTheEmployeeWithTheMaximumSalar());
        System.out.println("Среднее значение зарплат равно " + displaysTheAverageSalary());
        displaysTheFullNameOfEmployees();
        displaysTheIndexedSalary();
        removesAMinimumWageEmployeeFromTheDepartmen();


    }

    private static void prints() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);

        }
    }

    private static double calculatesTheAmountOfSalaries() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    private static Employee removesAnEmployeeWithMinimumWage() {;
        Employee minSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (minSalary == null || employee[i].getSalary() < minSalary.getSalary()) {
                minSalary = employee[i];
            }
        }
        return minSalary;
    }

    private static Employee removesTheEmployeeWithTheMaximumSalar() {
        Employee maxSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary == null || employee[i].getSalary() > maxSalary.getSalary()) {
                maxSalary = employee[i];
            }
        }
        return maxSalary;
    }

    private static double displaysTheAverageSalary() {
        double averageValue = calculatesTheAmountOfSalaries() / employee.length;
        return averageValue;
    }

    private static void displaysTheFullNameOfEmployees() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Ф. И. О. " + employee[i].getFullName());
        }
    }

    private static void displaysTheIndexedSalary() {
        double indexedSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            indexedSalary = employee[i].getSalary() * 0.06 + employee[i].getSalary();
            employee[i].setSalary(indexedSalary);
            System.out.println(employee[i]);
        }
    }

    private static int displaysTheDepartmentNumber() {
        int number = 3;
        return number;
    }

    private static void removesAMinimumWageEmployeeFromTheDepartmen() {
        double minSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == displaysTheDepartmentNumber()) {
                if (employee[i].getSalary() != 0 && employee[i].getSalary() < minSalary) {
                    System.out.println(employee[i]);
                }
            }
        }
    }
}