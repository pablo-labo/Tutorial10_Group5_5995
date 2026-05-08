package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.a;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class sv6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ d3a V;
    public final /* synthetic */ g4a<Boolean> W;
    public final /* synthetic */ String X;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o97 d;
    public final /* synthetic */ jhf e;
    public final /* synthetic */ Function1<jhf, j6g> f;

    public sv6(String str, String str2, boolean z, o97 o97Var, jhf jhfVar, Function1 function1, d3a d3aVar, g4a g4aVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = o97Var;
        this.e = jhfVar;
        this.f = function1;
        this.V = d3aVar;
        this.W = g4aVar;
        this.X = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        o97 o97Var = this.d;
        o97.a aVar = o97Var.c;
        if ((iIntValue & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVarF = g.f(e.a.b, 1.0f);
            bVar2.L(-1224400529);
            final String str = this.a;
            boolean zK = bVar2.K(str) | bVar2.a(false);
            final String str2 = this.b;
            boolean zK2 = zK | bVar2.K(str2);
            final boolean z = this.c;
            boolean zA = zK2 | bVar2.a(z) | bVar2.K(null);
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zA || objV == c0020a) {
                objV = new Function1(str, str2, z) { // from class: nv6
                    public final /* synthetic */ boolean a;
                    public final /* synthetic */ String b;

                    {
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        s5e s5eVar = (s5e) obj;
                        s5eVar.getClass();
                        iy8 iy8VarS = u63.s();
                        iy8VarS.add(this.b);
                        o5e.f(s5eVar, z92.W0(iy8VarS.l(), "\n", null, null, null, 62));
                        if (this.a) {
                            o5e.a(s5eVar, null);
                        }
                        return j6g.a;
                    }
                };
                bVar2.p(objV);
            }
            bVar2.F();
            e eVarB = b5e.b(eVarF, false, (Function1) objV);
            bVar2.L(5004770);
            Object objV2 = bVar2.v();
            if (objV2 == c0020a) {
                objV2 = new ug4(2, this.W);
                bVar2.p(objV2);
            }
            bVar2.F();
            e eVarA = a.a(eVarB, (Function1) objV2);
            kne kneVar = new kne(aVar.a.g.c);
            tjf tjfVarA = tjf.a(o97Var.j.f, aVar.a.c, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214);
            fh8 fh8Var = new fh8((Boolean) null, 4, 0, 123);
            String str3 = this.X;
            jhf jhfVar = this.e;
            d3a d3aVar = this.V;
            Function1<jhf, j6g> function1 = this.f;
            cd1.a(jhfVar, function1, eVarA, true, false, tjfVarA, fh8Var, null, false, 0, 0, null, null, d3aVar, kneVar, bh2.c(1799431664, new rv6(o97Var, jhfVar, d3aVar, str3, function1), bVar2), bVar2, 1572864, 199680, 8080);
        }
        return j6g.a;
    }
}
