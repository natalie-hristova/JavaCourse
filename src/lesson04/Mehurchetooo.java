package lesson04;

public class Mehurchetooo {
	public static void main (String[]args){
		int arr[]={9,5,1,3,2,7};
		for(int i=0;i<arr.length-1;i++){
			for (int j=0;j<arr.length -1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
	}

}
