import java.lang.reflect.Array;
import java.util.Arrays;

public class ArbolBinarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Empleado e1 = new Empleado(44, "Jose Medina", "otra cosa", "otro cosa");
		Empleado e2 = new Empleado(34, "Jose Medina", "otra cosa", "otro cosa");
		Empleado e3 = new Empleado(84, "Jose Medina", "otra cosa", "otro cosa");
		Empleado e4 = new Empleado(74, "Jose Medina", "otra cosa", "otro cosa");
		Empleado e5 = new Empleado(54, "Jose Medina", "otra cosa", "otro cosa");
		Empleado e6 = new Empleado(14, "Jose Medina", "otra cosa", "otro cosa");
		
		BST bst = new BST();
		Arrays.asList(e1, e2, e3, e4, e5, e6).forEach(bst :: insertar);
		bst.preorden();
		bst.postorden();// cambio hoy

	}
	
private static void buscar (BST bst, int id){
	if (bst.existe(id)) {
		System.out.println(bst.obtener(id));
	} else {
		System.out.println("No se encuentra el empleado id: "+ id);
	}
}
}
