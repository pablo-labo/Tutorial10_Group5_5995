package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import defpackage.bad;
import defpackage.le0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cm0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ cm0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new pld((okd) qpdVar.a(null, iwcVar.b(okd.class), null), (sx3) qpdVar.a(null, iwcVar.b(sx3.class), null), (dfg) qpdVar.a(null, iwcVar.b(dfg.class), null), (x46) qpdVar.a(null, iwcVar.b(x46.class), null), (wz5) qpdVar.a(null, iwcVar.b(wz5.class), null), (g26) qpdVar.a(null, iwcVar.b(g26.class), null), (q66) qpdVar.a(null, iwcVar.b(q66.class), null), (bkd) qpdVar.a(null, iwcVar.b(bkd.class), null), (s0a) qpdVar.a(null, iwcVar.b(s0a.class), null), (k36) qpdVar.a(null, iwcVar.b(k36.class), null), (e16) qpdVar.a(null, iwcVar.b(e16.class), null), (a06) qpdVar.a(null, iwcVar.b(a06.class), null), (x29) qpdVar.a(null, iwcVar.b(x29.class), null), (c39) qpdVar.a(null, iwcVar.b(c39.class), null));
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, null, 0L, ak2.I(R.string.messaging_close, bVar), null, bVar, 6, 94);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                e83 e83Var = e83.a;
                ((zk6) e83.f.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 3:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                OkHttpClient okHttpClient = (OkHttpClient) qpdVar2.a(null, iwcVar2.b(OkHttpClient.class), null);
                be6 be6Var = (be6) qpdVar2.a(null, iwcVar2.b(be6.class), null);
                String str = (String) qpdVar2.a(null, iwcVar2.b(String.class), new lve("brandedAdsLoggingUrl"));
                bad.b bVar2 = new bad.b();
                bVar2.a(str);
                bVar2.d.add(be6Var);
                bVar2.b = okHttpClient;
                return bVar2.b();
            case 4:
                return DynamicFromMap._get_type_$lambda$7((ReadableMap) obj, (String) obj2);
            case 5:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new xa6();
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new d8c(w8c.c);
            case 7:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new g2g();
            case 8:
                qpd qpdVar3 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new m99((qkd) qpdVar3.a(null, fwc.a.b(qkd.class), null));
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 10:
                return Integer.valueOf(((pl7) obj).P(((Integer) obj2).intValue()));
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                vld vldVar = (vld) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(wld.a((le0.c) list.get(i), wld.b, vldVar));
                }
                return arrayList;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                vld vldVar2 = (vld) obj;
                rif rifVar = (rif) obj2;
                foe foeVar = rifVar.a;
                ko2 ko2Var = wld.h;
                return u63.k(wld.a(foeVar, ko2Var, vldVar2), wld.a(rifVar.b, ko2Var, vldVar2), wld.a(rifVar.c, ko2Var, vldVar2), wld.a(rifVar.d, ko2Var, vldVar2));
            case 15:
                return Long.valueOf(((p4e) obj2).d.get());
            case 16:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new k36((e08) qpdVar4.a(null, fwc.a.b(e08.class), null));
            default:
                qpd qpdVar5 = (qpd) obj;
                qpdVar5.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar3 = fwc.a;
                return new y0h((f88) qpdVar5.a(null, iwcVar3.b(f88.class), null), (i88) qpdVar5.a(null, iwcVar3.b(i88.class), null));
        }
    }
}
