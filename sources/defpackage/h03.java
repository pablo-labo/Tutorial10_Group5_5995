package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h03 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ jhf V;
    public final /* synthetic */ ftg W;
    public final /* synthetic */ e X;
    public final /* synthetic */ e Y;
    public final /* synthetic */ e Z;
    public final /* synthetic */ wu5<Function2<? super b, ? super Integer, j6g>, b, Integer, j6g> a;
    public final /* synthetic */ e a0;
    public final /* synthetic */ lu8 b;
    public final /* synthetic */ fn1 b0;
    public final /* synthetic */ tjf c;
    public final /* synthetic */ rgf c0;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ igf f;
    public final /* synthetic */ Function1<mif, j6g> f0;
    public final /* synthetic */ roa g0;
    public final /* synthetic */ iy3 h0;

    /* JADX WARN: Multi-variable type inference failed */
    public h03(wu5<? super Function2<? super b, ? super Integer, j6g>, ? super b, ? super Integer, j6g> wu5Var, lu8 lu8Var, tjf tjfVar, int i, int i2, igf igfVar, jhf jhfVar, ftg ftgVar, e eVar, e eVar2, e eVar3, e eVar4, fn1 fn1Var, rgf rgfVar, boolean z, boolean z2, Function1<? super mif, j6g> function1, roa roaVar, iy3 iy3Var) {
        this.a = wu5Var;
        this.b = lu8Var;
        this.c = tjfVar;
        this.d = i;
        this.e = i2;
        this.f = igfVar;
        this.V = jhfVar;
        this.W = ftgVar;
        this.X = eVar;
        this.Y = eVar2;
        this.Z = eVar3;
        this.a0 = eVar4;
        this.b0 = fn1Var;
        this.c0 = rgfVar;
        this.d0 = z;
        this.e0 = z2;
        this.f0 = function1;
        this.g0 = roaVar;
        this.h0 = iy3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.a.q(bh2.c(-44346382, new g03(this.b, this.c, this.d, this.e, this.f, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0), bVar2), bVar2, 6);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
