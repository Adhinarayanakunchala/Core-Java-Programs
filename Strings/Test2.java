public class Test2 {
    public static void main(String[] args)
    {
        char[] arr={'$','a','t','h','y','@','#','2','5'};
        for(int i=arr.length-1;i>=0;i--)
        {
            char ch=arr[i];
            if(ch>='0'&&ch<='9')
            {
                System.out.println(ch);
            }
        }

    }
}
