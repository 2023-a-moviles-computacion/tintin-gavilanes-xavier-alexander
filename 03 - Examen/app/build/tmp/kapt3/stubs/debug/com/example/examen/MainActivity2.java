package com.example.examen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001e\u0010(\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+J\u001e\u0010,\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+J\u0006\u0010-\u001a\u00020)J\u0016\u0010.\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010*\u001a\u00020+J\u0012\u0010/\u001a\u00020)2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0018\u00102\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u00103\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00064"}, d2 = {"Lcom/example/examen/MainActivity2;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/examen/AdaptadorListener2;", "()V", "adatador", "Lcom/example/examen/AdaptadorHelados;", "getAdatador", "()Lcom/example/examen/AdaptadorHelados;", "setAdatador", "(Lcom/example/examen/AdaptadorHelados;)V", "binding", "Lcom/example/examen/databinding/ActivityMain2Binding;", "getBinding", "()Lcom/example/examen/databinding/ActivityMain2Binding;", "setBinding", "(Lcom/example/examen/databinding/ActivityMain2Binding;)V", "helado", "Lcom/example/examen/Helado;", "getHelado", "()Lcom/example/examen/Helado;", "setHelado", "(Lcom/example/examen/Helado;)V", "listaHelados", "", "getListaHelados", "()Ljava/util/List;", "setListaHelados", "(Ljava/util/List;)V", "room", "Lcom/example/examen/DBHeladeria;", "getRoom", "()Lcom/example/examen/DBHeladeria;", "setRoom", "(Lcom/example/examen/DBHeladeria;)V", "room2", "Lcom/example/examen/DBHelado;", "getRoom2", "()Lcom/example/examen/DBHelado;", "setRoom2", "(Lcom/example/examen/DBHelado;)V", "actualizarHelado", "", "codigoHeladeria", "", "agregarHelado", "limpiarCampos", "obtenerHelados", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteItemClick", "onEditItemClick", "app_debug"})
public final class MainActivity2 extends androidx.appcompat.app.AppCompatActivity implements com.example.examen.AdaptadorListener2 {
    public com.example.examen.databinding.ActivityMain2Binding binding;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.examen.Helado> listaHelados;
    public com.example.examen.AdaptadorHelados adatador;
    public com.example.examen.DBHeladeria room;
    public com.example.examen.DBHelado room2;
    public com.example.examen.Helado helado;
    
    public MainActivity2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.databinding.ActivityMain2Binding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.example.examen.databinding.ActivityMain2Binding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.examen.Helado> getListaHelados() {
        return null;
    }
    
    public final void setListaHelados(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.examen.Helado> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.AdaptadorHelados getAdatador() {
        return null;
    }
    
    public final void setAdatador(@org.jetbrains.annotations.NotNull
    com.example.examen.AdaptadorHelados p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.DBHeladeria getRoom() {
        return null;
    }
    
    public final void setRoom(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHeladeria p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.DBHelado getRoom2() {
        return null;
    }
    
    public final void setRoom2(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHelado p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.Helado getHelado() {
        return null;
    }
    
    public final void setHelado(@org.jetbrains.annotations.NotNull
    com.example.examen.Helado p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void obtenerHelados(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHelado room, int codigoHeladeria) {
    }
    
    public final void agregarHelado(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHelado room, @org.jetbrains.annotations.NotNull
    com.example.examen.Helado helado, int codigoHeladeria) {
    }
    
    public final void actualizarHelado(@org.jetbrains.annotations.NotNull
    com.example.examen.DBHelado room, @org.jetbrains.annotations.NotNull
    com.example.examen.Helado helado, int codigoHeladeria) {
    }
    
    public final void limpiarCampos() {
    }
    
    @java.lang.Override
    public void onEditItemClick(@org.jetbrains.annotations.NotNull
    com.example.examen.Helado helado, int codigoHeladeria) {
    }
    
    @java.lang.Override
    public void onDeleteItemClick(@org.jetbrains.annotations.NotNull
    com.example.examen.Helado helado, int codigoHeladeria) {
    }
}