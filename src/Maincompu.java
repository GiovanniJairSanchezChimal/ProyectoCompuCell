import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Maincompu {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		String marca;
		String so;
		float precio;
		boolean estatus;
		int indice, mainMenu, subMenu;
		
		Computadoras computadora;
		
		List<Computadoras> lista = new ArrayList<Computadoras>();
		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---->Alta");
			System.out.println("2---->Mostrar");
			System.out.println("3---->Buscar");
			System.out.println("4---->Editar");
			System.out.println("5---->Eliminar");
			System.out.println("6---->Salir");
			
			lectura = new Scanner(System.in);
			mainMenu = lectura.nextInt();
			
			switch(mainMenu){
			case 1:
				try {
					System.out.println("Ingrese la marca: "+"\n");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();
					
					System.out.println("Ingrese el Sistema Operativo: "+"\n");
					lectura = new Scanner(System.in);
					so = lectura.nextLine();
					
					System.out.println("Ingrese precio: "+"\n");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();
					
					System.out.println("Ingrese Estatus: "+"\n");
					lectura = new Scanner(System.in);
					estatus = lectura.nextBoolean();
					
					computadora = new Computadoras(marca, so, precio, estatus);
					lista.add(computadora);
					System.out.println("Se guardó correctamente");
				}catch(Exception e){
					System.out.print("Error al guardar: " + e.getMessage());
				}
				break;
				
			case 2:
				if(lista.size()>0)
					System.out.println(lista);
				else
					System.out.println("No hay registros");
				break;
				
			case 3:
				try {
					if(lista.size()>0) {
						System.out.println("Ingrese el registro a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						
						//Buscar
						computadora = lista.get(indice);
						System.out.println(computadora);
					}else
						System.out.println("No hay registros");
					
				}catch(Exception e) {
					System.out.println("No existe");
					
				}
				break;
				
			case 4:
				try {
					if(lista.size()>0) {
						System.out.println("Ingrese el indice del registro a editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						
						//Buscar
						computadora = lista.get(indice);
						System.out.print("Se encontro el registro apra editar: "+computadora.getMarca());
						
						do {
							System.out.println("SUBMENU PARA EDITAR");
							System.out.println("1---->Marca");
							System.out.println("2---->Precio");
							System.out.println("3---->Regresar");
							
							lectura = new Scanner(System.in);
							subMenu = lectura.nextInt();
							switch(subMenu) {
							case 1:
								System.out.print("Ingresa la nueva marca");
								lectura = new Scanner(System.in);
								marca = lectura.nextLine();
								
								//Actualizar
								computadora.setMarca(marca);
								System.out.println("Se edito con exito");
								break;
							case 2:
								System.out.print("Ingresa el nuevo precio");
								lectura = new Scanner(System.in);
								precio = lectura.nextInt();
								
								//Actualizar
								computadora.setPrecio(precio);
								System.out.println("Se edito con exito");
								break;
							case 3:
								break;
							}
						}while(subMenu<3);
						
					}else
						System.out.print("No hay registros");
				}catch(Exception e) {
					System.out.println("No existe ese registro");
					
				}
				break;
				
			case 5:
				try {
					System.out.println("Ingresa el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();
					
					//eliminar
					lista.remove(indice);
					System.out.println("Se elimino el registro");
				}catch(Exception e) {
					System.out.println("No existe ese registro");
					
				}
				break;
				
			case 6:
				break;
			} 
			
		}while(mainMenu!=6);
	}

}//comentario
