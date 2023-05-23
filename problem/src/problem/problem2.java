package problem;
// 다음 조건을 만족하도록 평면에서 점을 표현하는 Point 클래스 완성
class Point {
	double x, y; // 점의 x, y 죄표
	
	// 생성자: 실수 인자 x, y를 전달 받아서 해당 필드 값을 초기화
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 정적 메소드 getMidPoint: 두 Point 객체 p1, p2를 전달 받아서 중점에 해당하는 Point 객체 반환
	static Point getMidPoint(Point p1, Point p2) {
		return new Point((p2.x + p1.x)/2,(p2.y + p1.y)/2);
	}

	// increment 메소드: 필드 x, y 값을 각각 1씩 증가시키고 객체 자신을 반환
	Point increment() {
		this.x = x+1;
		this.y = y+1;
		return this;
	}

	// print 메소드, Point 객체의 x, y값을 (x, y)의 형태로 출력
	void print() {
		System.out.println("("+x+", "+y+")");
	}
}

/* 주어진 main 메소드가 실행되면 다음과 같이 출력될 수 있도록 프로그램을 작성해야 함
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
