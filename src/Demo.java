import java.util.Scanner;

/**
 * Created by faithpercious on 2017/10/7.
 */
public class Demo {
    public void sort(int x[]){
        int h[]=x;
        if (h[0]>h[1]){
            if (h[0]>h[2]){
                //h0最大
                if (h[1]<h[2]){
                    //h[2]第二
                    int t;
                    t=h[2];
                    h[2]=h[1];
                    h[1]=t;
                    return;
                }
                else {
                   return;
                }
            }
            else {
                //h2最大,h1最小
                int t;
                int z;
                t=h[0];
                h[0]=h[2];
                z=h[1];
                h[1]=t;
                h[2]=z;
            }
        }
        else {
            if (h[1]>h[2]){
                //h1最大
                if (h[0]>h[2]){//h1,h0,h2
                    int xe;
                    xe=h[0];
                    h[0]=h[1];
                    h[1]=xe;
                }
                else{
                    int xs;
                    xs=h[0];
                    h[0]=h[1];
                    h[1]=h[2];
                    h[2]=xs;
                }
            }
            else {
                int zx;
                    zx=h[0];
                    h[0]=h[2];
                    h[2]=zx;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入三个数字，输入后会进行从大到小的排序");
      int  xyz[]=new int[3];
      for (int i=0;i<3;i++){
          Scanner scanner=new Scanner(System.in);
         xyz[i]=scanner.nextInt();
      }
        Demo demo=new Demo();
        demo.sort(xyz);
        for (int x=0;x<3;x++){
            if (x==2)
            System.out.print(xyz[x]);
            else  System.out.print(xyz[x]+",");
        }
    }
}
