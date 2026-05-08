package defpackage;

import android.graphics.BitmapFactory;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.navigation.e;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.instrumentation.gestures.WindowCallbackWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.languageselector.LanguageSelectorFragment;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jobsearch.webview.external.ExternalWebView;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.results.ApplyResult;
import com.indeed.android.jsmappservices.bridge.results.IndeedApplyCompletionResult;
import com.indeed.android.profile.screens.sheets.profilesubtab.award.a;
import defpackage.hp7;
import defpackage.jq7;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fy implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ps7 ps7Var = ps7.d;
        b5g b5gVar = b5g.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bxb(((gy) obj).h0);
            case 1:
                pm0 pm0Var = (pm0) obj;
                Lazy<s87> lazy = s87.f;
                s87.a.a(pm0Var.M(), tx5.g(pm0Var.g0, "app_rating_multi_prompt_yes_on_negative_feedback", null, 6));
                lr5 lr5VarU = pm0Var.requireActivity().u();
                lr5VarU.getClass();
                List<Fragment> listF = lr5VarU.c.f();
                listF.getClass();
                Fragment fragment = (Fragment) z92.Q0(listF);
                e eVarK = fragment != null ? mh2.k(fragment) : null;
                if (eVarK == null) {
                    ArrayList arrayList = lz2.a;
                    w40.n("Could not find navController", "AppRatingMultiPromptFragment", "Could not find navController", false);
                } else {
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    r97.a.getClass();
                    rq7Var.f(lr5VarU, eVarK, new jq7.b0(r97.b()), "app_rating_multi_prompt_yes_on_negative_feedback");
                }
                pm0Var.F(false, false);
                return j6g.a;
            case 2:
                ModalWebview modalWebview = ((ec1) obj).m0;
                if (modalWebview != null) {
                    return modalWebview;
                }
                wl7.g("webview");
                throw null;
            case 3:
                ((BridgeDispatcher.c) obj).a(new IndeedApplyCompletionResult(ApplyResult.c, null));
                return j6g.a;
            case 4:
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                lr5 lr5VarU2 = ((gr2) obj).requireActivity().u();
                lr5VarU2.getClass();
                i1gVar.a(lr5VarU2, new c52());
                return j6g.a;
            case 5:
                ((o03) obj).l0.f();
                return Boolean.TRUE;
            case 6:
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(((x44) obj).a.getAbsolutePath(), options);
                return options;
            case 7:
                return new bxb(((of4) obj).g0);
            case 8:
                a aVar = (a) obj;
                ((gme) aVar.R().e).setValue(b5gVar);
                aVar.Q(ps7Var, null);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                return new bxb(((com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a) obj).i0);
            case 10:
                lk4 lk4Var = (lk4) obj;
                ((gme) lk4Var.Q().e).setValue(b5gVar);
                lk4Var.close();
                Function1<? super ps7, j6g> function1 = lk4Var.i0;
                if (function1 != null) {
                    function1.invoke(ps7Var);
                }
                return j6g.a;
            case 11:
                ExternalWebView externalWebView = ((ExternalActivity) obj).w0;
                if (externalWebView != null) {
                    return externalWebView.getUrl();
                }
                wl7.g("externalWebView");
                throw null;
            case 12:
                ut5 ut5Var = (ut5) obj;
                dd4 dd4Var = dd4.a;
                if (dd4.b()) {
                    ut5Var.H(false);
                } else {
                    ut5Var.J(false);
                }
                return j6g.a;
            case 13:
                ((vg) obj).invoke(new hp7.b(new jhb(0)));
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                LanguageSelectorFragment languageSelectorFragment = (LanguageSelectorFragment) obj;
                qf8<Object>[] qf8VarArr = LanguageSelectorFragment.d;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a((gz4) languageSelectorFragment.b.getValue(), languageSelectorFragment.c.o("language-selector", "app-closed"));
                g activity = languageSelectorFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return j6g.a;
            case 15:
                f8 f8Var = ((LaunchActivity) obj).J0;
                if (f8Var != null) {
                    f8Var.e.setVisibility(8);
                    return j6g.a;
                }
                wl7.g("binding");
                throw null;
            case 16:
                e2b e2bVar = (e2b) obj;
                return Integer.valueOf(e2bVar.k.b() ? ((dme) e2bVar.t).e() : e2bVar.k());
            case 17:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("ResumePreviewFragment", WindowCallbackWrapper.BACK_DEFAULT_TARGET_NAME, null, null, 12));
                ((d9d) obj).close();
                return j6g.a;
            case 18:
                ((cud) obj).p();
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return ((zf8) ((List) obj).get(0)).a();
            default:
                return Long.valueOf(((csf) obj).b());
        }
    }
}
