public class PracticeProblem {

	public static void main(String args[]) {

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
		for(int i=0; i<nums.length; i++){
			int smallest=i;
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[smallest]){
					smallest=j;
				}
				steps++;
		
			}
				
			double temp=nums[smallest];
			nums[smallest]=nums[i];
			nums[i]=temp;
			swaps=swaps+4;
			
		}
		int[] answer= {swaps, steps};
		return answer;
	}
	public static int[] insertionSort(double[] nums){
		int swaps=0;
		int steps=0;
		for(int i=0; i <nums.length;i++){
			double key=nums[i];
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
}
