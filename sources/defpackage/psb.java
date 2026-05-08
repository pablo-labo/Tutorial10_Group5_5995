package defpackage;

import androidx.compose.foundation.a;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class psb implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ psb(o97 o97Var, String str, e eVar) {
        this.b = o97Var;
        this.c = str;
        this.d = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                o97 o97Var = (o97) obj5;
                String str = (String) obj4;
                e eVar = (e) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bVar.L(1763886368);
                    o97.a aVar = o97Var.c;
                    e.a aVar2 = e.a.b;
                    e eVarN = g.n(aVar2, 128.0f);
                    androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
                    af1 af1Var = c20.a.e;
                    e eVarH = bVar2.h(eVarN, af1Var);
                    fgd fgdVar = ggd.a;
                    e eVarH2 = ygg.h(eVarH, fgdVar);
                    o97.a.b bVar3 = aVar.c;
                    o97.a.C0340a c0340a = aVar.b;
                    e eVarB = a.b(ti1.a(eVarH2, 3.0f, bVar3.b, fgdVar), c0340a.b, ytc.a);
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new nf(21);
                        bVar.p(objV);
                    }
                    e eVarF = f.f(b5e.a(eVarB, (Function1) objV), 8.0f);
                    ag9 ag9VarD = hl1.d(af1Var, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar3);
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
                    if (v1c.h(str)) {
                        bVar.L(-1671565586);
                        if (str == null) {
                            str = "";
                        }
                        vr6.a(v51.LARGE, u51.a, eVar, str, null, bVar, 438, 32);
                        bVar.F();
                    } else {
                        bVar.L(-1671171452);
                        wq6.b(z2b.a(R.drawable.ic_idl_profile_filled, 0, bVar), null, bVar2.h(g.d(aVar2, 0.6f), af1Var), c0340a.f.a, bVar, 48, 0);
                        bVar = bVar;
                        bVar.F();
                    }
                    bVar.q();
                    bVar.F();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ((yxb) obj5).e(ka2.L(55), (gu5) obj3, (b) obj, (Function1) obj4);
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                i9d.a((String) obj4, (Long) obj5, (gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                Function1 function1 = (Function1) obj5;
                ig3 ig3Var = (ig3) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar4 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objV2 = bVar4.v();
                    if (objV2 == c0020a) {
                        objV2 = new ug4(3, g4aVar);
                        bVar4.p(objV2);
                    }
                    ngg.a(function1, ig3Var, null, (Function1) objV2, bVar4, 24582, 8);
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ psb(yxb yxbVar, Function1 function1, gu5 gu5Var, int i) {
        this.b = yxbVar;
        this.c = function1;
        this.d = gu5Var;
    }

    public /* synthetic */ psb(String str, Long l, gu5 gu5Var, int i) {
        this.c = str;
        this.b = l;
        this.d = gu5Var;
    }

    public /* synthetic */ psb(Function1 function1, ig3 ig3Var, g4a g4aVar) {
        this.b = function1;
        this.c = ig3Var;
        this.d = g4aVar;
    }
}
