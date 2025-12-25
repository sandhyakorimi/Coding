import java.util.Arrays;
public class HashMap {
    private int[] map;

    public void hashMap(){
        map = new int[1000001];
        Arrays.fill(map,-1);
    }

    public void put(int key, int value){
        map[key]= value;
    }

    public int get(int key){
        return map[key];
    }

    public void remove(int key){
        map[key]=-1;
    }
}
// MyHashMap is implemented using an integer array with direct addressing.
// Each index represents a key, and the value stored is the mapped value.
// -1 is used to indicate the absence of a key.
// All operations run in O(1) time, but it uses extra space for the fixed key range.