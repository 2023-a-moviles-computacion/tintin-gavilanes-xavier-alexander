package com.example.examen;

import java.lang.System;

@androidx.room.Entity(tableName = "helados")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/example/examen/Helado;", "", "helado", "", "precioHelado", "descripcionP", "codigoHeladeria", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCodigoHeladeria", "()I", "setCodigoHeladeria", "(I)V", "getDescripcionP", "()Ljava/lang/String;", "setDescripcionP", "(Ljava/lang/String;)V", "getHelado", "setHelado", "getPrecioHelado", "setPrecioHelado", "app_debug"})
public final class Helado {
    @org.jetbrains.annotations.NotNull
    @androidx.room.PrimaryKey
    private java.lang.String helado;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "precioHelado")
    private java.lang.String precioHelado;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "descripcionP")
    private java.lang.String descripcionP;
    @androidx.room.ColumnInfo(name = "codigoHeladeria")
    private int codigoHeladeria;
    
    public Helado(@org.jetbrains.annotations.NotNull
    java.lang.String helado, @org.jetbrains.annotations.NotNull
    java.lang.String precioHelado, @org.jetbrains.annotations.NotNull
    java.lang.String descripcionP, int codigoHeladeria) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHelado() {
        return null;
    }
    
    public final void setHelado(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrecioHelado() {
        return null;
    }
    
    public final void setPrecioHelado(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescripcionP() {
        return null;
    }
    
    public final void setDescripcionP(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getCodigoHeladeria() {
        return 0;
    }
    
    public final void setCodigoHeladeria(int p0) {
    }
}