/*import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
    List <Venta> ventaList;

    public ListaVentas(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public ListaVentas() {
        this.ventaList = new ArrayList<>();
    }

    public void addVentaToList(Venta v){
        this.ventaList.add(v);
    }

    public void showList(){
        for (Venta v: this.ventaList){
            v.showInfo();
        }
    }
}
*/
import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
    private List<Venta> ventaList;

    public ListaVentas() {
        ventaList = new ArrayList<>();
    }

    public void agregarArticuloAVenta(String codigoVenta, Articulo articulo) {
        Venta ventaExistente = null;
        for (Venta venta : ventaList) {
            if (venta.getCodigo().equals(codigoVenta)) {
                ventaExistente = venta;
                break;
            }
        }

        if (ventaExistente != null) {
            ventaExistente.agregarArticuloVendido(articulo);
        } else {
            Venta nuevaVenta = new Venta(codigoVenta);
            nuevaVenta.agregarArticuloVendido(articulo);
            ventaList.add(nuevaVenta);
        }
    }

    public void mostrarList() {
        for (Venta venta : ventaList) {
            venta.mostrarInfo();
            System.out.println();
        }
    }
}
