package org.iesalandalus.programacion.tallermecanico.modelo;

import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Trabajo;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;

import java.time.LocalDate;
import java.util.List;

public interface Modelo {
    void comenzar();

    void terminar();

    void insertar(Cliente cliente) throws TallerMecanicoExcepcion;

    void insertar(Vehiculo vehiculo) throws TallerMecanicoExcepcion;

    void insertar(Trabajo revision) throws TallerMecanicoExcepcion;

    Cliente buscar(Cliente cliente);

    Vehiculo buscar(Vehiculo vehiculo);

    Trabajo buscar(Trabajo trabajo);

    boolean modificar(Cliente cliente, String nombre, String telefono) throws TallerMecanicoExcepcion;

    Trabajo anadirHoras(Trabajo revision, int horas) throws TallerMecanicoExcepcion;

    Trabajo anadirPrecioMaterial(Trabajo revision, float precioMaterial) throws TallerMecanicoExcepcion;

    Trabajo cerrar(Trabajo revision, LocalDate fechaFin) throws TallerMecanicoExcepcion;

    void borrar(Cliente cliente) throws TallerMecanicoExcepcion;

    void borrar(Vehiculo vehiculo) throws TallerMecanicoExcepcion;

    void borrar(Trabajo revision) throws TallerMecanicoExcepcion;

    List<Cliente> getClientes();

    List<Vehiculo> getVehiculos();

    List<Trabajo> getTrabajos();

    List<Trabajo> getTrabajos(Cliente cliente);

    List<Trabajo> getTrabajos(Vehiculo vehiculo);
}
