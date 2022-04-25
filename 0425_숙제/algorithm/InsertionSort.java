
public class InsertionSort {
	
	public static void main(String[] args) {
        //삽입정렬을 이용하여 오름차순 정렬!
		int array[] = {8, 5, 6, 2, 4};
		int temp = 0;
		for(int i=0; i<array.length-1; i++) { // 0, 1, 2, 3 번까지
			for(int j=i; j>=0; j--) {
				int prevJ = array[j]; // 앞에 자리 j (큰 수가 들어와야 if실행)
				int nextJ = array[j+1]; // 뒤에 자리 j (작은 수가 들어와야 if실행)
				if(prevJ>nextJ) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				} else break; // 앞에서부터 진행했기 때문에 만약 if문이 실행 안한다면 앞에 수는 정렬 된 것
			}
		}
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
	}
}
