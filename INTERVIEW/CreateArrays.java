package INTERVIEW;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateArrays {

  public static void main(String[] args) {
    List<String> names = Arrays.asList(
      "Reflection",
      "Customer",
      "Candidate",
      "Shri Radhe"
    );
    List res = (List) names
      .stream()
      .filter(x -> x.startsWith("S"))
      .collect(Collectors.toList());
    List<Integer> nums = Arrays.asList(1, 3, 5, 3, 6, 9);
    List square = nums.stream().map(x -> x * x).collect(Collectors.toList());

    // System.out.println(names);
    // System.out.println("filtered: "+res);
    System.out.println("squares "+square);

    nums.stream().map(x->x*2).forEach(y->System.out.print(y+", "));
  }
}
