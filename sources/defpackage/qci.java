package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qci implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ mci b;

    public qci(mci mciVar, long j) {
        this.b = mciVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mci mciVar = this.b;
        mciVar.b();
        mciVar.n();
        jwh jwhVar = mciVar.zzr().c0;
        long j = this.a;
        jwhVar.a(Long.valueOf(j), "Activity paused, time");
        de6 de6Var = mciVar.f;
        mci mciVar2 = (mci) de6Var.b;
        i0i i0iVar = mciVar2.a;
        if (i0iVar.V.k(null, djh.o0)) {
            i0iVar.c0.getClass();
            vci vciVar = new vci(de6Var, System.currentTimeMillis(), j);
            de6Var.a = vciVar;
            mciVar2.c.postDelayed(vciVar, 2000L);
        }
        if (mciVar.a.V.r().booleanValue()) {
            mciVar.e.c.c();
        }
        tdi tdiVar = mciVar.d;
        if (tdiVar.a.a.V.k(null, djh.C0)) {
            return;
        }
        tdiVar.a.f().l0.a(true);
    }
}
