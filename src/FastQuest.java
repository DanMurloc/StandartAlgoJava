public class FastQuest {


    //Найти число в отсутсвующей последовательности
    //можно использовать только один цикл
    public void CheckNumber()
    {
        int [] arra = new int[] {4,1,3,7,2,5,6,9};
        int sum = 0;
        int sum2=0;
        for (int i = 0; i < arra.length;i++)
        {
            sum2 = sum2+i+1;
            sum+=arra[i];
        }
        sum2 +=arra.length+1;
        int result = sum2 - sum;
        System.out.println(result);

    }
}
