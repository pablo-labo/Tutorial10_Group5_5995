package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class xv0 implements pne {
    public final /* synthetic */ fne a;
    public final /* synthetic */ hf7 b;

    public xv0(fne fneVar, hf7 hf7Var) {
        this.a = fneVar;
        this.b = hf7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        hf7 hf7Var = this.b;
        fne fneVar = this.a;
        fneVar.i();
        try {
            hf7Var.close();
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

    @Override // defpackage.pne
    public final long f1(zn1 zn1Var, long j) throws IOException {
        zn1Var.getClass();
        hf7 hf7Var = this.b;
        fne fneVar = this.a;
        fneVar.i();
        try {
            long jF1 = hf7Var.f1(zn1Var, j);
            if (fneVar.j()) {
                throw fneVar.l(null);
            }
            return jF1;
        } catch (IOException e) {
            if (fneVar.j()) {
                throw fneVar.l(e);
            }
            throw e;
        } finally {
            fneVar.j();
        }
    }

    @Override // defpackage.pne
    public final kmf g() {
        return this.a;
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ')';
    }
}
