// 20120907
// 課題２：連結リストをつくり、その値をすべて出力するプログラム

public class Kadai0902 {

	static void print_ll(Cell c){
		while(c != null){
			System.out.println(c.value);
			c = c.next;
		}
	}

	public static void main(String args[]){
		Cell first = new Cell();
		Cell current = first;

		current.value = 11;
		current.next = new Cell();

		for(int i=2;i<=10;i++){
			current = current.next;
			current.value = 10*i + i;
			current.next = new Cell();
		}
		current.next = null;

		print_ll(first);
	}
}

class Cell2{
	int value;
	Cell next;

	void setValue(int value){
		this.value = value;
	}

	void setNext(Cell next){
		this.next = next;
	}
}
