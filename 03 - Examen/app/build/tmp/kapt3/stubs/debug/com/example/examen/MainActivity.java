package com.example.examen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010%\u001a\u00020#J\u000e\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\'\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006,"}, d2 = {"Lcom/example/examen/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/examen/AdaptadorListener;", "()V", "adatador", "Lcom/example/examen/AdaptadorHeladerias;", "getAdatador", "()Lcom/example/examen/AdaptadorHeladerias;", "setAdatador", "(Lcom/example/examen/AdaptadorHeladerias;)V", "binding", "Lcom/example/examen/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/examen/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/examen/databinding/ActivityMainBinding;)V", "heladeria", "Lcom/example/examen/Heladeria;", "getHeladeria", "()Lcom/example/examen/Heladeria;", "setHeladeria", "(Lcom/example/examen/Heladeria;)V", "listaHeladerias", "", "getListaHeladerias", "()Ljava/util/List;", "setListaHeladerias", "(Ljava/util/List;)V", "room", "Lcom/example/examen/DBHeladeria;", "getRoom", "()Lcom/example/examen/DBHeladeria;", "setRoom", "(Lcom/example/examen/DBHeladeria;)V", "actualizarHeladeria", "", "agregarHeladeria", "limpiarCampos", "obtenerHeladerias", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteItemClick", "onEditItemClick", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.examen.AdaptadorListener {
    public com.example.examen.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.examen.Heladeria> listaHeladerias;
    public com.example.examen.AdaptadorHeladerias adatador;
    public com.example.examen.DBHeladeria room;
    public com.example.examen.Heladeria heladeria;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.example.examen.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.examen.Heladeria> getListaHeladerias() {
        return null;
    }
    
    public final void setListaHeladerias(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.examen.Heladeria> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.AdaptadorHeladerias getAdatador() {
        return null;
    }
    
    public final void setAdatador(@org.jetbrains.annotations.NotNull
    com.example.examen.AdaptadorHeladerias p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.DBHeladeria getRoom() {
        return null;
    }
    
    public final void setRoom(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHeladeria p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.Heladeria getHeladeria() {
        return null;
    }
    
    public final void setHeladeria(@org.jetbrains.annotations.NotNull
    com.example.examen.Heladeria p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void obtenerHeladerias(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHeladeria room) {
    }
    
    public final void agregarHeladeria(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHeladeria room, @org.jetbrains.annotations.NotNull
    com.example.examen.Heladeria heladeria) {
    }
    
    public final void actualizarHeladeria(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHeladeria room, @org.jetbrains.annotations.NotNull
    com.example.examen.Heladeria heladeria) {
    }
    
    public final void limpiarCampos() {
    }
    
    @java.lang.Override
    public void onEditItemClick(@org.jetbrains.annotations.NotNull
    com.example.examen.Heladeria heladeria) {
    }
    
    @java.lang.Override
    public void onDeleteItemClick(@org.jetbrains.annotations.NotNull
    com.example.examen.Heladeria heladeria) {
    }
}