import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Podaj ciąg znaków:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> wordCountMap = countWords(input);

        System.out.println("Wynik:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + "=" + wordCountMap.get(word));
        }
    }

    private static Map<String, Integer> countWords(String input) {
        String[] words = input.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Sortowanie mapy po kluczach
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}