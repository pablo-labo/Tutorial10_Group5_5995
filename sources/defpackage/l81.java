package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l81 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l81(gu5 gu5Var, b5g b5gVar, Function1 function1, g4a g4aVar, g4a g4aVar2) {
        this.b = gu5Var;
        this.d = b5gVar;
        this.c = function1;
        this.e = g4aVar;
        this.f = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m81.a((String) obj5, (List) obj3, this.c, (String) obj4, this.b, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                b5g b5gVar = (b5g) obj5;
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o97 o97Var = (o97) bVar.M(p97.a);
                    e.a aVar = e.a.b;
                    e eVarF = g.f(aVar, 1.0f);
                    o97.g gVar = o97Var.i;
                    e eVarM = pnb.M(f.h(eVarF, 16.0f, 0.0f, 2), pnb.L(0, 1, bVar), true);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarM);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    fw6.a(ak2.I(R.string.commute_time_description, bVar), f.j(aVar, 0.0f, 24.0f, 0.0f, 0.0f, 13), null, null, false, null, bh2.c(1985018593, new b52(o97Var, g4aVar), bVar), bVar, 1572864, 60);
                    bVar.q();
                    boolean zBooleanValue = ((Boolean) g4aVar2.getValue()).booleanValue();
                    b.a.C0020a c0020a = b.a.a;
                    if (zBooleanValue) {
                        bVar.L(-1936222141);
                        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-tab-edit-language", "confirmation-alert", sp7.c.a.a, null, null, 24));
                        Object objV = bVar.v();
                        if (objV == c0020a) {
                            objV = new op0(3, g4aVar2);
                            bVar.p(objV);
                        }
                        gu5 gu5Var = (gu5) objV;
                        gu5 gu5Var2 = this.b;
                        boolean zK = bVar.K(gu5Var2);
                        Object objV2 = bVar.v();
                        if (zK || objV2 == c0020a) {
                            objV2 = new eh4(gu5Var2, g4aVar2, 1);
                            bVar.p(objV2);
                        }
                        r03.e(gu5Var, (gu5) objV2, bVar, 6);
                    } else {
                        bVar.L(-1945064767);
                    }
                    bVar.F();
                    if (b5gVar == b5g.c) {
                        bVar.L(-1935661196);
                        ((tp7) cr8.p(tp7.class)).b(new sp7.c("profile-preferences-tab-commute-time-preference", "error-toast", sp7.c.a.c, null, null, 24));
                        Function1 function1 = this.c;
                        boolean zK2 = bVar.K(function1);
                        Object objV3 = bVar.v();
                        if (zK2 || objV3 == c0020a) {
                            objV3 = new pa0(10, function1, g4aVar);
                            bVar.p(objV3);
                        }
                        rg0.a((gu5) objV3, bVar, 0);
                        bVar.F();
                    } else {
                        bVar.L(-1935116092);
                        jh2.f(bVar, g.h(aVar, v1c.d));
                        bVar.F();
                    }
                } else {
                    bVar.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ l81(String str, List list, Function1 function1, String str2, gu5 gu5Var, int i) {
        this.d = str;
        this.f = list;
        this.c = function1;
        this.e = str2;
        this.b = gu5Var;
    }
}
