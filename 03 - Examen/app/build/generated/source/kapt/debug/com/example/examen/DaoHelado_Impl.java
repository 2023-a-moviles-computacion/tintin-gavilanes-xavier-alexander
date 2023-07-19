package com.example.examen;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DaoHelado_Impl implements DaoHelado {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Helado> __insertionAdapterOfHelado;

  private final SharedSQLiteStatement __preparedStmtOfActualizarHelado;

  private final SharedSQLiteStatement __preparedStmtOfBorrarHelado;

  public DaoHelado_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHelado = new EntityInsertionAdapter<Helado>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `helados` (`helado`,`precioHelado`,`descripcionP`,`codigoHeladeria`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Helado value) {
        if (value.getHelado() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getHelado());
        }
        if (value.getPrecioHelado() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPrecioHelado());
        }
        if (value.getDescripcionP() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescripcionP());
        }
        stmt.bindLong(4, value.getCodigoHeladeria());
      }
    };
    this.__preparedStmtOfActualizarHelado = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE helados set precioHelado=?, descripcionP=?,codigoHeladeria=? WHERE helado=?";
        return _query;
      }
    };
    this.__preparedStmtOfBorrarHelado = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM helados WHERE helado=?";
        return _query;
      }
    };
  }

  @Override
  public Object agregarHelado(final Helado helado, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHelado.insert(helado);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object actualizarHelado(final String helado, final String precioHelado,
      final String descripcionP, final int codigoHeladeria,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfActualizarHelado.acquire();
        int _argIndex = 1;
        if (precioHelado == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, precioHelado);
        }
        _argIndex = 2;
        if (descripcionP == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, descripcionP);
        }
        _argIndex = 3;
        _stmt.bindLong(_argIndex, codigoHeladeria);
        _argIndex = 4;
        if (helado == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, helado);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfActualizarHelado.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object borrarHelado(final String helado, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfBorrarHelado.acquire();
        int _argIndex = 1;
        if (helado == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, helado);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfBorrarHelado.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object obtenerHeladoPorCodigoHelado(final int codigoHeladeria,
      final Continuation<? super List<Helado>> continuation) {
    final String _sql = "SELECT * FROM helados WHERE codigoHeladeria =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, codigoHeladeria);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Helado>>() {
      @Override
      public List<Helado> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfHelado = CursorUtil.getColumnIndexOrThrow(_cursor, "helado");
          final int _cursorIndexOfPrecioHelado = CursorUtil.getColumnIndexOrThrow(_cursor, "precioHelado");
          final int _cursorIndexOfDescripcionP = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcionP");
          final int _cursorIndexOfCodigoHeladeria = CursorUtil.getColumnIndexOrThrow(_cursor, "codigoHeladeria");
          final List<Helado> _result = new ArrayList<Helado>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Helado _item;
            final String _tmpHelado;
            if (_cursor.isNull(_cursorIndexOfHelado)) {
              _tmpHelado = null;
            } else {
              _tmpHelado = _cursor.getString(_cursorIndexOfHelado);
            }
            final String _tmpPrecioHelado;
            if (_cursor.isNull(_cursorIndexOfPrecioHelado)) {
              _tmpPrecioHelado = null;
            } else {
              _tmpPrecioHelado = _cursor.getString(_cursorIndexOfPrecioHelado);
            }
            final String _tmpDescripcionP;
            if (_cursor.isNull(_cursorIndexOfDescripcionP)) {
              _tmpDescripcionP = null;
            } else {
              _tmpDescripcionP = _cursor.getString(_cursorIndexOfDescripcionP);
            }
            final int _tmpCodigoHeladeria;
            _tmpCodigoHeladeria = _cursor.getInt(_cursorIndexOfCodigoHeladeria);
            _item = new Helado(_tmpHelado,_tmpPrecioHelado,_tmpDescripcionP,_tmpCodigoHeladeria);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
