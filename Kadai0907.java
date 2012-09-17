// 課題７：１つの連結リストを２つに分割する
// ・分割できましたが、後ろ側のリストの先頭に必ず、
// 　値0をもつノードが余計に出力されてしまいます。

public class Kadai0907 {

	static void split_ll(Cell head, int value, Cell head2){
		Cell current = head;
		while(current.next != null){
			if(current.next.value == value){
			head2.next = current.next;
			current.next = null;
			head2 = head2.next;
			break;
			}
			current = current.next;
		}
	}

	static void print_ll(Cell c){
		while(c != null){
			System.out.println(c.value);
			c = c.next;
		}
	}

	public static void main(String args[]){
		Cell head = new Cell();
		Cell current = head;

		current.value = 11;
		current.next = new Cell();

		for(int i=2;i<=10;i++){
			current = current.next;
			current.value = 10*i + i;
			current.next = new Cell();
		}
		current.next = null;

		print_ll(head);
		System.out.println("---------------");

		Cell head2 = new Cell();

		// headから始まる連結リストを、値44のノードを境目に分割して、
		// 前方のリストをhead、後方のリストをhead2とする。
		split_ll(head,44,head2);

		// 分割された２つのリストを出力
		print_ll(head);
		System.out.println();
		print_ll(head2);
	}
}
