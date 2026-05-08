package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class vci implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ de6 c;

    public vci(de6 de6Var, long j, long j2) {
        this.c = de6Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((mci) this.c.b).zzq().m(new Runnable(this) { // from class: sci
            public final vci a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vci vciVar = this.a;
                de6 de6Var = vciVar.c;
                long j = vciVar.a;
                long j2 = vciVar.b;
                ((mci) de6Var.b).b();
                mci mciVar = (mci) de6Var.b;
                mdi mdiVar = mciVar.e;
                mciVar.zzr().b0.b("Application going to the background");
                i0i i0iVar = mciVar.a;
                boolean z = true;
                if (i0iVar.V.k(null, djh.C0)) {
                    mciVar.f().l0.a(true);
                }
                Bundle bundle = new Bundle();
                if (!i0iVar.V.r().booleanValue()) {
                    mdiVar.c.c();
                    if (i0iVar.V.k(null, djh.r0)) {
                        long j3 = j2 - mdiVar.b;
                        mdiVar.b = j2;
                        bundle.putLong("_et", j3);
                        c8i.r(mciVar.i().o(true), bundle, true);
                    } else {
                        z = false;
                    }
                    mdiVar.a(j2, false, z);
                }
                mciVar.h().n(j, bundle, "auto", "_ab");
            }
        });
    }
}
