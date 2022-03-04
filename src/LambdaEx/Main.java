package LambdaEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++){
            data.add(i * 2);
            data.add(i/2);
        }

        List<Integer> result = data.stream()
                .filter(y -> y > 10)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(data);
        System.out.println(result);

        System.out.println(getName());
    }

    public static String getName(){
        String nodata = null;
        return Optional.ofNullable(nodata)
                .orElse("No data find");
    }
}
