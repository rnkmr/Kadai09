// 課題５：連結リストから指定された値を削除する

public class Kadai0905 {

	// 指定された値をもつCellを削除する
	static void remove_ll(Cell c,int value){
		Cell current = c;
		while(c != null && c.next != null){
			// １コ先が該当するCellだったら、飛ばして２コ先をnextに代入する
			if(c.next.value == value){
				current.next = c.next.next;
			}
			c = c.next;
			current = c;
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
		// 値44をもつCellを削除するメソッドを呼び出す
		// ※22から110を指定したら上手く削除できたが、
		//  11(先頭のCell)だけはうまく削除できなかった。
		remove_ll(head,44);
		System.out.println();
		print_ll(head);
	}
}
