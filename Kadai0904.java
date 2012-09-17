// 20120907
// �ۑ�S�F�A�����X�g�Ɏw�肳�ꂽ�l��}������
// �EList�̓r���ɑ}�������邱�Ƃ��o���邾���ŁA
// �@List�̐擪�▖���ɑ}�����邱�Ƃ́A����ł͂ł��܂���B

// ���̉ۑ�Œ�`����Cell�Ƌ������Ă��܂��̂ŁA�֋X�I�ɁuCell3�v�Ƃ������Œ�`����
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
		//�}���O���o��
		print_ll(head);
		System.out.println("----------");
		// �l��100�̃m�[�h���A�l5�����m�[�h�̎�O�ɑ}������
		insert_ll(100,5,head);
		//�}������o��
		print_ll(head);
	}

}