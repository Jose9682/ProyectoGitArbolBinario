
public class BST implements IBST<Empleado> {

	private Empleado valor;
	private BST izdo, dcho;

	

	@Override
	public boolean esHola() {
		return valor != null && izdo == null && dcho == null;
	}

	@Override
	public boolean esVacio() {
		return valor == null;
	}
	@Override
	public void insertar(Empleado empl) {
		if (valor == null) {
			this.valor = empl;
		} else {
			if (empl.compareTo(valor) < 0) {
				if (izdo == null) izdo = new BST(); 
				izdo.insertar(empl);
			} else if (empl.compareTo(valor)>0){
				if (dcho == null) dcho = new BST();
				dcho.insertar(empl);
			} else {
				
			}
		}
		
	}

	@Override
	public boolean existe(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Empleado obtener(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void preorden() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inorden() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postorden() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

}
