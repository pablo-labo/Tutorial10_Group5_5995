package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.s87;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pr implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((sr) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                sx1.a((tx1) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                IanMainFragment ianMainFragment = (IanMainFragment) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    if (((Boolean) ((gme) ((thb) ianMainFragment.o0.getValue()).b).getValue()).booleanValue()) {
                        bVar.L(183732554);
                        shb.a(0, bVar);
                    } else {
                        bVar.L(162366827);
                    }
                    bVar.F();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                ((t78) obj3).M(ka2.L(1), (b) obj);
                return j6g.a;
            case 4:
                o97 o97Var = (o97) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ev6.a(fv6.W1, null, null, null, o97Var.c.a.b, ak2.I(R.string.desc_close, bVar2), null, bVar2, 6, 78);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 5:
                xac xacVar = (xac) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g4a g4aVarA = r.a(((d4g) xacVar.W.getValue()).c, bVar3);
                    b4g.p(((c4g) g4aVarA.getValue()).b, ((c4g) g4aVarA.getValue()).c, ((c4g) g4aVarA.getValue()).a, ((c4g) g4aVarA.getValue()).d, false, bVar3, 0, 48);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 6:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj3;
                String str = (String) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                str.getClass();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), audVarH.b.l(ak2.M(SearchType.b), "recent-search-item", zr4.a, m93.c));
                searchOverlayFragment.I().q(iIntValue4, str);
                return j6g.a;
            default:
                String str2 = (String) obj3;
                b bVar4 = (b) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e.a aVar = e.a.b;
                    e eVarJ = f.j(aVar, 0.0f, 8.0f, 0.0f, 10.0f, 5);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar4.k());
                    t8b t8bVarM = bVar4.m();
                    e eVarC = c.c(bVar4, eVarJ);
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
                    ygg.y(bVar4, ag9VarD, gl2.a.g);
                    ygg.y(bVar4, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar4, iHashCode, c0251a);
                    }
                    ygg.y(bVar4, eVarC, gl2.a.d);
                    vq6.b(z2b.a(R.drawable.ic_idl_native_android_arrow_back_24, 0, bVar4), str2, g.n(aVar, 24.0f), eu6.k, bVar4, 384, 0);
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ pr(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
