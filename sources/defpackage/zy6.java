package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.input.key.a;
import androidx.compose.ui.platform.f;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zy6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ lj8 V;
    public final /* synthetic */ String W;
    public final /* synthetic */ String X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ int a0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int b0;
    public final /* synthetic */ fm5 c;
    public final /* synthetic */ o97 c0;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1<String, j6g> d0;
    public final /* synthetic */ Function1<Boolean, j6g> e;
    public final /* synthetic */ fh8 e0;
    public final /* synthetic */ sm5 f;
    public final /* synthetic */ yg8 f0;
    public final /* synthetic */ ftg g0;
    public final /* synthetic */ d3a h0;
    public final /* synthetic */ g4a<jhf> i0;
    public final /* synthetic */ g4a<Boolean> j0;
    public final /* synthetic */ fv6 k0;
    public final /* synthetic */ ar6 l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ String o0;
    public final /* synthetic */ zrd p0;
    public final /* synthetic */ String q0;
    public final /* synthetic */ long r0;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;

    public zy6(String str, boolean z, fm5 fm5Var, float f, Function1 function1, sm5 sm5Var, lj8 lj8Var, String str2, String str3, boolean z2, String str4, int i, int i2, o97 o97Var, Function1 function12, fh8 fh8Var, yg8 yg8Var, ftg ftgVar, d3a d3aVar, g4a g4aVar, g4a g4aVar2, fv6 fv6Var, ar6 ar6Var, boolean z3, String str5, String str6, zrd zrdVar, String str7, long j, long j2, long j3, long j4) {
        this.a = str;
        this.b = z;
        this.c = fm5Var;
        this.d = f;
        this.e = function1;
        this.f = sm5Var;
        this.V = lj8Var;
        this.W = str2;
        this.X = str3;
        this.Y = z2;
        this.Z = str4;
        this.a0 = i;
        this.b0 = i2;
        this.c0 = o97Var;
        this.d0 = function12;
        this.e0 = fh8Var;
        this.f0 = yg8Var;
        this.g0 = ftgVar;
        this.h0 = d3aVar;
        this.i0 = g4aVar;
        this.j0 = g4aVar2;
        this.k0 = fv6Var;
        this.l0 = ar6Var;
        this.m0 = z3;
        this.n0 = str5;
        this.o0 = str6;
        this.p0 = zrdVar;
        this.q0 = str7;
        this.r0 = j;
        this.s0 = j2;
        this.t0 = j3;
        this.u0 = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        jhf jhfVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        o97 o97Var = this.c0;
        o97.a aVar = o97Var.c;
        if ((iIntValue & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            g4a<jhf> g4aVar = this.i0;
            jhf value = g4aVar.getValue();
            String str = this.a;
            String strConcat = str.concat("_TextField");
            e eVarB = e.a.b;
            e eVarA = f.a(eVarB, strConcat);
            bVar2.L(56962094);
            boolean z = this.b;
            b.a.C0020a c0020a = b.a.a;
            if (!z) {
                bVar2.L(5004770);
                fm5 fm5Var = this.c;
                boolean zX = bVar2.x(fm5Var);
                Object objV = bVar2.v();
                if (zX || objV == c0020a) {
                    objV = new uy6(fm5Var);
                    bVar2.p(objV);
                }
                bVar2.F();
                eVarB = a.b(eVarB, (Function1) objV);
            }
            bVar2.F();
            int i = 1;
            e eVarF = g.f(g.q(g.j(eVarA.o(eVarB), 0.0f, this.d, 1), 0.0f, 0.0f, 488.0f, 0.0f, 11), 1.0f);
            bVar2.L(-1746271574);
            Function1<Boolean, j6g> function1 = this.e;
            boolean zK = bVar2.K(function1);
            Object objV2 = bVar2.v();
            if (zK || objV2 == c0020a) {
                objV2 = new uz4(i, function1, this.j0, g4aVar);
                bVar2.p(objV2);
            }
            bVar2.F();
            e eVarA2 = c.a(androidx.compose.ui.focus.a.a(eVarF, (Function1) objV2), this.f);
            boolean z2 = !z;
            bVar2.L(-1224400529);
            boolean zK2 = bVar2.K(this.V) | bVar2.K(this.W) | bVar2.K(this.X) | bVar2.a(this.Y) | bVar2.K(this.Z);
            Object objV3 = bVar2.v();
            if (zK2 || objV3 == c0020a) {
                final boolean z3 = this.Y;
                final String str2 = this.Z;
                final lj8 lj8Var = this.V;
                final String str3 = this.X;
                jhfVar = value;
                final String str4 = this.W;
                Function1 function12 = new Function1() { // from class: ty6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str5;
                        s5e s5eVar = (s5e) obj;
                        s5eVar.getClass();
                        iy8 iy8VarS = u63.s();
                        lj8 lj8Var2 = lj8Var;
                        if (lj8Var2 != null && (str5 = lj8Var2.a) != null) {
                            iy8VarS.add(str5);
                            if (lj8Var2.b) {
                                iy8VarS.add(str4);
                            }
                        }
                        String str6 = str3;
                        if (str6 != null) {
                            iy8VarS.add(str6);
                        }
                        o5e.f(s5eVar, z92.W0(iy8VarS.l(), "\n", null, null, null, 62));
                        if (z3) {
                            o5e.a(s5eVar, str2);
                        }
                        return j6g.a;
                    }
                };
                bVar2.p(function12);
                objV3 = function12;
            } else {
                jhfVar = value;
            }
            bVar2.F();
            e eVarB2 = b5e.b(eVarA2, z2, (Function1) objV3);
            int i2 = z ? 1 : this.a0;
            int i3 = z ? 1 : this.b0;
            kne kneVar = new kne(aVar.a.g.c);
            tjf tjfVarA = tjf.a(o97Var.j.f, aVar.a.c, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214);
            bVar2.L(-1633490746);
            Function1<String, j6g> function13 = this.d0;
            boolean zK3 = bVar2.K(function13);
            Object objV4 = bVar2.v();
            if (zK3 || objV4 == c0020a) {
                objV4 = new bf(4, function13, g4aVar);
                bVar2.p(objV4);
            }
            Function1 function14 = (Function1) objV4;
            bVar2.F();
            long j = this.t0;
            long j2 = this.u0;
            fv6 fv6Var = this.k0;
            ar6 ar6Var = this.l0;
            boolean z4 = this.m0;
            Function1<String, j6g> function15 = this.d0;
            String str5 = this.n0;
            boolean z5 = this.b;
            d3a d3aVar = this.h0;
            cd1.a(jhfVar, function14, eVarB2, false, false, tjfVarA, this.e0, this.f0, z5, i3, i2, this.g0, null, d3aVar, kneVar, bh2.c(-751518174, new yy6(fv6Var, ar6Var, str, o97Var, z4, function15, str5, z5, d3aVar, g4aVar, this.o0, this.p0, this.q0, this.Y, this.r0, this.s0, j, j2), bVar2), bVar2, 0, 196608, 4104);
        }
        return j6g.a;
    }
}
