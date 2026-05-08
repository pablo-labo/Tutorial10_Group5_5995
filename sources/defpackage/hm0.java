package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.data.IndeedAppDatabase;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import defpackage.wif;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hm0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ hm0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new bn7((c85) qpdVar.a(null, iwcVar.b(c85.class), null), (qhb) qpdVar.a(null, iwcVar.b(qhb.class), null), (phb) qpdVar.a(null, iwcVar.b(phb.class), null), (rhb) qpdVar.a(null, iwcVar.b(rhb.class), null), (d16) qpdVar.a(null, iwcVar.b(d16.class), null), (h06) qpdVar.a(null, iwcVar.b(h06.class), null), (zjd) qpdVar.a(null, iwcVar.b(zjd.class), null), (f9g) qpdVar.a(null, iwcVar.b(f9g.class), null), (i1d) qpdVar.a(null, iwcVar.b(i1d.class), null), (wc9) qpdVar.a(null, iwcVar.b(wc9.class), null), (xjd) qpdVar.a(null, iwcVar.b(xjd.class), null), (c16) qpdVar.a(null, iwcVar.b(c16.class), null), (c39) qpdVar.a(null, iwcVar.b(c39.class), null));
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
                    vq6.b(z2b.a(R.drawable.ic_idl_close_24, 0, bVar2), ak2.I(R.string.desc_close, bVar2), g.n(e.a.b, 16.0f), pa2.a(R.color.idl_aurora_neutral_1000, bVar2), bVar2, 384, 0);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.b(fv6.K8, null, null, null, 0L, ak2.I(R.string.action_share, bVar3), bVar3, 6, 30);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                int iOrdinal = ((ep7) cr8.p(ep7.class)).a().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return "https://rezcow.sandbox.qa.indeed.net/";
                }
                if (iOrdinal == 2) {
                    return "https://resumecontacts.indeed.com/";
                }
                l.g();
                return null;
            case 5:
                ((Integer) obj2).getClass();
                yy4.e(ka2.L(1), (b) obj);
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                ym7.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 7:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new cy3((IndeedAppDatabase) qpdVar2.a(null, fwc.a.b(IndeedAppDatabase.class), null));
            case 8:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new l2g();
            case DatadogLogGenerator.CRASH /* 9 */:
                qpd qpdVar3 = (qpd) obj;
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new hca((dca) qpdVar3.a(null, iwcVar2.b(dca.class), null), ((IndeedAppDatabase) qpdVar3.a(null, iwcVar2.b(IndeedAppDatabase.class), null)).z());
            case 10:
                qpd qpdVar4 = (qpd) obj;
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                SharedPreferences sharedPreferences = ee3.i(qpdVar4).getSharedPreferences("indeedPrefs", 0);
                sharedPreferences.getClass();
                return new om0(sharedPreferences);
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                bkf bkfVar = (bkf) obj2;
                return bkfVar != null ? bkf.a(bkfVar.a, bkf.c) : false ? Boolean.FALSE : u63.k(Float.valueOf(bkf.c(bkfVar.a)), new ckf(bkf.b(bkfVar.a)));
            case 15:
                wif wifVar = (wif) obj2;
                wif.a aVar = new wif.a(wifVar.a);
                ko2 ko2Var = wld.a;
                return u63.k(aVar, Boolean.valueOf(wifVar.b));
            case 16:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new jed();
            case 17:
                qpd qpdVar5 = (qpd) obj;
                qpdVar5.getClass();
                ((v3b) obj2).getClass();
                return new a06((cm1) qpdVar5.a(null, fwc.a.b(cm1.class), null));
            default:
                qpd qpdVar6 = (qpd) obj;
                qpdVar6.getClass();
                ((v3b) obj2).getClass();
                return new yz5((f88) qpdVar6.a(null, fwc.a.b(f88.class), null));
        }
    }

    public /* synthetic */ hm0(int i, int i2) {
        this.a = i2;
    }
}
