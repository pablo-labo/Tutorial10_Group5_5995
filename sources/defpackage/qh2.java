package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qh2 implements wu5 {
    public final /* synthetic */ int a;

    public /* synthetic */ qh2(int i) {
        this.a = i;
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        byte b = 0;
        switch (this.a) {
            case 0:
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    cf6.a(0, bVar);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (!bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                bka bkaVar = (bka) obj;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                bkaVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= bVar3.K(bkaVar) ? 4 : 2;
                }
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    aka.b(bkaVar, bVar3, iIntValue3 & 14);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e.a aVar = e.a.b;
                    e eVarF = f.f(aVar, 16.0f);
                    ob2 ob2VarA = mb2.a(new vs0.i(3.0f, true, new us0(b == true ? 1 : 0)), c20.a.m, bVar4, 6);
                    int iHashCode = Long.hashCode(bVar4.k());
                    t8b t8bVarM = bVar4.m();
                    e eVarC = c.c(bVar4, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar2);
                    } else {
                        bVar4.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar4, ob2VarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar4, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar4, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar4, eVarC, eVar);
                    ehd ehdVarA = chd.a(vs0.h, c20.a.k, bVar4, 54);
                    int iHashCode2 = Long.hashCode(bVar4.k());
                    t8b t8bVarM2 = bVar4.m();
                    e eVarC2 = c.c(bVar4, aVar);
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar2);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA, dVar);
                    ygg.y(bVar4, t8bVarM2, fVar);
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar4, iHashCode2, c0251a);
                    }
                    ygg.y(bVar4, eVarC2, eVar);
                    hl1.a(a.a(f.f(g.h(g.r(aVar, 220.0f), 30.0f), 2.0f), kee.c(bVar4), null, 6), bVar4, 0);
                    jh2.f(bVar4, new LayoutWeightElement(1.0f, true));
                    hl1.a(a.a(f.f(g.h(g.r(aVar, 20.0f), 20.0f), 2.0f), kee.c(bVar4), null, 6), bVar4, 0);
                    bVar4.q();
                    hl1.a(a.a(f.f(g.h(g.r(aVar, 200.0f), 25.0f), 2.0f), kee.c(bVar4), null, 6), bVar4, 0);
                    hl1.a(a.a(f.f(g.h(g.r(aVar, 75.0f), 25.0f), 2.0f), kee.c(bVar4), null, 6), bVar4, 0);
                    Object objV = bVar4.v();
                    if (objV == b.a.a) {
                        objV = new bo0(2);
                        bVar4.p(objV);
                    }
                    kee.a((gu5) objV, bVar4, 6);
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                String str = (String) obj;
                Activity activity = (Activity) obj2;
                Promise promise = (Promise) obj3;
                if (!(activity instanceof LaunchActivity)) {
                    b0.p("No main activity in App", promise);
                    return j6g.a;
                }
                String queryParameter = Uri.parse(str).getQueryParameter("continueUrl");
                lr5 lr5VarU = ((LaunchActivity) activity).u();
                lr5VarU.getClass();
                qa qaVar = new qa(promise, 21);
                ry ryVar = new ry(10, queryParameter, promise);
                str.getClass();
                IndeedApplyWebViewFragment indeedApplyWebViewFragment = new IndeedApplyWebViewFragment();
                Bundle bundle = new Bundle();
                bundle.putString("KEY_APPLY_URL", str);
                indeedApplyWebViewFragment.setArguments(bundle);
                indeedApplyWebViewFragment.G0 = qaVar;
                indeedApplyWebViewFragment.H0 = ryVar;
                indeedApplyWebViewFragment.L(lr5VarU, "IndeedApplyWebViewFragment");
                return j6g.a;
        }
    }
}
