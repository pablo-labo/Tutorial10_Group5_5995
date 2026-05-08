package defpackage;

import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import defpackage.tze;

/* JADX INFO: loaded from: classes.dex */
public final class ct5 implements tze.c {
    @Override // tze.c
    public final tze c(tze.b bVar) {
        return new FrameworkSQLiteOpenHelper(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
    }
}
