public class LinearSearch {
    public static void main(String[]args){
        int[]nums ={1,23,45,65,78,19,85,3,99,987};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    //Search in the array: return the index if found
    //Otherwise if item not found return -1

    static int linearSearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //Run a for loop
        for(int index = 0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    
}
