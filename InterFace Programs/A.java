public interface A {
    
        public static void printA(){
            int sum =0;
            int mul=0;
            int[] a={1,2,3,4,5,6,7};
            for(int i=0; i<=a.length-1;i++)
            {
                if(i%2==0)
                sum=sum+i;
                else
                mul=mul*i;
        
            }
             System.out.println(sum);
             System.out.println(mul);
        }
        
         }
         class Main
         {
            
            public static void main(String[] args) {
                Main m=new Main();
                m.printA();
            }

            private void printA() {
            } 
        }
    
        
         
