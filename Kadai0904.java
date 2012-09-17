// 20120907
// 課題４：連結リストに指定された値を挿入する
// ・Listの途中に挿入させることが出来るだけで、
// 　Listの先頭や末尾に挿入することは、これではできません。

// 他の課題で定義したCellと競合してしまうので、便宜的に「Cell3」という名で定義する
class Cell3 {
	int value;
	Cell3 next;

	Cell3(int value){
		this.value = value;
		this.next = null;
	}
}
public class Kadai0904 {

	static void insert_ll(int value, int target, Cell3 head){
		Cell3 current = head;
		while(current.next != null){
			if(current.next.value == target){
				Cell3 tmp = current.next;
				current.next = new Cell3(value);
				current.next.next = tmp;
				break;
			}
			current = current.next;
		}
	}

	static void print_ll(Cell3 c){
		while(c != null){
			System.out.println(c.value);
			c = c.next;
		}
	}

	public static void main(String args[]){
		Cell3 head = new Cell3(0);
		Cell3 current = head;

		current.next = new Cell3(0);

		for(int i=1;i<11;i++){
			current = current.next;
			current.value = i;
			if(i==10){
			current.next = null;
			} else{
			current.next = new Cell3(i+1);
			}
		}
		//挿入前を出力
		print_ll(head);
		System.out.println("----------");
		// 値が100のノードを、値5をもつノードの手前に挿入する
		insert_ll(100,5,head);
		//挿入後を出力
		print_ll(head);
	}

}