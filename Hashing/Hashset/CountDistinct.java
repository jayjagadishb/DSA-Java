package Hashset;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String args[]){
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.print(hs.size());
    }
}
