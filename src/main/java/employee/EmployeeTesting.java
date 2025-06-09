package employee;

import pojo.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTesting {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11500.0));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //1. How many male and female employees are there in the organization?

        /*Map<String, Long> genderWithCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("genderWithCount  :: "+genderWithCount);*/

        /*Map<String, List<Employee>> genderRespectiveToListOfEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println("genderRespectiveToListOfEmp  :: "+genderRespectiveToListOfEmp);*/

        //2. Print the name of all departments in natural order in the organization?
        //employeeList.stream().map(Employee::getDepartment).distinct().sorted().forEach(System.out::println);

        //3. What is the average age of male and female employees?
        /*Map<String, Double> genderwiseAgeInGroup = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("genderwiseAgeInGroup  :: "+genderwiseAgeInGroup);*/

        //4. Get the details of highest paid employee in the organization?
       /* Optional<Employee> highestSalariedEmployeeOptional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee employee = highestSalariedEmployeeOptional.get();
        System.out.println("Name of highest paid employee  :: "+employee.getName());*/

        //5. Get the details of lowest paid employee in the organization?
        /*Optional<Employee> lowestSalariedEmployeeOptional = employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee employee = lowestSalariedEmployeeOptional.get();
        System.out.println("Name of lowest paid employee  :: "+employee.getName());*/

        //6. Get the names of all employees who have joined after 2015?
        // employeeList.stream().filter(e-> e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);

        //7. Count the number of employees in each department?
        //Map<String, Long> deptwiseCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //Set<Map.Entry<String, Long>> entries = deptwiseCount.entrySet();
        // Iterate Map in first way
        /*for (Map.Entry<String, Long> entry: entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }*/

        // Iterate Map in second way
       /* entries.forEach(entry -> {
            String s = entry.getKey() + " # " + entry.getValue();
            System.out.println(s);
        });*/

        //8. Average salary of each department
        /*Map<String, Double> deptwiseAverageSalry = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entries = deptwiseAverageSalry.entrySet();
        entries.forEach(entry ->{
            String deptAvgSalary = entry.getKey()+" : "+entry.getValue();
            System.out.println(deptAvgSalary);
        });*/

        //9. Find the youngest Male Employee in Product Development
        /*Optional<Employee> youngestEmpOptional = employeeList
                .stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge));
        Employee youngestEmp = youngestEmpOptional.get();
        System.out.println("Youngest Employee  : "+youngestEmp.getName());*/

        //10. Find the oldest Employee
       /* Optional<Employee> oldestEmpOptional = employeeList.stream()
                .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmp = oldestEmpOptional.get();
        System.out.println("Oldest Employee  : "+oldestEmp.getName());*/

        //11. Who has the most working experience in the organization?
        /*List<Employee> collect = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).collect(Collectors.toList());
        collect.forEach(e-> {
            System.out.println(e.toString());
        });*/

        //12. Who has the least working experience in the organization?
        /*Employee first = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).collect(Collectors.toList()).getFirst();
        System.out.println("===> "+first);*/

        //13. How many male and female employees are there in the sales and marketing team?
        /*Map<String, Long> mapObj = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing")
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maoObj);*/

        //14. What is the average salary of male and female employees?
        /*Map<String, Double> mapObj = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("mapObj   ::: "+mapObj);*/

        //15. List down the names of all employees in each department?
       /* Map<String, List<Employee>> mapObj = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entries = mapObj.entrySet();
        entries.forEach(e->{
            System.out.println("Department : "+e.getKey());
            System.out.println("************************");
            List<Employee> value = e.getValue();
            value.forEach(e1->System.out.println(e1.getName()));
            System.out.println();
        });*/

        //16.  What is the average salary and total salary of the whole organization?
        /*DoubleSummaryStatistics collectObj = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Total Salary  :: "+collectObj.getSum());
        System.out.println("Average Salary  :: "+collectObj.getAverage());*/

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
       /* Map<Boolean, List<Employee>> mapObj = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() >= 25));
        Set<Map.Entry<Boolean, List<Employee>>> entries = mapObj.entrySet();
        entries.forEach(e -> {
            if (e.getKey()){
                System.out.println("********List of Employees who is more than 25 year old**********");
                List<Employee> value = e.getValue();
                value.forEach(e1-> System.out.println(""+e1.getName()));
            }else {
                System.out.println();
                System.out.println("********List of Employees who is less than 25 year old**********");
                List<Employee> value = e.getValue();
                value.forEach(e1-> System.out.println(""+e1.getName()));
            }
        });*/

        // Who is the oldest employee in the organization? What is his age and which
        // department he belongs to?
        /*Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee employee = oldestEmployee.get();
        System.out.println(employee.getName()+"is in "+employee.getDepartment()+" department having age "+employee.getAge());
*/

        // Sort Employee list in descending order
        /*List<Employee> collectObj = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        collectObj.forEach(e -> System.out.println(e.getName()+" getting "+e.getSalary()+" salary."));*/


        // Sort Employee list in descending order(Get Highest Salary paid)
       /* List<Employee> collectObj1 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        collectObj1.forEach(e -> System.out.println(e.getName()+" getting "+e.getSalary()+" salary."));
*/
        /*System.out.println();
        System.out.println("********************************");
        System.out.println();*/

        // Sort Employee list in descending order(Get Second Highest or any requested position Salary paid)
       /* Optional<Employee> firstObj = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        Employee employee = firstObj.get();
        System.out.println(employee.getName()+" getting "+employee.getSalary()+" salary");
*/
      /*  List<Employee> empList = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).skip(1).collect(Collectors.toList());
        System.out.println();
        System.out.println("************In salary the second last and third employee********************");
        System.out.println();
        empList.forEach(e -> System.out.println(e.getName()+" getting "+e.getSalary()+" salary"));
   */

      // Picked duplicate single employee list having duplicate salary
        /*Set<Double> duplicateSalDetail = new HashSet<>();
        List<Employee> filteredEmpList = employeeList.stream().filter(e -> !duplicateSalDetail.add(e.getSalary())).collect(Collectors.toList());
        System.out.println(filteredEmpList);*/

        // Pick whole duplicate data
        Set<Employee> employeeList1 = employeeList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(employeeList1);
    }
}
