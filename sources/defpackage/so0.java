package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.MessagingDatabase;
import com.indeed.android.messaging.data.conversations.ConversationsRemoteDataSource;
import com.indeed.android.messaging.data.conversations.ConversationsRepositoryImpl;
import defpackage.fx8;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class so0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ so0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                wo0.i(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                fy1.c(ka2.L(1), (b) obj);
                return j6g.a;
            case 2:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yh1.a(0, bVar);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wq6.b(z2b.a(R.drawable.ic_idl_native_android_arrow_back_24, 0, bVar2), ak2.I(R.string.a11y_back_button, bVar2), null, 0L, bVar2, 0, 12);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 4:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, null, 0L, ak2.I(R.string.close, bVar3), null, bVar3, 6, 94);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 5:
                String str = ((bhd) obj).b;
                String str2 = ((bhd) obj2).b;
                str.getClass();
                str2.getClass();
                return Integer.valueOf(str.compareToIgnoreCase(str2));
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new mp7();
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new u1g();
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                epa epaVar = epa.a;
                OkHttpClient okHttpClient = (OkHttpClient) epa.Y.getValue();
                okHttpClient.getClass();
                return new t66(okHttpClient);
            case DatadogLogGenerator.CRASH /* 9 */:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new ConversationsRepositoryImpl((ConversationsRemoteDataSource) qpdVar.a(null, iwcVar.b(ConversationsRemoteDataSource.class), null), (MessagingDatabase) qpdVar.a(null, iwcVar.b(MessagingDatabase.class), null), (dq9) qpdVar.a(null, iwcVar.b(dq9.class), null), (lr9) qpdVar.a(null, iwcVar.b(lr9.class), null));
            case 10:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                f7d f7dVar = (f7d) obj2;
                ((vld) obj).getClass();
                f7dVar.getClass();
                return u63.a0(Boolean.valueOf(f7dVar.a()), (Long) ((gme) f7dVar.c).getValue(), (Integer) ((gme) f7dVar.d).getValue());
            case 13:
                le0 le0Var = (le0) obj2;
                return u63.k(le0Var.b, wld.a(le0Var.a, wld.a, (vld) obj));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                fx8 fx8Var = (fx8) obj2;
                return u63.k(new fx8.a(fx8Var.a), new fx8.c(fx8Var.b), new fx8.b());
            default:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new phb((i88) qpdVar2.a(null, fwc.a.b(i88.class), null));
        }
    }

    public /* synthetic */ so0(int i, int i2) {
        this.a = i2;
    }
}
