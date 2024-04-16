public  class ManipulatingAnArray<T>
{
    public void SwappArr(T[] arr, int k, int l)
    {
        T temp = arr[k];
        arr[k]=arr[l];
        arr[l] = temp;
    }

    public int[] RemoveAt(int[] arr, int ind)
    {
        int[] newArr = new int[arr.length-1];
        for (int i=0;i<ind;i++)
        {
            newArr[i] = arr[i];
        }
        for (int i = ind+1; i<arr.length;i++)
        {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

    public int[] RemoveAt2(int[] arr, int ind)
    {
        int[] newArr = new int[arr.length-1];
        if (ind >= 0) System.arraycopy(arr, 0, newArr, 0, ind);
        if (arr.length - (ind + 1) >= 0) System.arraycopy(arr, ind + 1, newArr, ind + 1 - 1, arr.length - (ind + 1));
        return newArr;
    }
}
