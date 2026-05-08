package defpackage;

import android.database.AbstractCursor;

/* JADX INFO: loaded from: classes.dex */
public final class jid extends AbstractCursor {
    public final iid a;
    public final int b;

    public jid(iid iidVar, int i) {
        iidVar.getClass();
        this.a = iidVar;
        this.b = i;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        return (String[]) this.a.getColumnNames().toArray(new String[0]);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return this.b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final short getShort(int i) {
        return (short) this.a.getLong(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String getString(int i) {
        return this.a.r1(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        if (i + 1 == i2) {
            return this.a.M1();
        }
        r6.g("Compat cursor can only move forward one position at a time.");
        return false;
    }
}
