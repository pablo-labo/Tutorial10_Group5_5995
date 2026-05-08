package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import com.swmansion.rnscreens.a;
import com.swmansion.rnscreens.d;
import defpackage.gs7;
import defpackage.s87;
import defpackage.yk4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        z = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jg jgVar = (jg) obj2;
                av8 av8Var = (av8) obj;
                av8Var.getClass();
                ((yvb) jgVar.h0.getValue()).h(av8Var, new oa(jgVar, z ? 1 : 0));
                return j6g.a;
            case 1:
                p91 p91Var = (p91) obj2;
                qf8<Object>[] qf8VarArr = p91.i0;
                if (((nre) ((jz2) obj).a()) != null) {
                    ArrayList arrayList = lz2.a;
                    lz2.d(p91Var.Q(), "startInitialLoadEvent", false, null);
                    p91Var.T();
                }
                return j6g.a;
            case 2:
                ((Float) obj).getClass();
                iy3 iy3VarA = ((sc4) obj2).a();
                dvf<Float> dvfVar = nc4.a;
                return Float.valueOf(iy3VarA.t1(56.0f));
            case 3:
                iba ibaVar = (iba) obj2;
                ((m74) obj).getClass();
                gh4 gh4Var = new gh4(z ? 1 : 0);
                ibaVar.b(gh4Var);
                return new yk4.a(ibaVar, gh4Var);
            case 4:
                b bVar = (b) obj2;
                gu5 gu5Var = (gu5) obj;
                gu5Var.getClass();
                yvb.n(bVar.Q(), bVar.k0, null, null, gu5Var, 6);
                return j6g.a;
            case 5:
                crb crbVar = (crb) obj2;
                pjb pjbVar = (pjb) obj;
                pjbVar.getClass();
                switch (pjbVar.ordinal()) {
                    case 0:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.c(null, null));
                        break;
                    case 1:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.d(null, null));
                        break;
                    case 2:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.h(null, null));
                        break;
                    case 3:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.b(null, null));
                        break;
                    case 4:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.e(null, null));
                        break;
                    case 5:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.f(null, null));
                        break;
                    case 6:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.g(null, null));
                        break;
                    case 7:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.i(null, null));
                        break;
                    case 8:
                        ((vr7) cr8.p(vr7.class)).a(t40.g(crbVar), new gs7.a(null, null));
                        break;
                    default:
                        l.g();
                        return null;
                }
                dg3.g(dg3.b(crbVar.Q().o().a, pjbVar, null, "Edit", 4));
                return j6g.a;
            case 6:
                xpc xpcVar = (xpc) obj2;
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null && !wl7.b(weakReference.get(), xpcVar)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                ((upb) obj2).f((vid) obj);
                return j6g.a;
            case 8:
                sqd sqdVar = (sqd) obj;
                sqdVar.getClass();
                return Boolean.valueOf((z92.I0(((d) obj2).a0, sqdVar) || sqdVar.l().getActivityState() == a.EnumC0194a.a) ? false : true);
            case DatadogLogGenerator.CRASH /* 9 */:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                int iIntValue = ((Integer) obj).intValue();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), audVarH.b.l(ak2.M(SearchType.c), "where-suggestion-option", zr4.a, m93.c));
                searchOverlayFragment.I().t(iIntValue);
                return j6g.a;
            case 10:
                m6f m6fVar = (m6f) obj2;
                if (((nre) ((jz2) obj).a()) != null) {
                    m6fVar.N();
                }
                return j6g.a;
            case 11:
                nuf nufVar = (nuf) obj2;
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                j62.a(j62Var, "first", nufVar.a.getDescriptor());
                j62.a(j62Var, "second", nufVar.b.getDescriptor());
                j62.a(j62Var, "third", nufVar.c.getDescriptor());
                return j6g.a;
            default:
                com.indeed.android.jobsearch.viewjob.a aVar = (com.indeed.android.jobsearch.viewjob.a) obj2;
                int i2 = com.indeed.android.jobsearch.viewjob.a.H0;
                ((wpa) obj).getClass();
                ArrayList arrayList2 = lz2.a;
                lz2.d("view-job-bottom-sheet", "onBackPressedDispatcher.handleOnBackPressed", false, null);
                ModalWebview modalWebview = aVar.B0;
                if (modalWebview == null) {
                    wl7.g("webview");
                    throw null;
                }
                if (modalWebview.canGoBack()) {
                    lz2.d("view-job-bottom-sheet", "handleBackAction() -> back in WebView", false, null);
                    ModalWebview modalWebview2 = aVar.B0;
                    if (modalWebview2 == null) {
                        wl7.g("webview");
                        throw null;
                    }
                    modalWebview2.goBack();
                } else {
                    lz2.d("view-job-bottom-sheet", "handleBackAction() -> closing VJ", false, null);
                    aVar.R("view_job_back");
                    g3a<jz2<j6g>> g3aVar = kqg.a;
                    LaunchActivity launchActivity = aVar.A0;
                    if (launchActivity == null) {
                        wl7.g("launchActivity");
                        throw null;
                    }
                    lr5 lr5VarU = launchActivity.u();
                    lr5VarU.getClass();
                    kqg.b(lr5VarU);
                }
                return j6g.a;
        }
    }
}
