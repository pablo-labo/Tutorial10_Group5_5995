package defpackage;

import android.content.Intent;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.results.PushAuthStatusResult;
import defpackage.et7;
import defpackage.ke9;
import defpackage.lx5;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        boolean z2 = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                du duVar = (du) obj2;
                n5b n5bVar = (n5b) obj;
                n5bVar.getClass();
                yvb yvbVarQ = duVar.Q();
                x9 x9Var = new x9(z ? 1 : 0, duVar, n5bVar);
                if (yvbVarQ.v().s) {
                    x9Var.invoke();
                } else {
                    String str = yvbVarQ.v().a;
                    if (str != null) {
                        ((gme) yvbVarQ.e).setValue(b5g.b);
                        u63.Y(ee3.p(yvbVarQ), null, null, new zvb(yvbVarQ, n5bVar, str, x9Var, null), 3);
                    }
                }
                return j6g.a;
            case 1:
                int i2 = ec1.s0;
                ((nhb) obj).getClass();
                ArrayList arrayList = lz2.a;
                lz2.b(((ec1) obj2).P(), "onPostApplyRequest is called unexpectedly", false, new Exception());
                return j6g.a;
            case 2:
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
            case 3:
                ((gu5) obj2).invoke();
                return j6g.a;
            case 4:
                iba ibaVar = (iba) obj2;
                ((m74) obj).getClass();
                oi4 oi4Var = new oi4();
                ibaVar.b(oi4Var);
                return new mh4(z2 ? 1 : 0, ibaVar, oi4Var);
            case 5:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                Function1<hr7, j6g> function1 = ((sp7.b) obj2).a;
                if (function1 != null) {
                    function1.invoke(new vp7(bVar));
                }
                return j6g.a;
            case 6:
                ikd ikdVar = (ikd) obj2;
                return Boolean.valueOf(ikdVar != null ? ikdVar.a(obj) : true);
            case 7:
                bhd bhdVar = (bhd) ((List) obj2).get(((Integer) obj).intValue());
                return z3.m(bhdVar.a, ":", bhdVar.d);
            case 8:
                return ((ke9.b) obj2).b(((Integer) obj).intValue());
            case DatadogLogGenerator.CRASH /* 9 */:
                b8a b8aVar = (b8a) obj2;
                int i3 = b8a.o0;
                if (new d8c(w8c.c).c(xj1.c, false)) {
                    b8aVar.R().h(s8c.WEBVIEW_MYJOBS);
                } else {
                    b8aVar.R().g(false);
                }
                return j6g.a;
            case 10:
                h5b h5bVar = (h5b) obj2;
                Intent intent = (Intent) obj;
                intent.getClass();
                ((gme) h5bVar.P().e).setValue(Boolean.TRUE);
                h5bVar.u0.a(intent);
                return j6g.a;
            case 11:
                return Boolean.valueOf(((Collection) obj2).contains(obj));
            case 12:
                String str2 = (String) obj;
                str2.getClass();
                ((yvb) obj2).o(str2);
                return j6g.a;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                ((f51) obj2).y(str3, null);
                return j6g.a;
            default:
                Exception exc = (Exception) obj;
                exc.getClass();
                ((SearchOverlayFragment) obj2).H().getClass();
                ArrayList arrayList2 = lz2.a;
                lz2.b("SearchOverlayFragment", "InputMethodManager Reflection Error", false, exc);
                return j6g.a;
        }
    }
}
