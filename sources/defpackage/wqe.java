package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wqe implements ng9 {
    public final d82 a;
    public boolean b;
    public long c;
    public long d;
    public cdb e = cdb.d;

    public wqe(d82 d82Var) {
        this.a = d82Var;
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = this.a.d();
        }
    }

    @Override // defpackage.ng9
    public final cdb e() {
        return this.e;
    }

    @Override // defpackage.ng9
    public final void g(cdb cdbVar) {
        if (this.b) {
            a(w());
        }
        this.e = cdbVar;
    }

    @Override // defpackage.ng9
    public final long w() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jD = this.a.d() - this.d;
        cdb cdbVar = this.e;
        return (cdbVar.a == 1.0f ? vjg.O(jD) : jD * ((long) cdbVar.c)) + j;
    }
}
