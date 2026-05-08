package defpackage;

import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.autocomplete.network.AutoCompleteApiService;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import defpackage.sp7;
import defpackage.v03;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dm0 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        HttpUrl httpUrl;
        switch (this.a) {
            case 0:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                return new ude((dfg) qpdVar.a(null, fwc.a.b(dfg.class), null));
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
                    nof.d("Profile UI Platform Debug", bVar2, 6);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ev6.a(fv6.o0, null, null, zq6.Md, 0L, "", null, bVar3, 199686, 86);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 4:
                v03 v03Var = (v03) obj;
                v03.a aVar = (v03.a) obj2;
                if (!(aVar instanceof iz2)) {
                    return v03Var.d1(aVar);
                }
                ((iz2) aVar).f0();
                return v03Var.d1(null);
            case 5:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return ((f2g) cr8.p(f2g.class)).a();
            case 6:
                return DynamicFromMap.asArray$lambda$5((ReadableMap) obj, (String) obj2);
            case 7:
                qpd qpdVar2 = (qpd) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                return new mfa((s9e) qpdVar2.a(null, iwcVar.b(s9e.class), null), (AutoCompleteApiService) qpdVar2.a(null, iwcVar.b(AutoCompleteApiService.class), null));
            case 8:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new r8c();
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new j1g();
            case 10:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new e2g();
            case 11:
                JobSearchApplication jobSearchApplication5 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new fj6();
            case 12:
                ApiError apiError = (ApiError) obj;
                Request request = (Request) obj2;
                apiError.getClass();
                tp7 tp7Var = (tp7) cr8.p(tp7.class);
                String str2 = (request == null || (httpUrl = request.a) == null) ? "" : httpUrl.i;
                if (request == null || (str = request.b) == null) {
                    str = "";
                }
                tp7Var.b(new sp7.d(str2, str, new cq7(System.currentTimeMillis(), request != null ? request.c.toString().length() : 0L), null, apiError.getMsg()));
                ArrayList arrayList = lz2.a;
                lz2.b("PreferencesService", apiError.description(), false, apiError.getCause());
                return j6g.a;
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Integer) obj2).getClass();
                gxc.f(ka2.L(1), (b) obj);
                return j6g.a;
            case 15:
                kjf kjfVar = (kjf) obj2;
                return u63.k(Integer.valueOf((int) (kjfVar.a >> 32)), Integer.valueOf((int) (kjfVar.a & 4294967295L)));
            case 16:
                Boolean boolValueOf = Boolean.valueOf(((acb) obj2).a);
                ko2 ko2Var = wld.a;
                return u63.k(boolValueOf, new vq4());
            case 17:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new as9();
            case 18:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                return new e16((e08) qpdVar3.a(null, fwc.a.b(e08.class), null));
            default:
                qpd qpdVar4 = (qpd) obj;
                qpdVar4.getClass();
                ((v3b) obj2).getClass();
                return new sx3((i88) qpdVar4.a(null, fwc.a.b(i88.class), null));
        }
    }

    public /* synthetic */ dm0(int i, byte b) {
        this.a = i;
    }
}
