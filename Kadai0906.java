// 課題６：２つの連結リストを結合する

public class Kadai0906 {

	static void connect_ll(Cell first, Cell second){
		// アタマになるリストの先頭ノードを current とする
		Cell current = first;
		// current が末尾ノードになるまで while文を回す
		while(current.next != null){
			current = current.next;
		}
		// while文を抜けた今、currentには末尾ノードが入っている。
		// そのため、次のノードとして,オシリになるリストの先頭ノードを指定する。
		current.next = second;
	}

	static void print_ll(Cell c){
		while(c != null){
			System.out.println(c.value);
			c = c.next;
		}
	}

	public static void main(String args[]){
		// 連結リストを２つつくる。（head1とhead2）
		Cell head1 = new Cell();
		Cell current1 = head1;
		Cell head2 = new Cell();
		Cell current2 = head2;

		current1.value = 11;
		current1.next = new Cell();
		current2.value = -11;
		current2.next = new Cell();

		for(int i=2;i<=10;i++){
		current1 = current1.next;
		current2 = current2.next;
		current1.value = 10*i + i;
		current2.value = -10*i - i;
		current1.next = new Cell();
		current2.next = new Cell();
		}
		current1.next = null;
		current2.next = null;

		// head1とhead2のリストをそれぞれ出力
		print_ll(head1);
		System.out.println();
		print_ll(head2);
		// head2のリストをhead1に連結
		connect_ll(head1,head2);
		System.out.println("-----------------");
		// head1を出力（結合されたもの）
		print_ll(head1);
	}
}
