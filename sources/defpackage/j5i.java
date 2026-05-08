package defpackage;

import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzn;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class j5i implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ m4i b;

    public j5i(m4i m4iVar, long j) {
        this.b = m4iVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m4i m4iVar = this.b;
        m4iVar.b();
        m4iVar.g();
        m4iVar.k();
        m4iVar.zzr().b0.b("Resetting analytics data (FE)");
        mci mciVarJ = m4iVar.j();
        mciVarJ.b();
        mdi mdiVar = mciVarJ.e;
        mdiVar.c.c();
        mdiVar.a = 0L;
        mdiVar.b = 0L;
        i0i i0iVar = m4iVar.a;
        boolean zD = i0iVar.d();
        eyh eyhVarF = m4iVar.f();
        i0i i0iVar2 = eyhVarF.a;
        eyhVarF.Y.b(this.a);
        if (!TextUtils.isEmpty(eyhVarF.f().o0.a())) {
            eyhVarF.o0.b(null);
        }
        zfi zfiVar = zfi.b;
        ((cgi) zfiVar.zza()).getClass();
        wmi wmiVar = i0iVar2.V;
        svh<Boolean> svhVar = djh.v0;
        if (wmiVar.k(null, svhVar)) {
            eyhVarF.j0.b(0L);
        }
        if (!i0iVar2.V.p()) {
            eyhVarF.m(!zD);
        }
        eyhVarF.p0.b(null);
        eyhVarF.q0.b(0L);
        eyhVarF.r0.b(null);
        y8i y8iVarM = i0iVar.m();
        y8iVarM.b();
        y8iVarM.g();
        y8iVarM.k();
        zzn zznVarN = y8iVarM.n(false);
        i0i i0iVar3 = y8iVarM.a;
        awd awdVar = i0iVar3.f;
        i0iVar3.l().p();
        y8iVarM.p(new u4i(y8iVarM, zznVarN));
        ((cgi) zfiVar.zza()).getClass();
        if (i0iVar.V.k(null, svhVar)) {
            m4iVar.j().d.a();
        }
        m4iVar.X = !zD;
        y8i y8iVarM2 = i0iVar.m();
        AtomicReference atomicReference = new AtomicReference();
        y8iVarM2.b();
        y8iVarM2.k();
        y8iVarM2.p(new d9i(y8iVarM2, atomicReference, y8iVarM2.n(false)));
    }
}
