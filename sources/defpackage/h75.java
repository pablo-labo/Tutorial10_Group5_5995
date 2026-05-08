package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h75 extends eq5 {
    public final m64 b;
    public boolean c;

    public h75(fie fieVar, m64 m64Var) {
        super(fieVar);
        this.b = m64Var;
    }

    @Override // defpackage.eq5, defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws EOFException {
        if (this.c) {
            zn1Var.skip(j);
            return;
        }
        try {
            super.I1(zn1Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.eq5, defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.eq5, defpackage.fie, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
