package StrToInt;

 class NewSum {
    public int[] twoSum(int[] nums, int target) {
        int match[]=new int[2];
        loop:
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            if(target==nums[i]+nums[j])
            {
            	match[0]=i+1;
            	match[1]=j+1;
            	break loop;
            }

            
        }
        return match;
    }
}

public class Sum {

	public static void main(String[] args)
	{
		int[] numbers={2,1,9,4,4,56,90,3};
		int[] result=new int[2];
		int target=8;
		NewSum ns=new NewSum();
		result=ns.twoSum(numbers, target);
		System.out.println("hi");
		
	}
}
