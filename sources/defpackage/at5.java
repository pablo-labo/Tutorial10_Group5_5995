package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class at5 implements sze {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final Lazy<Method> d;
    public static final Lazy<Method> e;
    public final SQLiteDatabase a;

    public static final class a {
    }

    static {
        as0 as0Var = new as0(7);
        qt8 qt8Var = qt8.c;
        d = boa.E(qt8Var, as0Var);
        e = boa.E(qt8Var, new sz0(2));
    }

    public at5(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.sze
    public final void D(String str) {
        this.a.execSQL(str);
    }

    @Override // defpackage.sze
    public final boolean F1() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.sze
    public final int N1(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            l5.q("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        zze zzeVarO0 = O0(sb.toString());
        int length2 = objArr2.length;
        while (i < length2) {
            Object obj = objArr2[i];
            i++;
            if (obj == null) {
                zzeVarO0.u(i);
            } else if (obj instanceof byte[]) {
                zzeVarO0.r(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                zzeVarO0.e(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                zzeVarO0.e(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                zzeVarO0.q(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                zzeVarO0.q(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                zzeVarO0.q(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                zzeVarO0.q(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                zzeVarO0.n(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                zzeVarO0.q(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((et5) zzeVarO0).b.executeUpdateDelete();
    }

    @Override // defpackage.sze
    public final zze O0(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new et5(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.sze
    public final void T() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.sze
    public final void U() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.sze
    public final void U0() throws IllegalAccessException, InvocationTargetException {
        Lazy<Method> lazy = e;
        if (lazy.getValue() != null) {
            Lazy<Method> lazy2 = d;
            if (lazy2.getValue() != null) {
                Method value = lazy.getValue();
                value.getClass();
                Method value2 = lazy2.getValue();
                value2.getClass();
                Object objInvoke = value2.invoke(this.a, null);
                if (objInvoke != null) {
                    value.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    r6.g("Required value was null.");
                    return;
                }
            }
        }
        y();
    }

    @Override // defpackage.sze
    public final void c0() {
        this.a.endTransaction();
    }

    @Override // defpackage.sze
    public final void c1(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.sze
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.sze
    public final void y() {
        this.a.beginTransaction();
    }

    @Override // defpackage.sze
    public final boolean y1() {
        return this.a.inTransaction();
    }

    @Override // defpackage.sze
    public final Cursor z(xze xzeVar) {
        final ys5 ys5Var = new ys5(xzeVar);
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: zs5
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) ys5Var.j(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, xzeVar.h(), c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }
}
