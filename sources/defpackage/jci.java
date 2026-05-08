package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jci implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ mci b;

    public jci(mci mciVar, long j) {
        this.b = mciVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mci mciVar = this.b;
        de6 de6Var = mciVar.f;
        mdi mdiVar = mciVar.e;
        mciVar.b();
        mciVar.n();
        jwh jwhVar = mciVar.zzr().c0;
        long j = this.a;
        jwhVar.a(Long.valueOf(j), "Activity resumed, time");
        wmi wmiVar = mciVar.a.V;
        svh<Boolean> svhVar = djh.C0;
        if (wmiVar.k(null, svhVar)) {
            if (wmiVar.r().booleanValue() || mciVar.f().l0.b()) {
                mdiVar.d.b();
                mdiVar.c.c();
                mdiVar.a = j;
                mdiVar.b = j;
            }
            de6Var.a();
        } else {
            de6Var.a();
            if (wmiVar.r().booleanValue()) {
                mdiVar.d.b();
                mdiVar.c.c();
                mdiVar.a = j;
                mdiVar.b = j;
            }
        }
        tdi tdiVar = mciVar.d;
        mci mciVar2 = tdiVar.a;
        mciVar2.b();
        i0i i0iVar = mciVar2.a;
        if (i0iVar.d()) {
            if (!i0iVar.V.k(null, svhVar)) {
                mciVar2.f().l0.a(false);
            }
            i0iVar.c0.getClass();
            tdiVar.b(System.currentTimeMillis(), false);
        }
    }
}
