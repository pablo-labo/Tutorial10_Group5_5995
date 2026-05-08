package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class gh1 implements fie {
    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws EOFException {
        zn1Var.getClass();
        zn1Var.skip(j);
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fie, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.fie
    public final kmf g() {
        return kmf.d;
    }
}
