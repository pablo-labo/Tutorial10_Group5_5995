package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.tare.nav.a;
import com.indeed.android.jobsearch.util.AppStartupTimes;
import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import com.indeed.android.myjobs.data.remote.api.InterviewJobsService;
import defpackage.v03;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fn0 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Long l = (Long) obj2;
                str.getClass();
                if (AppStartupTimes.W) {
                    ArrayList arrayList = lz2.a;
                    lz2.f("Event has been sent before; checkpoint " + str + " will not be sent");
                }
                ConcurrentHashMap<String, Long> concurrentHashMap = AppStartupTimes.V;
                if ((str.equalsIgnoreCase("proctor_loaded") && concurrentHashMap.containsKey("init_values_synced")) || (str.equalsIgnoreCase("init_values_synced") && concurrentHashMap.containsKey("proctor_loaded"))) {
                    md2 md2Var = new md2(2);
                    md2Var.b("appTrace");
                    md2Var.c(new String[]{"startup", "timeToInitialDisplay"});
                    ArrayList arrayList2 = (ArrayList) md2Var.a;
                    jpf.c(0, z92.W0(u63.a0(arrayList2.toArray(new String[arrayList2.size()])), "|", null, null, null, 62));
                }
                if (str.equalsIgnoreCase("homePageHTMLRequest")) {
                    if (AppStartupTimes.f) {
                        ArrayList arrayList3 = lz2.a;
                        lz2.f("checkpoint " + str + " marked before, will not be marked again");
                    } else {
                        AppStartupTimes.f = true;
                    }
                }
                return Long.valueOf(l != null ? l.longValue() : System.currentTimeMillis());
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bxg.a(0, bVar);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_native_android_arrow_back_24, 0, bVar2), ak2.I(R.string.desc_back_arrow, bVar2), null, 0L, bVar2, 0, 12);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj).intValue();
                ConversationWithDraft conversationWithDraft = (ConversationWithDraft) obj2;
                conversationWithDraft.getClass();
                return t40.k(conversationWithDraft.getConversation().getId(), conversationWithDraft.getConversation().getFolder().a());
            case 4:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (InterviewJobsService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("MyjobsRetrofit"))).b(InterviewJobsService.class);
            case 5:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new nl0((nm0) qpdVar2.a(null, fwc.a.b(nm0.class), null));
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new a(0);
            case 7:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new r2g();
            case 8:
                qpd qpdVar3 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new mig((gsa) qpdVar3.a(null, fwc.a.b(gsa.class), null));
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new u49();
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ((Integer) obj2).getClass();
                q2d.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 13:
                return Integer.valueOf(((dme) ((zrd) obj2).a).e());
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return Integer.valueOf(((pl7) obj).K(((Integer) obj2).intValue()));
            case 15:
                v03.a aVar = (v03.a) obj2;
                if (!(aVar instanceof qkf)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue3 = num != null ? num.intValue() : 1;
                return iIntValue3 == 0 ? aVar : Integer.valueOf(iIntValue3 + 1);
            case 16:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new g06((f88) qpdVar4.a(null, fwc.a.b(f88.class), null));
            default:
                qpd qpdVar5 = (qpd) obj;
                qpdVar5.getClass();
                ((v3b) obj2).getClass();
                return new g26((f88) qpdVar5.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ fn0(int i, byte b) {
        this.a = i;
    }
}
