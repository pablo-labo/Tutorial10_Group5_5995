package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import com.indeed.android.myjobs.data.remote.api.AppstatusJobsService;
import com.indeed.android.myjobs.data.remote.api.ButtonRestApiService;
import com.indeed.android.myjobs.data.remote.api.HomepageLoggingService;
import com.indeed.android.myjobs.data.remote.api.InterviewJobsService;
import com.indeed.android.myjobs.data.remote.api.LoggingApiService;
import com.indeed.android.myjobs.data.remote.api.ResumeContactsService;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zh1 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ zh1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ai1.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                vg2.c(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_hamburger_24, 0, bVar), ak2.I(R.string.menu, bVar), null, 0L, bVar, 0, 12);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new oz7((AppstatusJobsService) qpdVar.a(null, iwcVar.b(AppstatusJobsService.class), null), (InterviewJobsService) qpdVar.a(null, iwcVar.b(InterviewJobsService.class), null), (ButtonRestApiService) qpdVar.a(null, iwcVar.b(ButtonRestApiService.class), null), (LoggingApiService) qpdVar.a(null, iwcVar.b(LoggingApiService.class), null), (ResumeContactsService) qpdVar.a(null, iwcVar.b(ResumeContactsService.class), null), (HomepageLoggingService) qpdVar.a(null, iwcVar.b(HomepageLoggingService.class), null));
            case 4:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                z47.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new n9a();
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new fp7();
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new b3g();
            case DatadogLogGenerator.CRASH /* 9 */:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                p87 p87Var = (p87) qpdVar2.a(null, fwc.a.b(p87.class), null);
                epa epaVar = epa.a;
                return new z45(p87Var, epa.b(), null);
            case 10:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new h02((ConversationsRepository) qpdVar3.a(null, iwcVar2.b(ConversationsRepository.class), null), (fnf) qpdVar3.a(null, iwcVar2.b(fnf.class), null), (lr9) qpdVar3.a(null, iwcVar2.b(lr9.class), null));
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ((Integer) obj2).getClass();
                kub.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                lhf lhfVar = (lhf) obj2;
                return u63.k(Float.valueOf(lhfVar.a), Float.valueOf(lhfVar.b));
            case 15:
                return ((bng) obj2).a;
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new d16((f88) qpdVar4.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ zh1(int i, int i2) {
        this.a = i2;
    }
}
