package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.ft2;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oc7 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ vu5 f;

    public /* synthetic */ oc7(o97 o97Var, jqg jqgVar, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3) {
        this.c = o97Var;
        this.d = jqgVar;
        this.b = gu5Var;
        this.e = gu5Var2;
        this.f = gu5Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gu5 gu5Var;
        jqg jqgVar;
        o97 o97Var;
        gu5 gu5Var2;
        gl2.a.f fVar;
        b bVar;
        gl2.a.C0251a c0251a;
        pm8.a aVar;
        gl2.a.d dVar;
        float f;
        androidx.compose.runtime.b bVar2;
        int i;
        b bVar3;
        int i2;
        int i3 = this.a;
        vu5 vu5Var = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                uc7.a((hw9) obj5, (String) obj4, (String) obj3, this.b, (ah2) vu5Var, (androidx.compose.runtime.b) obj, ka2.L(24585));
                return j6g.a;
            default:
                o97 o97Var2 = (o97) obj5;
                jqg jqgVar2 = (jqg) obj4;
                gu5 gu5Var3 = (gu5) obj3;
                gu5 gu5Var4 = (gu5) vu5Var;
                androidx.compose.runtime.b bVar4 = (androidx.compose.runtime.b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e.a aVar2 = e.a.b;
                    e eVarB = a.b(g.f(aVar2, 1.0f), o97Var2.c.b.a, ytc.a);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar4.k());
                    t8b t8bVarM = bVar4.m();
                    e eVarC = c.c(bVar4, eVarB);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar3);
                    } else {
                        bVar4.n();
                    }
                    gl2.a.d dVar2 = gl2.a.g;
                    ygg.y(bVar4, ag9VarD, dVar2);
                    gl2.a.f fVar2 = gl2.a.f;
                    ygg.y(bVar4, t8bVarM, fVar2);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar4, iHashCode, c0251a2);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar4, eVarC, eVar);
                    boolean z = jqgVar2.b;
                    float f2 = jqgVar2.i;
                    b bVar5 = b.a;
                    if (z) {
                        bVar4.L(-1934852190);
                        bVar2 = bVar4;
                        gu5Var = gu5Var4;
                        i = -1940874467;
                        o97Var = o97Var2;
                        c0251a = c0251a2;
                        jqgVar = jqgVar2;
                        f = f2;
                        gu5Var2 = gu5Var3;
                        fVar = fVar2;
                        bVar = bVar5;
                        dVar = dVar2;
                        aVar = aVar3;
                        rq6.b(this.b, bVar5.h(aVar2, c20.a.d), false, null, null, ypd.d, bVar2, 196608, 28);
                    } else {
                        gu5Var = gu5Var4;
                        jqgVar = jqgVar2;
                        o97Var = o97Var2;
                        gu5Var2 = gu5Var3;
                        fVar = fVar2;
                        bVar = bVar5;
                        c0251a = c0251a2;
                        aVar = aVar3;
                        dVar = dVar2;
                        f = f2;
                        bVar2 = bVar4;
                        i = -1940874467;
                        bVar2.L(-1940874467);
                    }
                    bVar2.F();
                    if (f > 0.0f) {
                        bVar2.L(-1934328600);
                        androidx.compose.runtime.b bVar6 = bVar2;
                        i2 = 0;
                        f17.a(z2b.a(R.drawable.ic_grabber, 0, bVar2), null, f.a(ygg.g(androidx.compose.foundation.layout.f.f(bVar.h(aVar2, c20.a.b), 12.0f), f), "Grabber"), null, ft2.a.b, 0.0f, null, bVar6, 24624, 104);
                        bVar2 = bVar6;
                        bVar2.F();
                        bVar3 = bVar;
                    } else {
                        bVar3 = bVar;
                        i2 = 0;
                        bVar2.L(i);
                        bVar2.F();
                    }
                    e eVarH = bVar3.h(aVar2, c20.a.f);
                    ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, i2);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarH);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ehdVarA, dVar);
                    ygg.y(bVar2, t8bVarM2, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                    }
                    ygg.y(bVar2, eVarC2, eVar);
                    jqg jqgVar3 = jqgVar;
                    if (jqgVar3.a) {
                        bVar2.L(-824573382);
                        androidx.compose.runtime.b bVar7 = bVar2;
                        b07.b(ak2.I(R.string.share_tooltip, bVar2), pnf.c, ee1.d(jqgVar3.j, bVar2, 4), null, 0.0f, "ShareButtonTooltip", bh2.c(-616993301, new e24(gu5Var), bVar2), bVar7, 14156208, 48);
                        bVar2 = bVar7;
                    } else {
                        bVar2.L(-831843719);
                    }
                    bVar2.F();
                    if (jqgVar3.f) {
                        bVar2.L(-823489312);
                        androidx.compose.runtime.b bVar8 = bVar2;
                        rq6.b(gu5Var2, null, false, null, null, bh2.c(1851439416, new gu(6, jqgVar3, o97Var), bVar2), bVar8, 196608, 30);
                        bVar2 = bVar8;
                    } else {
                        bVar2.L(-831843719);
                    }
                    bVar2.F();
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ oc7(hw9 hw9Var, String str, String str2, gu5 gu5Var, ah2 ah2Var, int i) {
        this.c = hw9Var;
        this.d = str;
        this.e = str2;
        this.b = gu5Var;
        this.f = ah2Var;
    }
}
