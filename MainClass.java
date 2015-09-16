
public class MainClass {
	public static void main(String[] args) {
		
		
		
		
		Cafe cafe = new Pimenta(new Creme( new Creme(new Preto())));
		
		
		System.out.println(cafe.getPreco());
		cafe.preparar();
		
//		new Pimenta(creme).preparar();
	}

}
