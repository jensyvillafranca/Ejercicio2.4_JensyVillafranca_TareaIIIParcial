package com.example.ejercicio24_jensyvillafranca_tareaiiiparcial.transacciones;

public class transacciones_bd {

    //nombre de la BD
    public static final String nombre_bd = "bd_firmas";

    //Tablas de la BD
    public static final String tabla = "firmas";

    //Campos de la tabla
    public static final String id = "id";
    public static final String firma = "firma";
    public static final String descripcion = "descripcion";

    //Consultas de base de datos DDL
    //Creando la tabla con sus campos
    public static final String CreateTableFirmas = "CREATE TABLE firmas "+"(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "firma BLOB, " +
            "descripcion TEXT)";

    //Consultas de base de datos DML
    public static final String SelectTableFirmas = "SELECT firma, descripcion from " + transacciones_bd.tabla;
}
