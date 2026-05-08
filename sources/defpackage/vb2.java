package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.messaging.data.conversations.AttachmentsRepository;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vb2 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ vb2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                v03.a aVar = (v03.a) obj2;
                str.getClass();
                aVar.getClass();
                if (str.length() == 0) {
                    return aVar.toString();
                }
                return str + ", " + aVar;
            case 1:
                ((Integer) obj2).getClass();
                vg2.d(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new e88();
            case 4:
                ((Integer) obj2).getClass();
                oi3.d(ka2.L(1), (b) obj);
                return j6g.a;
            case 5:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new vwg();
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new cp7();
            case 7:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new s0g();
            case 8:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new y1e((ConversationsRepository) qpdVar.a(null, iwcVar.b(ConversationsRepository.class), null), (AttachmentsRepository) qpdVar.a(null, iwcVar.b(AttachmentsRepository.class), null), (h02) qpdVar.a(null, iwcVar.b(h02.class), null), (fnf) qpdVar.a(null, iwcVar.b(fnf.class), null), (lr9) qpdVar.a(null, iwcVar.b(lr9.class), null), (ConversationsRemoteDataSource) qpdVar.a(null, iwcVar.b(ConversationsRemoteDataSource.class), null));
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                vld vldVar = (vld) obj;
                nhf nhfVar = (nhf) obj2;
                bkf bkfVar = new bkf(nhfVar.a);
                xld xldVar = wld.q;
                return u63.k(wld.a(bkfVar, xldVar, vldVar), wld.a(new bkf(nhfVar.b), xldVar, vldVar));
            case 12:
                return ((vhg) obj2).a;
            default:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new wc9((f88) qpdVar2.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ vb2(int i, int i2) {
        this.a = i2;
    }
}
