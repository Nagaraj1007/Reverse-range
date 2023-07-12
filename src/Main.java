
public class Main {

    public static int[] reverseRange(int array[], int from , int to){
        while (from < to){
            int temporary = array[from];
            array[from] = array[to];
            array[to] = temporary;
            from++;
            to--;
        }
        return array;
    }

    public static void main(String[] args) {
        int resultArray[] = reverseRange(new int[]{2,5,6}, 0 ,2);
        for (int elements : resultArray){
            System.out.print(elements + " ");
        }
    }
}