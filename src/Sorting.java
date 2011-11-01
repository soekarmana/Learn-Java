public class Sorting {
	
	private static void tukar(int[] array, int a, int b){
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
		//System.out.print("Angka 1 = " + a + " Angka2 = " + b);
	}
	
	public static void bubblesort(){
		int[] isi = new int[5];
		
		isi[0] = 5;
		isi[1] = 1;
		isi[2] = 3;
		isi[3] = 9;
		isi[4] = 2;
		
		for (int i = 1; i <= isi.length; i++) {
			for (int j = isi.length - 1; j > 0; j--) {
				if (isi[j-1] > isi[j]) {
					tukar(isi, j-1, j);
				}
			}
		}
		
		for (int i = 0; i < isi.length; i++) {
			System.out.print(isi[i]+" ");
		}
	}
	
}
