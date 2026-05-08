package defpackage;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j0f extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ bj1 $border;
    final /* synthetic */ long $color;
    final /* synthetic */ Function2<b, Integer, j6g> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ d3a $interactionSource;
    final /* synthetic */ e $modifier;
    final /* synthetic */ gu5<j6g> $onClick;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ dce $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0f(float f, float f2, long j, bj1 bj1Var, ah2 ah2Var, gu5 gu5Var, d3a d3aVar, dce dceVar, e eVar, boolean z) {
        super(2);
        this.$modifier = eVar;
        this.$shape = dceVar;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$border = bj1Var;
        this.$interactionSource = d3aVar;
        this.$enabled = z;
        this.$onClick = gu5Var;
        this.$shadowElevation = f2;
        this.$content = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVar = this.$modifier;
            jte jteVar = fi7.a;
            e eVarB = androidx.compose.foundation.b.b(l0f.c(eVar.o(MinimumInteractiveModifier.b), this.$shape, l0f.d(this.$color, this.$absoluteElevation, bVar2), this.$border, ((iy3) bVar2.M(um2.h)).t1(this.$shadowElevation)), this.$interactionSource, rdd.c(false, 0.0f, 0L, bVar2, 0, 7), this.$enabled, null, null, this.$onClick, 24);
            Function2<b, Integer, j6g> function2 = this.$content;
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
            function2.invoke(bVar2, 0);
            bVar2.q();
        }
        return j6g.a;
    }
}
