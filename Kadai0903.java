// 20120907
// �ۑ�R�F�A�����X�g����w�肳�ꂽ�l���o�͂���
import java.util.Scanner;
public class Kadai0903 {

	static void search_ll(Cell c, int n){
		while(c != null){
			if(c.value == n){
				System.out.println(c + " " + c.value);
			}
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
		// �T������l����͂���
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		// �T������
		search_ll(first,num);
	}
}
