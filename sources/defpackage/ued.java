package defpackage;

import android.content.Context;
import defpackage.xed;

/* JADX INFO: loaded from: classes.dex */
public final class ued {
    public static final <T extends xed> xed.a<T> a(Context context, Class<T> cls, String str) {
        context.getClass();
        if (zve.U(str)) {
            l5.q("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new xed.a<>(context, cls, str);
        }
        l5.q("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }
}
