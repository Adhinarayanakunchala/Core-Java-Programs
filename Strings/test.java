import javax.sql.rowset.spi.SyncResolver;

public class test {
    public static void main(String[] args)
    {
        char[] arr={'$','a','t','h','y','@','#','2','5'};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>='0'&&arr[i]<='9'){
            int x = arr[i]-48;
            sum=sum+x;
            }
        }
        System.out.println("Sum :"+sum);
    }

}
