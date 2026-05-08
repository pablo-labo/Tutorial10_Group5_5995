package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.Logger;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationsRepository;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ph2 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
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
                    vq6.b(z2b.a(R.drawable.ic_idl_native_android_arrow_back_24, 0, bVar3), ak2.I(R.string.desc_back_arrow, bVar3), null, 0L, bVar3, 0, 12);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                dy2.b(ka2.L(1), (b) obj);
                return j6g.a;
            case 4:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new h88();
            case 5:
                ((Integer) obj2).getClass();
                xm6.b(ka2.L(1), (b) obj);
                return j6g.a;
            case 6:
                ((ps7) obj).getClass();
                return j6g.a;
            case 7:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return (Logger) bg3.e.getValue();
            case 8:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new qp7();
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new d3g();
            case 10:
                qpd qpdVar = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                p87 p87Var = (p87) qpdVar.a(null, fwc.a.b(p87.class), null);
                epa epaVar = epa.a;
                return new a5b(p87Var, (OkHttpClient) epa.Y.getValue());
            case 11:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new u67((ConversationsRepository) qpdVar2.a(null, iwcVar.b(ConversationsRepository.class), null), (h02) qpdVar2.a(null, iwcVar.b(h02.class), null), (lr9) qpdVar2.a(null, iwcVar.b(lr9.class), null), (j7d) qpdVar2.a(null, iwcVar.b(j7d.class), null));
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mwe.a(f.f(e.a.b, 8.0f), fv6.I5, null, z2b.a(R.drawable.ic_idl_more_horizontal_24, 0, bVar4), ak2.I(R.string.menu, bVar4), null, bVar4, 48, 36);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new zjd((f88) qpdVar3.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ ph2(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ ph2(int i) {
        this.a = i;
    }
}
