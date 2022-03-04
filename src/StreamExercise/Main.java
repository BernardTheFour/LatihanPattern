package StreamExercise;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Initialize the list
        List<Integer> list = Init(100);

        // print the list
        System.out.println("Integer list: ");
        System.out.println(list);

        // print the question
        System.out.println(number1(list));
        System.out.println(number2(list));
        System.out.println(number3(list));
        System.out.println(number4(list));

        // (also) print the question
        System.out.println("\n---------Question 2-------");
        Task2 newTask = new Task2();
    }

    static List<Integer> Init(int size) {
        List<Integer> list = new ArrayList<Integer>(){};

        for (int i = 1; i <= size; i++) {
            list.add(i);
            list.add((i * 2));
        }

        return list;
    }

    static List<Integer> number1(List<Integer> list) {
        String text = "\nNumber 1: \n";
        text += "Given a list of integers, find out all the even number exist in the list using Stream function";
        System.out.println(text);

        // answer
        List<Integer> result;
        result = list.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        return result;
    }

    static List<Integer> number2(List<Integer> list) {
        String text = "\nNumber 2: \n";
        text += "Given a list of integers, find out all the numbers starting with 1 using Stream functions";
        System.out.println(text);

        // answer
        List<Integer> result;
        result = list.stream()
                .filter(number -> number.toString().startsWith("1"))
                .collect(Collectors.toList());

        return result;
    }

    static Integer number3(List<Integer> list) {
        String text = "\nNumber 3: \n";
        text += "Given a list of integers, find the total number of elements present in the list using Stream functions";
        System.out.println(text);

        // answer
        int result;
        result = list.stream()
                .reduce(0, (a,b) -> a + b);

        return result;
    }

    static List<Integer> number4(List<Integer> list) {
        String text = "\nNumber 4: \n";
        text += "Given a list of integers, sort all the value present in it using Stream functions";
        System.out.println(text);

        // answer
        List<Integer> result;
        result = list.stream()
                .sorted()
                .collect(Collectors.toList());

        return result;
    }
}
