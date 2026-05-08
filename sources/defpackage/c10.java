package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.MessagingDatabase;
import defpackage.bad;
import defpackage.cd4;
import defpackage.rx8;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c10 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ c10(JobSearchApplication jobSearchApplication) {
        this.a = 7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                i10.e(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), r03.b, bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_upload_24, 0, bVar2), ak2.I(R.string.upload_resume, bVar2), null, 0L, bVar2, 0, 12);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.b(fv6.W1, null, null, null, 0L, "ClearButtonIcon", bVar3, 196614, 30);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                OkHttpClient okHttpClient = (OkHttpClient) qpdVar.a(null, iwcVar.b(OkHttpClient.class), null);
                be6 be6Var = (be6) qpdVar.a(null, iwcVar.b(be6.class), null);
                String str = (String) qpdVar.a(null, iwcVar.b(String.class), new lve("applyButtonUrl"));
                bad.b bVar4 = new bad.b();
                bVar4.a(str);
                bVar4.d.add(be6Var);
                bVar4.b = okHttpClient;
                return bVar4.b();
            case 5:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((np7) cr8.p(np7.class)).c("GhostwriterImpl", "Failed to fetch schedule apply jobs from ghostwriter backend", false, apiError.getCause());
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                cf6.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                nl0 nl0Var = (nl0) qpdVar2.a(null, iwcVar2.b(nl0.class), null);
                sf5 sf5Var = (sf5) qpdVar2.a(null, iwcVar2.b(sf5.class), null);
                ba5 ba5Var = (ba5) qpdVar2.a(null, iwcVar2.b(ba5.class), null);
                HandlerThread handlerThread = new HandlerThread("event-logger-dispatcher");
                handlerThread.start();
                iz4 iz4Var = new iz4(nl0Var.a().hashCode() & 33554431, new Handler(handlerThread.getLooper()));
                fj fjVar = sf5Var.e;
                fjVar.getClass();
                CopyOnWriteArraySet<Function1<qx4, j6g>> copyOnWriteArraySet = iz4Var.c;
                copyOnWriteArraySet.add(fjVar);
                new flf(new a1(ba5Var, 14)).start();
                j91 j91Var = ba5Var.h;
                j91Var.getClass();
                copyOnWriteArraySet.add(j91Var);
                return iz4Var;
            case 8:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new op7();
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new i3g();
            case 10:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new z77(0);
            case 11:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return (MessagingDatabase) pq9.a.getValue();
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Integer) obj2).getClass();
                e9d.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 15:
                rx8.a aVar = (rx8.a) obj2;
                return u63.k(aVar.a, wld.a(aVar.b, wld.i, (vld) obj));
            case 16:
                igf igfVar = (igf) obj2;
                return u63.a0(Float.valueOf(((cme) igfVar.a).g()), Boolean.valueOf(((dwa) ((gme) igfVar.f).getValue()) == dwa.a));
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new i1d((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ c10(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ c10(int i) {
        this.a = i;
    }
}
