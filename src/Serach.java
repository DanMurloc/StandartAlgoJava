import java.io.File;
import java.util.List;

public class Serach {

    public int LinerSearch(int[] Arr, int elemetn)
    {
        for (int i = 0; i<Arr.length;i++)
        {
            if (Arr[i]==elemetn)
                return i;
        }
        return -1;
    }

    public int BinarySearch(int [] arr, int value)
    {
        int low =0;
        int high = arr.length-1;
        int index = -1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]<value)
                low= mid+1;
            else if (arr[mid]>value)
                high=mid -1;
            else
            {
                index=mid;
                break;
            }

        }
        return index;
    }

    public int BinarySearchReq(int[] arr, int value, int lef, int row)
    {
        if(lef==row)
        {
            return (arr[lef]==value) ? lef:-1;
        }
        int m = (row+lef)/2;
        if (value > arr[m])
            return BinarySearchReq(arr,value,m+1,row);
        else if (arr[m]>value)
            return BinarySearchReq(arr,value,lef,m-1);
        return m;
    }

    public void SearchFile(File rootFile, List<File> fileList)
    {
        if(rootFile.isDirectory()){
            File[] directotyFiles = rootFile.listFiles();
            if (directotyFiles != null){
                for(File file : directotyFiles)
                {
                    if(file.isDirectory())
                    {
                        SearchFile(file,fileList);
                    }
                    else {
                    if(file.getName().toLowerCase().endsWith(".png"));
                    fileList.add(file);
                    }
                }
            }
        }

    }
}
