import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        /*
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
       arr = ArrOrigin.clone();

       a.CocktailSort(arr);
       for (int item: arr)
           System.out.printf(String.valueOf(item)+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();

        a.RevCocktailSort(arr);
            for (int item: arr)
                System.out.printf(String.valueOf(item)+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        var b = new ManipulatingAnArray<Integer>();
        Integer[] arrI = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        b.SwappArr( arrI,0,1);
        for (int item: arrI)
            System.out.printf(String.valueOf(item)+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();

        arr =b.RemoveAt(arr,3).clone();
        for (int item: arr)
            System.out.printf(item+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        arr =b.RemoveAt2(arr,3).clone();
        for (int item: arr)
            System.out.printf(item+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        arr = b.RemoveAtFirst(arr);
        arr = b.RemoveAtLast(arr);
        for (int item: arr)
            System.out.printf(item+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        arr = b.RemoveAllFromIndexForward(arr,3);
        for (int item: arr)
            System.out.printf(item+" ");
        System.out.println("\n####################################");
        arr = ArrOrigin.clone();
        arr = b.RemoveAllFromIndexBack(arr,3);
        for (int item: arr)
            System.out.printf(item+" ");
        System.out.println("\n####################################");
        int[] arrl = ArrOrigin.clone();

        int m = b.MinArrayElement(arrl);
        System.out.println("min="+m);
        m = b.MaxArrayElement(arrl);
        System.out.println("max="+m);
        System.out.println("\n####################################");
           */
        /*
        int[] arrOrigin2 ={4,2,1,6,8,9,2,1,2,1,3,6,2,7,9,2,1,99,9,9,9,9};
        int[] arring = arrOrigin2.clone();
        ManipulatingAnArray man = new ManipulatingAnArray();
        arring = man.ReverArr(arring);
        for (int i:arring)
            System.out.print(i+" ");
        System.out.println("\n#######################################");
        arring = arrOrigin2.clone();
        man.swapArr(arring,0,1);
        for(int i : arring)
            System.out.print(i+" ");
        System.out.println("\n#######################################");
        arring = arrOrigin2.clone();
        SortingStandartClass sot = new SortingStandartClass();
        sot.InsertSort(arring);
        for (int i : arring)
            System.out.print(i+" ");
        System.out.println("\n#######################################");
        */

        int [] arrayOrigin = {10,45,1,111,6,55,3,9,2,12,55};
        Serach c = new Serach();
        int k = c.LinerSearch(arrayOrigin,5);
        System.out.println(k+" ");
        int[] arrayOrio = {0,1,2,3,4,5,6,7,8,9,10};
        k = c.BinarySearch(arrayOrio,7);
        System.out.println(k);
        k = c.BinarySearchReq(arrayOrio,8,0,arrayOrio.length-1);
        System.out.println(k);
    }
}

