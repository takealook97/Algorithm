public class LC14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) return "";
        else if (strs.length == 1) return strs[0];
        out:
        for (int i = 0; i < strs[0].length(); i++) {
            boolean check = false;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1) break out;
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    check = true;
                } else {
                    check = false;
                    break out;
                }
            }
            if (check) sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}