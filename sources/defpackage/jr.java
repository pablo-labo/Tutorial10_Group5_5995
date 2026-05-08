package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.tare.InvalidMobileHomepageUrlException;
import defpackage.jq7;
import defpackage.ke9;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jr implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ jr(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws InvalidMobileHomepageUrlException {
        switch (this.a) {
            case 0:
                return j6g.a;
            case 1:
                qf8<Object>[] qf8VarArr = p91.i0;
                return j6g.a;
            case 2:
                return u63.a0(new pxc(".*\\bmail\\.google\\.com$"), new pxc(".*\\bmail\\.yahoo\\.com$"), new pxc(".*\\boutlook\\.live\\.com$"));
            case 3:
                return j6g.a;
            case 4:
                return j6g.a;
            case 5:
                return j6g.a;
            case 6:
                return Uri.parse("android-app://com.indeed.android.jobsearch");
            case 7:
                return j6g.a;
            case 8:
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return j6g.a;
            case 10:
                return j6g.a;
            case 11:
                String strG = d93.g();
                String host = Uri.parse(strG).getHost();
                if (host == null) {
                    throw new InvalidMobileHomepageUrlException("CurrentSite.mobileHomepageUrl is not an Indeed URL: ".concat(strG));
                }
                ke9 ke9VarC = d87.a.c(host);
                if (ke9VarC == null) {
                    throw new InvalidMobileHomepageUrlException("CurrentSite.mobileHomepageUrl is not an Indeed URL: ".concat(strG));
                }
                String str = (String) ((ke9.a) ke9VarC.a()).get(1);
                if (str == null || str.length() == 0) {
                    throw new InvalidMobileHomepageUrlException("CurrentSite.mobileHomepageUrl is not an Indeed URL: ".concat(strG));
                }
                return str;
            case 12:
                pxc pxcVar = fz2.a;
                String cookie = CookieManager.getInstance().getCookie(d93.g());
                if (cookie == null) {
                    cookie = "";
                }
                LinkedHashMap linkedHashMapA = fz2.a(cookie);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapA.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 1) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new AtomicReference(linkedHashMap.keySet());
            case 13:
                return web.j("com.indeed.android.tare.nav.InterviewSchedulingResultT", kk7.values(), new String[]{"SUCCESS", "CANCEL"}, new Annotation[][]{null, null});
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return new gt0(ni1.a, 0);
            case 15:
                return new rna("Messaging", jq7.o.INSTANCE, new Annotation[0]);
            case 16:
                mve mveVar = mve.a;
                return new by8(mveVar, mveVar);
            case 17:
                return it7.Companion.serializer();
            case 18:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new ao0(11));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new u35());
                arrayList.add(new i87((g87) epa.g0.getValue()));
                arrayList.add(new f87());
                arrayList.add(new i77());
                builderE.a(epa.c());
                builderE.e(30L, TimeUnit.SECONDS);
                return new OkHttpClient(builderE);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return j6g.a;
            case 20:
                return j6g.a;
            case 21:
                m2c.c(pjb.X);
                return j6g.a;
            case 22:
                return j6g.a;
            default:
                g3a<jz2<j6g>> g3aVar = kqg.a;
                j6g j6gVar = j6g.a;
                g3aVar.k(new jz2<>(j6gVar));
                return j6gVar;
        }
    }
}
