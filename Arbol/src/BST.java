
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
		if (valor != null) {
			if (id == valor.getId()) {
				return true;
			} else if (id < valor.getId() && izdo != null) {
				return izdo.existe(id);
			} else if (id < valor.getId() && dcho != null) {
				return dcho.existe(id);
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	@Override
	public Empleado obtener(int id) {
		// TODO Auto-generated method stub
		if (valor != null) {
			if (id == valor.getId()) {
				return valor;
			} else if (id < valor.getId()  && izdo != null) {
				return izdo.obtener(id);
			} else if (id < valor.getId() && dcho != null) {
				return dcho.obtener(id);
			} else {
				return null;
			}

		} else {
			return null;
		}
	}


	private  void preordenImpl(String prefijo){
		if (valor != null) {

			System.out.println(prefijo + valor);
			if (izdo != null) izdo.preordenImpl(prefijo + "  ");
			if (dcho != null) dcho.preordenImpl(prefijo + "  ");

		}
	}
	@Override
	public void preorden() {
		// TODO Auto-generated method stub
		preordenImpl("");

	}

	@Override
	public void inorden() {
		// TODO Auto-generated method stub
		if (valor != null) {
			if (izdo != null) izdo.inorden();
			System.out.println(valor);

			if (dcho != null) dcho.inorden();

		}
	}

	@Override
	public void postorden() {
		// TODO Auto-generated method stub
		if (valor != null) {
			if (izdo != null) izdo.postorden();
			

			if (dcho != null) dcho.postorden();
			System.out.println(valor);

		}
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

}
