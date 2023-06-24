import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);
        task4_v2(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> parityNums = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                parityNums.add(num);
            }
        }

        System.out.println(parityNums);
    }

    public static void task3(List<String> strings) {
        Set<String> stringSet = new HashSet<>();
        for (String string : strings) {
            stringSet.add(string);
        }

        System.out.println(stringSet);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> stringMap = new HashMap<>();
        for (String string : strings) {
            if (stringMap.containsKey(string)) {
                stringMap.put(string, stringMap.get(string) + 1);
            } else {
                stringMap.put(string, 1);
            }
        }

        System.out.println(stringMap);
    }


    public static void task4_v2(List<String> strings) {
        Map<String, Integer> stringMap = new HashMap<>();
        for (String string : strings) {
            stringMap.merge(string, 1, Integer::sum);
        }

        System.out.println(stringMap);
    }
}
