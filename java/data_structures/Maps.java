import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {

    public static void main(String[] args) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        String s = "lqwsneotxgyjpfbkduzcmkvlhqimsyvohtzrjfnlrmngcydskwuwupzbgwzsyqgdqwdmdppjzvcl";
        for (char c : s.toCharArray()) {
            freqMap.putIfAbsent(c, 0);
            freqMap.put(c, freqMap.get(c) + 1);
        }

        Map<Character, Integer> sortedMap = freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        LinkedHashMap::new));

        System.out.println(sortedMap);
    }

}
