// �ۑ�U�F�Q�̘A�����X�g����������

public class Kadai0906 {

	static void connect_ll(Cell first, Cell second){
		// �A�^�}�ɂȂ郊�X�g�̐擪�m�[�h�� current �Ƃ���
		Cell current = first;
		// current �������m�[�h�ɂȂ�܂� while������
		while(current.next != null){
			current = current.next;
		}
		// while���𔲂������Acurrent�ɂ͖����m�[�h�������Ă���B
		// ���̂��߁A���̃m�[�h�Ƃ���,�I�V���ɂȂ郊�X�g�̐擪�m�[�h���w�肷��B
		current.next = second;
	}

	static void print_ll(Cell c){
		while(c != null){
			System.out.println(c.value);
			c = c.next;
		}
	}

	public static void main(String args[]){
		// �A�����X�g���Q����B�ihead1��head2�j
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

		// head1��head2�̃��X�g�����ꂼ��o��
		print_ll(head1);
		System.out.println();
		print_ll(head2);
		// head2�̃��X�g��head1�ɘA��
		connect_ll(head1,head2);
		System.out.println("-----------------");
		// head1���o�́i�������ꂽ���́j
		print_ll(head1);
	}
}
