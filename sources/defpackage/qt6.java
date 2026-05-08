package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class qt6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ hza V;
    public final /* synthetic */ d3a W;
    public final /* synthetic */ ese<Boolean> X;
    public final /* synthetic */ fv6 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ vt6 a;
    public final /* synthetic */ fv6 a0;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ o97 e;
    public final /* synthetic */ gu5<j6g> f;

    public qt6(vt6 vt6Var, e eVar, String str, boolean z, o97 o97Var, gu5 gu5Var, hza hzaVar, d3a d3aVar, g4a g4aVar, fv6 fv6Var, String str2, fv6 fv6Var2) {
        this.a = vt6Var;
        this.b = eVar;
        this.c = str;
        this.d = z;
        this.e = o97Var;
        this.f = gu5Var;
        this.V = hzaVar;
        this.W = d3aVar;
        this.X = g4aVar;
        this.Y = fv6Var;
        this.Z = str2;
        this.a0 = fv6Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        o97 o97Var = this.e;
        o97.a aVar = o97Var.c;
        if ((iIntValue & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVarA = g.a(this.b, 1.0f, this.a.a());
            String str = this.c;
            e eVarA2 = f.a(eVarA, str);
            boolean z = !this.d;
            hza hzaVar = hq1.a;
            nq1.c(this.f, eVarA2, z, ggd.a(o97Var.h.b), hq1.g(this.X.getValue().booleanValue() ? aVar.a.g.f.c : aVar.a.g.f.a, da2.b(aVar.a.g.f.a, 0.4f), bVar2), null, null, this.V, this.W, bh2.c(-2063147930, new pt6(this.Y, this.Z, this.a0, str), bVar2), bVar2, 905969664, 96);
        }
        return j6g.a;
    }
}
