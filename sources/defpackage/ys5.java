package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ys5 implements xu5 {
    public final /* synthetic */ xze a;

    public /* synthetic */ ys5(xze xzeVar) {
        this.a = xzeVar;
    }

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        sQLiteQuery.getClass();
        this.a.p(new dt5(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
