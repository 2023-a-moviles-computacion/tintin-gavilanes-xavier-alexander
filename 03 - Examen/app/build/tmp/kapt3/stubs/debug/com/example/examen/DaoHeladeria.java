package com.example.examen;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\bg\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/examen/DaoHeladeria;", "", "actualizarHeladeria", "", "codigoHeladeria", "", "heladeria", "", "precio", "sabor", "descripcion", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "agregarHeladeria", "Lcom/example/examen/Heladeria;", "(Lcom/example/examen/Heladeria;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "borrarHeladeria", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerCodigoActual", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtenerHeladerias", "", "app_debug"})
public abstract interface DaoHeladeria {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM heladerias")
    public abstract java.lang.Object obtenerHeladerias(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.examen.Heladeria>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object agregarHeladeria(@org.jetbrains.annotations.NotNull
    com.example.examen.Heladeria heladeria, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "UPDATE heladerias set heladeria=:heladeria,precio=:precio, sabor=:sabor, descripcion=:descripcion WHERE codigoHeladeria=:codigoHeladeria")
    public abstract java.lang.Object actualizarHeladeria(int codigoHeladeria, @org.jetbrains.annotations.NotNull
    java.lang.String heladeria, @org.jetbrains.annotations.NotNull
    java.lang.String precio, @org.jetbrains.annotations.NotNull
    java.lang.String sabor, @org.jetbrains.annotations.NotNull
    java.lang.String descripcion, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM heladerias WHERE codigoHeladeria=:codigoHeladeria")
    public abstract java.lang.Object borrarHeladeria(int codigoHeladeria, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT codigoHeladeria FROM heladerias LIMIT 1")
    public abstract java.lang.Object obtenerCodigoActual(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}