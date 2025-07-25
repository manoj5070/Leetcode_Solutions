class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int n = str2.length();
        int m = str1.length();
        for (int i = 0; i < n; i++) {
            String pattern = str2.substring(0, i + 1);
            int len = pattern.length();
            if (m % len != 0 || n % len != 0)
                continue;
            boolean flag = true;
            for (int j = 0; j + len <= m; j += len) {
                if (!str1.substring(j, len + j).equals(pattern)) {
                    flag = false;
                    break;
                }
            }
            if(!flag) continue;
            boolean flag2 = true;   
            for (int j = 0; j + len <= n; j += len) {
                if (!str2.substring(j, len + j).equals(pattern)) {
                    flag2 = false;
                    break;
                }
            }
            if (flag2) {
                sb = new StringBuilder(pattern);
            }
        }
        return sb.toString();
    }
}