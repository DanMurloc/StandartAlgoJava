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
}
