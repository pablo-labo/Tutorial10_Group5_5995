package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.regpromo.RegPromoFragment;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.indeed.android.jobsearch.webview.modal.ModalWebview;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import defpackage.jq7;
import defpackage.p85;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xh implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        Object obj = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new bxb(((bi) obj2).j0);
            case 1:
                vw vwVar = (vw) obj2;
                ((gme) vwVar.Q().e).setValue(b5g.a);
                vwVar.close();
                Function2<? super ps7, ? super qs7, j6g> function2 = vwVar.j0;
                if (function2 != null) {
                    function2.invoke(ps7.d, null);
                }
                return j6g.a;
            case 2:
                return Long.valueOf(((n4e) obj2).a());
            case 3:
                og2 og2Var = (og2) obj2;
                List<? extends gu5<? extends List<? extends Pair<? extends p85.a<? extends Object>, ? extends yd8<? extends Object>>>>> list = og2Var.d;
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    w92.w0(arrayList, list.get(i3).invoke());
                }
                og2Var.d = zr4.a;
                return arrayList;
            case 4:
                a aVar = (a) obj2;
                yvb yvbVarR = aVar.R();
                u63.Y(ee3.p(yvbVarR), null, null, new gwb(null, new oj(aVar, 9), yvbVarR, aVar.R().v().a0.a), 3);
                return j6g.a;
            case 5:
                ut5 ut5Var = (ut5) obj2;
                String str = ut5Var.N().g().c;
                ut5Var.Y.g(str, true);
                ut5Var.N().h(false);
                if (str != null) {
                    ut5Var.G().h(str, false, false);
                }
                return j6g.a;
            case 6:
                return ((IndeedWebView) obj2).getUrl();
            case 7:
                xed xedVar = ((km7) obj2).a;
                return Boolean.valueOf(!xedVar.q() || xedVar.u());
            case 8:
                ((udf) obj2).onStop();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                sl8 sl8Var = (sl8) ((gme) ((h89) obj2).p0).getValue();
                return new ooa(sl8Var != null ? sl8Var.a0(0L) : 9205357640488583168L);
            case 10:
                ArrayList arrayList2 = ((r1a) obj2).e;
                if (!arrayList2.isEmpty()) {
                    Object obj3 = arrayList2.get(0);
                    float fC = ((g3b) obj3).a.c();
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        while (true) {
                            Object obj4 = arrayList2.get(i2);
                            float fC2 = ((g3b) obj4).a.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj3 = obj4;
                                fC = fC2;
                            }
                            if (i2 != size2) {
                                i2++;
                            }
                        }
                    }
                    obj = obj3;
                }
                g3b g3bVar = (g3b) obj;
                return Float.valueOf(g3bVar != null ? g3bVar.a.c() : 0.0f);
            case 11:
                crb crbVar = (crb) obj2;
                return new n2c(crbVar.d, crbVar.e);
            case 12:
                ((bub) obj2).close();
                return j6g.a;
            case 13:
                x1c x1cVar = (x1c) obj2;
                ((gme) x1cVar.V).setValue(exb.a(x1cVar.o(), null, null, null, null, false, false, false, null, false, false, false, false, false, false, 57343));
                x1cVar.v();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((Function1) obj2).invoke(null);
                return j6g.a;
            case 15:
                RegPromoFragment regPromoFragment = (RegPromoFragment) obj2;
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = regPromoFragment.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(regPromoFragment), jq7.g.INSTANCE, "reg-promo-native");
                regPromoFragment.E("cookie-policy");
                return j6g.a;
            case 16:
                x8f x8fVar = (x8f) obj2;
                rq7 rq7Var2 = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU2 = x8fVar.requireActivity().u();
                lr5VarU2.getClass();
                rq7Var2.f(lr5VarU2, mh2.k(x8fVar), jq7.a.INSTANCE, "tare-debug-screen");
                return j6g.a;
            case 17:
                com.indeed.android.jobsearch.viewjob.a aVar2 = (com.indeed.android.jobsearch.viewjob.a) obj2;
                int i4 = com.indeed.android.jobsearch.viewjob.a.H0;
                Boolean bool = aVar2.Q().g().g;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    lqg lqgVarQ = aVar2.Q();
                    ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, Boolean.valueOf(!zBooleanValue), null, 0.0f, false, false, 4031));
                    String str2 = aVar2.Q().g().h;
                    if (str2 != null) {
                        try {
                            String str3 = "window.JSMABridgeRegistry.executeCallback(" + s98.d.b(mve.a, str2) + ")";
                            ModalWebview modalWebview = aVar2.B0;
                            if (modalWebview == null) {
                                wl7.g("webview");
                                throw null;
                            }
                            modalWebview.evaluateJavascript(str3, null);
                        } catch (Exception e) {
                            ArrayList arrayList3 = lz2.a;
                            lz2.b("view-job-bottom-sheet", "Error while executing save button click handler", false, e);
                        }
                    }
                }
                return j6g.a;
            default:
                f4h f4hVar = (f4h) obj2;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-edit-work-wellbeing-preference", "close-work-wellbeing-preference", null, null, 12));
                f4hVar.close();
                Function2<? super hs7, ? super ys7, j6g> function22 = f4hVar.h0;
                if (function22 != null) {
                    function22.invoke(hs7.c, null);
                }
                return j6g.a;
        }
    }
}
