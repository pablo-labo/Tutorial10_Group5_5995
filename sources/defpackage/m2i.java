package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m2i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public m2i(wy3 wy3Var, ewh ewhVar, JobParameters jobParameters) {
        this.b = wy3Var;
        this.c = ewhVar;
        this.d = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fei feiVar = ((h1i) obj).a;
                feiVar.F();
                zzao zzaoVar = (zzao) obj3;
                String str = (String) obj2;
                i0i i0iVar = feiVar.X;
                gxh gxhVarM = feiVar.z().M(str);
                if (gxhVarM == null || TextUtils.isEmpty(gxhVarM.K())) {
                    ewh ewhVar = i0iVar.X;
                    i0i.i(ewhVar);
                    ewhVar.b0.a(str, "No app data available; dropping event");
                } else {
                    Boolean boolP = feiVar.p(gxhVarM);
                    if (boolP != null) {
                        if (!boolP.booleanValue()) {
                            ewh ewhVar2 = i0iVar.X;
                            i0i.i(ewhVar2);
                            ewhVar2.f.a(ewh.l(str), "App version does not match; dropping event. appId");
                        }
                    } else if (!"_ui".equals(zzaoVar.a)) {
                        ewh ewhVar3 = i0iVar.X;
                        i0i.i(ewhVar3);
                        ewhVar3.X.a(ewh.l(str), "Could not find package. appId");
                    }
                    String strU = gxhVarM.u();
                    String strK = gxhVarM.K();
                    long jM = gxhVarM.M();
                    String strO = gxhVarM.O();
                    long jQ = gxhVarM.Q();
                    long jS = gxhVarM.S();
                    boolean zV = gxhVarM.V();
                    String strF = gxhVarM.F();
                    long jG = gxhVarM.g();
                    boolean zH = gxhVarM.h();
                    boolean zI = gxhVarM.i();
                    String strX = gxhVarM.x();
                    a0i a0iVar = gxhVarM.a.Y;
                    i0i.i(a0iVar);
                    a0iVar.b();
                    Boolean bool = gxhVarM.t;
                    long jU = gxhVarM.U();
                    ArrayList arrayListJ = gxhVarM.j();
                    lgi.a();
                    feiVar.q(zzaoVar, new zzn(str, strU, strK, jM, strO, jQ, jS, (String) null, zV, false, strF, jG, 0L, 0, zH, zI, false, strX, bool, jU, (List<String>) arrayListJ, i0iVar.V.k(gxhVarM.n(), djh.n0) ? gxhVarM.A() : null));
                }
                break;
            default:
                ((ewh) obj2).c0.b("AppMeasurementJobService processed last upload request.");
                ((eci) ((Service) ((wy3) obj3).b)).b((JobParameters) obj);
                break;
        }
    }

    public m2i(h1i h1iVar, zzao zzaoVar, String str) {
        this.d = h1iVar;
        this.b = zzaoVar;
        this.c = str;
    }
}
