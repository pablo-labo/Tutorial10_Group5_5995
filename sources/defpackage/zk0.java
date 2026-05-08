package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.remote.api.HomepageLoggingService;
import defpackage.ba5;
import java.io.File;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zk0 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                il0.a.getClass();
                ((zk6) il0.d.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                yh1.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ai1.a(0, bVar);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_close_24, 0, bVar2), ak2.I(R.string.desc_close, bVar2), g.n(e.a.b, 24.0f), eu6.s, bVar2, 384, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 4:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (HomepageLoggingService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("MyjobsRetrofit"))).b(HomepageLoggingService.class);
            case 5:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                File file = new File(ee3.i(qpdVar2).getFilesDir(), "eventlog");
                file.mkdirs();
                return new ba5(file, new ba5.a(), ((nl0) qpdVar2.a(null, fwc.a.b(nl0.class), null)).a());
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new ip7();
            case 7:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new fnf();
            case 8:
                ((ps7) obj).getClass();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 10:
                return Integer.valueOf(((odf) obj2).a);
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new wz5((d88) qpdVar3.a(null, fwc.a.b(d88.class), null));
        }
    }

    public /* synthetic */ zk0(int i, byte b) {
        this.a = i;
    }
}
