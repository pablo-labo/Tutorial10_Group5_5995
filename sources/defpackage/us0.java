package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jsmappservices.util.LocationSensor;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsApiService;
import com.indeed.android.myjobs.data.remote.api.BrandedAdsLoggingApiService;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ us0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round((1.0f + (((vl8) obj2) == vl8.a ? -1.0f : 1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 1:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new fm1((BrandedAdsApiService) qpdVar.a(null, iwcVar.b(BrandedAdsApiService.class), null), (BrandedAdsLoggingApiService) qpdVar.a(null, iwcVar.b(BrandedAdsLoggingApiService.class), null));
            case 2:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new pk3();
            case 3:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new b24((LocationSensor) qpdVar2.a(null, fwc.a.b(LocationSensor.class), null));
            case 4:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new wuf();
            case 5:
                qpd qpdVar3 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                p87 p87Var = (p87) qpdVar3.a(null, fwc.a.b(p87.class), null);
                epa epaVar = epa.a;
                return new xp9(p87Var, (OkHttpClient) epa.b0.getValue());
            case 6:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 7:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new i3d((dq9) qpdVar4.a(null, iwcVar2.b(dq9.class), null), (h02) qpdVar4.a(null, iwcVar2.b(h02.class), null));
            case 8:
                ((ps7) obj).getClass();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 10:
                return Integer.valueOf(((to5) obj2).a);
            default:
                qpd qpdVar5 = (qpd) obj;
                qpdVar5.getClass();
                ((v3b) obj2).getClass();
                return new h06((f88) qpdVar5.a(null, fwc.a.b(f88.class), null));
        }
    }
}
