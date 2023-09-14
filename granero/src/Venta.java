/*public class Venta {
    private String codigo;
    private String codigoArticulo;
    private double cantidad;

    public Venta() {
    }

    public Venta(String codigo, String codigoArticulo, double cantidad) {
        this.codigo = codigo;
        this.codigoArticulo = codigoArticulo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void showInfo(){
        System.out.println(this.getCodigo());
        System.out.println(this.getCodigoArticulo());
        System.out.println(this.getCantidad());
    }

}
*/
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo;
    private List<Articulo> articulosVendidos;

    public Venta() {
        articulosVendidos = new ArrayList<>();
    }

    public Venta(String codigo) {
        this.codigo = codigo;
        articulosVendidos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Articulo> getArticulosVendidos() {
        return articulosVendidos;
    }

    public void agregarArticuloVendido(Articulo articulo) {
        articulosVendidos.add(articulo);
    }

    public double calcularTotalVenta() {
        double total = 0.0;
        for (Articulo articulo : articulosVendidos) {
            total += articulo.getValorCompra();
        }
        return total;
    }

    public void mostrarInfo() {
        System.out.println("Código de Venta: " + this.getCodigo());
        System.out.println("Artículos Vendidos:");
        for (Articulo articulo : articulosVendidos) {
            System.out.println(" - " + articulo.getNombre());
        }
        System.out.println("Total de Venta: " + calcularTotalVenta());
    }
}
