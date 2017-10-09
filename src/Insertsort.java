import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by faithpercious on 2017/10/9.
 */
public class Insertsort {//插入排序
    public void sort(int x[]){
        List<Integer> list=new ArrayList<>();
        int currentnum; //记录当前值
        list.add(x[0]);
        for (int i=0;i<x.length-1;i++){//i为list的最大下标
            for (int k=i;k>=0&&x[i+1]<list.get(k);k--){//分两种情况，第一种x[k]插入list内部
                if (k>0&&x[i+1]>list.get(k-1)){
                   currentnum=x[i+1];
                    x[i+1]=list.get(k-1);
                     list.add(k,currentnum);
                }
            }
            if (i<x.length&&x[i+1]>list.get(i)){//第二种直接放最外面
            list.add(i+1,x[i+1]);
            }
        }
        for (int k=0;k<list.size();k++){//进行输出
            if (k==list.size()-1)
            System.out.print(list.get(k));
            else   System.out.print(list.get(k)+",");
        }
    }
    public static void main(String[] args) {
        //测试的数据
        System.out.println("请输入待排序数字的数量");
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int x[]=new int[t];
        System.out.println("请输入排序的数字");
        for (int f=0;f<t;f++){
            int z=scanner.nextInt();
            x[f]=z;
        }
        Insertsort a=new Insertsort();
        System.out.println("排序结果为：");
        a.sort(x);
    }
}
