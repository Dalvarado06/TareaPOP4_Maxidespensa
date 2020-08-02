/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg4.pop_12011159;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Daniel A. Alvarado
 */
public class Tarea4POP_12011159 {

    static ArrayList<GranosBasicos> granos = new ArrayList();
    static ArrayList<ProductosLimpieza> limpieza = new ArrayList();
    static ArrayList<Liquidos> liquidos = new ArrayList();
    static ArrayList<Carnes_embutidos> carnes = new ArrayList();
    static ArrayList<Frutas_Verduras> frutasVerduras = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {

        
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("***MENU***");
            System.out.println("1) Agregar Producto");
            System.out.println("2) Modificar Producto");
            System.out.println("3) Eliminar Producto");
            System.out.println("4) Reporte de inventario");
            System.out.println("5) Opcion de salida");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar producto");
                    System.out.println();

                    System.out.println("1) Agregar grano");
                    System.out.println("2) Agregar limpieza");
                    System.out.println("3) Agregar liquido");
                    System.out.println("4) Agregar carne");
                    System.out.println("5) Agregar fruta y verdura");
                    System.out.println("Ingrese su seleccion: ");
                    int option = sc.nextInt();
                    System.out.println();

                    switch (option) {
                        case 1:
                            agregarGrano();
                            break;

                        case 2:
                            agregarLimpieza();
                            break;

                        case 3:
                            agregarLiquido();
                            break;

                        case 4:
                            agregarCarne();
                            break;

                        case 5:
                            agregarFrutaVerdura();
                            break;

                        default:
                            System.out.println("Su eleccion es incorrecta!");
                            System.out.println("No se agrego nada al inventario");
                            System.out.println();
                    }

                    break;

                case 2:
                    System.out.println("Modificar producto");

                    if (granos.isEmpty() && limpieza.isEmpty() && liquidos.isEmpty()
                            && carnes.isEmpty() && frutasVerduras.isEmpty()) {
                        System.out.println("Las listas de inventario estan vacias!");
                        System.out.println();
                    } else {

                        System.out.println("-> Ingrese la opcion del producto"
                                + " a modificar: ");
                        System.out.println("1) Modificar grano");
                        System.out.println("2) Modificar limpieza");
                        System.out.println("3) Modificar Liquido");
                        System.out.println("4) Modificar Carne");
                        System.out.println("5) Modificar Fruta o Verdura");
                        int eleccion = sc.nextInt();

                        switch (eleccion) {
                            case 1:
                                if (granos.isEmpty()) {
                                    System.out.println("La lista de granos "
                                            + "esta vacia");
                                    System.out.println();
                                } else {
                                    modificarGranos();
                                }
                                break;

                            case 2:
                                if (limpieza.isEmpty()) {
                                    System.out.println("La lista de limpieza "
                                            + "esta vacia");
                                    System.out.println();
                                } else {
                                    modificarLimpieza();
                                }

                                break;

                            case 3:
                                if (liquidos.isEmpty()) {
                                    System.out.println("La lista de liquidos"
                                            + " esta vacia");
                                    System.out.println();
                                } else {
                                    modificarLiquido();
                                }
                                break;

                            case 4:
                                if (carnes.isEmpty()) {
                                    System.out.println("La lista de carnes esta"
                                            + " vacia");
                                    System.out.println();
                                } else {
                                    modificarCarnes();
                                }
                                break;

                            case 5:
                                if (frutasVerduras.isEmpty()) {
                                    System.out.println("La lista de frutas y "
                                            + "verduras esta vacia");
                                    System.out.println();
                                } else {
                                    modificarFrutaVerdura();
                                }
                                break;

                            default:
                                System.out.println("Opcion incorrecta!");
                                System.out.println("Vuelve al menu...");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Eliminar un producto");
                    System.out.println();
                    
                     if (granos.isEmpty() && limpieza.isEmpty() && liquidos.isEmpty()
                            && carnes.isEmpty() && frutasVerduras.isEmpty()) {
                        System.out.println("Las listas de inventario estan vacias!");
                        System.out.println();
                     }else{
                         System.out.println("-> Ingrese el tipo de producto "
                                 + "que desea eliminar: ");
                         System.out.println("1) Granos Basicos");
                         System.out.println("2) Limpieza");
                         System.out.println("3) Liquidos");
                         System.out.println("4) Carnes y embutidos");
                         System.out.println("5) Frutas y verduras");
                         int choice = sc.nextInt();
                         
                         switch(choice){
                             case 1:
                                 eliminarGranos();
                                 break;
                                 
                             case 2:
                                 eliminarLimpieza();
                                 break;
                                 
                             case 3:
                                 eliminarLiquidos();
                                 break;
                                 
                             case 4:
                                 eliminarCarnesEmbutidos();
                                 break;
                                 
                             case 5:
                                 eliminarFrutasVerduras();
                                 break;
                                 
                             default: System.out.println("Eleccion incorrecta");
                                 System.out.println("Vuelve al menu");
                                 System.out.println();
                         }
                     }   
                    break;

                case 4:
                    System.out.println("-> Reporte de inventario");
                    System.out.println();
                    
                    System.out.println("-> Granos Basicos");
                    for (GranosBasicos g : granos) {
                        System.out.println(granos.indexOf(g)+". "+g);
                    }
                    System.out.println();
                    
                    System.out.println("->Productos de Limpieza");
                    for (ProductosLimpieza l : limpieza) {
                        System.out.println(limpieza.indexOf(l)+". "+l);
                    }
                    System.out.println();
                    
                    System.out.println("-> Liquidos");
                    for (Liquidos l : liquidos) {
                        System.out.println(liquidos.indexOf(l)+". "+l);
                    }
                    System.out.println();
                    
                    System.out.println("-> Carnes y Embutidos");
                    for (Carnes_embutidos c : carnes) {
                        System.out.println(carnes.indexOf(c)+". "+c);
                    }
                    System.out.println();
                    
                    System.out.println("-> Frutas y Verduras");
                    for (Frutas_Verduras f : frutasVerduras) {
                        System.out.println(frutasVerduras.indexOf(f)+". "+f);
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Ha decidido salir");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    System.out.println("");
            }
        }
    }//main

    public static void agregarGrano() {
        System.out.println("-> Ingrese el nombre del grano");
        String nombre = sc.next();
        System.out.println();

        System.out.println("-> Ingrese la cantidad: ");
        double cantidad = sc.nextDouble();
        System.out.println();

        System.out.println("-> Ingrese el precio");
        double precio = sc.nextDouble();
        System.out.println();

        System.out.println("-> Ingrese la unidad de medida: ");
        System.out.println("1) Libra");
        System.out.println("2) Medida");
        System.out.println("3) Kilo");
        int opcion = sc.nextInt();

        while (opcion > 3 || opcion < 1) {
            System.out.println("Ingrese una opcion correcta");
            opcion = sc.nextInt();
            System.out.println();
        }

        String unidadMedida = "";

        switch (opcion) {
            case 1:
                unidadMedida = "libra";
                break;

            case 2:
                unidadMedida = "medida";
                break;

            case 3:
                unidadMedida = "kilo";
                break;
        }

        System.out.println("-> Ingrese la procedencia del producto: ");
        String procedencia = sc.next();
        System.out.println();

        GranosBasicos g = new GranosBasicos(nombre, procedencia);
        g.setCantidad(cantidad);
        g.setMedida(unidadMedida);
        g.setPrecio(precio);

        granos.add(g);

        System.out.println("El producto ha sido agregado exitosamente");
        System.out.println();
    }

    public static void agregarLimpieza() {
        System.out.println("-> Ingrese el tipo del producto");
        System.out.println("1) Liquido");
        System.out.println("2) Polvo");
        int opcion = sc.nextInt();

        while (opcion > 2 || opcion < 1) {
            System.out.println("Ingrese una opcion valida!");
            opcion = sc.nextInt();
            System.out.println();
        }

        String tipo = "";

        switch (opcion) {
            case 1:
                tipo = "liquido";
                break;

            case 2:
                tipo = "polvo";
                break;
        }

        System.out.println("-> Ingrese la marca: ");
        String marca = sc.next();
        System.out.println();

        System.out.println("-> Ingrese el codigo: ");
        String codigo = sc.next();
        System.out.println();

        boolean check = false;

        while (check == false) {
            boolean rev;
            rev = checkCodigo(codigo);

            if (rev) {
                check = true;
            } else {
                System.out.println("-> Ingrese otro codigo: ");
                codigo = sc.next();
                System.out.println();
                check = false;
            }
        }

        System.out.println("-> Ingrese el precio");
        double precio = sc.nextDouble();
        System.out.println();

        System.out.println("-> Ingrese la cantidad de producto: ");
        int cantidad = sc.nextInt();
        System.out.println();

        System.out.println("-> Ingrese el proveedor del producto: ");
        String proveedor = sc.next();
        System.out.println();

        System.out.println("-> Ingrese el nombre del producto: ");
        String nombre = sc.next();
        System.out.println();

        ProductosLimpieza l = new ProductosLimpieza(marca, proveedor);
        l.setCodigo(codigo);
        l.setPrecio(precio);
        l.setCantidad(cantidad);
        l.setProveedor(proveedor);
        l.setNombre(nombre);
        l.setTipo(tipo);

        limpieza.add(l);

        System.out.println("Se agrego exitosamente el producto de limpieza");
        System.out.println();
    }

    public static void agregarLiquido() throws ParseException {
        System.out.println("-> Elija la categoria del producto: ");
        System.out.println("1) Lacteos");
        System.out.println("2) Jugos");
        System.out.println("3) Gaseosas");
        System.out.println("4) Agua");
        int opcion = sc.nextInt();

        while (opcion > 4 || opcion < 1) {
            System.out.println("Ingrese una opcion correcta!");
            opcion = sc.nextInt();
            System.out.println();
        }

        String categoria = "";

        switch (opcion) {

            case 1:
                categoria = "lacteos";
                break;

            case 2:
                categoria = "jugos";
                break;

            case 3:
                categoria = "gaseosas";
                break;

            case 4:
                categoria = "agua";
                break;
        }

        System.out.println();

        System.out.println("-> Ingrese su forma de empaque: ");
        System.out.println("1) Botella/bote");
        System.out.println("2) Caja");
        System.out.println("3) lata");
        int eleccion = sc.nextInt();

        while (eleccion > 3 || eleccion < 1) {
            System.out.println("-> Ingrese una opcion correcta!");
            eleccion = sc.nextInt();
            System.out.println();
        }

        String empaque = "";

        switch (eleccion) {

            case 1:
                empaque = "botella";
                break;

            case 2:
                empaque = "caja";
                break;

            case 3:
                empaque = "lata";
                break;
        }

        System.out.println();

        System.out.println("-> Ingrese size del empaque: ");
        System.out.println("1) Chica");
        System.out.println("2) Mediana");
        System.out.println("3) Grande");
        int o = sc.nextInt();

        while (o > 3 || o < 1) {
            System.out.println("-> Ingrese una opcion correcta!");
            o = sc.nextInt();
            System.out.println();
        }

        String size = "";

        switch (o) {

            case 1:
                size = "chica";
                break;

            case 2:
                size = "mediana";
                break;

            case 3:
                size = "grande";
                break;
        }

        System.out.println("-> Ingrese el nombre del producto: ");
        String nombre = sc.next();
        System.out.println();

        System.out.println("-> Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println();

        Date vencimiento;

        System.out.println("-> Ingrese mes de vencimiento formato(00): ");
        int mes = sc.nextInt();
        System.out.println();

        System.out.println("-> Ingrese el dia de vencimeinto formato(00): ");
        int dia = sc.nextInt();
        System.out.println();

        System.out.println("-> Ingrese year de vencimiento en 4 digitos: ");
        int year = sc.nextInt();
        System.out.println();

        SimpleDateFormat pt = new SimpleDateFormat("dd/MM/yyyy");
        vencimiento = pt.parse(dia + "/" + mes + "/" + year);

        Liquidos l = new Liquidos(nombre, categoria);
        l.setEmpaque(empaque);
        l.setFechaVencimiento(vencimiento);
        l.setPrecio(precio);
        l.setSize(size);

        liquidos.add(l);

        System.out.println("Se ha agregado el producto de liquido exitosamente");
        System.out.println();

    }

    public static void agregarCarne() {
        System.out.println("-> Ingrese su lugar de procedencia: ");
        String procedencia = sc.next();
        System.out.println();

        System.out.println("-> Ingrese la cantidad en inventario: ");
        int cantidad = sc.nextInt();
        System.out.println();

        System.out.println("-> Ingrese el tipo de carne: ");
        System.out.println("1) Res");
        System.out.println("2) Carne blanca");
        System.out.println("3) Cerdo");
        int eleccion = sc.nextInt();
        System.out.println();

        while (eleccion > 3 || eleccion < 1) {
            System.out.println("Ingrese una opcion correcta!");
            eleccion = sc.nextInt();
            System.out.println();
        }

        String tipo = "";

        switch (eleccion) {
            case 1:
                tipo = "res";
                break;

            case 2:
                tipo = "carne blanca";
                break;

            case 3:
                tipo = "cerdo";
                break;
        }

        System.out.println("-> Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println();

        Carnes_embutidos c = new Carnes_embutidos(tipo, cantidad);
        c.setPrecio(precio);
        c.setProcedencia(procedencia);

        carnes.add(c);

        System.out.println("El producto carnico se agrego exitosamente");
        System.out.println();

    }

    public static void agregarFrutaVerdura() {
        System.out.println("-> Ingrese el precio: ");
        double precio = sc.nextDouble();
        System.out.println();

        System.out.println("-> Ingrese la cantidad a inventariar: ");
        int cInventariar = sc.nextInt();
        System.out.println();

        System.out.println("-> Ingrese la categoria del producto: ");
        System.out.println("1) Verduras");
        System.out.println("2) Frutas");
        int opcion = sc.nextInt();
        System.out.println();

        while (opcion > 2 || opcion < 1) {
            System.out.println("Ingrese una opcion correcta!");
            opcion = sc.nextInt();
            System.out.println();
        }

        String categoria = "";

        switch (opcion) {
            case 1:
                System.out.println("-> Elija la cateogria de la verdura: ");
                System.out.println("1) Tuberculo");
                System.out.println("2) Legumbre");
                System.out.println("3) de hojas");
                int eleccion = sc.nextInt();
                System.out.println();

                while (eleccion > 3 || eleccion < 1) {
                    System.out.println("-> Ingrese una opcion correcta!");
                    eleccion = sc.nextInt();
                    System.out.println();
                }

                switch (eleccion) {
                    case 1:
                        categoria = "verdura tuberculo";
                        break;

                    case 2:
                        categoria = "verdura legumbre";
                        break;

                    case 3:
                        categoria = "verdura de hojas";
                        break;
                }

                break;

            case 2:
                System.out.println("-> Elija la categoria de la fruta: ");
                System.out.println("1) Tropical");
                System.out.println("2) Citrica");
                System.out.println("3) de grano");
                System.out.println("4) Rica en fibra");
                int option = sc.nextInt();
                System.out.println();

                while (option > 4 || option < 1) {
                    System.out.println("-> Elija una opcion correcta!");
                    option = sc.nextInt();
                    System.out.println();
                }

                switch (option) {
                    case 1:
                        categoria = "fruta tropical";
                        break;

                    case 2:
                        categoria = "fruta citrica";
                        break;

                    case 3:
                        categoria = "fruta de grano";
                        break;

                    case 4:
                        categoria = "fruta rica en fibra";
                        break;
                }
        }

        Frutas_Verduras frutaVerduras = new Frutas_Verduras(precio, cInventariar);
        frutaVerduras.setCategoria(categoria);

        frutasVerduras.add(frutaVerduras);

        System.out.println("El producto verdura o fruta se ha agregador exitosamente");
        System.out.println();
    }

    public static void modificarGranos() {
        for (GranosBasicos g : granos) {
            System.out.println(granos.indexOf(g) + ". " + g);
        }
        System.out.println();

        System.out.println("-> Ingrese la posicion a modificar: ");
        int posicion = sc.nextInt();
        System.out.println();

        while (posicion > granos.size() - 1 || posicion < 0) {
            System.out.println("-> Ingrese una opcion correcta: ");
            posicion = sc.nextInt();
            System.out.println();
        }

        System.out.println("-> Que elemento desea modificar? ");
        System.out.println("1) Nombre");
        System.out.println("2) Cantidad");
        System.out.println("3) Precio");
        System.out.println("4) Unidad de medida");
        System.out.println("5) Procedencia");
        int opcion = sc.nextInt();
        System.out.println();

        switch (opcion) {
            case 1:
                System.out.println("-> Ingrese el nuevo nombre: ");
                String nombre = sc.next();

                granos.get(posicion).setNombre(nombre);

                System.out.println("El nombre se ha modificado exitosamente");
                System.out.println();

                break;

            case 2:
                System.out.println("-> Ingrese la cantidad del producto: ");
                int cantidad = sc.nextInt();

                granos.get(posicion).setCantidad(cantidad);

                System.out.println("La cantidad se ha modificado exitosamente");
                System.out.println();
                break;

            case 3:
                System.out.println("-> Ingrese el nuevo precio: ");
                double precio = sc.nextDouble();

                granos.get(posicion).setPrecio(precio);

                System.out.println("El Precio se ha modificado exitosamente");
                System.out.println();
                break;

            case 4:
                System.out.println("-> Seleccione la nueva unidad de medida: ");
                System.out.println("1) Libra");
                System.out.println("2) Medida");
                System.out.println("3) Kilo");
                int option = sc.nextInt();

                while (option > 3 || option < 1) {
                    System.out.println("Ingrese una opcion correcta");
                    option = sc.nextInt();
                    System.out.println();
                }

                String unidadMedida = "";

                switch (option) {
                    case 1:
                        unidadMedida = "libra";
                        break;

                    case 2:
                        unidadMedida = "medida";
                        break;

                    case 3:
                        unidadMedida = "kilo";
                        break;
                }

                granos.get(posicion).setMedida(unidadMedida);

                System.out.println("La unidad de medida se ha modificado exitosamente");
                System.out.println();
                break;

            case 5:
                System.out.println("-> Ingrese la nueva procedencia: ");
                sc.nextLine();
                String procedencia = sc.nextLine();

                granos.get(posicion).setProcedencia(procedencia);

                System.out.println("Se ha modificado exitosamente la procedencia");
                System.out.println();

                break;

            default:
                System.out.println("Su opcion es incorrecta");
                System.out.println("Vuelve al menu");
        }
    }

    public static void modificarLimpieza() {
        for (ProductosLimpieza l : limpieza) {
            System.out.println(limpieza.indexOf(l) + ". " + l);
        }
        System.out.println();

        System.out.println("-> Elija el producto a modificar: ");
        int posicion = sc.nextInt();
        System.out.println();

        while (posicion > limpieza.size() - 1 || posicion < 0) {
            System.out.println("-> Elija una posicion correcta!");
            posicion = sc.nextInt();
            System.out.println();
        }

        System.out.println("-> Que atributo desea modificar?");
        System.out.println("1) Tipo");
        System.out.println("2) Marca");
        System.out.println("3) Codigo");
        System.out.println("4) Precio");
        System.out.println("5) Canitdad en inventario");
        System.out.println("6) Proveedro");
        System.out.println("7) Nombre del producto");
        int eleccion = sc.nextInt();
        System.out.println();

        switch (eleccion) {
            case 1:
                System.out.println("-> Ingrese el nuevo tipo: ");
                System.out.println("1) Polvo");
                System.out.println("2) Liquido");
                int option = sc.nextInt();
                System.out.println();

                while (option > 2 || option < 1) {
                    System.out.println("-> Ingrese una eleccion valida!");
                    option = sc.nextInt();
                    System.out.println();
                }

                String tipo = "";

                switch (option) {

                    case 1:
                        tipo = "polvo";
                        break;

                    case 2:
                        tipo = "liquido";
                        break;
                }

                limpieza.get(posicion).setTipo(tipo);

                System.out.println("El tipo de producto de limpieza ha sido"
                        + " modificada exitosamente");
                System.out.println();

                break;

            case 2:
                System.out.println("-> Ingrese el nombre de la marca:");
                sc.nextLine();
                String marca = sc.nextLine();

                limpieza.get(posicion).setMarca(marca);

                System.out.println("La marca del producto ha sido "
                        + "modificada con exito");
                System.out.println();

                break;

            case 3:
                System.out.println("-> Ingrese el nuevo codigo del producto: ");
                String codigo = sc.next();

                boolean check = false;

                while (check == false) {
                    boolean rev;

                    rev = checkCodigo(codigo);

                    if (rev) {
                        check = true;
                    } else {
                        System.out.println("-> Ingrese un codigo correcto!");
                        codigo = sc.next();
                    }

                }

                limpieza.get(posicion).setCodigo(codigo);

                System.out.println("Se ha modificado el codigo "
                        + "exitosamente");
                System.out.println();

                break;

            case 4:
                System.out.println("-> Ingrese el nuevo precio");
                double precio = sc.nextDouble();

                limpieza.get(posicion).setPrecio(precio);

                System.out.println("Se ha modificado el precio con exito");
                break;

            case 5:
                System.out.println("-> Ingrese la nueva cantidad en inventario: ");
                int cantidad = sc.nextInt();

                limpieza.get(posicion).setCantidad(cantidad);

                System.out.println("Se ha modificado la cantidad en inventario"
                        + " con exito");
                System.out.println();
                break;

            case 6:
                System.out.println("-> Ingrese el nuevo proveedor: ");
                sc.nextLine();
                String proveedor = sc.nextLine();

                limpieza.get(posicion).setProveedor(proveedor);
                break;

            case 7:
                System.out.println("-> Ingrese el nuevo nombre del producto: ");
                sc.nextLine();
                String nombre = sc.nextLine();

                limpieza.get(posicion).setNombre(nombre);
                
                System.out.println("El nombre se ha modificado correctamente");
                break;

            default:
                System.out.println("Se equivoco de opcion!");
                System.out.println("Vuelve al menu");
        }
    }

    public static void modificarLiquido() throws ParseException {
        for (Liquidos l : liquidos) {
            System.out.println(liquidos.indexOf(l) + ". " + l);
        }

        System.out.println();

        System.out.println("-> Ingrese el indice del producto a modificar: ");
        int posicion = sc.nextInt();
        System.out.println();

        while (posicion > liquidos.size() - 1 || posicion < 0) {
            System.out.println("-> Ingrese una posicion correcta!");
            posicion = sc.nextInt();
            System.out.println();
        }

        System.out.println("-> Elija el atributo a modificar: ");
        System.out.println("1) Categoria");
        System.out.println("2) Empaque");
        System.out.println("3) Nombre");
        System.out.println("4) Size");
        System.out.println("5) Precio");
        System.out.println("6) Fecha de vencimiento");
        int opcion = sc.nextInt();
        System.out.println();

        switch (opcion) {

            case 1:
                System.out.println("-> Elija la nueva categoria");
                System.out.println("1) Lacteos");
                System.out.println("2) Jugos");
                System.out.println("3) Gaseosas");
                System.out.println("4) Agua");
                int eleccion = sc.nextInt();

                while (eleccion > 4 || eleccion < 1) {
                    System.out.println("-> Elija una categoria correcta");
                    eleccion = sc.nextInt();
                    System.out.println();
                }

                String tipo = "";

                switch (eleccion) {

                    case 1:
                        tipo = "lacteo";
                        break;

                    case 2:
                        tipo = "jugo";
                        break;

                    case 3:
                        tipo = "gaseosa";
                        break;

                    case 4:
                        tipo = "agua";
                        break;
                }

                liquidos.get(posicion).setCateigoria(tipo);

                System.out.println("Se ha modificado exitosamente la categoria");
                System.out.println();

                break;

            case 2:
                System.out.println("-> Elija el nuevo empaque del liquido: ");
                System.out.println("1) Botella");
                System.out.println("2) Caja");
                System.out.println("3) Lata");
                int option = sc.nextInt();

                while (option > 3 || option < 1) {
                    System.out.println("-> Elija una opcion correcta");
                    option = sc.nextInt();
                    System.out.println();
                }

                String empaque = "";

                switch (option) {

                    case 1:
                        empaque = "botella";
                        break;

                    case 2:
                        empaque = "caja";
                        break;

                    case 3:
                        empaque = "lata";
                        break;
                }

                liquidos.get(posicion).setEmpaque(empaque);

                System.out.println("El empaque del liquido se ha modificado"
                        + " de manera correcta");
                System.out.println();

                break;

            case 3:
                System.out.println("-> Ingrese el nuevo nombre del producto: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.println();

                liquidos.get(posicion).setNombre(nombre);

                System.out.println("Se ha modificado el nombre de manera correcta");
                System.out.println();
                break;

            case 4:
                System.out.println("-> Elija el nuevo size del producto: ");
                System.out.println("1) Chica");
                System.out.println("2) Mediana");
                System.out.println("3) Grande");
                int o = sc.nextInt();

                while (o > 3 || o < 1) {
                    System.out.println("-> Elija una opcion correcta!");
                    o = sc.nextInt();
                    System.out.println();
                }

                String size = "";

                switch (o) {

                    case 1:
                        size = "chica";
                        break;

                    case 2:
                        size = "mediana";
                        break;

                    case 3:
                        size = "grande";
                        break;
                }

                liquidos.get(posicion).setSize(size);

                System.out.println("Se ha modificado el size del empaque");
                System.out.println();

                break;

            case 5:
                System.out.println("->Ingrese el nuevo precio del liquido: ");
                double precio = sc.nextDouble();

                liquidos.get(posicion).setPrecio(precio);

                System.out.println("Se ha modificado el precio del liquido");
                System.out.println();
                break;

            case 6:
                System.out.println("-> Modificar fecha de vencimiento");
                Date vencimiento;

                System.out.println("-> Ingrese mes de vencimiento formato(00): ");
                int mes = sc.nextInt();
                System.out.println();

                System.out.println("-> Ingrese el dia de vencimeinto formato(00): ");
                int dia = sc.nextInt();
                System.out.println();

                System.out.println("-> Ingrese year de vencimiento en 4 digitos: ");
                int year = sc.nextInt();
                System.out.println();

                SimpleDateFormat pt = new SimpleDateFormat("dd/MM/yyyy");
                vencimiento = pt.parse(dia + "/" + mes + "/" + year);
                
                liquidos.get(posicion).setFechaVencimiento(vencimiento);
                
                break;

            default:
                System.out.println("Se equivoco de opcion");
                System.out.println("Vuelve al menu");
        }
    }

    public static void modificarCarnes() {
        for (Carnes_embutidos c : carnes) {
            System.out.println(carnes.indexOf(c)+". "+c);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice de la carne a modificar: ");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > carnes.size()-1 || indice < 0){
            System.out.println("-> Elija un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("-> Elija el atributo a modificar: ");
        System.out.println("1) Procedencia");
        System.out.println("2) Cantidad");
        System.out.println("3) Tipo");
        System.out.println("4) Precio");
        int opcion = sc.nextInt();
        System.out.println();
        
        switch(opcion){
            
            case 1:
                System.out.println("-> Ingrese la nueva procedencia del la carne: ");
                sc.nextLine();
                String procedencia = sc.nextLine();
                
                carnes.get(indice).setProcedencia(procedencia);
                
                System.out.println("La procedencia se modificado de manerar correcta");
                System.out.println();
                break;
                
            case 2:
                System.out.println("-> Ingrese la nueva cantidad de la carne: ");
                int cantidad = sc.nextInt();
                
                carnes.get(indice).setCantidad(cantidad);
                
                System.out.println("La cantidad se ha modificado con exito");
                System.out.println();
                
                break;
                
            case 3:
                System.out.println("-> Elija el nuevo tipo de carne");
                System.out.println("1) Res");
                System.out.println("2) Carne blanca");
                System.out.println("3) Cerdo");
                int eleccion = sc.nextInt();
                
                while(eleccion > 3 || eleccion < 1){
                    System.out.println("-> Ingrese una opcion correcta!");
                    eleccion = sc.nextInt();
                    System.out.println();
                }
                
                String tipo = "";
                
                switch(eleccion){
                    
                    case 1:
                        tipo = "res";
                        break;
                        
                    case 2:
                        tipo = "carne blanca";
                        break;
                        
                    case 3:
                        tipo = "cerdo";
                        break;
                }
                
                carnes.get(indice).setTipo(tipo);
                
                System.out.println("El tipo de carne ha sido modificado con exito");
                System.out.println();
                
                break;
                
            case 4:
                System.out.println("-> Ingrese el nuevo precio de la carne: ");
                double precio = sc.nextDouble();
                System.out.println();
                
                
                
                break;
                
            default: System.out.println("Se equivoco de opcion");
                System.out.println("Vuelve al menu");
        }
        
    }

    public static void modificarFrutaVerdura() {
        for (Frutas_Verduras fV : frutasVerduras) {
            System.out.println(frutasVerduras.indexOf(fV)+". "+fV);
        }
        System.out.println();
        
        System.out.println("-> Elija el indice del producto a modificar");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > frutasVerduras.size()-1 || indice < 0){
            System.out.println("-> Ingrese un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("-> Que atributo desea modificar? ");
        System.out.println("1) Precio");
        System.out.println("2) Cantidad a inventariar");
        System.out.println("3) Categoria");
        int opcion = sc.nextInt();
        System.out.println();
        
        switch(opcion){
            
            case 1:
                System.out.println("-> Ingrese el nuevo precio del producto: ");
                double precio = sc.nextDouble();
                System.out.println();
                
                frutasVerduras.get(indice).setPrecio(precio);
                
                System.out.println("Se ha modificado el precio del producto");
                System.out.println();
                break;
                
            case 2:
                System.out.println("-> Ingrese la nueva cantiadad a inventariar: ");
                int cInventariar = sc.nextInt();
                System.out.println();
                
                frutasVerduras.get(indice).setcInventariar(cInventariar);
                
                System.out.println("Se ha modificado la cantidad a invetariar"
                        + " del producto");
                System.out.println();
                break;
                
            case 3:
                System.out.println("-> Elija la categoria del producto: ");
                System.out.println("1) Verdura");
                System.out.println("2) Fruta");
                int option = sc.nextInt();
                
                switch(option){
                    
                    case 1:
                        System.out.println("-> Ingrese la categoria de la verdura: ");
                        System.out.println("1) Tuberculo");
                        System.out.println("2) Legumbres");
                        System.out.println("3) De hojas");
                        int choice = sc.nextInt();
                        System.out.println();
                        
                        while(choice > 3 || choice < 1){
                            System.out.println("-> Elija una opcion correcta!");
                            choice = sc.nextInt();
                            System.out.println("");
                        }
                        
                        String categoria = "";
                        
                        switch(choice){
                            case 1:
                                categoria = "verdura tuberculo";
                                break;
                                
                            case 2:
                                categoria = "verdura legumbres";
                                break;
                                
                            case 3:
                                categoria = "verdura de hojas";
                                break;
                        }
                        
                        frutasVerduras.get(indice).setCategoria(categoria);
                        
                        System.out.println("Se modifico la categoria del producto");
                        System.out.println();
                                                
                        break;
                        
                    case 2:
                        System.out.println("-> Ingrese la categoria de la fruta: ");
                        System.out.println("1) Tropical");
                        System.out.println("2) Citrica");
                        System.out.println("3) de grano");
                        System.out.println("4) rica en fibra");
                        int o = sc.nextInt();
                        System.out.println();
                        
                        while(o > 4 || o < 1){
                            System.out.println("-> Elija una opcion correcta!");
                            o = sc.nextInt();
                            System.out.println();
                        }
                        
                        String cat = "";
                        
                        switch(o){
                            
                            case 1:
                                cat = "fruta tropical";
                                break;
                                
                            case 2:
                                cat = "fruta citrica";
                                break;
                                
                            case 3:
                                cat = "fruta de granos";
                                break;
                                
                            case 4:
                                cat = "fruta rica en fibra";
                                break;
                        }
                        
                        frutasVerduras.get(indice).setCategoria(cat);
                        
                        System.out.println("Se ha modificado la categoria"
                                + " del producto");
                        System.out.println();
                        
                        break;
                        
                    default: System.out.println("Se equivoco de opcion");
                        System.out.println("Vuelva al menu...");
                        System.out.println();
                }
                break;
                
            default: System.out.println("Opcion equivocada");
                System.out.println("Regresa al menu");
                System.out.println();
        }
    }
    
    public static void eliminarGranos(){
        for (GranosBasicos g : granos) {
            System.out.println(granos.indexOf(g)+". "+g);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice del producto a eliminar: ");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > granos.size()-1 || indice < 0){
            System.out.println("-> Elija un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("Desea elimnar al producto? 1 = si 2 = no");
        int resp = sc.nextInt();
        
        if(resp == 1){
            granos.remove(indice);
            System.out.println("Se elimino el elemento en la lista");
            System.out.println();
        }else{
            System.out.println("El producto no se elimino");
            System.out.println();
        }
    }
    
    public static void eliminarLimpieza(){
        for (ProductosLimpieza l : limpieza) {
            System.out.println(limpieza.indexOf(l)+". "+l);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice del producto a eliminar: ");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > limpieza.size()-1 || indice < 0){
            System.out.println("-> Elija un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("Desea elimnar al producto? 1 = si 2 = no");
        int resp = sc.nextInt();
        
        if(resp == 1){
            limpieza.remove(indice);
            System.out.println("Se elimino el elemento en la lista");
            System.out.println();
        }else{
            System.out.println("El producto no se elimino");
            System.out.println();
        }
    }
    
    public static void eliminarLiquidos(){
        for (Liquidos l : liquidos) {
            System.out.println(liquidos.indexOf(l)+". "+l);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice del producto a eliminar: ");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > liquidos.size()-1 || indice < 0){
            System.out.println("-> Elija un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("Desea elimnar al producto? 1 = si 2 = no");
        int resp = sc.nextInt();
        
        if(resp == 1){
            liquidos.remove(indice);
            System.out.println("Se elimino el elemento en la lista");
            System.out.println();
        }else{
            System.out.println("El producto no se elimino");
            System.out.println();
        }
    }
    
    public static void eliminarCarnesEmbutidos(){
        for (Carnes_embutidos c : carnes) {
            System.out.println(carnes.indexOf(c)+". "+c);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice del producto a eliminar: ");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > carnes.size()-1 || indice < 0){
            System.out.println("-> Elija un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("Desea elimnar al producto? 1 = si 2 = no");
        int resp = sc.nextInt();
        
        if(resp == 1){
            carnes.remove(indice);
            System.out.println("Se elimino el elemento en la lista");
            System.out.println();
        }else{
            System.out.println("El producto no se elimino");
            System.out.println();
        }
    }
    
    public static void eliminarFrutasVerduras(){
        for (Frutas_Verduras f : frutasVerduras) {
            System.out.println(frutasVerduras.indexOf(f)+". "+f);
        }
        System.out.println();
        
        System.out.println("-> Ingrese el indice del producto a eliminar: ");
        int indice = sc.nextInt();
        System.out.println();
        
        while(indice > frutasVerduras.size()-1 || indice < 0){
            System.out.println("-> Elija un indice correcto!");
            indice = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("Desea elimnar al producto? 1 = si 2 = no");
        int resp = sc.nextInt();
        
        if(resp == 1){
            frutasVerduras.remove(indice);
            System.out.println("Se elimino el elemento en la lista");
            System.out.println();
        }else{
            System.out.println("El producto no se elimino");
            System.out.println();
        }
    }
    
    
    public static boolean checkCodigo(String codigo) {
        boolean check = false;
        int contador = 0;

        for (ProductosLimpieza p : limpieza) {
            String code = limpieza.get(limpieza.indexOf(p)).getCodigo();
            if (codigo.equals(code)) {
                contador++;
            }
        }

        if (contador == 0) {
            check = true;
        }

        return check;
    }

}
