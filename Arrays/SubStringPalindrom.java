class SubStringPalindrom {
    public static void main(String[] args) {
        String S = "ab12321bakjkkjh3432";
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                String s1 = S.substring(i, j);
                String s2 = "";
                for (int k = s1.length() - 1; k >= 0; k--) {
                    s2 = s2 + s1.charAt(k);
                }
                if (s1.equals(s2) && s1.length() > 2) {
                    System.out.println(s1);
                }
            }
        }
    }
}