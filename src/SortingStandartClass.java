import java.util.Random;

public class SortingStandartClass
{
    //Сортировка пузырьком
    public void BubbleSort(int [] Arr)
    {
        for (int i=0; i<Arr.length;i++)
        {
            for (int j =0; j<Arr.length-i-1;j++)
            {
                if (Arr[j]>Arr[j+1])
                {
                    int temp = Arr[j+1];
                    Arr[j+1]=Arr[j];
                    Arr[j]=temp;
                }
            }
        }
    }

    //Сортировка пузырьком по убыванию
    public void RevBubbleSort(int [] Arr)
    {
        for (int i =0; i<Arr.length;i++)
        {
            for (int j=0; j<Arr.length-i-1; j++)
            {
                if (Arr[j]<Arr[j+1])
                {
                    int Temp = Arr[j+1];
                    Arr[j+1] = Arr[j];
                    Arr[j]=Temp;
                }
            }
        }
    }

    //Сортировка пузырьком  обратно
    public void BubbleInSort(int[] Arr)
    {
        for (int i = Arr.length-1; i>=0; i--)
        {
            for (int j = 0; j < Arr.length-1; j++)
            {
                if (Arr[j]>Arr[j+1])
                {
                    int Temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1]= Temp;
                }
            }
        }
    }

    //Сортировка пузырьком по убыванию обратно
    public void RevBubbleInSort(int[] Arr)
    {
        for (int i = Arr.length-1; i>=0;i--)
        {
            for (int j = 0; j<Arr.length-1;j++)
            {
                if (Arr[j]<Arr[j+1])
                {
                    int temp = Arr[j+1];
                    Arr[j+1] = Arr[j];
                    Arr[j]=temp;
                }
            }
        }
    }

    //Шейкер сортировка
    public void CocktailSort(int[] Arr)
    {
        int left =0;
        int right = Arr.length-1;
        while (left<right)
        {
            for (int i=left; i<right;i++)
            {
                if (Arr[i]>Arr[i+1])
                {
                    int temp = Arr[i+1];
                    Arr[i+1] = Arr[i];
                    Arr[i]=temp;
                }
            }
            right--;

            for (int i = right; i>left;i--)
            {
                if (Arr[i]<Arr[i-1])
                {
                    int temp = Arr[i-1];
                    Arr[i-1]=Arr[i];
                    Arr[i]=temp;
                }
            }
            left++;
        }
    }

    public void RevCocktailSort(int[] arr)
    {
        int right = arr.length-1;
        int left = 0;

        while (left < right)
        {
            for (int i = left; i<right;i++)
            {
                if (arr[i]<arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            right--;

            for (int i = right; i>left; i --)
            {
                if (arr[i]>arr[i-1])
                {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] =temp;
                }
            }
        }
    }

    //Сортировка шейкера
    public void InsertSort(int [] arr)
    {
        for (int i = 1; i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i;

            while (j>0&&temp<arr[j-1])
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public int [] StalinSort(int[] arr){
        ManipulatingAnArray m = new ManipulatingAnArray();
        for (int i =0;i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1]){
                arr= m.RemoveAt(arr,i+1);
                i--;
            }
        }
        return arr;
    }

    //Сортировка Йог-сарона
    public int [] BogoSort(int[] arr)
    {
        boolean chek = true;
        ManipulatingAnArray m = new ManipulatingAnArray();
        while (chek)
        {
            for(int i=0; i < arr.length-1;i++){
                if (arr[i]> arr[i+1])
                {
                    chek =true;
                    arr=m.shuffleArray(arr);
                    break;
                }
                if (arr[i]<arr[i+1]){
                    chek=false;
                }
            }
        }
        return arr;
    }

    public  int [] ChoiceSorting(int [] arr)
    {
        ManipulatingAnArray c = new ManipulatingAnArray();
        for (int i = 0; i< arr.length; i++){
            int index = c.MinEindex(arr, i);
           c.swapArr(arr,i, index);
        }
        return arr;
    }

    //быстрая сортировка
    public  void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

    }
}
