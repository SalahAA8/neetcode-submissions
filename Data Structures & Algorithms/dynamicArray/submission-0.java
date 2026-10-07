class DynamicArray {

    private int[] dynamicarray;
    private int size = 0;

    public DynamicArray(int capacity) {
        dynamicarray = new int[capacity];
    }

    public int get(int i) {
        return dynamicarray[i];
    }

    public void set(int i, int n) {
        dynamicarray[i] = n;
    }

    public void pushback(int n) {
        if (size == dynamicarray.length) {
            resize();
        }

        dynamicarray[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return dynamicarray[size];
    }

    private void resize() {
        int[] newArray = new int[dynamicarray.length * 2];

        for (int i = 0; i < size; i++) {
            newArray[i] = dynamicarray[i];
        }

        dynamicarray = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return dynamicarray.length;
    }
}