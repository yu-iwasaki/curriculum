package interfaces;

public class NanaumiMain {
	 
	 public static void main(String[] args) {
	  // 3. 現実（1, 2 を使ってみる）
	 Nanaumi nanaumi = new Nanaumi();
	 
	  // Javaカリキュラム作って報告
	 final String message = nanaumi.doCreateJavaCurriculum();
	 System.out.println("message = " + message);
	 }
	}