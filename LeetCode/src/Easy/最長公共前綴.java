package Easy;
class 最長公共前綴 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        String[] example2 = {"dog", "racecar", "car"};

        System.out.println("範例1結果: " + longestCommonPrefix(example1)); // fl
        System.out.println("範例2結果: " + longestCommonPrefix(example2)); // ""
    }
}
