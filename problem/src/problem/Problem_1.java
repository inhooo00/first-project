// (10점)
package problem;
public class Problem_1 {

	// 다음 조건을 만족하도록 성적 배열을 받아 합계를 반환하는 getScoreSum 메소드 작성
    // - 인자: 정수 성적 배열 scores
    // - scores 원소들의 합을 반환
    // - scores가 null인 경우,
	//   message가 "null argument"인 IllegalArgumentException 예외 발생
	// - scores의 원소가 0~100 범위를 벗어나는 경우,
	//   message가 "bad score"인 IllegalArgumentException 예외 발생
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
	

    // 다음 조건을 만족하도록 printScoreSum 메소드 작성
    // - 인자: 정수 성적 배열 scores
    // - getScoreSum 메소드를 호출하여 scores 원소들의 합계를 출력
	//   출력 형식은 아래 main 메소드 실행 결과 참고
    // - 예외가 발생하면 Exception type으로 catch하여 해당 예외의 message 출력
	static void printScoreSum(int [] scores) {
		getScoreSum(int [] scores]);
		System.out.println();
	}

/* 주어진 main 메소드가 실행되면 다음과 같이 출력될 수 있도록 프로그램을 작성해야 함
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
