//Write a program to sort frames using appropriate sorting techniques
//sorts the frames in ascending order and not data
import java.util.*;

public class SortFrames {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<int[]> frame=new ArrayList<>();
        System.out.println("Enter the number of the frames");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            Random random=new Random();
            int seqNum= random.nextInt(10000)+1;
            System.out.printf("Enter the data for %dth frame\n",i+1);
            int data=in.nextInt();
            frame.add(new int[]{seqNum,data});
        }
        System.out.println("\nBefore Sorting");
        for(int[] i:frame)
            System.out.printf("SeqNum->%d,Data->%d\n",i[0],i[1]);
        sort(frame);
        System.out.println("\nAfter Sorting");
        for(int[] i:frame)
            System.out.printf("SeqNum->%d,Data->%d\n",i[0],i[1]);
    }

    private static void sort(List<int[]> frame) {
        frame.sort(Comparator.comparingInt(a -> a[0]));
    }
}
