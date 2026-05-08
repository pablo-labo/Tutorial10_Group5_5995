package defpackage;

import android.database.Cursor;
import defpackage.l9c;

/* JADX INFO: loaded from: classes.dex */
public final class r60 implements wpe {
    public final Cursor a;

    public r60(Cursor cursor) {
        cursor.getClass();
        this.a = cursor;
    }

    @Override // defpackage.wpe
    public final String getString(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @Override // defpackage.wpe
    public final l9c.b next() {
        return new l9c.b(Boolean.valueOf(this.a.moveToNext()));
    }
}
