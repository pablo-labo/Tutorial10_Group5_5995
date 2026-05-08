package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vj2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ vj2(int i) {
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
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_hamburger_24, 0, bVar2), ak2.I(R.string.menu, bVar2), null, 0L, bVar2, 0, 12);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (AppstatusJobsService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("MyjobsRetrofit"))).b(AppstatusJobsService.class);
            case 3:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new sra(new dc(13));
            case 4:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new mr7();
            case 5:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new i2g();
            case 6:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return (OkHttpClient) epa.a0.getValue();
            case 7:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new cya(0);
            case 8:
                ((Integer) obj2).getClass();
                yqb.e(ka2.L(1), (b) obj);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((Integer) obj2).getClass();
                kee.b(ka2.L(1), (b) obj);
                return j6g.a;
            case 12:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new g85((f88) qpdVar2.a(null, iwcVar.b(f88.class), null), (d88) qpdVar2.a(null, iwcVar.b(d88.class), null));
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new s0a((f88) qpdVar3.a(null, iwcVar2.b(f88.class), null), (i88) qpdVar3.a(null, iwcVar2.b(i88.class), null));
        }
    }

    public /* synthetic */ vj2(int i, int i2) {
        this.a = i2;
    }
}
