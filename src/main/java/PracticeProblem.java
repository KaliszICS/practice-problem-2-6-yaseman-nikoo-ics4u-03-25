public class PracticeProblem {

	public static void main(String args[]) {
		double arr[] = {155.2, 155.1, 1, 5, 3, 2, 7};
		//System.out.println(bubbleSort(arr)[0]);
		System.out.println(leastSwaps(arr));
		


	}
	public static int[] bubbleSort(double[] nums){
		int swaps=0;
		int steps=0;
		boolean swapped= true;
		for(int i=0; i<nums.length-1 && swapped;i++){
			swapped =false;
			for(int j=0;j<nums.length-1-i;j++){
				if(nums[j]>nums[j+1]){
					swapped=true;
					double tem =nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=tem;
					swaps=swaps+3;
				}
				steps++;
			}
		}
		int[] answer= {swaps, steps};
		return answer;
	}
	public static int[] selectionSort(double[] nums){
		int swaps=0;
		int steps=0;
		for(int i=0; i<nums.length-1; i++){
			int smallest=i;
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[smallest]){
	
					smallest=j;
					swaps++;
				}
				steps++;
		
			}
				
			double temp=nums[smallest];
			nums[smallest]=nums[i];
			nums[i]=temp;
			swaps+=3;
			
		}
		int[] answer= {swaps, steps};
		return answer;
	}
	public static int[] insertionSort(double[] nums){
		int swaps=0;
		int steps=0;
		for(int i=0; i <nums.length;i++){
			double key=nums[i];
			swaps++;
			int index=i-1;
			while(index>=0 && key< nums[index]){
				steps++;
				nums[index+1]=nums[index];
				index--;
				swaps++;
			}
			nums[index+1]=key;
			swaps++;
		}
		int[] answer={swaps, steps};
		return answer;
	}
	public static String leastSwaps(double[] nums){
		double[] nums2 = new double[nums.length];
		double[] nums3=new double[nums.length];
		for(int z=0;z<nums.length ;z++){
			nums2[z]=nums[z];
			nums3[z]=nums[z];
			}
			System.out.println();
		
		int swaps= 0;
		boolean swap=true;
		for(int i=0; i<nums.length-1 && swap;i++){
		
			swap=false;
			for(int j =0; j<nums.length-1-i;j++){
				if (nums[j]>nums[j+1]){
					double temp= nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					swaps+=3;
					swap=true;
				}
			}
		}
		System.out.println();
		int swaps3=0;
		
		
		int swaps2=0;
		for(int x=0;x<nums2.length; x++){
			int smallest=x;
			swaps2++;
			for(int y=x+1;y<nums2.length;y++){
				if(nums2[smallest]>nums2[y]){
					smallest=y;
				}
			}
			double temp=nums2[smallest];
			nums2[smallest]=nums2[x];
			nums2[x]=temp;
			swaps2+=3;
		}
		for(int h=0; h <nums3.length;h++){
			double key=nums3[h];
			swaps3++;
			int index=h-1;
			while(index>=0 && key< nums3[index]){
				nums3[index+1]=nums3[index];
				index--;
				swaps3++;
			}
			nums3[index+1]=key;
			swaps3++;
		}
		String answer;
		if (swaps<=swaps2){
			if(swaps<=swaps3){
				answer= "Bubble";
			}
			else{
				answer ="Insertion";
			}
		}
		else if(swaps2>=swaps3){
			answer = "Insertion";
		}
		else{
			answer ="Selection";
		}
		System.out.println(swaps + " "+ swaps2 + " " +swaps3);
		return answer;
	}
}
