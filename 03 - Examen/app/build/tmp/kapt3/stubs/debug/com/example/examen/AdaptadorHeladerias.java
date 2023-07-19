package com.example.examen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/examen/AdaptadorHeladerias;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/examen/AdaptadorHeladerias$ViewHolder;", "listaHeladerias", "", "Lcom/example/examen/Heladeria;", "listener", "Lcom/example/examen/AdaptadorListener;", "(Ljava/util/List;Lcom/example/examen/AdaptadorListener;)V", "getListaHeladerias", "()Ljava/util/List;", "getListener", "()Lcom/example/examen/AdaptadorListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdaptadorHeladerias extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.examen.AdaptadorHeladerias.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.examen.Heladeria> listaHeladerias = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.examen.AdaptadorListener listener = null;
    
    public AdaptadorHeladerias(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.examen.Heladeria> listaHeladerias, @org.jetbrains.annotations.NotNull
    com.example.examen.AdaptadorListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.examen.Heladeria> getListaHeladerias() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.AdaptadorListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.examen.AdaptadorHeladerias.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.examen.AdaptadorHeladerias.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0018\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u001a\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/example/examen/AdaptadorHeladerias$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Lcom/example/examen/AdaptadorHeladerias;Landroid/view/View;)V", "btnBorrar", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getBtnBorrar", "()Landroid/widget/Button;", "btnCrear", "getBtnCrear", "cvHeladeria", "Landroidx/cardview/widget/CardView;", "getCvHeladeria", "()Landroidx/cardview/widget/CardView;", "tvCodigoHeladeria", "Landroid/widget/TextView;", "getTvCodigoHeladeria", "()Landroid/widget/TextView;", "tvDescripcion", "getTvDescripcion", "tvHeladeria", "getTvHeladeria", "tvPrecio", "getTvPrecio", "tvSabor", "getTvSabor", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.cardview.widget.CardView cvHeladeria = null;
        private final android.widget.TextView tvCodigoHeladeria = null;
        private final android.widget.TextView tvHeladeria = null;
        private final android.widget.TextView tvPrecio = null;
        private final android.widget.TextView tvSabor = null;
        private final android.widget.TextView tvDescripcion = null;
        private final android.widget.Button btnBorrar = null;
        private final android.widget.Button btnCrear = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View ItemView) {
            super(null);
        }
        
        public final androidx.cardview.widget.CardView getCvHeladeria() {
            return null;
        }
        
        public final android.widget.TextView getTvCodigoHeladeria() {
            return null;
        }
        
        public final android.widget.TextView getTvHeladeria() {
            return null;
        }
        
        public final android.widget.TextView getTvPrecio() {
            return null;
        }
        
        public final android.widget.TextView getTvSabor() {
            return null;
        }
        
        public final android.widget.TextView getTvDescripcion() {
            return null;
        }
        
        public final android.widget.Button getBtnBorrar() {
            return null;
        }
        
        public final android.widget.Button getBtnCrear() {
            return null;
        }
    }
}