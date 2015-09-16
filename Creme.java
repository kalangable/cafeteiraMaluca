
public class Creme extends CafeDecorator {

	public Creme(Cafe cafe) {
		super(cafe);
		
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Creme de baunilha");

	}

	@Override
	public int getPreco() {
		// TODO Auto-generated method stub
		return 1 + super.getPreco();
	}

}
