package defpackage;

import android.webkit.CookieManager;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.jsmappservices.bridge.ToastStyle;
import com.indeed.android.jsmappservices.bridge.results.ApplyResult;
import com.indeed.android.jsmappservices.bridge.results.IndeedApplyCompletionResult;
import com.wlappdebug.r;
import com.wlproctor.common.model.TestBucket$$serializer;
import defpackage.c20;
import defpackage.jq7;
import defpackage.sp7;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ao0 implements gu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ ao0(int i) {
        this.a = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() throws Exception {
        switch (this.a) {
            case 0:
                yd8 yd8VarB = fwc.a.b(o09.class);
                p09 p09Var = p09.a;
                return new iu2(yd8VarB, new KSerializer[0]);
            case 1:
                DisplayToastData.Companion companion = DisplayToastData.INSTANCE;
                return ToastStyle.Companion.serializer();
            case 2:
                jte jteVar = np4.a;
                return cn3.a;
            case 3:
                return c20.a.m;
            case 4:
                IndeedApplyCompletionResult.Companion companion2 = IndeedApplyCompletionResult.Companion;
                return ApplyResult.Companion.serializer();
            case 5:
                try {
                    return CookieManager.getInstance();
                } catch (Exception e) {
                    if (wve.D(e.getClass().getName(), "MissingWebViewPackageException", false)) {
                        return null;
                    }
                    throw e;
                }
            case 6:
                jte jteVar2 = vf7.a;
                return null;
            case 7:
                return new gt0(ni1.a, 0);
            case 8:
                return new rna("IndeedNumberOneJobSearchSiteClaims", jq7.j.INSTANCE, new Annotation[0]);
            case DatadogLogGenerator.CRASH /* 9 */:
                return aq3.Companion.serializer();
            case 10:
                return x98.b;
            case 11:
                epa epaVar = epa.a;
                ((r.b) epa.d.getValue()).b(BuildConfig.VERSION_NAME, "initService.appVersion");
                d2f d2fVar = ajg.a;
                return ajg.a(epa.a().a());
            case 12:
                return j6g.a;
            case 13:
                return new by8(mve.a, TestBucket$$serializer.INSTANCE);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return j6g.a;
            case 15:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "hamburger-menu", null, null, 12));
                ((j2g) cr8.p(j2g.class)).a();
                return j6g.a;
            case 16:
                m2c.c(pjb.b);
                return j6g.a;
            default:
                return rzf.a;
        }
    }
}
