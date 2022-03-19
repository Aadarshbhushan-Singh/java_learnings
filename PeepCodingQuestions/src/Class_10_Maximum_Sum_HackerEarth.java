//Sample Input
//2
//4 1
//3 -1 2 5
//4 2
//2 1 2 5

//Sample Output
//5
//9


import java.util.*;

public class Class_10_Maximum_Sum_HackerEarth {
	public static void main(String args[] ) throws Exception {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        while(t>0){
            int n=scn.nextInt();
            int k=scn.nextInt();

            ArrayList<Integer> arr1=new ArrayList<>();
            for(int i=0; i<n; i++){
                int x=scn.nextInt();
                arr1.add(x);
            }

            Map<Integer, Integer> map1=new TreeMap<>();
            for(int ele: arr1){
                if(map1.containsKey(ele)){
                    int x1=map1.get(ele);
                    map1.put(ele, x1+1);
                }else{
                    map1.put(ele, 1);
                }
            }

           

            Set<Integer> set1=new HashSet<>(arr1);
            ArrayList<Integer> arr2=new ArrayList<>(set1);
            Collections.sort(arr2);

            ArrayList<Integer> finalArr=new ArrayList<>();
            for(int ele: arr2){
                int n1=ele;
                int n2=map1.get(ele);
                int n3=n1*n2;
                finalArr.add(n3);
            }

            

            Collections.sort(finalArr, Collections.reverseOrder());

            int sum=0;
            for(int i=0; i<k; i++){
                int n4=finalArr.get(i);
                sum+=n4;
            }

            System.out.println(sum);
            t--;
        }

    }
}
