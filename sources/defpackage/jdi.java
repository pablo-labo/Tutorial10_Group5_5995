package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class jdi extends ohh {
    public final /* synthetic */ mdi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdi(mdi mdiVar, f3i f3iVar) {
        super(f3iVar);
        this.e = mdiVar;
    }

    @Override // defpackage.ohh
    public final void a() {
        mdi mdiVar = this.e;
        mci mciVar = mdiVar.d;
        mciVar.b();
        i0i i0iVar = mciVar.a;
        i0iVar.c0.getClass();
        mdiVar.a(SystemClock.elapsedRealtime(), false, false);
        lfh lfhVarP = i0iVar.p();
        i0iVar.c0.getClass();
        lfhVarP.k(SystemClock.elapsedRealtime());
    }
}
