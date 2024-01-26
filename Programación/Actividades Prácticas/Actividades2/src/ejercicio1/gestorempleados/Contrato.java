package ejercicio1.gestorempleados;

import java.util.Date;

enum TipoContrato {
    INDEFINIDO, TEMPORAL
}

public class Contrato {
    private Date fechaCreacion;
    private TipoContrato tipoContrato;
    private Empresa empresa;
    private Empleado empleado;

    public Contrato(Date fechaCreacion, TipoContrato tipoContrato, Empleado empleado) {
        this.fechaCreacion = fechaCreacion;
        this.tipoContrato = tipoContrato;
        this.empleado = empleado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Fecha de creacion: " + this.fechaCreacion + "\nTipo de contrato: " + this.tipoContrato
                + "\nEmpresa: " + (empresa != null ? empresa.toString() : "No asignada");
    }

}
