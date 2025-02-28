package ex07;

interface Printable {
	void print();
}

class Papers {
	private String msg;

	// 생성자 생성
	public Papers(String msg) {
		this.msg = msg;
	}

	public Printable getPrinter() {

		// 선언 + 생성 ---> 익명 클래스
//		Printable tmp = new Printable() {
//				
//				@Override
//				public void print() {
//					System.out.println(msg);
//			}
//		};

		return new Printable() {

			@Override
			public void print() {
				System.out.println(msg);
			}
		};
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {

		Papers tmp = new Papers("전송할 메세지...");

		tmp.getPrinter().print();

	}

}
