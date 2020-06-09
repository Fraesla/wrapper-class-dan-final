import java.util.ArrayList;
class Unboxing
{
	public static void main(String[] args) {
		char ch='a';

		Character a = ch; //unboxing - nilai primitive sebelum dikonversi

		ArrayList<Integer> arrayList= new ArrayList<Integer>(); //nilai primitive dikonver menjadi character object
		arrayList.add(24);//memasukkan nilai character object

		int num=arrayList.get(0);//character object dikonver menjadi nilai primitive

		System.out.println(num);//menampilkan hasil character object setelah dikonversi
	}	
}