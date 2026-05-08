package defpackage;

import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jobsearch.webview.IndeedWebView;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.swmansion.rnscreens.i;
import defpackage.fr;
import defpackage.s87;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj == ((l1) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                iba ibaVar = (iba) obj2;
                ((m74) obj).getClass();
                zq zqVar = new zq(i);
                ibaVar.b(zqVar);
                return new fr.a(ibaVar, zqVar);
            case 2:
                sr srVar = (sr) obj2;
                mt9 mt9Var = (mt9) obj;
                mt9Var.getClass();
                if (srVar.g0) {
                    bs7 bs7VarF = jsb.f(mt9Var);
                    srVar.close();
                    Function2<? super ps7, ? super bs7, j6g> function2 = srVar.h0;
                    if (function2 != null) {
                        function2.invoke(ps7.a, bs7VarF);
                    }
                } else {
                    yvb yvbVarQ = srVar.Q();
                    rr rrVar = new rr(i, srVar, mt9Var);
                    String str = yvbVarQ.v().a;
                    if (str != null) {
                        ((gme) yvbVarQ.e).setValue(b5g.b);
                        u63.Y(ee3.p(yvbVarQ), null, null, new tvb(yvbVarQ, mt9Var, str, rrVar, null), 3);
                    }
                }
                return j6g.a;
            case 3:
                p91 p91Var = (p91) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qf8<Object>[] qf8VarArr = p91.i0;
                ((c6f) p91Var.b0.getValue()).k(p91Var.getQ0(), zBooleanValue, prd.a);
                return j6g.a;
            case 4:
                ((zhd) obj).getClass();
                return ((Callable) obj2).call();
            case 5:
                lx5 lx5Var = (lx5) obj;
                lx5Var.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a((gz4) pnb.B((IanMainFragment) obj2).a(null, fwc.a.b(gz4.class), null), lx5Var);
                return j6g.a;
            case 6:
                mq6 mq6Var = (mq6) obj2;
                ex4 ex4Var = (ex4) obj;
                ex4Var.getClass();
                fx4 fx4Var = mq6Var.f;
                if (fx4Var != null) {
                    ((gme) fx4Var.b).setValue(dx4.a(fx4Var.g(), false, ex4Var, false, 95));
                }
                bp6 bp6Var = mq6Var.f0;
                bp6Var.getClass();
                Lazy<s87> lazy2 = s87.f;
                s87.a.a(bp6Var.a(), tx5.g(bp6Var.b, ex4Var == ex4.b ? "network-error-screen" : "http-error-screen", null, 6));
                ComposeView composeView = mq6Var.W;
                if (composeView != null) {
                    composeView.setVisibility(0);
                }
                IndeedWebView indeedWebView = mq6Var.V;
                if (indeedWebView != null) {
                    indeedWebView.setVisibility(8);
                }
                ComposeView composeView2 = mq6Var.Z;
                if (composeView2 != null) {
                    composeView2.setVisibility(8);
                }
                return j6g.a;
            case 7:
                ((IndeedApplyWebViewFragment) obj2).R("ShouldInterceptRequestComponent", ((Boolean) obj).booleanValue());
                return j6g.a;
            case 8:
                is7 is7Var = (is7) obj;
                is7Var.getClass();
                ((h78) obj2).Q(hs7.a, is7Var);
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                t78 t78Var = (t78) obj2;
                List list = (List) obj;
                list.getClass();
                aub aubVarQ = t78Var.Q();
                u63.Y(ee3.p(aubVarQ), null, null, new otb(aubVarQ, list, new me(t78Var, 11), null), 3);
                return j6g.a;
            case 10:
                Intent intent = (Intent) obj;
                int i2 = LaunchActivity.e1;
                intent.getClass();
                ((LaunchActivity) obj2).M0.a(intent);
                return j6g.a;
            case 11:
                o99 o99Var = (o99) obj2;
                wj8 wj8Var = (wj8) obj;
                wj8Var.getClass();
                o99Var.Q().p(wj8Var, new z0(o99Var, 14));
                return j6g.a;
            case 12:
                yvb yvbVar = (yvb) obj2;
                String str2 = (String) obj;
                str2.getClass();
                yvbVar.getClass();
                u63.Y(ee3.p(yvbVar), null, null, new swb(null, yvbVar, str2), 3);
                return j6g.a;
            case 13:
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                ((p9d) obj2).i(sl8Var.a());
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                ((zmc) obj2).d();
                ((xmc) obj).getClass();
                return null;
            case 15:
                zrd zrdVar = (zrd) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                c3a c3aVar = zrdVar.a;
                dme dmeVar = (dme) c3aVar;
                float fE = dmeVar.e() + fFloatValue + zrdVar.e;
                float fB = nic.B(fE, 0.0f, zrdVar.f());
                i = fE == fB ? 1 : 0;
                float fE2 = fB - dmeVar.e();
                int iRound = Math.round(fE2);
                ((dme) c3aVar).h(dmeVar.e() + iRound);
                zrdVar.e = fE2 - iRound;
                if (i == 0) {
                    fFloatValue = fE2;
                }
                return Float.valueOf(fFloatValue);
            case 16:
                return i.g((i) obj2, (qb3) obj);
            default:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                String str3 = (String) obj;
                str3.getClass();
                searchOverlayFragment.H().g();
                searchOverlayFragment.I().A(str3, false);
                return j6g.a;
        }
    }
}
