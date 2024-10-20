import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);

        StudentUtils.sortByName(list);
        StudentUtils.print(list);

        StudentUtils.sortByAvg(list);
        StudentUtils.print(list);

        StudentUtils.sortByAgeDescending(list);
        StudentUtils.print(list);

        
        System.out.println("\n============ BEGIN ============ ");
        System.out.println(StudentUtils.avg(list));
        System.out.println("============ END ============ \n");

        
        List<String> nameOfGoodStudents = StudentUtils.goodStudentName(list);
        System.out.println("\n============ BEGIN ============ ");
        nameOfGoodStudents.forEach(System.out::println); // example of Method Reference (look like callback)
        System.out.println("============ END ============ \n");
    }
}
