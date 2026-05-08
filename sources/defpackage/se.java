package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.layout.w;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.viewjob.a;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.jsmappservices.bridge.results.PushAuthStatusResult;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import defpackage.et7;
import defpackage.h63;
import defpackage.jq7;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class se implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ se(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 12;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj2;
                ((m74) obj).getClass();
                jf jfVar = new jf();
                ibaVar.b(jfVar);
                return new pf(i3, ibaVar, jfVar);
            case 1:
                rj rjVar = (rj) obj2;
                lu0 lu0Var = (lu0) obj;
                lu0Var.getClass();
                yvb yvbVarQ = rjVar.Q();
                qj qjVar = new qj(i3, rjVar, lu0Var);
                if (yvbVarQ.v().D) {
                    qjVar.invoke();
                } else {
                    String str = yvbVarQ.v().a;
                    if (str != null) {
                        u63.Y(ee3.p(yvbVarQ), null, null, new uvb(yvbVarQ, lu0Var, str, qjVar, null), 3);
                    }
                }
                return j6g.a;
            case 2:
                gy gyVar = (gy) obj2;
                g2h g2hVar = (g2h) obj;
                g2hVar.getClass();
                yvb yvbVarQ2 = gyVar.Q();
                qj qjVar2 = new qj(1, gyVar, g2hVar);
                if (zve.U(g2hVar.b)) {
                    ArrayList arrayList = lz2.a;
                    lz2.c("ProfileSectionsViewModel", "No work experience title to add", false, null, 12);
                } else if (yvbVarQ2.v().i) {
                    qjVar2.invoke();
                } else {
                    u63.Y(ee3.p(yvbVarQ2), null, null, new uwb(yvbVarQ2, g2hVar, qjVar2, null), 3);
                }
                return j6g.a;
            case 3:
                w.a.y((w.a) obj, (w) obj2, 0, 0);
                return j6g.a;
            case 4:
                p91 p91Var = (p91) obj2;
                Intent intent = (Intent) obj;
                qf8<Object>[] qf8VarArr = p91.i0;
                intent.getClass();
                bp6 bp6Var = p91Var.Y;
                String strName = p91Var.getQ0().name();
                bp6Var.getClass();
                bp6.b(strName);
                p91Var.W.a(intent);
                return j6g.a;
            case 5:
                int i4 = ec1.s0;
                ((DisplayToastData) obj).getClass();
                ArrayList arrayList2 = lz2.a;
                lz2.h(((ec1) obj2).P(), "onDisplayToast called unexpectedly", null, 12);
                return j6g.a;
            case 6:
                BridgeDispatcher.c cVar = (BridgeDispatcher.c) obj2;
                et7 et7Var = (et7) obj;
                et7Var.getClass();
                if (et7Var instanceof et7.b) {
                    cVar.a(new PushAuthStatusResult(rm1.d(((et7.b) et7Var).a)));
                    return j6g.a;
                }
                if (et7Var instanceof et7.a) {
                    throw null;
                }
                l.g();
                return null;
            case 7:
                hr7 hr7Var = (hr7) obj;
                int i5 = ExternalActivity.H0;
                hr7Var.getClass();
                hr7Var.a("url", wea.i(false, (Uri) obj2));
                return j6g.a;
            case 8:
                return Integer.valueOf(((ou6) ((ArrayList) obj2).get(((Integer) obj).intValue())).a);
            case DatadogLogGenerator.CRASH /* 9 */:
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = (IndeedApplyWebViewFragment) obj2;
                h63 h63Var = (h63) obj;
                if (wl7.b(h63Var, h63.b.a)) {
                    ((gme) indeedApplyWebViewFragment.Q().X).setValue(Boolean.TRUE);
                } else if (h63Var instanceof h63.c) {
                    indeedApplyWebViewFragment.requireContext().startActivity(((h63.c) h63Var).a);
                } else if (!wl7.b(h63Var, h63.a.a)) {
                    l.g();
                    return null;
                }
                return j6g.a;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                ((h5b) obj2).R(str2);
                return j6g.a;
            case 11:
                p9d p9dVarR = ((crb) obj2).R();
                Uri uri = Uri.EMPTY;
                uri.getClass();
                p9dVarR.j(uri, "");
                return j6g.a;
            case 12:
                sl8 sl8Var = (sl8) obj;
                sl8Var.getClass();
                ((Function1) obj2).invoke(new th7(sl8Var.a()));
                return j6g.a;
            case 13:
                return RNTareBridge.readableMapToJSTParamsBuilder$lambda$15((ReadableMap) obj2, (hr7) obj);
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                j4e j4eVar = (j4e) obj2;
                if (j4eVar.a.b().a(((Long) obj).longValue())) {
                    ((gme) j4eVar.n).setValue(j6g.a);
                    j4eVar.n();
                    j4eVar.p();
                }
                return j6g.a;
            case 15:
                x8f x8fVar = (x8f) obj2;
                String str3 = (String) obj;
                str3.getClass();
                rq7 rq7Var = (rq7) cr8.p(rq7.class);
                lr5 lr5VarU = x8fVar.requireActivity().u();
                lr5VarU.getClass();
                rq7Var.f(lr5VarU, mh2.k(x8fVar), new jq7.p(str3), "tare-debug-screen");
                return j6g.a;
            default:
                a aVar = (a) obj2;
                ((Boolean) obj).getClass();
                int i6 = a.H0;
                dd4 dd4Var = dd4.a;
                if (dd4.b()) {
                    xa6.b((xa6) aVar.q0.getValue(), new wm1(aVar, 20), false, new cj(aVar, i2), new o91(aVar, 28), 18);
                } else {
                    ((ua6) aVar.p0.getValue()).c(false, new ji(aVar, 17));
                }
                return j6g.a;
        }
    }
}
