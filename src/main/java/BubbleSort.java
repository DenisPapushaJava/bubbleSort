public class BubbleSort {
    public void sort(int[] numbers){
        boolean isSorted;
        int num=numbers.length;
        do {
            isSorted = false;
            int lastSorted = num;
            for (int i = 1; i <num ; i++) {
                if (numbers[i-1]>numbers[i]){
                    swap(numbers,i-1,i);
                    isSorted = true;
                    lastSorted = i;
                }
            }num=lastSorted;
        }while (isSorted);
    }
private void swap(int[] values, int first, int second){
        int temp = values[first];
        values[first]=values[second];
        values[second]=temp;
}
}

