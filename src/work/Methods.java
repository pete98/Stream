package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter(Predicate- returns t & f)
            //boolean valued function
            //e->{braces only for multiple lines}
            //e-> true or false (only if one line)



        //map(Function returns values)
        /*
        * each element operation
        *
        *
        *
        * */

        //Filter Functionn
        List<String> names = List.of("Aman", "Ankit", "Pranav");
        List<String> newnames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newnames);

        //Map Function
        List<Integer> numbers = List.of(23,4,5,6,4,3);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);

        newnames.stream().forEach(System.out::println);
    }
}
