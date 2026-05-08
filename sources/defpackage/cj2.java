package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cj2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ cj2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev6.b(fv6.g3, null, null, null, 0L, null, bVar, 6, 62);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new f08(ie7.d0);
            case 3:
                return (uc4) ((gme) ((sc4) obj2).a.g).getValue();
            case 4:
                qpd qpdVar = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return new s9e((nm0) qpdVar.a(null, fwc.a.b(nm0.class), null), new w74(26));
            case 5:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new zk6();
            case 6:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return sl0.a;
            case 7:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new a1g();
            case 8:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                jsa jsaVar = (jsa) qpdVar2.a(null, fwc.a.b(jsa.class), null);
                epa epaVar = epa.a;
                return new hsa(jsaVar, (OkHttpClient) epa.Z.getValue(), new he(8));
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 10:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new p9d(new g7b(ee3.i(qpdVar3)), new qq2(ee3.i(qpdVar3)));
            case 11:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ArrayList arrayList = lz2.a;
                lz2.c("NavMenuImpl", "onegraphApi.getNavigationMenu failure", false, apiError.getCause(), 4);
                return j6g.a;
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new rj7((i88) qpdVar4.a(null, fwc.a.b(i88.class), null));
        }
    }
}
