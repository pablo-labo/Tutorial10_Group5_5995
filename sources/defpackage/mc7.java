package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class mc7 implements pne {
    public final uqc a;
    public final Inflater b;
    public int c;
    public boolean d;

    public mc7(uqc uqcVar, Inflater inflater) {
        this.a = uqcVar;
        this.b = inflater;
    }

    public final long a(zn1 zn1Var, long j) {
        Inflater inflater = this.b;
        zn1Var.getClass();
        if (j < 0) {
            h5.k(r6.c(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.d) {
            r6.g("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                lyd lydVarM0 = zn1Var.m0(1);
                int iMin = (int) Math.min(j, 8192 - lydVarM0.c);
                boolean zNeedsInput = inflater.needsInput();
                uqc uqcVar = this.a;
                if (zNeedsInput && !uqcVar.W0()) {
                    lyd lydVar = uqcVar.b.a;
                    lydVar.getClass();
                    int i = lydVar.c;
                    int i2 = lydVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(lydVar.a, i2, i3);
                }
                int iInflate = inflater.inflate(lydVarM0.a, lydVarM0.c, iMin);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    uqcVar.skip(remaining);
                }
                if (iInflate > 0) {
                    lydVarM0.c += iInflate;
                    long j2 = iInflate;
                    zn1Var.b += j2;
                    return j2;
                }
                if (lydVarM0.b == lydVarM0.c) {
                    zn1Var.a = lydVarM0.a();
                    qyd.a(lydVarM0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) throws EOFException {
        zn1Var.getClass();
        do {
            long jA = a(zn1Var, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.W0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.a.a.g();
    }
}
