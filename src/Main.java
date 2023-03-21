import java.util.Arrays;

public class Main {
    Employee[] arrStorage = new Employee[10];

    // база
    public static void employeeList(Employee[] arrStorage) {
        for (int i = 0; i < arrStorage.length; i++) {
            System.out.println(arrStorage[i].toString());
        }
    }

    public static void calculateSumOfSalary(Employee[] arrStorage) {
        double sum = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            sum += arrStorage[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц составляет: " + sum);
    }

    public static void findMinSalary(Employee[] arrStorage) {
        double minSum = arrStorage[0].getSalary();
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getSalary() < minSum) {
                minSum = arrStorage[i].getSalary();
            }
        }
        System.out.println("Минимальная заработная плата составляет: " + minSum);
    }

    public static void findMaxSalary(Employee[] arrStorage) {
        double maxSum = -1;
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getSalary() > maxSum) {
                maxSum = arrStorage[i].getSalary();
            }
        }
        System.out.println("Максимальная заработная плата составляет: " + maxSum);
    }

    public static void calculateTheAverageSalary(Employee[] arrStorage) {
        double averageSalary = 0;
        double sum = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            sum += arrStorage[i].getSalary();
            averageSalary = sum / arrStorage.length;
        }
        System.out.println("Среднее значение зарплат составляет: " + averageSalary);
    }

    public static void printFullNames(Employee[] arrStorage) {
        for (int i = 0; i < arrStorage.length; i++) {
            System.out.println(arrStorage[i].getFullName().toString());
        }
    }

    //    повышенная сложность
    public static void changeSalary(Employee[] arrStorage, int index) {
        double newSalary = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            newSalary = arrStorage[i].getSalary() / 100 * index + arrStorage[i].getSalary();
            arrStorage[i].setSalary(newSalary);
            System.out.println(arrStorage[i].getSalary());
        }
    }

    public static void findMinSalaryInDepartment(Employee[] arrStorage, int department) {
        double minSum = arrStorage[0].getSalary();
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getSalary() < minSum && arrStorage[i].getDepartment() == department) {
                minSum = arrStorage[i].getSalary();
            }
        }
        System.out.println("Минимальная заработная плата в " + department + " отделе составляет: " + minSum);
    }

    public static void findMaxSalaryInDepartment(Employee[] arrStorage, int department) {
        double maxSum = -1;
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getSalary() > maxSum && arrStorage[i].getDepartment() == department) {
                maxSum = arrStorage[i].getSalary();
            }
        }
        System.out.println("Максимальная заработная плата в " + department + " отделе составляет: " + maxSum);
    }

    public static void calculateSumOfSalaryInDepartment(Employee[] arrStorage, int department) {
        double sum = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getDepartment() == department) {
                sum += arrStorage[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в " + department + " отделе составляет: " + sum);
    }
    public static void calculateTheAverageSalaryInDepartment(Employee[] arrStorage, int department) {
        double averageSalary = 0;
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getDepartment() == department) {
                counter += 1;
                sum += arrStorage[i].getSalary();
                averageSalary = sum / counter;
            }
        }
        System.out.println("Среднее значение зарплат в " + department + " отделе составляет: " + averageSalary);
    }
    public static void changeSalaryInDepartment(Employee[] arrStorage, int department, int index) {
        double newSalary = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getDepartment() == department) {
                newSalary = arrStorage[i].getSalary() / 100 * index + arrStorage[i].getSalary();
                arrStorage[i].setSalary(newSalary);
                System.out.println(arrStorage[i].getSalary());
            }
        }
    }

    public static void printListOfDepartment(Employee[] arrStorage, int department) {
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getDepartment() == department) {
                System.out.println(arrStorage[i].getFullName() + " " + arrStorage[i].getSalary());
            }
        }
    }

        public static void main(String[] args){
//            Employee employee = new Employee();
            Employee[] arrStorage = new Employee[10];
            arrStorage[0] = new Employee("Тимофеев Илья Васильевич", 1, 38740);
            arrStorage[1] = new Employee("Павлов Степан Кириллович", 2, 38740);
            arrStorage[2] = new Employee("Филиппова Василиса Макаровна", 3, 38380);
            arrStorage[3] = new Employee("Нефедов Алексей Ярославович", 4, 74380);
            arrStorage[4] = new Employee("Давыдов Евгений Михайлович", 5, 38380);
            arrStorage[5] = new Employee("Черепанова Ева Ярославовна", 4, 34380);
            arrStorage[6] = new Employee("Андреев Михаил Давидович", 3, 38780);
            arrStorage[7] = new Employee("Попова Майя Васильевна", 2, 38780);
            arrStorage[8] = new Employee("Никифорова Александра Романовна", 1, 38780);
            arrStorage[9] = new Employee("Дмитриева Софья Артуровна", 5, 20000);

//            employeeList(arrStorage);
//            calculateSumOfSalary(arrStorage);
//            findMinSalary(arrStorage);
//            findMaxSalary(arrStorage);
//            calculateTheAverageSalary(arrStorage);
//            printFullNames(arrStorage);

//            changeSalary(arrStorage, 9);
            findMinSalaryInDepartment(arrStorage, 4);
            findMaxSalaryInDepartment(arrStorage, 1);
            calculateSumOfSalaryInDepartment(arrStorage, 1);
            calculateTheAverageSalaryInDepartment(arrStorage, 1);
//            changeSalaryInDepartment(arrStorage, 5, 10);
            printListOfDepartment(arrStorage, 2);

        }
    }
