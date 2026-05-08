package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class im0 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return new ap0((y0h) qpdVar.a(null, fwc.a.b(y0h.class), null));
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ev6.a(fv6.I6, null, null, null, 0L, ak2.I(R.string.messaging_people_in_conversation, bVar), null, bVar, 6, 94);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, null, pnb.g(4281150765L), ak2.I(R.string.close, bVar2), null, bVar2, 24582, 78);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                OkHttpClient.Builder builderE = ((f2g) cr8.p(f2g.class)).b().e();
                builderE.c.add(new qe3());
                return new OkHttpClient(builderE);
            case 4:
                ((String) obj).getClass();
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                nj6.d(ka2.L(1), (b) obj);
                return j6g.a;
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new qga();
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new p2g();
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                epa epaVar = epa.a;
                return new tid((OkHttpClient) epa.d0.getValue());
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new zw8();
            case 10:
                View view = (View) obj;
                rzg rzgVar = (rzg) obj2;
                view.getClass();
                rzgVar.getClass();
                kf7 kf7VarG = rzgVar.a.g(135);
                kf7VarG.getClass();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.getClass();
                ((FrameLayout.LayoutParams) layoutParams).setMargins(kf7VarG.a, kf7VarG.b, kf7VarG.c, kf7VarG.d);
                return rzg.b;
            case 11:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new x29((cm1) qpdVar2.a(null, fwc.a.b(cm1.class), null));
            case 15:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new q66((f88) qpdVar3.a(null, iwcVar.b(f88.class), null), (i88) qpdVar3.a(null, iwcVar.b(i88.class), null));
            default:
                View view2 = (View) obj2;
                ViewGroupManager.INSTANCE.getClass();
                Integer numA = ViewGroupManager.Companion.a((View) obj);
                int iIntValue3 = numA != null ? numA.intValue() : 0;
                Integer numA2 = ViewGroupManager.Companion.a(view2);
                return Integer.valueOf(iIntValue3 - (numA2 != null ? numA2.intValue() : 0));
        }
    }

    public /* synthetic */ im0(int i, byte b) {
        this.a = i;
    }
}
