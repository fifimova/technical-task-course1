public class EmployeeBook {
    private Employee[] arrStorage;
    private int size;

    public EmployeeBook() {
        this.arrStorage = new Employee[10];
    }

    public void addEmployee(String fullName, int department, double salary) {
        if (size > arrStorage.length) {
            System.out.println("В хранилище нет места");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        arrStorage[size++] = newEmployee;
    }

    //  база

    public void employeeList() {
        for (Employee employee : arrStorage) {
            System.out.println(employee.toString());
        }
    }

    public void calculateSumOfSalary() {
        double sum = 0;
        for (Employee employee : arrStorage) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплату в месяц составляет: " + sum);
    }

    public void findMinSalary() {
        double minSum = arrStorage[0].getSalary();
        for (Employee employee : arrStorage) {
            if (employee.getSalary() < minSum && employee != null) {
                minSum = employee.getSalary();
            }
        }
        System.out.println("Минимальная заработная плата составляет: " + minSum);
    }

    public void findMaxSalary() {
        double maxSum = -1;
        for (Employee employee : arrStorage) {
            if (employee.getSalary() > maxSum && employee != null) {
                maxSum = employee.getSalary();
            }
        }
        System.out.println("Максимальная заработная плата составляет: " + maxSum);
    }

    public void calculateTheAverageSalary() {
        double averageSalary = 0;
        double sum = 0;
        for (Employee employee : arrStorage) {
            sum += employee.getSalary();
            averageSalary = sum / arrStorage.length;
        }
        System.out.println("Среднее значение зарплат составляет: " + averageSalary);
    }

    public void printFullNames() {
        for (Employee employee : arrStorage) {
            System.out.println(employee.getFullName().toString());
        }
    }

    //    повышенная сложность
    public void changeSalary(int index) {
        double newSalary = 0;
        for (Employee employee : arrStorage) {
            newSalary = employee.getSalary() / 100 * index + employee.getSalary();
            employee.setSalary(newSalary);
            System.out.println(employee.getSalary());
        }
    }

    public void findMinSalaryInDepartment(int department) {
        double minSum = arrStorage[0].getSalary();
        for (Employee employee : arrStorage) {
            if (employee.getSalary() < minSum && employee.getDepartment() == department && employee != null) {
                minSum = employee.getSalary();
            }
        }
        System.out.println("Минимальная заработная плата в " + department + " отделе составляет: " + minSum);
    }

    public void findMaxSalaryInDepartment(int department) {
        double maxSum = -1;
        for (Employee employee : arrStorage) {
            if (employee.getSalary() > maxSum && employee.getDepartment() == department && employee != null) {
                maxSum = employee.getSalary();
            }
        }
        System.out.println("Максимальная заработная плата в " + department + " отделе составляет: " + maxSum);
    }

    public void calculateSumOfSalaryInDepartment(int department) {
        double sum = 0;
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату в " + department + " отделе составляет: " + sum);
    }

    public void calculateTheAverageSalaryInDepartment(int department) {
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

    public void changeSalaryInDepartment(int department, int index) {
        double newSalary = 0;
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                newSalary = employee.getSalary() / 100 * index + employee.getSalary();
                employee.setSalary(newSalary);
                System.out.println(employee.getSalary());
            }
        }
    }

    public void printListOfDepartment(int department) {
        for (Employee employee : arrStorage) {
            if (employee.getDepartment() == department && employee != null) {
                System.out.println(employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public void findEmployeesWithLowerSalary(double maxNum) {
        for (Employee employee : arrStorage) {
            if (employee.getSalary() < maxNum && employee != null) {
                maxNum = employee.getSalary();
                System.out.println("ID сотрудника: " + employee.getId() + ", " + employee.getFullName()
                        + ", заработная плата: " + employee.getSalary());

            }
        }
    }

    public void findEmployeesWithHigherSalary(double minNum) {
        for (Employee employee : arrStorage) {
            if (employee.getSalary() >= minNum && employee != null) {
                minNum = employee.getSalary();
                System.out.println("ID сотрудника: " + employee.getId() + ", " + employee.getFullName()
                        + ", заработная плата: " + employee.getSalary());

            }
        }
    }

    public void addNewEmployee(String fullName, int department, double salary) {
        for (int i = 0; i < arrStorage.length; i++) {
            Employee employee = arrStorage[i];
            if (employee == null) {
                System.out.println("Сотрудник " + fullName + " добавлен в книгу");
                Employee newEmployee = new Employee(fullName, department, salary);
                arrStorage[size++] = newEmployee;
                return;
            }
        }
        System.out.println("В книге нет свободных ячеек");
    }

    public void deleteEmployee(String fullName) {
        for (int i = 0; i < arrStorage.length; i++) {
            if (arrStorage[i].getFullName().equals(fullName)) {
                System.out.println(arrStorage[i].getFullName() + " - удален");
                System.arraycopy(arrStorage, i + 1, arrStorage, i, size - i - 1);
                arrStorage[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void changeSalary(String fullName, double salary) {
        for (Employee employee : arrStorage) {
            if (employee.getFullName().equals(fullName)) {
                System.out.println("Зарплата сотрудника измененена");
                employee.setSalary(salary);
                return;
            }
        }
        System.out.println("Сотрудник не найден");
    }

    public void changeDepartment(String fullName, int department) {
        for (Employee employee : arrStorage) {
            if (employee.getFullName().equals(fullName)) {
                System.out.println("Сотрудник переведен в " + department + " отдел");
                employee.setDepartment(department);
                return;
            }
        }
        System.out.println("Сотрудник не найден");
    }

    public void printEmployeesByDepartment() {
        System.out.println("===== ОТДЕЛ 1 =====");
        for (Employee employee : arrStorage) {
            if (employee == null) {
                System.out.println("");
            } else if (employee.getDepartment() == 1) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("===== ОТДЕЛ 2 =====");
        for (Employee employee : arrStorage) {
            if (employee == null) {
                System.out.println("");
            } else if (employee.getDepartment() == 2) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("===== ОТДЕЛ 3 =====");
        for (Employee employee : arrStorage) {
            if (employee == null) {
                System.out.println("");
            } else if (employee.getDepartment() == 3) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("===== ОТДЕЛ 4 =====");
        for (Employee employee : arrStorage) {
            if (employee == null) {
                System.out.println("");
            } else if (employee.getDepartment() == 4) {
                System.out.println(employee.getFullName());
            }
        }
        System.out.println("===== ОТДЕЛ 5 =====");
        for (Employee employee : arrStorage) {
            if (employee == null) {
                System.out.println("");
            } else if (employee.getDepartment() == 5) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
