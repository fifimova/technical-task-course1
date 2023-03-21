public class Main {

    // база
    public static void employeeList(Employee[] arrStorage) {
        for (int i = 0; i < arrStorage.length; i++) {
            System.out.println(arrStorage[i].toString());
        }
    }

    public static void calculateSumOfSalary(Employee[] arrStorage) {
        int sum = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            sum += arrStorage[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц составляет: " + sum);
    }

    public static void findMinSalary(Employee[] arrStorage) {
        int minSum = arrStorage[0].getSalary();
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getSalary() < minSum) {
                minSum = arrStorage[i].getSalary();
            }
        }
        System.out.println("Минимальная заработная плата составляет: " + minSum);
    }

    public static void findMaxSalary(Employee[] arrStorage) {
        int maxSum = -1;
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getSalary() > maxSum) {
                maxSum = arrStorage[i].getSalary();
            }
        }
        System.out.println("Максимальная заработная плата составляет: " + maxSum);
    }

    public static void calculateTheAverageSalary(Employee[] arrStorage) {
        int averageSalary = 0;
        int sum = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            sum += arrStorage[i].getSalary();
            averageSalary = sum / arrStorage.length;
        }
        System.out.println("Среднее значение зарплат составляет: " + averageSalary);
    }

    public static void getFullNames(Employee[] arrStorage) {
        for (int i = 0; i < arrStorage.length; i++) {
            System.out.println(arrStorage[i].getFullName().toString());
        }
    }

    //    повышенная сложность
    public static void changeSalary(Employee[] arrStorage) {
        int newSalary = 0;
        for (int i = 0; i < arrStorage.length; i++) {
            newSalary = arrStorage[i].getSalary() / 100 * 10 + arrStorage[i].getSalary();
            arrStorage[i].setSalary(newSalary);
            System.out.println(arrStorage[i].getSalary());
        }
    }

        public static void main(String[] args){
            Employee employee = new Employee();
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
            arrStorage[9] = new Employee("Дмитриева Софья Артуровна", 5, 34380);

            employeeList(arrStorage);
            calculateSumOfSalary(arrStorage);
            findMinSalary(arrStorage);
            findMaxSalary(arrStorage);
            calculateTheAverageSalary(arrStorage);
            getFullNames(arrStorage);

            changeSalary(arrStorage);
        }
    }
