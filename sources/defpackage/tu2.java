package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tu2 implements qd3 {
    public Object a;

    public tu2(t8e t8eVar) {
        t8eVar.getClass();
        this.a = t8eVar;
    }

    @Override // defpackage.qd3
    public long a(long j) {
        return 0L;
    }

    @Override // defpackage.qd3
    public boolean b() {
        return true;
    }

    @Override // defpackage.qd3
    public long c(long j, long j2) {
        return j2;
    }

    @Override // defpackage.qd3
    public long d(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.qd3
    public long e(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.qd3
    public mic f(long j) {
        return (mic) this.a;
    }

    @Override // defpackage.qd3
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.qd3
    public long h(long j) {
        return 1L;
    }

    @Override // defpackage.qd3
    public long i() {
        return 0L;
    }

    @Override // defpackage.qd3
    public long j(long j, long j2) {
        return 1L;
    }

    public void k() {
        hdf hdfVar;
        ndf ndfVar = (ndf) this.a;
        if (ndfVar == null) {
            de7.d("ToolbarRequester is not initialized.");
            r40.e();
        } else if (ndfVar.c0) {
            uqe uqeVar = ndfVar.j0;
            if ((uqeVar == null || !uqeVar.isActive()) && (hdfVar = (hdf) om2.a(ndfVar, idf.b)) != null) {
                ndfVar.j0 = u63.Y(ndfVar.Q1(), null, i13.d, new mdf(ndfVar, hdfVar, null), 1);
            }
        }
    }

    public tu2() {
    }
}
