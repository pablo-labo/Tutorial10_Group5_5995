package defpackage;

import android.webkit.CookieManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jsmappservices.bridge.results.GetAvailableMethodsResult;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd1 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ pd1(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                jte jteVar = rd1.a;
                break;
            case 6:
                GetAvailableMethodsResult.Companion companion = GetAvailableMethodsResult.Companion;
                break;
            case 10:
                String cookie = CookieManager.getInstance().getCookie(d93.g());
                break;
            case 13:
                iwc iwcVar = fwc.a;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                iwc iwcVar2 = fwc.a;
                break;
            case 15:
                it7[] it7VarArrValues = it7.values();
                it7VarArrValues.getClass();
                break;
            case 16:
                epa epaVar = epa.a;
                OkHttpClient.Builder builderE = epa.e().e();
                s97 s97Var = new s97(new mz(13));
                ArrayList arrayList = builderE.c;
                arrayList.add(s97Var);
                arrayList.add(new yy0());
                builderE.a(epa.c());
                builderE.b(15L, TimeUnit.SECONDS);
                break;
            case 17:
                m2c.c(pjb.e);
                break;
            case 18:
                ((at7) cr8.p(at7.class)).g(null, ht7.b, "tare-debug-screen", new od2(11));
                break;
        }
        return j6g.a;
    }
}
