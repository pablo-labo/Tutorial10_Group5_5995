package defpackage;

import androidx.compose.ui.layout.w;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.reactnative.rntarebridge.nav.RNJSTNavigator;
import defpackage.oq7;
import defpackage.sp7;
import defpackage.wle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wi implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        z = true;
        boolean z2 = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((luc) obj2).element = (String) obj;
                return j6g.a;
            case 1:
                sa0 sa0Var = (sa0) obj2;
                qme qmeVar = sa0Var.e;
                qmeVar.getClass();
                wle.a aVar = wle.e;
                ey eyVar = qmeVar.d;
                aVar.getClass();
                qmeVar.h = wle.a.d(eyVar);
                return new za0(sa0Var);
            case 2:
                tb2 tb2Var = (tb2) obj2;
                gu5<j6g> gu5Var = tb2Var.z0;
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                if (tb2Var.A0) {
                    ((yf6) om2.a(tb2Var, um2.l)).a(0);
                }
                return j6g.a;
            case 3:
                o03 o03Var = (o03) obj2;
                List list = (List) obj;
                if (o03Var.h0.d() != null) {
                    nif nifVarD = o03Var.h0.d();
                    nifVarD.getClass();
                    list.add(nifVarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                of4 of4Var = (of4) obj2;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab-edit-accounting-license", "delete", null, null, 12));
                of4Var.Q().l((String) obj, new la(of4Var, 4));
                return j6g.a;
            case 5:
                return o6.a((p63) obj, (t41) obj2);
            case 6:
                ut5 ut5Var = (ut5) obj2;
                DisplayToastData displayToastData = (DisplayToastData) obj;
                displayToastData.getClass();
                vq5 vq5Var = ut5Var.a0;
                vq5Var.getClass();
                vq5Var.b.setContent(new ah2(-2075587237, new jh(3, displayToastData, ut5Var), true));
                vq5 vq5Var2 = ut5Var.a0;
                vq5Var2.getClass();
                vq5Var2.b.setVisibility(0);
                return j6g.a;
            case 7:
                qj6 qj6Var = (qj6) obj2;
                int i2 = qj6.r0;
                ArrayList arrayList = lz2.a;
                lz2.d("HomeTabWebViewFragment", "deepLinkLoadCompleteEvent fired. tryInitializeWebView()...", false, null);
                lz2.d("HomeTabWebViewFragment", qj6Var.G().l(qj6Var.P(), new jr(z ? 1 : 0)) ? "Initialization started." : "Already initialized.", false, null);
                zo6.a.getClass();
                LinkedHashMap linkedHashMap = iq6.b;
                xj1 xj1Var = xj1.b;
                if (linkedHashMap.containsKey(xj1Var)) {
                    linkedHashMap.remove(xj1Var);
                }
                ((ik3) qj6Var.k0.getValue()).b = false;
                ((d1g) qj6Var.j0.getValue()).c = false;
                lz2.d("HomeTabWebViewFragment", "Deep link handling marked as completed.", false, null);
                return j6g.a;
            case 8:
                return RNJSTNavigator.openModal$lambda$15$lambda$7((Promise) obj2, (oq7.k) obj);
            case DatadogLogGenerator.CRASH /* 9 */:
                ((Boolean) obj).booleanValue();
                ((Function1) obj2).invoke(tzc.b);
                return j6g.a;
            case 10:
                xpc xpcVar = (xpc) obj2;
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null && !wl7.b(weakReference.get(), xpcVar)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                w.a.y((w.a) obj, (w) obj2, 0, 0);
                return j6g.a;
        }
    }
}
