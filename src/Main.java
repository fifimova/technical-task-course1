public class Main {
        public static void main(String[] args){
            EmployeeBook employeeBook = new EmployeeBook();
            employeeBook.addEmployee("Тимофеев Илья Васильевич", 1, 38740);
            employeeBook.addEmployee("Павлов Степан Кириллович", 2, 38740);
            employeeBook.addEmployee("Филиппова Василиса Макаровна", 3, 38380);
            employeeBook.addEmployee("Нефедов Алексей Ярославович", 4, 74380);
            employeeBook.addEmployee("Кошкина Наталья Владиславовна", 5, 36666);
            employeeBook.addEmployee("Черепанова Ева Ярославовна", 4, 34380);
            employeeBook.addEmployee("Андреев Михаил Давидович", 3, 38780);
            employeeBook.addEmployee("Попова Майя Васильевна", 2, 38780);
            employeeBook.addEmployee("Никифорова Александра Романовна", 1, 38780);
            employeeBook.addEmployee("Дмитриева Софья Артуровна", 5, 20000);

            employeeBook.employeeList();
            employeeBook.calculateSumOfSalary();
            employeeBook.findMinSalary();
            employeeBook.findMaxSalary();
            employeeBook.calculateTheAverageSalary();
            employeeBook.printFullNames();

            employeeBook.changeSalary(10);
            employeeBook.findMinSalaryInDepartment(5);
            employeeBook.findMaxSalaryInDepartment(1);
            employeeBook.calculateSumOfSalaryInDepartment(1);
            employeeBook.calculateTheAverageSalaryInDepartment(1);
            employeeBook.changeSalaryInDepartment(2, 10);
            employeeBook.printListOfDepartment(5);
            employeeBook.findEmployeesWithLowerSalary(40000);
            employeeBook.findEmployeesWithHigherSalary(36000);

            employeeBook.addNewEmployee("Вася", 4, 50000);
            employeeBook.deleteEmployee("Тимофеев Илья Васильевич");
            employeeBook.changeSalary("Павлов Степан Кириллович",40000);
            employeeBook.changeDepartment("Филиппова Василиса Макаровна", 5);
            employeeBook.printEmployeesByDepartment();

        }
    }
