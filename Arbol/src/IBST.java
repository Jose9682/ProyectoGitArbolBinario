
public interface IBST<T extends Comparable> {

	void insertar(T empl);
	boolean existe(int id);
	T obtener(int id);
	boolean esHola();
	boolean esVacio();
	void preorden();
	void inorden();
	void postorden();
	void eliminar(int id);
}
