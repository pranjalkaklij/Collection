import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if (hm.containsKey(arr[i])) {
            //     hm.put(arr[i], hm.get(arr[i])+1);
            // }
            // else
            // {
            //     hm.put(arr[i], 1);
            // }
            //instead of above lengthy code we can directly use getOrDefault(key, defaulyValue) fumction
            //this function check if key is present then return value of key and if key is not present then
            // set default value and it will return that value
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(hm);

        for (Integer key : hm.keySet()) { //keySet() returns the all keys from map
            if (hm.get(key) >arr.length/3) {
                System.out.println(key);
            }            
        }
    }
}
