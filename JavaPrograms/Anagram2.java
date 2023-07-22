
public class Anagram2 {
    public static void main(String[] args) {
        
        String s1="Adi";
        String s2="diA";
        int count=0;
        if(s1.length()==s2.length())
        {
          for(int i=0; i<s1.length(); i++)
          {
            char ch1=s1.charAt(i);
            
            for(int j=0; j<s2.length(); j++)
            {
                char ch2=s2.charAt(j);
                if(ch1==ch2)
                count=1;
                break;
                
            }
            if(count==0)
            {
            System.out.println("Strings are Equal");
            }
          }
          if(count==1)
          {
          System.out.println("Strings are Anagram");
          }
        }
        else
        {
            System.out.println("Strings are not Anagrams");
        }
    }
}
