package mike.basic.practice;

import java.util.Scanner;

public class multiple {          //公倍数

    public static void main(String arg[]){


        int x,y;
        x=5>>2;y=x>>>2;
        System.out.println("请输入两个数："+y );
        Scanner in =new Scanner(System.in);
//        int m=in.nextInt();
//        int n=in.nextInt();
//        System.out.println("最小公倍数为="+m*n/gbs(m,n));


        System.out.println(Math.round(11.9));
        System.out.println(16<<1);
//        int a[] = {5,9,3,4,7,10};
//        ins(a,6);
//        for (int b:a) {
//            System.out.println(b);
//        }


    }

   public static int gbs(int a,int b){
       if(a%b==0)
           return b;
       else
           return gbs( b,(a%b));
    }
    void ins(int a[],int n){
        for (int i=1;i<n;i++){
            if (a[i]<a[i-1]) {
                int j=i-1;
                int x=a[i];
                a[i]=a[i-1];
                while(j>=0&&x<a[j]){
                    a[j+1] = a[j];
                    j--;
                }
                a[j + 1] =x ;
            }
        }
    }
}