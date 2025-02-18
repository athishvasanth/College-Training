import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        print(nums, 9);
        fun();
        gun();
    }
    static void fun(){
        int [] nums={3,2,4};
        print(nums, 6);
    }
    static void gun(){
        int [] nums={3,3};
        print(nums, 6);
    }



    static void print(int[] nums,int target){
        int [] sumy=new int [2];
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    sumy[0]= i;
                    sumy[1]= j;

                }
            }


        }
        for (int i=0;i< sumy.length-1;i++){
            System.out.println(Arrays.toString(sumy));
        }


    }
}

