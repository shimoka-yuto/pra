package sample;

public class multiplicationTable {
	static String sep = System.getProperty("line.separator");

	public static void main(String[] args){
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				if(j==9){
					System.out.print(i*j + sep);
				}
				else {
					System.out.print(i*j + " ");
				}
			}
		}
	}
}
