// �ۑ�T�F�A�����X�g����w�肳�ꂽ�l���폜����

public class Kadai0905 {

	// �w�肳�ꂽ�l������Cell���폜����
	static void remove_ll(Cell c,int value){
		Cell current = c;
		while(c != null && c.next != null){
			// �P�R�悪�Y������Cell��������A��΂��ĂQ�R���next�ɑ������
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
		// �l44������Cell���폜���郁�\�b�h���Ăяo��
		// ��22����110���w�肵�����肭�폜�ł������A
		//  11(�擪��Cell)�����͂��܂��폜�ł��Ȃ������B
		remove_ll(head,44);
		System.out.println();
		print_ll(head);
	}
}
