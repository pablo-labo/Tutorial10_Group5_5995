package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class ie6 implements fie {
    public final tqc a;
    public final Deflater b;
    public final hs3 c;
    public boolean d;
    public final CRC32 e;

    public ie6(ro1 ro1Var) {
        ro1Var.getClass();
        tqc tqcVar = new tqc(ro1Var);
        this.a = tqcVar;
        Deflater deflater = new Deflater(-1, true);
        this.b = deflater;
        this.c = new hs3(tqcVar, deflater);
        this.e = new CRC32();
        zn1 zn1Var = tqcVar.b;
        zn1Var.N0(8075);
        zn1Var.r0(8);
        zn1Var.r0(0);
        zn1Var.L0(0);
        zn1Var.r0(0);
        zn1Var.r0(0);
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        lyd lydVar = zn1Var.a;
        lydVar.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, lydVar.c - lydVar.b);
            this.e.update(lydVar.a, lydVar.b, iMin);
            j2 -= (long) iMin;
            lydVar = lydVar.f;
            lydVar.getClass();
        }
        this.c.I1(zn1Var, j);
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        int value;
        boolean z;
        zn1 zn1Var;
        Deflater deflater = this.b;
        tqc tqcVar = this.a;
        if (this.d) {
            return;
        }
        try {
            hs3 hs3Var = this.c;
            hs3Var.b.finish();
            hs3Var.a(false);
            value = (int) this.e.getValue();
            z = tqcVar.c;
            zn1Var = tqcVar.b;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        zn1Var.getClass();
        zn1Var.L0(k.c(value));
        tqcVar.a();
        int bytesRead = (int) deflater.getBytesRead();
        if (tqcVar.c) {
            throw new IllegalStateException("closed");
        }
        zn1Var.getClass();
        zn1Var.L0(k.c(bytesRead));
        tqcVar.a();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            tqcVar.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.fie, java.io.Flushable
    public final void flush() throws IOException {
        this.c.flush();
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.a.a.g();
    }
}
