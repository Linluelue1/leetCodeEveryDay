import java.util.*;

public class mysqlGroupBy {
    public static int[][] calSql(int[][] t,int a,int b,int c){
        Map<Integer,int[]> group = new HashMap<>();
        for(int[] row : t){
            int groupKey = row[c-1];
            if(!group.containsKey(groupKey)){
                group.put(row[c-1],new int[]{0,0});
            }
            int[] countAndSum = group.get(groupKey);
            countAndSum[0]++;
            countAndSum[1]+=row[b-1];
        }

        int[][] result = new int[group.size()][3];
        int index=0;
        for(Map.Entry<Integer,int[]> entry : group.entrySet()){
            result[index][0]=entry.getKey();
            result[index][1]=entry.getValue()[0];
            result[index][2]=entry.getValue()[1];
            index++;
        }
        return result;
    }
    public static void main(String[] args) {

        int[][] t = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 3}};

        int a=1,b=2,c=3;

        int[][] arr = calSql(t,a,b,c);

        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
