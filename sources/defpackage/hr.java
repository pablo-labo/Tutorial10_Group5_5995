package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.g;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.defaults.a;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.google.firebase.iid.FirebaseInstanceId;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import defpackage.d0a;
import defpackage.jq7;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hr implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        lr5 lr5VarU;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                nr nrVar = (nr) obj;
                nrVar.Q().C();
                nrVar.close();
                Function2<? super ps7, ? super zr7, j6g> function2 = nrVar.h0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                return j6g.a;
            case 1:
                return Boolean.valueOf((((toa) obj).a() & 9223372034707292159L) != 9205357640488583168L);
            case 2:
                return (le0) obj;
            case 3:
                wt3 wt3Var = (wt3) obj;
                kdd kddVar = (kdd) om2.a(wt3Var, sdd.a);
                n90 n90Var = wt3Var.j0;
                if (kddVar == null) {
                    if (n90Var != null) {
                        wt3Var.d2(n90Var);
                    }
                    wt3Var.j0 = null;
                } else if (n90Var == null) {
                    st3 st3Var = new st3(wt3Var);
                    qa qaVar = new qa(wt3Var, 7);
                    ei7 ei7Var = wt3Var.f0;
                    boolean z = wt3Var.g0;
                    float f = wt3Var.h0;
                    dvf<Float> dvfVar = qdd.a;
                    n90 n90Var2 = new n90(ei7Var, z, f, st3Var, qaVar);
                    wt3Var.c2(n90Var2);
                    wt3Var.j0 = n90Var2;
                }
                return j6g.a;
            case 4:
                return (List) ((GhostwriterDebugFragment) obj).d.getValue();
            case 5:
                qj6 qj6Var = (qj6) obj;
                int i2 = qj6.r0;
                qj6Var.Y.j("HOME");
                qj6Var.c0().h(false);
                qj6Var.W(gq6.IDV_CLOSE);
                return j6g.a;
            case 6:
                View view = (View) obj;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                if (jobSearchApplication == null) {
                    wl7.g("appInstance");
                    throw null;
                }
                f97 f97Var = jobSearchApplication.c;
                if (f97Var == null) {
                    wl7.g("indeedFcmManager");
                    throw null;
                }
                Context context = view.getContext();
                context.getClass();
                if (na6.d.c(context, oa6.a) == 0) {
                    ikh ikhVar = FirebaseInstanceId.i;
                    FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(pf5.c());
                    pf5 pf5Var = firebaseInstanceId.b;
                    FirebaseInstanceId.c(pf5Var);
                    firebaseInstanceId.a(xih.b(pf5Var)).addOnCompleteListener(new c97(f97Var, context));
                }
                return j6g.a;
            case 7:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj;
                Lazy<s87> lazy = s87.f;
                s87.a.a(indeedApplyWebViewFragment.P(), tx5.k(indeedApplyWebViewFragment.t0, "IndeedApplyWebViewFragment", "retry", null, 12));
                ((gme) indeedApplyWebViewFragment.Q().d).setValue(Boolean.TRUE);
                ((gme) indeedApplyWebViewFragment.Q().e).setValue(Boolean.FALSE);
                ModalWebview modalWebviewN = indeedApplyWebViewFragment.N();
                String str = indeedApplyWebViewFragment.z0;
                if (str != null) {
                    modalWebviewN.loadUrl(str);
                    return j6g.a;
                }
                wl7.g("indeedApplyUrl");
                throw null;
            case 8:
                JobSearchApplication jobSearchApplication2 = (JobSearchApplication) obj;
                JobSearchApplication jobSearchApplication3 = JobSearchApplication.X;
                Context applicationContext = jobSearchApplication2.getApplicationContext();
                applicationContext.getClass();
                ymc ymcVar = jobSearchApplication2.V;
                ymcVar.getClass();
                HermesInstance hermesInstance = new HermesInstance();
                List<inc> packages = ymcVar.getPackages();
                packages.getClass();
                String jSMainModuleName = ymcVar.getJSMainModuleName();
                jSMainModuleName.getClass();
                String bundleAssetName = ymcVar.getBundleAssetName();
                if (bundleAssetName == null) {
                    bundleAssetName = "index";
                }
                String jSBundleFile = ymcVar.getJSBundleFile();
                boolean zD = ymcVar.d();
                hs hsVar = new hs(6);
                if (a.a == null) {
                    DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(jSMainModuleName, jSBundleFile != null ? wve.K(jSBundleFile, "assets://", false) ? JSBundleLoader.INSTANCE.createAssetLoader(applicationContext, jSBundleFile, true) : JSBundleLoader.INSTANCE.createFileLoader(jSBundleFile) : JSBundleLoader.INSTANCE.createAssetLoader(applicationContext, "assets://".concat(bundleAssetName), true), packages, hermesInstance, null, hsVar, new DefaultTurboModuleManagerDelegate.a());
                    ComponentFactory componentFactory = new ComponentFactory();
                    DefaultComponentsRegistry.register(componentFactory);
                    a.a = new ReactHostImpl(applicationContext, defaultReactHostDelegate, componentFactory, zD);
                }
                ReactHostImpl reactHostImpl = a.a;
                reactHostImpl.getClass();
                return reactHostImpl;
            case DatadogLogGenerator.CRASH /* 9 */:
                return (d0a.a) j22.a(((u12) obj).j());
            case 10:
                int i3 = ura.l0;
                ((ura) obj).D();
                return j6g.a;
            case 11:
                vpb vpbVar = (vpb) obj;
                spb spbVar = vpbVar.b;
                return vpbVar.i(spbVar.a(), new olf[]{new LocalExifThumbnailProducer(spbVar.i.i(), spbVar.j, spbVar.a)});
            case 12:
                crb crbVar = (crb) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-http-error-screen", "report-issue", null, null, 12));
                g activity = crbVar.getActivity();
                if (activity == null || (lr5VarU = activity.u()) == null) {
                    ArrayList arrayList = lz2.a;
                    w40.n("navigateToReportIssueWebView failed: activity is null", "ProfileFragment", "navigateToReportIssueWebView failed: activity is null", false);
                } else {
                    ((rq7) cr8.p(rq7.class)).f(lr5VarU, mh2.k(crbVar), new jq7.b0(null), "rich-profile-home-screen");
                }
                return j6g.a;
            default:
                dld dldVar = (dld) obj;
                dldVar.getLifecycle().a(new otc(dldVar));
                return j6g.a;
        }
    }
}
