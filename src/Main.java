public class Main {
    static Employee[] arrStorage = new Employee[10];

    //  база
    public static void employeeList(Employee[] arrStorage) {
        for (Employee employee : arrStorage) {
            System.out.println(employee.toString());
        }
    }

    public static void calculateSumOfSalary(Employee[] arrStorage) {
        double sum = 0;
        for (Employee employee : arrStorage) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц составляет: " + sum);
    }

    public static void findMinSalary(Employee[] arrStorage) {
        double minSum = arrStorage[0].getSalary();
        for (Employee employee : arrStorage) {
            if (employee.getSalary() < minSum && employee != null) {
                minSum = employee.getSalary();
            }
        }
        System.out.println("Минимальная заработная плата составляет: " + minSum);
    }

    public static void findMaxSalary(Employee[] arrStorage) {
        double maxSum = -1;
        for (Employee employee : arrStorage) {
            if (employee.getSalary() > maxSum && employee != null) {
                maxSum = employee.getSalary();
            }
        }
        System.out.println("Максимальная заработная плата составляет: " + maxSum);
    }

    public static void calculateTheAverageSalary(Employee[] arrStorage) {
        double averageSalary = 0;
        double sum = 0;
        for (Employee employee : arrStorage) {
            sum += employee.getSalary();
            averageSalary = sum / arrStorage.length;
        }
        System.out.println("Среднее значение зарплат составляет: " + averageSalary);
    }

    public static void printFullNames(Employee[] arrStorage) {
        for (Employee employee : arrStorage) {
            System.out.println(employee.getFullName().toString());
        }
    }

    //    повышенная сложность
    public static void changeSalary(Employee[] arrStorage, int index) {
        double newSalary = 0;
        for (Employee employee : arrStorage) {
            newSalary = employee.getSalary() / 100 * index + employee.getSalary();
            employee.setSalary(newSalary);
            System.out.println(employee.getSalary());
        }
    }

    public static void findMinSalaryInDepartment(Employee[] arrStorage, int department) {
        double minSum = arrStorage[0].getSalary();
        for (Employee employee : arrStorage) {
            if (employee.getSalary() < minSum && employee.getDepartment() == department && employee != null) {
                minSum = employee.getSalary();
            }
        }
        System.out.println("Минимальная заработная плата в " + department + " отделе составляет: " + minSum);
    }

    public static void findMaxSalaryInDepartment(Employee[] arrStorage, int department) {
        double maxSum = -1;
        for (Employee employee : arrStorage) {
            if (employee.getSalary() > maxSum && employee.getDepartment() == department && employee != null) {
                maxSum = employee.getSalary();
            }
        }
        System.out.println("Максимальная заработная плата в " + department + " отделе составляет: " + maxSum);
    }

    public static void calculateSumOfSalaryInDepartment(Employee[] arrStorage, int department) {
        double sum = 0;
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в " + department + " отделе составляет: " + sum);
    }
    public static void calculateTheAverageSalaryInDepartment(Employee[] arrStorage, int department) {
        double averageSalary = 0;
        double sum = 0;
        int counter = 0;
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                counter++;
                sum += employee.getSalary();
                averageSalary = sum / counter;
            }
        }
        System.out.println("Среднее значение зарплат в " + department + " отделе составляет: " + averageSalary);
    }
    public static void changeSalaryInDepartment(Employee[] arrStorage, int department, int index) {
        double newSalary = 0;
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                newSalary = employee.getSalary() / 100 * index + employee.getSalary();
                employee.setSalary(newSalary);
                System.out.println(employee.getSalary());
            }
        }
    }

    public static void printListOfDepartment(Employee[] arrStorage, int department) {
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                System.out.println(employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public static void findEmployeesWithLowerSalary(Employee[] arrStorage, double maxNum) {
        for (Employee employee : arrStorage) {
            if (employee.getSalary() < maxNum && employee != null) {
                maxNum = employee.getSalary();
                System.out.println("ID сотрудника: " + employee.getId() + ", " + employee.getFullName()
                        + ", заработная плата: " + employee.getSalary());

            }
        }
    }
    public static void findEmployeesWithHigherSalary(Employee[] arrStorage, double minNum) {
        for (Employee employee : arrStorage) {
            if (employee.getSalary() >= minNum && employee != null) {
                minNum = employee.getSalary();
                System.out.println("ID сотрудника: " + employee.getId() + ", " + employee.getFullName()
                        + ", заработная плата: " + employee.getSalary());

            }
        }
    }

        public static void main(String[] args){
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
//
//            changeSalary(arrStorage, 9);
//            findMinSalaryInDepartment(arrStorage, 4);
//            findMaxSalaryInDepartment(arrStorage, 1);
//            calculateSumOfSalaryInDepartment(arrStorage, 1);
//            calculateTheAverageSalaryInDepartment(arrStorage, 1);
//            changeSalaryInDepartment(arrStorage, 5, 10);
//            printListOfDepartment(arrStorage, 2);
//            findEmployeesWithLowerSalary(arrStorage, 40000);
//            findEmployeesWithHigherSalary(arrStorage, 36000);

        }
    }
