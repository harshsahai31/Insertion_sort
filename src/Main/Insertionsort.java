package Main;

public class Insertionsort {
	void insertionsort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			int temp = arr[i];
			int  j= i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	void print(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,8,3};
		Insertionsort is = new Insertionsort();
		is.insertionsort(arr);
		is.print(arr);
	}
}
