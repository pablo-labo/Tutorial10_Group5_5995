package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yf1 implements iid {
    public final /* synthetic */ iid a;

    public yf1(iid iidVar) {
        iidVar.getClass();
        this.a = iidVar;
    }

    @Override // defpackage.iid
    public final boolean M1() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final void R(int i, String str) {
        str.getClass();
        this.a.R(i, str);
    }

    @Override // defpackage.iid
    public final boolean b1() {
        return this.a.b1();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final void e(int i, double d) {
        this.a.e(i, d);
    }

    @Override // defpackage.iid
    public final int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final String getColumnName(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final List<String> getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // defpackage.iid
    public final double getDouble(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // defpackage.iid
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // defpackage.iid
    public final long getLong(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final boolean isNull(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final void q(int i, long j) {
        this.a.q(i, j);
    }

    @Override // defpackage.iid
    public final void r(int i, byte[] bArr) {
        this.a.r(i, bArr);
    }

    @Override // defpackage.iid
    public final String r1(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.iid
    public final void u(int i) {
        this.a.u(i);
    }
}
