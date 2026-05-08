package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface sze extends Closeable {
    void D(String str);

    boolean F1();

    int N1(ContentValues contentValues, Object[] objArr);

    zze O0(String str);

    void T();

    void U();

    default void U0() {
        y();
    }

    void c0();

    void c1(Object[] objArr);

    boolean isOpen();

    void y();

    boolean y1();

    Cursor z(xze xzeVar);
}
