package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class dxa implements fie {
    public final OutputStream a;
    public final kmf b;

    public dxa(OutputStream outputStream, kmf kmfVar) {
        this.a = outputStream;
        this.b = kmfVar;
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        k.b(zn1Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            lyd lydVar = zn1Var.a;
            lydVar.getClass();
            int iMin = (int) Math.min(j, lydVar.c - lydVar.b);
            this.a.write(lydVar.a, lydVar.b, iMin);
            int i = lydVar.b + iMin;
            lydVar.b = i;
            long j2 = iMin;
            j -= j2;
            zn1Var.b -= j2;
            if (i == lydVar.c) {
                zn1Var.a = lydVar.a();
                qyd.a(lydVar);
            }
        }
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.fie, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }
}
