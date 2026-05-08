package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class hf7 implements pne {
    public final InputStream a;
    public final kmf b;

    public hf7(InputStream inputStream, kmf kmfVar) {
        inputStream.getClass();
        kmfVar.getClass();
        this.a = inputStream;
        this.b = kmfVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.b.f();
            lyd lydVarM0 = zn1Var.m0(1);
            int i = this.a.read(lydVarM0.a, lydVarM0.c, (int) Math.min(j, 8192 - lydVarM0.c));
            if (i != -1) {
                lydVarM0.c += i;
                long j2 = i;
                zn1Var.b += j2;
                return j2;
            }
            if (lydVarM0.b != lydVarM0.c) {
                return -1L;
            }
            zn1Var.a = lydVarM0.a();
            qyd.a(lydVarM0);
            return -1L;
        } catch (AssertionError e) {
            if (c0h.z(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
