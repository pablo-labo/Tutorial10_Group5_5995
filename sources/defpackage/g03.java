package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.relocation.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.tf7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g03 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ ftg V;
    public final /* synthetic */ e W;
    public final /* synthetic */ e X;
    public final /* synthetic */ e Y;
    public final /* synthetic */ e Z;
    public final /* synthetic */ lu8 a;
    public final /* synthetic */ fn1 a0;
    public final /* synthetic */ tjf b;
    public final /* synthetic */ rgf b0;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ igf e;
    public final /* synthetic */ Function1<mif, j6g> e0;
    public final /* synthetic */ jhf f;
    public final /* synthetic */ roa f0;
    public final /* synthetic */ iy3 g0;

    /* JADX WARN: Multi-variable type inference failed */
    public g03(lu8 lu8Var, tjf tjfVar, int i, int i2, igf igfVar, jhf jhfVar, ftg ftgVar, e eVar, e eVar2, e eVar3, e eVar4, fn1 fn1Var, rgf rgfVar, boolean z, boolean z2, Function1<? super mif, j6g> function1, roa roaVar, iy3 iy3Var) {
        this.a = lu8Var;
        this.b = tjfVar;
        this.c = i;
        this.d = i2;
        this.e = igfVar;
        this.f = jhfVar;
        this.V = ftgVar;
        this.W = eVar;
        this.X = eVar2;
        this.Y = eVar3;
        this.Z = eVar4;
        this.a0 = fn1Var;
        this.b0 = rgfVar;
        this.c0 = z;
        this.d0 = z2;
        this.e0 = function1;
        this.f0 = roaVar;
        this.g0 = iy3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        int iF;
        e ingVar;
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            lu8 lu8Var = this.a;
            e eVarJ = g.j(e.a.b, ((j94) ((gme) lu8Var.g).getValue()).a, 0.0f, 2);
            tf7.a aVar = tf7.a;
            int i = this.c;
            int i2 = this.d;
            tjf tjfVar = this.b;
            e eVarA = c.a(eVarJ, aVar, new mh6(i, i2, tjfVar));
            boolean zX = bVar2.x(lu8Var);
            Object objV = bVar2.v();
            if (zX || objV == b.a.a) {
                objV = new qq(lu8Var, 5);
                bVar2.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            igf igfVar = this.e;
            dwa dwaVar = (dwa) ((gme) igfVar.f).getValue();
            jhf jhfVar = this.f;
            long j = jhfVar.b;
            int i3 = kjf.c;
            int i4 = (int) (j >> 32);
            long j2 = igfVar.e;
            if (i4 != ((int) (j2 >> 32))) {
                iF = i4;
            } else {
                int i5 = (int) (j & 4294967295L);
                iF = i5 != ((int) (j2 & 4294967295L)) ? i5 : kjf.f(j);
            }
            igfVar.e = jhfVar.b;
            vrf vrfVarA = clg.a(this.V, jhfVar.a);
            int iOrdinal = dwaVar.ordinal();
            if (iOrdinal == 0) {
                ingVar = new ing(igfVar, iF, vrfVarA, gu5Var);
            } else {
                if (iOrdinal != 1) {
                    l.g();
                    return null;
                }
                ingVar = new yj6(igfVar, iF, vrfVarA, gu5Var);
            }
            yfe.a(a.a(c.a(ygg.i(eVarA).o(ingVar).o(this.W).o(this.X), aVar, new dhf(tjfVar)).o(this.Y).o(this.Z), this.a0), bh2.c(1412697320, new f03(this.b0, lu8Var, this.c0, this.d0, this.e0, this.f, this.f0, this.g0, this.d), bVar2), bVar2, 48);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
