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
}
