package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jsmappservices.bridge.ToastTheme;
import com.indeed.android.jsmappservices.bridge.results.GetRegisteredJSONCallbackIdsResult;
import defpackage.jq7;
import defpackage.sp7;
import defpackage.waf;
import java.lang.annotation.Annotation;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zr0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ zr0(km7 km7Var) {
        this.a = 6;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        switch (this.a) {
            case 0:
                cs0[] cs0VarArrValues = cs0.values();
                cs0VarArrValues.getClass();
                return new aw4(cs0VarArrValues, "com.indeed.android.rnmessaging.api.logging.ArchiveCause");
            case 1:
                return new gt0(waf.a.a, 0);
            case 2:
                return new pgb(12);
            case 3:
                return new gt0(d4f.Companion.serializer(), 0);
            case 4:
                GetRegisteredJSONCallbackIdsResult.Companion companion = GetRegisteredJSONCallbackIdsResult.Companion;
                return new gt0(mve.a, 0);
            case 5:
                return j6g.a;
            case 6:
                return j6g.a;
            case 7:
                return new gt0(ni1.a, 0);
            case 8:
                return new rna("ResumeCoach", jq7.y.INSTANCE, new Annotation[0]);
            case DatadogLogGenerator.CRASH /* 9 */:
                return new OkHttpClient();
            case 10:
                return new dv1(new OkHttpClient());
            case 11:
                return new by8(mve.a, rh7.a);
            case 12:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-http-error-screen", "hamburger-menu", null, null, 12));
                ((j2g) cr8.p(j2g.class)).a();
                return j6g.a;
            case 13:
                return web.j("com.indeed.android.jsmappservices.bridge.ToastTheme", ToastTheme.values(), new String[]{"light", "dark"}, new Annotation[][]{null, null});
            default:
                return j6g.a;
        }
    }

    public /* synthetic */ zr0(int i) {
        this.a = i;
    }
}
