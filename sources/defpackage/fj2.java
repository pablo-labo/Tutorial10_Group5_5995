package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.R;
import defpackage.bad;
import defpackage.k15;
import defpackage.v03;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fj2 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vq6.b(z2b.a(R.drawable.ic_idl_profile_24, 0, bVar), ak2.I(R.string.uip_topnav_profile_icon_description, bVar), null, 0L, bVar, 0, 12);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((v03.a) obj2) instanceof iz2));
            case 2:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                e83 e83Var = e83.a;
                ((zk6) e83.f.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            case 3:
                qpd qpdVar = (qpd) obj;
                qpdVar.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar = fwc.a;
                OkHttpClient okHttpClient = (OkHttpClient) qpdVar.a(null, iwcVar.b(OkHttpClient.class), null);
                be6 be6Var = (be6) qpdVar.a(null, iwcVar.b(be6.class), null);
                String str = (String) qpdVar.a(null, iwcVar.b(String.class), new lve("brandedAdsUrl"));
                bad.b bVar2 = new bad.b();
                bVar2.a(str);
                bVar2.d.add(be6Var);
                bVar2.b = okHttpClient;
                return bVar2.b();
            case 4:
                return DynamicFromMap.asString$lambda$4((ReadableMap) obj, (String) obj2);
            case 5:
                k15 k15Var = (k15) obj;
                k15.a aVar = (k15.a) obj2;
                k15Var.getClass();
                aVar.getClass();
                k15 k15VarA = k15Var.a(aVar.getKey());
                return k15VarA == wr4.a ? aVar : new xb2(k15VarA, aVar);
            case 6:
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new ua6();
            case 7:
                JobSearchApplication jobSearchApplication2 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new z1g(0);
            case 8:
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return u34.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                JobSearchApplication jobSearchApplication4 = JobSearchApplication.X;
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new zee();
            case 10:
                ((ps7) obj).getClass();
                return j6g.a;
            case 11:
                ((ApiError) obj).getClass();
                return j6g.a;
            case 12:
                return Integer.valueOf(((pl7) obj).K(((Integer) obj2).intValue()));
            case 13:
                ((ps7) obj).getClass();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((ps7) obj).getClass();
                return j6g.a;
            case 15:
                ((qpd) obj).getClass();
                ((v3b) obj2).getClass();
                return new rr9();
            case 16:
                ((Integer) obj2).getClass();
                gxc.e(ka2.L(1), (b) obj);
                return j6g.a;
            case 17:
                qpd qpdVar2 = (qpd) obj;
                qpdVar2.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar2 = fwc.a;
                return new okd((f88) qpdVar2.a(null, iwcVar2.b(f88.class), null), (i88) qpdVar2.a(null, iwcVar2.b(i88.class), null));
            case 18:
                qpd qpdVar3 = (qpd) obj;
                qpdVar3.getClass();
                ((v3b) obj2).getClass();
                iwc iwcVar3 = fwc.a;
                return new dfg((f88) qpdVar3.a(null, iwcVar3.b(f88.class), null), (i88) qpdVar3.a(null, iwcVar3.b(i88.class), null));
            default:
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
                WebResourceResponse webResourceResponse = (WebResourceResponse) obj2;
                webResourceRequest.getClass();
                webResourceResponse.getClass();
                ((zk6) axg.a.getValue()).a(webResourceRequest, webResourceResponse);
                return j6g.a;
        }
    }

    public /* synthetic */ fj2(int i, byte b) {
        this.a = i;
    }
}
