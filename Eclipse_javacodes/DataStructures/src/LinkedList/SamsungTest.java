package LinkedList;

import java.util.*;


class SamsungTest {
    public static int small=Integer.MAX_VALUE;
    public static void main(String args[] ) throws Exception {
    	
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int arr[] = new int[n];
        //small =Integer.MAX_VAlUE;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for(int a=0; a<q; a++){
            int l = s.nextInt();
            int r = s.nextInt();
            int subarr[]=new int[r-l+1];
            for(int i=l-1,j=0; (i<r&&j<subarr.length); i++,j++)
            {
                subarr[j]=fib(arr[i]);
            }
           
            for(int i=small; i>0; i--){
            	boolean flag=true;
                for(int j=0; j<subarr.length; j++){
                        if(subarr[j]%i!=0){
                            flag=false;
                        }
                }
                if(flag){
                    System.out.println(i);
                    break;
                }
            }
                
        }
    }
    static int fib(int num){
           int f1=0,f2=1,f3=0;
           for(int i=1; i<num; i++){
               f3=f1+f2;
               f1=f2;
               f2=f3;
           }
           if(f3<small){
               small=f3;
           }
           return f3;
       }
}
