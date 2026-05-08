package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.kz9;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class em0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ em0(int i) {
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
                return new rs0((ds0) qpdVar.a(null, iwcVar.b(ds0.class), null), (yz5) qpdVar.a(null, iwcVar.b(yz5.class), null), (c39) qpdVar.a(null, iwcVar.b(c39.class), null));
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
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, zq6.Md, 0L, "", null, bVar3, 199686, 86);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return ie7.e;
            case 5:
                return Boolean.valueOf(DynamicFromMap._get_isNull_$lambda$0((ReadableMap) obj, (String) obj2));
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new mga();
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new h1g();
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                kz9.a aVar = new kz9.a();
                aVar.a.add(new ojh(16));
                return new kz9(aVar);
            case DatadogLogGenerator.CRASH /* 9 */:
                so8 so8Var = (so8) obj2;
                return u63.a0(Integer.valueOf(((dme) so8Var.d.a).e()), Integer.valueOf(((dme) so8Var.d.b).e()));
            case 10:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 11:
                return Integer.valueOf(((pl7) obj).O(((Integer) obj2).intValue()));
            case 12:
                ((ps7) obj).getClass();
                return j6g.a;
            case 13:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new h6a();
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new w56((e08) qpdVar2.a(null, fwc.a.b(e08.class), null));
            default:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new ow5((i88) qpdVar3.a(null, fwc.a.b(i88.class), null));
        }
    }
}
