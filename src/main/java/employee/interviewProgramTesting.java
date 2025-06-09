package employee;

import org.w3c.dom.ls.LSOutput;
import pojo.Employee;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class interviewProgramTesting {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.789));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11500.789));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //1.1 How many male and female employees are there in the organization?
        /*Map<String, Long> genderWiseGroup = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        genderWiseGroup.forEach((k,v)-> System.out.println(k+" count: "+v));*/

        // 1.2 How many male and female employees are there in the sales and marketing team?
        /*Map<String, Long> salesAndMarketingEmpList = employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        salesAndMarketingEmpList.forEach((k,v)-> System.out.println(k+"  : "+v));*/

        // 1.3 Count the no of employee in each department
       /* Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        collect.forEach((k, v )-> System.out.println(k +" :: "+ v));*/

        // 1.4 What is the average age of male and female employees?
        /*Map<String, Double> mapObj = employeeList.stream()
                                                 .collect((Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
        mapObj.forEach((k,v)-> System.out.println(k+" have avergae salary : "+v));*/

        // 1.5 Average salary of each department
        /*Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        collect.forEach((k, v)-> System.out.println(k+" :: "+v));*/

        // 1.6 What is the average salary of male and female employees?
       /* Map<String, Double> genderwiseAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        genderwiseAvgSalary.forEach((k,v)-> System.out.println(k+"  ::  "+v));*/

        // 1.7 Fetched data in Key & Value pair(Where key is id and value is a employee obj)
        /*Map<Integer, Employee> empMapObj = employeeList.stream().collect(Collectors.toMap(Employee::getId, emp -> emp));
        empMapObj.forEach((k,v)-> System.out.println("EmpId : "+k+" mapped with : "+v.getName()));*/

        //1.8  Collecting name and percentage of each student into a Map
        Map<Integer, String> employeeRecordInMap = employeeList
                                                  .stream()
                                                  .collect(Collectors.toMap(Employee::getId, Employee::getName));
        employeeRecordInMap.forEach((k,v)-> System.out.println(k+" :: "+v));

        //1.9 Fetched MALE data in Key & Value pair(Where key is id and value is a employee obj)
        /*Map<Integer, Employee> empMapObj = employeeList.stream().filter(e -> e.getGender().equalsIgnoreCase("MALE")).collect(Collectors.toMap(Employee::getId, emp -> emp));
        empMapObj.forEach((k,v)-> System.out.println("EmpId : "+k+" mapped with : "+v.getName()));*/

        //2.1 Print the name of all departments in natural order in the organization?
        /*List<String> deptList = employeeList.stream().map(Employee::getDepartment).sorted().distinct().toList();
        deptList.forEach(System.out::println);*/

        //3.1 Get the details of highest paid employee in the organization?
        /*Optional<Employee> collect = employeeList.stream()
                                                 .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee employee = collect.get();
        System.out.println(employee.getName()+" getting highest salary ("+employee.getSalary()+")");*/

        //3.2 Get the details of Lowest paid employee in the organization?
        /*Optional<Employee> collect = employeeList.stream()
                                                   .collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee employee = collect.get();
        System.out.println(employee.getName()+" getting lowest salary ("+employee.getSalary()+")");*/

        //3.3 Find the youngest Employee (Solution through stream().min)
       /* Optional<Employee> yongestEmployee = employeeList.stream()
                                                         .min(Comparator.comparingInt(Employee::getAge));
        if (yongestEmployee.isPresent()){
            System.out.println("Youngest Employee  :: "+yongestEmployee.get());
        }*/

        //3.3 Find the youngest Male Employee in Product Development
        /*Optional<Employee> yongestEmployee2 = employeeList.stream()
                                              .filter(emp-> emp.getGender().equalsIgnoreCase("Male") && emp.getDepartment().equalsIgnoreCase("Product Development"))
                                              .min(Comparator.comparingInt(Employee::getAge));
        if (yongestEmployee2.isPresent()){
            System.out.println("Youngest Employee  :: "+yongestEmployee2.get());
        }*/

        //3.4 Find the youngest Employee (Solution through Collectors.minBy)
        /*Optional<Employee> collect = employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
        System.out.println(collect.get());*/

        //3.5 Find the oldest employee (Using max function)
       /* Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        if(oldestEmployee.isPresent()){
            System.out.println(oldestEmployee.get());
        }*/

        //3.5 Find the oldest employee (Using maxBy function)
        /*Optional<Employee> oldestEmployee2 = employeeList.stream()
                .collect((Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
        if(oldestEmployee2.isPresent()){
            System.out.println(oldestEmployee2.get());
        }*/

        // 4.1. Get the names of all employees who have joined after 2015?
        /*List<String> collect = employeeList.stream()
                                           .filter(e -> e.getYearOfJoining() > 2015)
                                           .map(Employee::getName).collect(Collectors.toList());
        collect.forEach(System.out::println);*/

        // 5.1 Employee List sorted on the basis of the experience
        /*List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).collect(Collectors.toList());
        sortedEmployeeList.forEach(System.out::println);*/

        // 5.2 Most experience employee (Get most exp emplyee by using first() from the list)
        /*Employee mostExpEmp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).collect(Collectors.toList()).getFirst();
        System.out.println("Most Exp Employee  : "+mostExpEmp);*/

        // 5.3 Most experience employee (Get Most exp employee using min function returning the Optional object)
       /* Optional<Employee> leastExpEmployee = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        if(leastExpEmployee.isPresent()){
            System.out.println(leastExpEmployee.get());
        }*/

        // 5.4 Least experience employee  (Get least from the list)
        /*Employee leastExpEmp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).collect(Collectors.toList()).getLast();
        System.out.println("Least Exp Employee  : "+leastExpEmp);*/

        // 5.5 Least experience employee  (Get least from the list after reversing the list)
        /*Employee leastExpEmp2 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining).reversed()).collect(Collectors.toList()).getFirst();
        System.out.println("Least Exp Employee  : "+leastExpEmp2);*/

        // 5.6 Least experience employee (Get least exp employee using max function returning the Optional object)
        /*Optional<Employee> leastExpEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getYearOfJoining));
        if(leastExpEmployee.isPresent()){
            System.out.println(leastExpEmployee.get());
        }*/

        // 6. List down the names of all employees in each department?
       /* Map<String, List<Employee>> deptwiseEmpList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entries = deptwiseEmpList.entrySet();
        entries.forEach(e-> {
            System.out.println("Department  :: "+e.getKey());
            System.out.println("**************************");
            List<Employee> empList = e.getValue();
            empList.forEach(e1 -> System.out.println(e1.getName()));
            System.out.println();
        });*/

        //7. What is the average,total, min & max salary of the whole organization?
        /*DoubleSummaryStatistics collect = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Avg Salary ::: "+collect.getAverage());
        System.out.println("Total Salary ::: "+collect.getSum());
        System.out.println("Max Salary ::: "+collect.getMax());
        System.out.println("Min Salary ::: "+collect.getMin());*/

        //8. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        /*Map<Boolean, List<Employee>> collect = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() >= 25));
        Set<Map.Entry<Boolean, List<Employee>>> entries = collect.entrySet();
        entries.forEach(e->{
            if(e.getKey()){
                System.out.println("Employees who have experience more than or equal 25 years");
                System.out.println("*************************");
                List<Employee> value = e.getValue();
                value.forEach(e1 -> System.out.println(e1.getName()+"  ::  "+e1.getAge()));
                System.out.println();
            }else{
                System.out.println("Employees who have experience less than or equal 25 years");
                System.out.println("*************************");
                List<Employee> value = e.getValue();
                value.forEach(e1-> System.out.println(e1.getName()+"  ::  "+e1.getAge()));
                System.out.println();
            }
        });*/

        //9. Who is the oldest employee in the organization? What is his age and which department he belongs to?
        /*Optional<Employee> oldestEmployee = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        if(oldestEmployee.isPresent()){
            Employee employee = oldestEmployee.get();
            System.out.println(employee.getName()+" is the oldest employee who is "+employee.getAge()+" year old and belongs to "+employee.getDepartment()+" department");
        }*/

        //10.1 Sort Employee list on the basis of salary in ascending order
        /*List<Employee> collect = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        collect.forEach(System.out::println);*/

        //10.2 Sort Employee list on the basis of salary in descending order
        /*List<Employee> collect = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println();*/

        //10.3 Get 2nd highest paid employee (We can find any position and passed the position inside skip() function)
        /*Employee first = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).collect(Collectors.toList()).getFirst();
        System.out.println("2nd highest paid employee  :: "+first);*/

        //10.4 Get 2nd and 3rd position salary wise data
        /*List<Employee> collect = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).skip(1).collect(Collectors.toList());
        collect.forEach(e-> System.out.println(e.getName()+" getting "+e.getSalary()+" per month."));*/

        //11. Get duplicate salary detail
        /*Set<Double> duplicateSalDetail = new HashSet<>();
        List<Employee> collect = employeeList.stream().filter(e -> !duplicateSalDetail.add(e.getSalary())).collect(Collectors.toList());
        //collect.forEach(e-> System.out.println(e.getName()+" get salary : "+String.format("%.2f",e.getSalary())));
        collect.forEach(e-> System.out.println(e.getName()+" get salary : "+df.format(e.getSalary())));*/



        //12. Get employee list who are have the same salary
       /* Map<Double, List<Employee>> empDeatils = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary)) //Group By Salary
                .entrySet().stream() // Convert to Stream to filter
                .filter(entry -> entry.getValue().size() > 1) // Keep group with more than one employee
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Final list of employees who are getting the same salary

        empDeatils.forEach((k, v)-> System.out.println(k +"  ==> "+ v));*/

        //13.
    }
}
