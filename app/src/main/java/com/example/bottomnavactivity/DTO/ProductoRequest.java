package com.example.bottomnavactivity.DTO;

import java.math.BigDecimal;

public class ProductoRequest {
    private String nombreProducto;
    private String codigoProducto;
    private int cantidad;
    private BigDecimal precio;

    public ProductoRequest() {}

    public ProductoRequest(String nombreProducto, String codigoProducto, int cantidad, BigDecimal precio) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombreProducto() { return nombreProducto; }
    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public String getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }
}
