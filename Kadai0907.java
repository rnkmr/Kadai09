// �ۑ�V�F�P�̘A�����X�g���Q�ɕ�������
// �E�����ł��܂������A��둤�̃��X�g�̐擪�ɕK���A
// �@�l0�����m�[�h���]�v�ɏo�͂���Ă��܂��܂��B

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

		// head����n�܂�A�����X�g���A�l44�̃m�[�h�����ڂɕ������āA
		// �O���̃��X�g��head�A����̃��X�g��head2�Ƃ���B
		split_ll(head,44,head2);

		// �������ꂽ�Q�̃��X�g���o��
		print_ll(head);
		System.out.println();
		print_ll(head2);
	}
}
