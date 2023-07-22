package javaPrograms;

public class SubStringPalindrom {

	public static void main(String[] args) {
		
        String s="ab12321bajkkjh3432";
          for(int i=0;i<s.length();i++)
          {
       	   for(int j=i;j<s.length();j++)
        
       		{
       			String s1=s.substring(i,j);
       			String s2="";
       		for(int k=s1.length()-1;k>=0;k--) {
       			s2=s2+s1.charAt(k);
       		}
       		if(s1.equals(s2)&&s1.length()>2)//comparing
       		{
       			System.out.println(s1);
       		}
       		}
       	
       	}
          
        }

}
