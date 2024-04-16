
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        int[] ArrOrigin  = {8,4,7,1,2};
        int[] arr =ArrOrigin.clone();
        SortingStandartClass a = new SortingStandartClass();
        a.BubbleSort(arr);
        for(int n : arr)
            System.out.printf(n+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        a.RevBubbleSort(arr);
        for (int n: arr)
            System.out.printf(String.valueOf(n)+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        a.BubbleInSort(arr);
        for (int item : arr)
            System.out.printf(String.valueOf(item)+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        a.RevBubbleInSort(arr);

        for (int item : arr)
            System.out.printf(String.valueOf(item)+" ");
        System.out.println("\n####################################");
        System.out.println("Проверка");
        System.out.println("\n####################################");

    }
}