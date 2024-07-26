public class marge {
    static void displayArray(int[]array){
       for(int value:array) {
        System.out.println(value+" ");
       }
    }
    static void merge(int[]array,int l,int mid,int r){
     int n1=mid-l+1;
     int n2=r-mid;
     int[]left=new int[n1];
     int[]right=new int[n2];
     int i,j,k;
     for(i=0;i<n1;i++) left[i]=array[l+i];
     for(j=0;j<n2;j++) right[j]=array[mid+1+j];
     i=0;
     j=0;
     k=l;
     while(i<n1 && j<n2){
        if(left[i]<right[j])
        array[k++]=left[i++];
        else
        array[k++]=right[j++];
     }
     while(i<n1)
     array[k++]=left[i++];
     while(j<n2)
     array[k++]=right[j++];
    }
    static void mergeSort(int []array,int l,int r){
       if(l>=r) return;
     int mid=(l+r)/2;
     mergeSort(array ,l,mid);
     mergeSort(array,mid+1,r);
     merge(array,l,mid,r);
    }
    public static void main(String[]args){
    int array[]={4,5,2,9,8,7};
    int n=array.length;
    System.out.println("array before sorting");
    displayArray(array);
    mergeSort(array,0,n-1);
    System.out.println("array after sorting");
    displayArray(array);
    }
    
}
