package defpackage;

import android.graphics.drawable.Icon;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.cd4;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String str2 = (String) g4aVar.getValue();
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new ru(z ? 1 : 0, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function1 = (Function1) objV;
                    String strI = ak2.I(u5b.a.a(), bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new su(0, g4aVar);
                        bVar.p(objV2);
                    }
                    jyb.a(str2, function1, strI, true, str, false, null, null, (gu5) objV2, true, null, "AddPatentTitle", null, null, null, bVar, 905972784, 48, 29920);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ((rc1) obj4).b((gu5) obj3, (b) obj, ka2.L(7));
                return j6g.a;
            case 2:
                IanMainFragment ianMainFragment = (IanMainFragment) obj4;
                ComposeView composeView = (ComposeView) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ne4 ne4Var = p97.a;
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    ad4Var.e(cd4.a.D0);
                    cd4.i3.a.getClass();
                    rm2.a(ne4Var.a(h07.a), bh2.c(1498223601, new jd(4, ianMainFragment, composeView), bVar2), bVar2, 56);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$25((Promise) obj4, (RNProfileFormsModule) obj3, (hs7) obj, (xs7) obj2);
            case 4:
                ((Integer) obj2).getClass();
                gxc.k((gu5) obj4, (e) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            case 5:
                ((Integer) obj2).getClass();
                ((ddf) obj4).b((Icon) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            default:
                jqg jqgVar = (jqg) obj4;
                o97 o97Var = (o97) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fv6 fv6Var = fv6.c1;
                    ar6 ar6Var = wl7.b(jqgVar.g, Boolean.TRUE) ? ar6.Filled : ar6.Stroke;
                    String strI2 = ak2.I(R.string.save, bVar3);
                    o97.g gVar = o97Var.i;
                    ev6.b(fv6Var, f.j(e.a.b, 0.0f, 2.0f, 0.0f, 0.0f, 13), ar6Var, null, 0L, strI2, bVar3, 6, 24);
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ gu(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
