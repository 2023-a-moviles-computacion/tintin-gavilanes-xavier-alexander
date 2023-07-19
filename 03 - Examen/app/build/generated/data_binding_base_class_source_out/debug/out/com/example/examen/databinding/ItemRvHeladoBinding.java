// Generated by view binder compiler. Do not edit!
package com.example.examen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.examen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRvHeladoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnBorrarP;

  @NonNull
  public final CardView cvHelado;

  @NonNull
  public final TextView tvCodigoHeladeria;

  @NonNull
  public final TextView tvDescripcionP;

  @NonNull
  public final TextView tvHelado;

  @NonNull
  public final TextView tvPrecioHelado;

  private ItemRvHeladoBinding(@NonNull LinearLayout rootView, @NonNull Button btnBorrarP,
      @NonNull CardView cvHelado, @NonNull TextView tvCodigoHeladeria,
      @NonNull TextView tvDescripcionP, @NonNull TextView tvHelado,
      @NonNull TextView tvPrecioHelado) {
    this.rootView = rootView;
    this.btnBorrarP = btnBorrarP;
    this.cvHelado = cvHelado;
    this.tvCodigoHeladeria = tvCodigoHeladeria;
    this.tvDescripcionP = tvDescripcionP;
    this.tvHelado = tvHelado;
    this.tvPrecioHelado = tvPrecioHelado;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRvHeladoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRvHeladoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_rv_helado, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRvHeladoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBorrarP;
      Button btnBorrarP = ViewBindings.findChildViewById(rootView, id);
      if (btnBorrarP == null) {
        break missingId;
      }

      id = R.id.cvHelado;
      CardView cvHelado = ViewBindings.findChildViewById(rootView, id);
      if (cvHelado == null) {
        break missingId;
      }

      id = R.id.tvCodigoHeladeria;
      TextView tvCodigoHeladeria = ViewBindings.findChildViewById(rootView, id);
      if (tvCodigoHeladeria == null) {
        break missingId;
      }

      id = R.id.tvDescripcionP;
      TextView tvDescripcionP = ViewBindings.findChildViewById(rootView, id);
      if (tvDescripcionP == null) {
        break missingId;
      }

      id = R.id.tvHelado;
      TextView tvHelado = ViewBindings.findChildViewById(rootView, id);
      if (tvHelado == null) {
        break missingId;
      }

      id = R.id.tvPrecioHelado;
      TextView tvPrecioHelado = ViewBindings.findChildViewById(rootView, id);
      if (tvPrecioHelado == null) {
        break missingId;
      }

      return new ItemRvHeladoBinding((LinearLayout) rootView, btnBorrarP, cvHelado,
          tvCodigoHeladeria, tvDescripcionP, tvHelado, tvPrecioHelado);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
