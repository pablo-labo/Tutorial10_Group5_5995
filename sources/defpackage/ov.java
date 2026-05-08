package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.messaging.data.conversations.AttachmentsRepositoryImpl;
import defpackage.cd4;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ov implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ov(int i) {
        this.a = 11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((ps7) obj).getClass();
                return j6g.a;
            case 1:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                il0.a.getClass();
                ((zk6) il0.d.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 2:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), wg2.e, bVar, 56);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_profile_24, 0, bVar2), ak2.I(R.string.a11y_profile_content_desc, bVar2), null, 0L, bVar2, 0, 12);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 4:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nof.d("Profile Forms Debug", bVar3, 6);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 5:
                qpd qpdVar = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return new sf5(ee3.i(qpdVar), (nl0) qpdVar.a(null, fwc.a.b(nl0.class), null));
            case 6:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new lq7();
            case 7:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new q1g();
            case 8:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new AttachmentsRepositoryImpl((dq9) qpdVar2.a(null, iwcVar.b(dq9.class), null), (MessagingDatabase) qpdVar2.a(null, iwcVar.b(MessagingDatabase.class), null));
            case DatadogLogGenerator.CRASH /* 9 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((Integer) obj2).getClass();
                x9f.f(ka2.L(7), (b) obj);
                return j6g.a;
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new c85((g8a) qpdVar3.a(null, fwc.a.b(g8a.class), null));
        }
    }

    public /* synthetic */ ov(int i, byte b) {
        this.a = i;
    }
}
