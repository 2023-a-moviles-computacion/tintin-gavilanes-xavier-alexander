package com.example.examen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/examen/AdaptadorListener2;", "", "onDeleteItemClick", "", "helado", "Lcom/example/examen/Helado;", "codigoHeladeria", "", "onEditItemClick", "app_debug"})
public abstract interface AdaptadorListener2 {
    
    public abstract void onEditItemClick(@org.jetbrains.annotations.NotNull
    com.example.examen.Helado helado, int codigoHeladeria);
    
    public abstract void onDeleteItemClick(@org.jetbrains.annotations.NotNull
    com.example.examen.Helado helado, int codigoHeladeria);
}