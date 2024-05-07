public class Desenho {
	public static void main(String[] args) {
		//writePlus(4,4);

		
	}
	
	public static void writePlus(int heigh,int width){
		for(int j = 1;j <= heigh;j++){
			for(int i = 1;i <= width;i++) {
				System.out.print("+");
			}
			System.out.println();
		}
	}
	
	public static void writeOthers() {
		String word = "";
		for(int j = 1;j <= 4;j++){

			for(int i = 1;i <= 5;i++){
				word = j == 1 || j == 2 ? "" : "+";

				System.out.print(word);
			}
			System.out.println();
		}
	}
}
