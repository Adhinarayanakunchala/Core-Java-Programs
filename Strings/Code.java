

class Code
{
    public static void main(String[] args) {
        String s="APpelE";
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch>='A' && ch<='Z')&&(ch>='a'&&ch<='z'))
        {
            ch x= (char)(ch+32);
          
        }
        else
        {
            char x=ch;
           
        }
        
    }
    System.out.println();
    }
}