import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args)

    {
       //set

        Set<String> students = new HashSet<>();

        Student student11 = new Student("sanela2", 1);
        Student student22 = new Student("sani", 2);


        Set<Student>students2 = new HashSet<>();
        students2.add(student11);


        students.add("chris");
        students.add("PAul");
        students.add("sanela");
        students.add("barbara");
        students.add("barbara");

        for (String s:students){
            System.out.println(s);
        }

        for (Student  s1: students2){
            System.out.println(s1.getName());

        }

        //mape

        Map<Integer, Student> bootcamp = new HashMap<>();
        bootcamp.put(student11.getId(), student11);
        bootcamp.put(student22.getId(), student22);

        System.out.println(bootcamp.containsKey(1));
        System.out.println(bootcamp.get(1).getName());



      //  bootcamp.remove(1);
    }
}