import java.util.ArrayList;
class Autoboxing
{
	public static void main(String[] args) {
		char ch='a';

		Character a = ch; //autoboxing - nilai primitive sebelum dikonversi 
		ArrayList<Integer> arrayList= new ArrayList<Integer>();//nilai primitive dikonver menjadi character object
		arrayList.add(25);//memasukkan nilai character object
		System.out.println(arrayList.get(0));//menampilkan hasil charcter object
	}	
}