package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import defpackage.m2c;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gm0 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new mk7((rj7) qpdVar.a(null, iwcVar.b(rj7.class), null), (ow5) qpdVar.a(null, iwcVar.b(ow5.class), null), (v43) qpdVar.a(null, iwcVar.b(v43.class), null), (c39) qpdVar.a(null, iwcVar.b(c39.class), null));
            case 1:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.b(fv6.Z, g.n(e.a.b, 24.0f), null, zq6.Md, 0L, null, bVar2, 3126, 52);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, null, pnb.g(4281150765L), ak2.I(R.string.close, bVar3), null, bVar3, 24582, 78);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                b bVar4 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ev6.b(fv6.W1, null, null, null, 0L, ak2.I(R.string.desc_close, bVar4), bVar4, 6, 30);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            case 5:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                int iOrdinal = ((ep7) cr8.p(ep7.class)).a().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return "https://cookie-sync-service.sandbox.qa.indeed.net";
                }
                if (iOrdinal == 2) {
                    return "https://pxl.indeed.com";
                }
                l.g();
                return null;
            case 6:
                np3 np3Var = (np3) obj2;
                return u63.a0(Integer.valueOf(np3Var.k()), Float.valueOf(nic.B(np3Var.l(), -0.5f, 0.5f)), Integer.valueOf(np3Var.o()));
            case 7:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new z2g();
            case 8:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                nm0 nm0Var = (nm0) qpdVar2.a(null, fwc.a.b(nm0.class), null);
                h87 h87Var = new h87();
                h87Var.a = nm0Var;
                return h87Var;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Integer) obj2).getClass();
                ip9.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 10:
                k38 k38Var = (k38) obj;
                ((String) obj2).getClass();
                lr5 lr5Var = m2c.e;
                if (lr5Var != null) {
                    int i = k38Var == null ? -1 : m2c.a.a[k38Var.ordinal()];
                    if (i == 1) {
                        ((i1g) cr8.p(i1g.class)).a(lr5Var, new of4());
                    } else if (i == 2) {
                        ((i1g) cr8.p(i1g.class)).a(lr5Var, new lk4());
                    } else if (i == 3) {
                        ((i1g) cr8.p(i1g.class)).a(lr5Var, new rh4());
                    }
                }
                return j6g.a;
            case 11:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new cbc();
            case 12:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new c39((i88) qpdVar3.a(null, fwc.a.b(i88.class), null));
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new x46((f88) qpdVar4.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ gm0(int i, byte b) {
        this.a = i;
    }
}
