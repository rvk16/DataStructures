package strings;

import java.util.*;

public class RepeatedDNASequence {
    public static void main(String[] args) {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(repeatedDNSSequenceHashset(str));
    }

    private static List<String> repeatedDNSSequence(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            map.put(subString, map.getOrDefault(subString, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() > 1) {
                result.add(item.getKey());
            }
        }

        return result;
    }

    private static List<String> repeatedDNSSequenceHashset(String s) {
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            if (set.contains(subString)) {
                list.add(subString);
            } else {
                set.add(subString);
            }
        }
        return new ArrayList(list);
    }
}