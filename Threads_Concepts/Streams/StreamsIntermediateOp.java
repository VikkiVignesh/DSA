package Threads_Concepts.Streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamsIntermediateOp {
    public static void main(String[] args) {
        
        // Integer []arr1={1,2,3,4,5,6};  // Object wrapper class type
        // int [] arr2={1,2,3,4,5};  //primitive type

        // final IntStream intStream=IntStream.of(arr2);
        // intStream.forEach(System.out::println);

        // final Stream<Integer> stream=Stream.of(arr1);
        // stream.forEach(System.out::println);

//Intermediate operations are like a pipeline used to process the elements in the stream and return a new stream


        //filter is like a gate just checjs whetehr the condition is true or not
        List<Integer> list=List.of(1,2,3,4,5,6);
        list.stream()
        .filter(n->n%2==0)
        .forEach(System.out::println);



        // map is liek a transformer used to convert from one state to other state
        List<String> list2=List.of("Java","Python","C++","JavaScript");

        list2.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);


        // reduce is like a accumulator used to accumulate the result and return a single value
        List<Integer> list3=List.of(1,2,3,4,5);
        String sum=list2.stream()
        .reduce("",(a,b)->a+b+"; ");
        System.out.println("Sum:"+sum);
        


        //flatmap is like a flattener used to flatten the nested structure and return a single stream
        List<List<String>> list4=List.of(
            List.of("Java","Python"),
            List.of("C++","JavaScript"),
            List.of("Go","Rust"));

        list4.stream().flatMap(Collection::stream)
        .map(String::toLowerCase)
        .forEach(System.out::println);




        //peak is like a observer used to observe the elements in the stream without modifying them
        List<Integer> list5=List.of(1,2,3,4,5);
        list5.stream()
        .peek(n->System.out.println("Peek:"+n))
        .filter(n->n%2==0)
        .collect(Collectors.toList());

        System.out.println("List5:"+list5);


        //distinct is like a filter used to remove the duplicate elements from the stream
        List<Integer> list6=List.of(1,2,3,4,5,1,2,3);
        list6.stream()
        .distinct()
        .forEach(System.out::println);


        System.out.println("Sorted List");
        list6.stream().sorted(Comparator.reverseOrder())
        .forEach(System.out::println);


        System.out.println("Sorted List with flatmap");
        list4.stream().flatMap(Collection::stream)
        .sorted(Comparator.comparingInt(String::length))
        .forEach(System.out::println);


        //skip is like a filter used to skip the first n elements from the stream
        List<Integer> list7=List.of(1,2,3,4,5);

        System.out.println("Skip first 2 elements");
        list7.stream()  
        .skip(2)
        .forEach(System.out::println);

        //limit is like a filter used to limit the number of elements from the stream
        System.out.println("Limit first 3 elements");
        list7.stream()
        .limit(3)
        .forEach(System.out::println);



        
    }
}
