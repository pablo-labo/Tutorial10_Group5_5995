package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes3.dex */
public final class hs3 implements fie {
    public final tqc a;
    public final Deflater b;
    public boolean c;

    public hs3(tqc tqcVar, Deflater deflater) {
        this.a = tqcVar;
        this.b = deflater;
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        k.b(zn1Var.b, 0L, j);
        while (j > 0) {
            lyd lydVar = zn1Var.a;
            lydVar.getClass();
            int iMin = (int) Math.min(j, lydVar.c - lydVar.b);
            this.b.setInput(lydVar.a, lydVar.b, iMin);
            a(false);
            long j2 = iMin;
            zn1Var.b -= j2;
            int i = lydVar.b + iMin;
            lydVar.b = i;
            if (i == lydVar.c) {
                zn1Var.a = lydVar.a();
                qyd.a(lydVar);
            }
            j -= j2;
        }
    }

    public final void a(boolean z) throws IOException {
        lyd lydVarM0;
        int iDeflate;
        tqc tqcVar = this.a;
        zn1 zn1Var = tqcVar.b;
        while (true) {
            lydVarM0 = zn1Var.m0(1);
            byte[] bArr = lydVarM0.a;
            int i = lydVarM0.c;
            Deflater deflater = this.b;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                lydVarM0.c += iDeflate;
                zn1Var.b += (long) iDeflate;
                tqcVar.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (lydVarM0.b == lydVarM0.c) {
            zn1Var.a = lydVarM0.a();
            qyd.a(lydVarM0);
        }
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.b;
        if (this.c) {
            return;
        }
        try {
            deflater.finish();
            a(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.fie, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.a.flush();
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.a.a.g();
    }

    public final String toString() {
        return "DeflaterSink(" + this.a + ')';
    }
}
