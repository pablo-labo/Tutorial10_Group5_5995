package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.ig3;
import defpackage.o97;
import defpackage.pm8;
import defpackage.v94;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class va implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ va(int i, gu5 gu5Var, e eVar, String str) {
        this.a = 2;
        this.b = str;
        this.c = gu5Var;
        this.d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        e.a aVar;
        e eVarA;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                b5g b5gVar = (b5g) obj5;
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarA2 = nub.a(nub.b(g.d(f.h(e.a.b, v1c.e, 0.0f, 2), 1.0f)), b5gVar == b5g.c, "Add accounting license failed", oub.SAVE);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA2);
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
                    ig3.b bVar2 = ((ig3) g4aVar.getValue()).c;
                    s38 s38Var = bVar2 != null ? bVar2.b : null;
                    ig3.b bVar3 = ((ig3) g4aVar.getValue()).c;
                    tg3 tg3Var = new tg3(Boolean.FALSE, s38Var, bVar3 != null ? bVar3.c : null);
                    String strI = ak2.I(jv8.c.a(), bVar);
                    Object objV = bVar.v();
                    if (objV == c0020a) {
                        objV = new lb(g4aVar, i2);
                        bVar.p(objV);
                    }
                    Function2 function2 = (Function2) objV;
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new mb(0, g4aVar2);
                        bVar.p(objV2);
                    }
                    gz9.b(tg3Var, function2, strI, false, (Function1) objV2, 10, bVar, 14377008, 8);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ja4 ja4Var = (ja4) obj5;
                kuc kucVar = (kuc) obj4;
                ymg ymgVar = (ymg) obj3;
                yeb yebVar = (yeb) obj;
                ooa ooaVar = (ooa) obj2;
                long jV = us3.e(ja4Var).v(0L);
                if (!ooa.c(jV, kucVar.element)) {
                    ja4Var.m0 = ooa.f(ja4Var.m0, ooa.e(jV, kucVar.element));
                }
                kucVar.element = jV;
                beb.b(ymgVar, yebVar, ja4Var.m0);
                go1 go1Var = ja4Var.j0;
                if (go1Var != null) {
                    go1Var.f(new v94.b(ooaVar.a));
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                yye.a(ka2.L(1), (gu5) obj4, (b) obj, (e) obj3, (String) obj5);
                return j6g.a;
            default:
                o97 o97Var = (o97) obj5;
                raa raaVar = (raa) obj4;
                sof sofVar = (sof) obj3;
                b bVar4 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar4.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o97.g gVar = o97Var.i;
                    o97.a.e eVar = o97Var.c.a;
                    e.a aVar3 = e.a.b;
                    e eVarC2 = g.c(f.j(aVar3, 0.0f, 0.0f, 16.0f, 0.0f, 11), 1.0f);
                    ehd ehdVarA = chd.a(new vs0.i(12.0f, true, new us0(i2)), c20.a.k, bVar4, 48);
                    int iG = bVar4.G();
                    t8b t8bVarM2 = bVar4.m();
                    e eVarC3 = c.c(bVar4, eVarC2);
                    gl2.j.getClass();
                    pm8.a aVar4 = gl2.a.b;
                    if (bVar4.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar4.B();
                    if (bVar4.f()) {
                        bVar4.y(aVar4);
                    } else {
                        bVar4.n();
                    }
                    ygg.y(bVar4, ehdVarA, gl2.a.g);
                    ygg.y(bVar4, t8bVarM2, gl2.a.f);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar4.f() || !wl7.b(bVar4.v(), Integer.valueOf(iG))) {
                        uz.g(iG, bVar4, iG, c0251a2);
                    }
                    ygg.y(bVar4, eVarC3, gl2.a.d);
                    if (raaVar != null) {
                        bVar4.L(589296676);
                        b4g.l(null, raaVar.e, raaVar.b, raaVar.f, bVar4, 0, 1);
                        bVar4.F();
                    } else {
                        bVar4.L(589597221);
                        Integer num = sofVar.c;
                        if (num == null) {
                            bVar4.L(589620222);
                            bVar4.F();
                            aVar = aVar3;
                        } else {
                            bVar4.L(589620223);
                            aVar = aVar3;
                            f17.a(z2b.a(num.intValue(), 0, bVar4), "", g.c(aVar3, 1.0f), null, null, 0.0f, new ih1(eVar.c, 5), bVar4, 432, 56);
                            bVar4 = bVar4;
                            bVar4.F();
                        }
                        String str = sofVar.a;
                        if (str == null) {
                            bVar4.L(590039559);
                            bVar4.F();
                        } else {
                            bVar4.L(590039560);
                            tjf tjfVarA = tjf.a(o97Var.j.e, 0L, 0L, o97Var.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                            long j = eVar.c;
                            String str2 = sofVar.d;
                            if (str2 == null || (eVarA = androidx.compose.ui.platform.f.a(aVar, str2)) == null) {
                                eVarA = aVar;
                            }
                            boolean zK = bVar4.K(sofVar);
                            Object objV3 = bVar4.v();
                            if (zK || objV3 == c0020a) {
                                objV3 = new ji(sofVar, 16);
                                bVar4.p(objV3);
                            }
                            b bVar5 = bVar4;
                            cif.b(str, b5e.b(eVarA, false, (Function1) objV3), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar5, 0, 0, 65528);
                            bVar4 = bVar5;
                            bVar4.F();
                            j6g j6gVar = j6g.a;
                        }
                        bVar4.F();
                    }
                    bVar4.q();
                } else {
                    bVar4.D();
                }
                return j6g.a;
        }
    }

    public /* synthetic */ va(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
