class Test1 {
    public static void main(String[] args)
    {
        char[] arr={'$','a','t','h','y','@','#','2','5'} ;   
        int big=0;
        for(int i=0;i<=arr.length-1;i++){
            int x=arr[i]-48;
            if(x>big)
            {
                big=x;
            }
        }
        System.out.println("Big :"+big);
    }
}
