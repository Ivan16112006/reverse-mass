public class Main {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 66};
		a = reverse(a, 0);
		for(int i: a) System.out.println(i);
	}
	static int[] reverse(int[] mas, int a){
		int b = mas.length;
		int an = mas[b-1-a];
		mas[b-1-a] = mas[a];
		mas[a] = an;
		if(a+2<=b/2){
			mas = reverse(mas, a+1);
		}
		return mas;
	}
}