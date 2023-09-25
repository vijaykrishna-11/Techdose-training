import java.util.*;

class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String k = String.valueOf(ch);
            if (!map.containsKey(k)) {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(k, l);
            } else {
                List<String> s = map.get(k);
                s.add(strs[i]);
                map.put(k, s);
            }
        }
        System.out.println(map);
        return new ArrayList<>(map.values());
    }
}