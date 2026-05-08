package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class wv0 implements fie {
    public final /* synthetic */ fne a;
    public final /* synthetic */ dxa b;

    public wv0(fne fneVar, dxa dxaVar) {
        this.a = fneVar;
        this.b = dxaVar;
    }

    @Override // defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        k.b(zn1Var.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            lyd lydVar = zn1Var.a;
            lydVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += (long) (lydVar.c - lydVar.b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    lydVar = lydVar.f;
                    lydVar.getClass();
                }
            }
            dxa dxaVar = this.b;
            fne fneVar = this.a;
            fneVar.i();
            try {
                try {
                    dxaVar.I1(zn1Var, j2);
                    j6g j6gVar = j6g.a;
                    if (fneVar.j()) {
                        throw fneVar.l(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!fneVar.j()) {
                        throw e;
                    }
                    throw fneVar.l(e);
                }
            } catch (Throwable th) {
                fneVar.j();
                throw th;
            }
        }
    }

    @Override // defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        dxa dxaVar = this.b;
        fne fneVar = this.a;
        fneVar.i();
        try {
            dxaVar.close();
            j6g j6gVar = j6g.a;
            if (fneVar.j()) {
                throw fneVar.l(null);
            }
        } catch (IOException e) {
            if (!fneVar.j()) {
                throw e;
            }
            throw fneVar.l(e);
        } finally {
            fneVar.j();
        }
    }

    @Override // defpackage.fie, java.io.Flushable
    public final void flush() throws IOException {
        dxa dxaVar = this.b;
        fne fneVar = this.a;
        fneVar.i();
        try {
            dxaVar.flush();
            j6g j6gVar = j6g.a;
            if (fneVar.j()) {
                throw fneVar.l(null);
            }
        } catch (IOException e) {
            if (!fneVar.j()) {
                throw e;
            }
            throw fneVar.l(e);
        } finally {
            fneVar.j();
        }
    }

    @Override // defpackage.fie
    public final kmf g() {
        return this.a;
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ')';
    }
}
