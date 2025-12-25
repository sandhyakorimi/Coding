public class HashSet {
    private boolean[] data;

    public void MyHashSet(){
        data = new boolean[1000001];
    }

    public void add(int key){
        data[key] = true;
    }

    public void remove(int key){
        data[key] = false;
    }

    public boolean contains(int key){
        return data[key];
    }
}


// “MyHashSet is implemented using a boolean array.
// Each index represents a key.
// true means the key is present and false means it is absent.
// The add method sets the key to true, the remove method sets it to false,
// and the contains method checks whether the key exists.”