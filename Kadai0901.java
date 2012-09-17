// 20120907
// ‰Û‘è‚PF’·‚³‚P‚O‚Ì˜AŒ‹ƒŠƒXƒg‚ğ‚Â‚­‚é

public class Kadai0901 {

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

	}
}

class Cell{
	int value;
	Cell next;

	void setValue(int value){
		this.value = value;
	}

	void setNext(Cell next){
		this.next = next;
	}
}
