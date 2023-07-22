public class Code2 {
    public static void main(String[] args) {
        char[] arr={'$','a','t','h','y','@','#','2','5'};
        
        for(int i='0';i<=arr.length-1;i++)
        {
            char ch=arr[i];
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
                System.out.println(ch);
            }
           
        }
        
    }

    
}
