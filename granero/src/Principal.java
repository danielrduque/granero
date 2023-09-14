import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //System.out.println("Bienvenidos a POO con java");

        //crear un articulo
        //Articulo articulo1 = new Articulo("001","Arroz","0-A",50,2500);

       /* System.out.println( articulo1.getCodigo() );
        System.out.println( articulo1.getNombre() );
        System.out.println( articulo1.getCategoria() );
        System.out.println( articulo1.getCantidad() );
        System.out.println( articulo1.getValorCompra() ); */

        //articulo1.showInfo();

        //Articulo articulo2 = new Articulo("002","Cafe","0-A",30,4000);
        //articulo2.showInfo();

     /*   List<Articulo> listaArticulo = new ArrayList<>();

        listaArticulo.add(new Articulo("001","Arroz","0-A",50,2500));
        listaArticulo.add(new Articulo("002","Cafe","0-A",30,4000));


        //recorrer la lista de articulos para mostrar la información de cada articulo
        for (Articulo articulo:listaArticulo){
            articulo.showInfo();
        }*/
        /*
        ListaArticulos articulos = new ListaArticulos();
        articulos.addArticuloToList(new Articulo("001","Arroz","0-A",50,2500));
        articulos.addArticuloToList(new Articulo("002","Cafe","0-A",30,4000));
        articulos.showList();

         */

        /*
        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0B","Aseo",0.15));

        categorias.showList(); */

        /*
        ListaVentas ventas = new ListaVentas();
        ventas.addVentaToList(new Venta("0009","001",5));
        ventas.addVentaToList(new Venta("0009","002",3));

        ventas.showList();


        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0-A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0-B","Aseo",0.15));

        ListaArticulos articulos = new ListaArticulos();
        articulos.addArticuloToList(new Articulo("001","Arroz","0-A",50,2500));
        articulos.addArticuloToList(new Articulo("002","Cafe","0-A",30,4000));
        articulos.generarGanancias(categorias);

        articulos.showList();


    }
}
*/
        ListaVentas listaVentas = new ListaVentas();
        ListaArticulos listaArticulos = new ListaArticulos();

        // Agregar artículos a la lista de artículos
        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0-A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0-B","Aseo",0.15));

        Articulo articulo1 = new Articulo("001", "Arroz", "0-A", 50, 2500);
        listaArticulos.addArticuloToList(articulo1);
        Articulo articulo2 = new Articulo("002", "Cafe", "0-A", 30, 4000);
        listaArticulos.addArticuloToList(articulo2);
        Articulo articulo3 = new Articulo("003", "Leche", "0-A", 20, 1800);
        Articulo articulo4 = new Articulo("004", "Pan", "0-A", 40, 1200);
        Articulo articulo5 = new Articulo("005", "Huevos", "0-A", 60, 1500);
        Articulo articulo6 = new Articulo("006", "Azúcar", "0-A", 25, 900);
        Articulo articulo7 = new Articulo("007", "Jabón", "0-B", 15, 1200);

        // Agregar artículos a las ventas

        listaVentas.agregarArticuloAVenta("Venta1", articulo1);
        listaVentas.agregarArticuloAVenta("Venta1", articulo2);
        listaVentas.agregarArticuloAVenta("Venta1", articulo3);
        listaVentas.agregarArticuloAVenta("Venta2", articulo4);
        listaVentas.agregarArticuloAVenta("Venta2", articulo5);
        listaVentas.agregarArticuloAVenta("Venta3", articulo6);
        listaVentas.agregarArticuloAVenta("Venta3", articulo7);

        listaVentas.mostrarList();
    }
}