package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g75 implements fie {
    public final fie a;
    public final me b;
    public boolean c;

    public g75(fie fieVar, me meVar) {
        this.a = fieVar;
        this.b = meVar;
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws EOFException {
        if (this.c) {
            zn1Var.skip(j);
            return;
        }
        try {
            this.a.I1(zn1Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.fie, java.io.Flushable
    public final void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.a.g();
    }
}
