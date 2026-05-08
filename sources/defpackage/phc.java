package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jobsearch.LaunchActivity;
import com.wlappdebug.r;
import defpackage.pgd;
import java.io.EOFException;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class phc implements yu5 {
    @Override // defpackage.yu5
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws EOFException {
        String str = (String) obj;
        String str2 = (String) obj2;
        hde hdeVar = (hde) obj3;
        Activity activity = (Activity) obj4;
        Promise promise = (Promise) obj5;
        if (!(activity instanceof LaunchActivity)) {
            b0.p("No main activity in App", promise);
            return j6g.a;
        }
        pgd pgdVarB = yhg.a.b(str, str2);
        if (pgdVarB instanceof pgd.n) {
            pgd.n nVar = (pgd.n) pgdVarB;
            String str3 = nVar.b;
            String str4 = nVar.c;
            String str5 = nVar.d;
            HttpUrl.Companion companion = HttpUrl.k;
            String strG = d93.g();
            companion.getClass();
            HttpUrl httpUrlH = HttpUrl.Companion.c(strG).h(str3);
            if (httpUrlH == null) {
                b0.p("Unable to parse externalUrl", promise);
                return j6g.a;
            }
            ((LaunchActivity) activity).K(httpUrlH.i, str4, str5, hdeVar.a, hdeVar.b, null);
        } else {
            p87 p87Var = (p87) cr8.p(p87.class);
            ((r.b) cr8.p(r.b.class)).b(BuildConfig.VERSION_NAME, "initService.appVersion");
            d2f d2fVar = ajg.a;
            ((LaunchActivity) activity).K(str2, ajg.a(p87Var.a()), null, null, null, null);
        }
        return j6g.a;
    }
}
