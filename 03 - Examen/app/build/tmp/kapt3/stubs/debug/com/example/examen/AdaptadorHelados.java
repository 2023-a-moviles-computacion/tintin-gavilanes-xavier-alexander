package com.example.examen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/examen/AdaptadorHelados;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/examen/AdaptadorHelados$ViewHolder;", "listaHelados", "", "Lcom/example/examen/Helado;", "listener", "Lcom/example/examen/AdaptadorListener2;", "(Ljava/util/List;Lcom/example/examen/AdaptadorListener2;)V", "getListaHelados", "()Ljava/util/List;", "getListener", "()Lcom/example/examen/AdaptadorListener2;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class AdaptadorHelados extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.examen.AdaptadorHelados.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.examen.Helado> listaHelados = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.examen.AdaptadorListener2 listener = null;
    
    public AdaptadorHelados(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.examen.Helado> listaHelados, @org.jetbrains.annotations.NotNull
    com.example.examen.AdaptadorListener2 listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.examen.Helado> getListaHelados() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.examen.AdaptadorListener2 getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.examen.AdaptadorHelados.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.examen.AdaptadorHelados.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/example/examen/AdaptadorHelados$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/examen/AdaptadorHelados;Landroid/view/View;)V", "btnBorrarP", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "getBtnBorrarP", "()Landroid/widget/Button;", "cvHelado", "Landroidx/cardview/widget/CardView;", "getCvHelado", "()Landroidx/cardview/widget/CardView;", "tvCodigoHeladeriaHelado", "Landroid/widget/TextView;", "getTvCodigoHeladeriaHelado", "()Landroid/widget/TextView;", "tvDescripcionP", "getTvDescripcionP", "tvHelado", "getTvHelado", "tvPrecioHelado", "getTvPrecioHelado", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.cardview.widget.CardView cvHelado = null;
        private final android.widget.TextView tvCodigoHeladeriaHelado = null;
        private final android.widget.TextView tvHelado = null;
        private final android.widget.TextView tvPrecioHelado = null;
        private final android.widget.TextView tvDescripcionP = null;
        private final android.widget.Button btnBorrarP = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final androidx.cardview.widget.CardView getCvHelado() {
            return null;
        }
        
        public final android.widget.TextView getTvCodigoHeladeriaHelado() {
            return null;
        }
        
        public final android.widget.TextView getTvHelado() {
            return null;
        }
        
        public final android.widget.TextView getTvPrecioHelado() {
            return null;
        }
        
        public final android.widget.TextView getTvDescripcionP() {
            return null;
        }
        
        public final android.widget.Button getBtnBorrarP() {
            return null;
        }
    }
}