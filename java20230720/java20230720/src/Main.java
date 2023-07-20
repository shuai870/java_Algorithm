public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int N = 12;
        int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;

        /**
         * 这段代码，如果数据不在数组中则会陷入死循环
          */

        while(arr[mid]!=N){
            if(arr[mid] > N){
                right = mid;
                mid = (left + right)/2;
            }else if(arr[mid] < N){
                left = mid;
                mid = (left + right)/2;
            }
        }
        /**
         * 下面虽不会陷入死循环，但是会数组越界
         */
        while(arr[mid]!=N){
            if(arr[mid] > N){
                right = mid-1;
                mid = (left + right)/2;
            }else if(arr[mid] < N){
                left = mid+1;
                mid = (left + right)/2;
            }
        }
        /**
         * 这样合理了
         */
        while(arr[mid]!=N && left <= right ){
            if(arr[mid] > N){
                right = mid;
                mid = (left + right)/2;
            }else if(arr[mid] < N){
                left = mid;
                mid = (left + right)/2;
            }
        }
        System.out.println("数值是"+arr[mid]);
    }
}