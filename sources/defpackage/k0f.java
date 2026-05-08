package defpackage;

import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k0f implements Function2<b, Integer, j6g> {
    public final /* synthetic */ d3a V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ gu5<j6g> X;
    public final /* synthetic */ ah2 Y;
    public final /* synthetic */ e a;
    public final /* synthetic */ dce b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ bj1 e;
    public final /* synthetic */ float f;

    public k0f(float f, float f2, long j, bj1 bj1Var, ah2 ah2Var, gu5 gu5Var, d3a d3aVar, dce dceVar, e eVar, boolean z) {
        this.a = eVar;
        this.b = dceVar;
        this.c = j;
        this.d = f;
        this.e = bj1Var;
        this.f = f2;
        this.V = d3aVar;
        this.W = z;
        this.X = gu5Var;
        this.Y = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            jte jteVar = gi7.a;
            e eVarB = androidx.compose.foundation.b.b(m0f.c(this.a.o(MinimumInteractiveModifier.b), this.b, m0f.d(this.c, (mp4) bVar2.M(np4.a), this.d, bVar2), this.e, this.f), this.V, sdd.a(0L, 7, 0.0f), this.W, null, null, this.X, 24);
            ag9 ag9VarD = hl1.d(c20.a.a, true);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarB);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
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
            ygg.y(bVar2, ag9VarD, gl2.a.g);
            ygg.y(bVar2, t8bVarM, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                uz.g(iG, bVar2, iG, c0251a);
            }
            ygg.y(bVar2, eVarC, gl2.a.d);
            this.Y.invoke(bVar2, 0);
            bVar2.q();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
