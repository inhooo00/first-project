package problem;
// ���� ������ �����ϵ��� ��鿡�� ���� ǥ���ϴ� Point Ŭ���� �ϼ�
class Point {
	double x, y; // ���� x, y ��ǥ
	
	// ������: �Ǽ� ���� x, y�� ���� �޾Ƽ� �ش� �ʵ� ���� �ʱ�ȭ
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// ���� �޼ҵ� getMidPoint: �� Point ��ü p1, p2�� ���� �޾Ƽ� ������ �ش��ϴ� Point ��ü ��ȯ
	static Point getMidPoint(Point p1, Point p2) {
		return new Point((p2.x + p1.x)/2,(p2.y + p1.y)/2);
	}

	// increment �޼ҵ�: �ʵ� x, y ���� ���� 1�� ������Ű�� ��ü �ڽ��� ��ȯ
	Point increment() {
		this.x = x+1;
		this.y = y+1;
		return this;
	}

	// print �޼ҵ�, Point ��ü�� x, y���� (x, y)�� ���·� ���
	void print() {
		System.out.println("("+x+", "+y+")");
	}
}

/* �־��� main �޼ҵ尡 ����Ǹ� ������ ���� ��µ� �� �ֵ��� ���α׷��� �ۼ��ؾ� ��
(5.5, 11.0)
(6.5, 12.0)
*/
public class problem2 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(10, 20);
		Point p3 = Point.getMidPoint(p1, p2);
		p3.print();
		p3.increment().print();
	}
}
