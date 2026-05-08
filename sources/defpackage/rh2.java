package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.JavaTimerManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.OnlineStatusRepository;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rh2 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objV = bVar.v();
                    if (objV == b.a.a) {
                        objV = new jr(3);
                        bVar.p(objV);
                    }
                    m12.a((gu5) objV, bVar, 6);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ag9 ag9VarD = hl1.d(c20.a.e, false);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, e.a.b);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ag9VarD, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    q2d.a(0, bVar2);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    f17.a(z2b.a(R.drawable.ic_profile_resume_migration, 0, bVar3), null, null, null, null, 0.0f, null, bVar3, 48, 124);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new h8a();
            case 4:
                return DynamicFromMap.asMap$lambda$6((ReadableMap) obj, (String) obj2);
            case 5:
                return Integer.valueOf(Long.signum(((JavaTimerManager.c) obj).b - ((JavaTimerManager.c) obj2).b));
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new ned(new vy2(7), new wy2(13));
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new y0g();
            case 8:
                qpd qpdVar = (qpd) obj;
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return new xla((p87) qpdVar.a(null, fwc.a.b(p87.class), null), (OkHttpClient) epa.e0.getValue());
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 10:
                ((Integer) obj2).getClass();
                vj8.c(ka2.L(1), (b) obj);
                return j6g.a;
            case 11:
                ss8 ss8Var = (ss8) obj2;
                return u63.a0(Integer.valueOf(ss8Var.h()), Integer.valueOf(ss8Var.i()));
            case 12:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new kta((OnlineStatusRepository) qpdVar2.a(null, fwc.a.b(OnlineStatusRepository.class), null));
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 15:
                vld vldVar = (vld) obj;
                l3b l3bVar = (l3b) obj2;
                dcf dcfVar = new dcf(l3bVar.a);
                sdf sdfVar = new sdf(l3bVar.b);
                Object objA = wld.a(new bkf(l3bVar.c), wld.q, vldVar);
                nhf nhfVar = l3bVar.d;
                nhf nhfVar2 = nhf.c;
                Object objA2 = wld.a(nhfVar, wld.l, vldVar);
                acb acbVar = l3bVar.e;
                acb acbVar2 = acb.b;
                Object objA3 = wld.a(acbVar, yld.a, vldVar);
                fx8 fx8Var = l3bVar.f;
                fx8 fx8Var2 = fx8.c;
                return u63.k(dcfVar, sdfVar, objA, objA2, objA3, wld.a(fx8Var, wld.u, vldVar), wld.a(new bx8(l3bVar.g), yld.b, vldVar), new zm6(l3bVar.h), wld.a(l3bVar.i, yld.c, vldVar));
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new xjd((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ rh2(int i, byte b) {
        this.a = i;
    }
}
