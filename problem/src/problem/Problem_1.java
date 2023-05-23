// (10��)
package problem;
public class Problem_1 {

	// ���� ������ �����ϵ��� ���� �迭�� �޾� �հ踦 ��ȯ�ϴ� getScoreSum �޼ҵ� �ۼ�
    // - ����: ���� ���� �迭 scores
    // - scores ���ҵ��� ���� ��ȯ
    // - scores�� null�� ���,
	//   message�� "null argument"�� IllegalArgumentException ���� �߻�
	// - scores�� ���Ұ� 0~100 ������ ����� ���,
	//   message�� "bad score"�� IllegalArgumentException ���� �߻�
	static int getScoreSum(int [] scores) {
		int sum;
		for(int i=0;i<scores.length;i++) {
			try {
			sum +=scores[i];
		}
		catch(IllegalArgumentException e) {
			System.out.println("null argument");
		}
			
		}
		
	}
	

    // ���� ������ �����ϵ��� printScoreSum �޼ҵ� �ۼ�
    // - ����: ���� ���� �迭 scores
    // - getScoreSum �޼ҵ带 ȣ���Ͽ� scores ���ҵ��� �հ踦 ���
	//   ��� ������ �Ʒ� main �޼ҵ� ���� ��� ����
    // - ���ܰ� �߻��ϸ� Exception type���� catch�Ͽ� �ش� ������ message ���
	static void printScoreSum(int [] scores) {
		getScoreSum(int [] scores]);
		System.out.println();
	}

/* �־��� main �޼ҵ尡 ����Ǹ� ������ ���� ��µ� �� �ֵ��� ���α׷��� �ۼ��ؾ� ��
null argument
bad score
bad score
score sum = 180
*/
	public static void main(String[] args) {
		printScoreSum(null);
		printScoreSum(new int[] { 70, -1, 80, 90 });
		printScoreSum(new int[] { 80, 70, 101, 90 });
		printScoreSum(new int[] { 0, 100, 80 });
	}
}
