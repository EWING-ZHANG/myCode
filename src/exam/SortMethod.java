package exam;

public class SortMethod {
    public static void main(String[] args) {
        method method = new method();
        int[] array = {2, 1, 4, 9, 5};
        method.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

class method {
    public void quickSort(int[] array, int left, int right) {
        if(left<right){//base情况 打破递归的时候  区级中还有元素需要分开时候才进行
            int index = partition(array, left, right);
            quickSort(array, left, index-1);
            quickSort(array, index + 1, right);
        }
    }

    public int partition(int[] array, int left, int right) {
        //基准元素
        int pivot = array[left];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            //从l开始找到大于等于基准元素的
            while (l <= r && array[l] < pivot) {
                l++;
            }
            //从r开始找到小于等于基准元素的
            while (l <= r && array[r] > pivot) {
                r--;
            }
            //此时l和r的元素进行交换
            if (l <= r) {
                swap(array, l, r);
                l++;
                r--;
            }
        }
        //换分区的位置并且 返回分区的位置
        swap(array, left, r);
        return r;

    }
    public void swap(int[] array, int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

}


