
public class Pimenta extends CafeDecorator {

	public Pimenta(Cafe cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}
	
	public void preparar(){
		super.preparar();
		System.out.println("Uma pimentinha");
	}

	@Override
	public int getPreco() {
		// TODO Auto-generated method stub
		return 5 + super.getPreco();
	}

}
