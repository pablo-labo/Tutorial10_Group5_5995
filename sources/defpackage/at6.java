package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import defpackage.o97;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class at6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ d3a V;
    public final /* synthetic */ ese<Boolean> W;
    public final /* synthetic */ fv6 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ fv6 Z;
    public final /* synthetic */ vt6 a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o97 d;
    public final /* synthetic */ gu5<j6g> e;
    public final /* synthetic */ hza f;

    public at6(vt6 vt6Var, e eVar, String str, o97 o97Var, gu5 gu5Var, hza hzaVar, d3a d3aVar, g4a g4aVar, fv6 fv6Var, String str2, fv6 fv6Var2) {
        this.a = vt6Var;
        this.b = eVar;
        this.c = str;
        this.d = o97Var;
        this.e = gu5Var;
        this.f = hzaVar;
        this.V = d3aVar;
        this.W = g4aVar;
        this.X = fv6Var;
        this.Y = str2;
        this.Z = fv6Var2;
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
            e eVarA = g.a(this.b, 1.0f, this.a.a());
            String str = this.c;
            e eVarA2 = f.a(eVarA, str);
            hza hzaVar = hq1.a;
            nq1.c(this.e, eVarA2, true, ggd.a(o97Var.h.b), hq1.g(this.W.getValue().booleanValue() ? aVar.a.g.g.c : aVar.a.g.g.a, da2.b(aVar.a.g.g.a, 0.4f), bVar2), null, null, this.f, this.V, bh2.c(2094109896, new zs6(this.X, this.Y, this.Z, str), bVar2), bVar2, 905969664, 96);
        }
        return j6g.a;
    }
}
