package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.bad;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.qu2;
import defpackage.v03;
import defpackage.xed;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kk2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ kk2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wb2 wb2Var;
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarF = f.f(g.f(e.a.b, 1.0f), 16.0f);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.n, bVar, 48);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    tx6.a(null, null, false, null, bVar, 0, 15);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                v03 v03Var = (v03) obj;
                v03.a aVar2 = (v03.a) obj2;
                v03Var.getClass();
                aVar2.getClass();
                v03 v03VarP = v03Var.P(aVar2.getKey());
                vr4 vr4Var = vr4.a;
                if (v03VarP == vr4Var) {
                    return aVar2;
                }
                qu2.a aVar3 = qu2.a.a;
                qu2 qu2Var = (qu2) v03VarP.h1(aVar3);
                if (qu2Var == null) {
                    wb2Var = new wb2(aVar2, v03VarP);
                } else {
                    v03 v03VarP2 = v03VarP.P(aVar3);
                    if (v03VarP2 == vr4Var) {
                        return new wb2(qu2Var, aVar2);
                    }
                    wb2Var = new wb2(qu2Var, new wb2(aVar2, v03VarP2));
                }
                return wb2Var;
            case 2:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                OkHttpClient okHttpClient = (OkHttpClient) qpdVar.a(null, iwcVar.b(OkHttpClient.class), null);
                be6 be6Var = (be6) qpdVar.a(null, iwcVar.b(be6.class), null);
                String str = (String) qpdVar.a(null, iwcVar.b(String.class), new lve("apiUrl"));
                bad.b bVar2 = new bad.b();
                bVar2.a(str);
                bVar2.d.add(be6Var);
                bVar2.b = okHttpClient;
                return bVar2.b();
            case 3:
                return Boolean.valueOf(DynamicFromMap.asBoolean$lambda$1((ReadableMap) obj, (String) obj2));
            case 4:
                ((Integer) obj2).getClass();
                la5.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                n76.i(ka2.L(1), (b) obj);
                return j6g.a;
            case 6:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                Context contextI = ee3.i(qpdVar2);
                IndeedAppDatabase indeedAppDatabase = dfd.a;
                if (indeedAppDatabase == null) {
                    synchronized (IndeedAppDatabase.class) {
                        try {
                            if (dfd.a == null) {
                                Context applicationContext = contextI.getApplicationContext();
                                applicationContext.getClass();
                                xed.a aVarA = ued.a(applicationContext, IndeedAppDatabase.class, "indeed_app_database");
                                aVarA.p = false;
                                aVarA.q = true;
                                dfd.a = (IndeedAppDatabase) aVarA.b();
                            }
                            j6g j6gVar = j6g.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    indeedAppDatabase = dfd.a;
                    if (indeedAppDatabase == null) {
                        wl7.g("INSTANCE");
                        throw null;
                    }
                }
                return indeedAppDatabase;
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new in0();
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new yba(0);
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new d1g();
            case 10:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new d0h();
            case 11:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 12:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new d4g();
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 15:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new iq9();
            case 16:
                return Float.valueOf(((lc1) obj2).a);
            case 17:
                vld vldVar = (vld) obj;
                foe foeVar = (foe) obj2;
                da2 da2Var = new da2(foeVar.a.c());
                xld xldVar = wld.p;
                Object objA = wld.a(da2Var, xldVar, vldVar);
                bkf bkfVar = new bkf(foeVar.b);
                xld xldVar2 = wld.q;
                Object objA2 = wld.a(bkfVar, xldVar2, vldVar);
                to5 to5Var = foeVar.c;
                to5 to5Var2 = to5.b;
                Object objA3 = wld.a(to5Var, wld.m, vldVar);
                mo5 mo5Var = foeVar.d;
                no5 no5Var = foeVar.e;
                String str2 = foeVar.g;
                Object objA4 = wld.a(new bkf(foeVar.h), xldVar2, vldVar);
                Object objA5 = wld.a(foeVar.i, wld.n, vldVar);
                Object objA6 = wld.a(foeVar.j, wld.k, vldVar);
                b19 b19Var = foeVar.k;
                b19 b19Var2 = b19.c;
                Object objA7 = wld.a(b19Var, wld.s, vldVar);
                Object objA8 = wld.a(new da2(foeVar.l), xldVar, vldVar);
                Object objA9 = wld.a(foeVar.m, wld.j, vldVar);
                vbe vbeVar = foeVar.n;
                vbe vbeVar2 = vbe.d;
                return u63.k(objA, objA2, objA3, mo5Var, no5Var, -1, str2, objA4, objA5, objA6, objA7, objA8, objA9, wld.a(vbeVar, wld.o, vldVar));
            case 18:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new eka((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new b36((gub) qpdVar4.a(null, fwc.a.b(gub.class), null));
        }
    }

    public /* synthetic */ kk2(int i, int i2) {
        this.a = i2;
    }
}
