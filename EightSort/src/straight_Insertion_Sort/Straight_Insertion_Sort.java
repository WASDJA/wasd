package straight_Insertion_Sort;

public class Straight_Insertion_Sort {
	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 2, 4, 9, 6, 10, 8, 12 };
		Straight_Insertion_Sort obj = new Straight_Insertion_Sort();
		System.out.print("��ʼֵ��");
		obj.print(a);
		obj.insertSort(a);
		System.out.println("\n�����");
		obj.print(a);
	}

	public void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {// ��ͷ����һ�������Ѿ��ź���ģ��Ѻ����һ��һ���Ĳ嵽�Ѿ��źõ��б���ȥ��
			if (a[i] < a[i - 1]) {
				int j;
				int x = a[i]; // ����Ϊ�ڱ������洢������Ԫ��
				a[i] = a[i - 1]; // �Ⱥ���һ��Ԫ��
				for (j = i - 1; j >= 0 && x < a[j]; j--) {// ͨ��ѭ�����������һλ�ҵ�Ҫ�����λ�á�
															// j--; //Ԫ�غ���
					a[j + 1] = a[j];
				}
				a[j + 1] = x;// ���뵽��ȷλ��
			}
			System.out.println("\n��" + i + " ����������");
			print(a);// ��ӡÿ������Ľ��
		}
	}
}
