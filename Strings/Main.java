public class Main {
    public static void main(String[] args) {
        String s= "a2b3c4d5";
        for(int i=0; i<=s.length()-1;i=i+2){
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            int n= (int)(c2-48);
            for(int j=1;j<=n;j++){
                System.out.println(c1);
            }
        }
    }
}
