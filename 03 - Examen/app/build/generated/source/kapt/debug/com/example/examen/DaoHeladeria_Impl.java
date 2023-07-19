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
import java.lang.Integer;
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
public final class DaoHeladeria_Impl implements DaoHeladeria {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Heladeria> __insertionAdapterOfHeladeria;

  private final SharedSQLiteStatement __preparedStmtOfActualizarHeladeria;

  private final SharedSQLiteStatement __preparedStmtOfBorrarHeladeria;

  public DaoHeladeria_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHeladeria = new EntityInsertionAdapter<Heladeria>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `heladerias` (`codigoHeladeria`,`heladeria`,`precio`,`sabor`,`descripcion`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Heladeria value) {
        stmt.bindLong(1, value.getCodigoHeladeria());
        if (value.getHeladeria() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getHeladeria());
        }
        if (value.getPrecio() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPrecio());
        }
        if (value.getSabor() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSabor());
        }
        if (value.getDescripcion() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescripcion());
        }
      }
    };
    this.__preparedStmtOfActualizarHeladeria = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE heladerias set heladeria=?,precio=?, sabor=?, descripcion=? WHERE codigoHeladeria=?";
        return _query;
      }
    };
    this.__preparedStmtOfBorrarHeladeria = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM heladerias WHERE codigoHeladeria=?";
        return _query;
      }
    };
  }

  @Override
  public Object agregarHeladeria(final Heladeria heladeria,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHeladeria.insert(heladeria);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object actualizarHeladeria(final int codigoHeladeria, final String heladeria,
      final String precio, final String sabor, final String descripcion,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfActualizarHeladeria.acquire();
        int _argIndex = 1;
        if (heladeria == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, heladeria);
        }
        _argIndex = 2;
        if (precio == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, precio);
        }
        _argIndex = 3;
        if (sabor == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, sabor);
        }
        _argIndex = 4;
        if (descripcion == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, descripcion);
        }
        _argIndex = 5;
        _stmt.bindLong(_argIndex, codigoHeladeria);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfActualizarHeladeria.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object borrarHeladeria(final int codigoHeladeria,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfBorrarHeladeria.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, codigoHeladeria);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfBorrarHeladeria.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object obtenerHeladerias(final Continuation<? super List<Heladeria>> continuation) {
    final String _sql = "SELECT * FROM heladerias";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Heladeria>>() {
      @Override
      public List<Heladeria> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCodigoHeladeria = CursorUtil.getColumnIndexOrThrow(_cursor, "codigoHeladeria");
          final int _cursorIndexOfHeladeria = CursorUtil.getColumnIndexOrThrow(_cursor, "heladeria");
          final int _cursorIndexOfPrecio = CursorUtil.getColumnIndexOrThrow(_cursor, "precio");
          final int _cursorIndexOfSabor = CursorUtil.getColumnIndexOrThrow(_cursor, "sabor");
          final int _cursorIndexOfDescripcion = CursorUtil.getColumnIndexOrThrow(_cursor, "descripcion");
          final List<Heladeria> _result = new ArrayList<Heladeria>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Heladeria _item;
            final int _tmpCodigoHeladeria;
            _tmpCodigoHeladeria = _cursor.getInt(_cursorIndexOfCodigoHeladeria);
            final String _tmpHeladeria;
            if (_cursor.isNull(_cursorIndexOfHeladeria)) {
              _tmpHeladeria = null;
            } else {
              _tmpHeladeria = _cursor.getString(_cursorIndexOfHeladeria);
            }
            final String _tmpPrecio;
            if (_cursor.isNull(_cursorIndexOfPrecio)) {
              _tmpPrecio = null;
            } else {
              _tmpPrecio = _cursor.getString(_cursorIndexOfPrecio);
            }
            final String _tmpSabor;
            if (_cursor.isNull(_cursorIndexOfSabor)) {
              _tmpSabor = null;
            } else {
              _tmpSabor = _cursor.getString(_cursorIndexOfSabor);
            }
            final String _tmpDescripcion;
            if (_cursor.isNull(_cursorIndexOfDescripcion)) {
              _tmpDescripcion = null;
            } else {
              _tmpDescripcion = _cursor.getString(_cursorIndexOfDescripcion);
            }
            _item = new Heladeria(_tmpCodigoHeladeria,_tmpHeladeria,_tmpPrecio,_tmpSabor,_tmpDescripcion);
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

  @Override
  public Object obtenerCodigoActual(final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT codigoHeladeria FROM heladerias LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getInt(0);
            }
          } else {
            _result = null;
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
