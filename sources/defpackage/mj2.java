package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.remote.api.ButtonRestApiService;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mj2 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vq6.a(i82.a(), ak2.I(R.string.desc_close, bVar), null, 0L, bVar, 0, 12);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    vg2.c(0, bVar2);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return (ButtonRestApiService) ((bad) qpdVar.a(null, fwc.a.b(bad.class), new lve("ApplyRetrofit"))).b(ButtonRestApiService.class);
            case 3:
                ((Integer) obj2).getClass();
                vk7.a(ka2.L(1), (b) obj);
                return j6g.a;
            case 4:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new yof();
            case 5:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new gq7();
            case 6:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new v2g();
            case 7:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new sob();
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                return new ltc(str, str2);
            case DatadogLogGenerator.CRASH /* 9 */:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                return new lr9((sr9) qpdVar2.a(null, fwc.a.b(sr9.class), null));
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((ps7) obj).getClass();
                return j6g.a;
            case 12:
                return obj2;
            case 13:
                return Integer.valueOf(((pl7) obj).O(((Integer) obj2).intValue()));
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                blf blfVar = (blf) obj;
                v03.a aVar = (v03.a) obj2;
                if (aVar instanceof qkf) {
                    qkf<Object> qkfVar = (qkf) aVar;
                    v03 v03Var = blfVar.a;
                    Object objP0 = qkfVar.P0();
                    Object[] objArr = blfVar.b;
                    int i = blfVar.d;
                    objArr[i] = objP0;
                    qkf<Object>[] qkfVarArr = blfVar.c;
                    blfVar.d = i + 1;
                    qkfVarArr[i] = qkfVar;
                }
                return blfVar;
            case 15:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new ds0((f88) qpdVar3.a(null, iwcVar.b(f88.class), null), (i88) qpdVar3.a(null, iwcVar.b(i88.class), null));
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new h39((i88) qpdVar4.a(null, fwc.a.b(i88.class), null));
        }
    }

    public /* synthetic */ mj2(int i, byte b) {
        this.a = i;
    }
}
