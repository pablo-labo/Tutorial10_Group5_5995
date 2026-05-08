package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.myjobs.data.remote.api.LoggingApiService;
import defpackage.cd4;
import defpackage.sp7;
import defpackage.v03;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ih2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ih2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        HttpUrl httpUrl;
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), jh2.b, bVar, 56);
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
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.b(fv6.g3, null, null, null, 0L, null, bVar3, 6, 62);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (LoggingApiService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("MyjobsRetrofit"))).b(LoggingApiService.class);
            case 4:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new p8c();
            case 5:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new pbc();
            case 6:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new c87();
            case 7:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new qig((mig) qpdVar2.a(null, iwcVar.b(mig.class), null), ((IndeedAppDatabase) qpdVar2.a(null, iwcVar.b(IndeedAppDatabase.class), null)).A(), r03.p(d93.f()));
            case 8:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new fpb(0);
            case DatadogLogGenerator.CRASH /* 9 */:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new sr9();
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ApiError apiError = (ApiError) obj;
                Request request = (Request) obj2;
                apiError.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.d((request == null || (httpUrl = request.a) == null) ? "" : httpUrl.i, (request == null || (str = request.b) == null) ? "" : str, new cq7(System.currentTimeMillis(), request != null ? request.c.toString().length() : 0L), null, apiError.getMsg()));
                ArrayList arrayList = lz2.a;
                lz2.b("ResumeFileService", apiError.description(), false, apiError.getCause());
                lz2.c("ResumeFileService", apiError.description(), false, null, 12);
                return j6g.a;
            case 13:
                vld vldVar = (vld) obj;
                List<a19> list = ((b19) obj2).a;
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(wld.a(list.get(i), wld.t, vldVar));
                }
                return arrayList2;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return Integer.valueOf(((pl7) obj).w(((Integer) obj2).intValue()));
            case 15:
                qkf qkfVar = (qkf) obj;
                v03.a aVar = (v03.a) obj2;
                if (qkfVar != null) {
                    return qkfVar;
                }
                if (aVar instanceof qkf) {
                    return (qkf) aVar;
                }
                return null;
            case 16:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new vjd((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new vz5((f88) qpdVar4.a(null, fwc.a.b(f88.class), null));
        }
    }
}
