package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.a;
import androidx.compose.ui.platform.f;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pw6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ String V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ jhf X;
    public final /* synthetic */ Function1<jhf, j6g> Y;
    public final /* synthetic */ kcf Z;
    public final /* synthetic */ o97 a;
    public final /* synthetic */ Function1<kcf, j6g> a0;
    public final /* synthetic */ float b;
    public final /* synthetic */ d3a b0;
    public final /* synthetic */ String c;
    public final /* synthetic */ g4a<Boolean> c0;
    public final /* synthetic */ Function1<Boolean, j6g> d;
    public final /* synthetic */ String d0;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    public pw6(o97 o97Var, float f, String str, Function1 function1, String str2, boolean z, String str3, boolean z2, jhf jhfVar, Function1 function12, kcf kcfVar, Function1 function13, d3a d3aVar, g4a g4aVar, String str4) {
        this.a = o97Var;
        this.b = f;
        this.c = str;
        this.d = function1;
        this.e = str2;
        this.f = z;
        this.V = str3;
        this.W = z2;
        this.X = jhfVar;
        this.Y = function12;
        this.Z = kcfVar;
        this.a0 = function13;
        this.b0 = d3aVar;
        this.c0 = g4aVar;
        this.d0 = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            o97 o97Var = this.a;
            o97.h hVar = o97Var.j;
            o97.a.e eVar = o97Var.c.a;
            tjf tjfVarA = tjf.a(hVar.f, eVar.c, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214);
            e eVarF = g.f(f.a(g.h(e.a.b, this.b), this.c.concat("_TextField")), 1.0f);
            bVar2.L(-1633490746);
            Function1<Boolean, j6g> function1 = this.d;
            boolean zK = bVar2.K(function1);
            Object objV = bVar2.v();
            g4a<Boolean> g4aVar = this.c0;
            b.a.C0020a c0020a = b.a.a;
            if (zK || objV == c0020a) {
                objV = new w34(3, function1, g4aVar);
                bVar2.p(objV);
            }
            bVar2.F();
            e eVarA = a.a(eVarF, (Function1) objV);
            bVar2.L(-1224400529);
            final String str = this.e;
            boolean zK2 = bVar2.K(str);
            final boolean z = this.f;
            boolean zA = zK2 | bVar2.a(z);
            final String str2 = this.V;
            boolean zK3 = zA | bVar2.K(str2) | bVar2.K(null);
            final boolean z2 = this.W;
            boolean zA2 = zK3 | bVar2.a(z2) | bVar2.K(null);
            Object objV2 = bVar2.v();
            if (zA2 || objV2 == c0020a) {
                objV2 = new Function1() { // from class: mw6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        s5e s5eVar = (s5e) obj;
                        s5eVar.getClass();
                        iy8 iy8VarS = u63.s();
                        String str3 = str;
                        if (str3 != null) {
                            iy8VarS.add(str3);
                            if (z) {
                                iy8VarS.add(str2);
                            }
                        }
                        o5e.f(s5eVar, z92.W0(iy8VarS.l(), "\n", null, null, null, 62));
                        if (z2) {
                            o5e.a(s5eVar, null);
                        }
                        return j6g.a;
                    }
                };
                bVar2.p(objV2);
            }
            bVar2.F();
            e eVarB = b5e.b(eVarA, false, (Function1) objV2);
            kne kneVar = new kne(eVar.g.c);
            bVar2.L(-1224400529);
            jhf jhfVar = this.X;
            boolean zK4 = bVar2.K(jhfVar) | bVar2.K(this.Y) | bVar2.d(this.Z.ordinal()) | bVar2.K(this.a0);
            Object objV3 = bVar2.v();
            if (zK4 || objV3 == c0020a) {
                i83 i83Var = new i83(this.X, this.Y, this.Z, this.a0, g4aVar);
                bVar2.p(i83Var);
                objV3 = i83Var;
            }
            bVar2.F();
            String str3 = this.d0;
            d3a d3aVar = this.b0;
            ah2 ah2VarC = bh2.c(1714386706, new ow6(o97Var, jhfVar, d3aVar, str3), bVar2);
            cd1.a(this.X, (Function1) objV3, eVarB, true, false, tjfVarA, null, null, false, 0, 3, null, null, d3aVar, kneVar, ah2VarC, bVar2, 0, 199686, 7120);
        }
        return j6g.a;
    }
}
