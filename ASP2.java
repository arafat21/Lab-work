import java.util.*;
public class ASP2 {
    public static void sorting(String[] items,int[] start,int[] finish){
        for (int i=1;i<finish.length;i++) {
            int key=finish[i];
            String key1=items[i];
            int key2=start[i];
            int j=i-1;
            while (j>=0 && finish[j]>key) {
                finish[j+1]=finish[j];
                start[j+1]=start[j];
                items[j+1]=items[j];
                j=j-1;
            }
            finish[j+1]=key;
            items[j+1]=key1;
            start[j+1]=key2;
        }
    }
    public static void selectActivities(String[] items,int[] start,int[] finish){
        sorting(items,start,finish);
        System.out.print(items[0]+" ");
        int fin=finish[0];
        for(int i=1;i<finish.length;i++){
            if(fin<=start[i]){
                System.out.print(items[i]+" ");
                fin=finish[i];
            }
        }
    }

    public static void main(String[] args) {
        String[] items={ "A1" ,"A2","A3","A4","A5","A6"};
        int[] start={0,3,1,5,5,8};
        int[] finish={6,4,2,9,7,9};
        
        selectActivities(items,start,finish);
    }
}
