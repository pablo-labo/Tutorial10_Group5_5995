package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import defpackage.c20;
import defpackage.f1f;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h0f extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ bj1 $border;
    final /* synthetic */ long $color;
    final /* synthetic */ Function2<b, Integer, j6g> $content;
    final /* synthetic */ e $modifier;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ dce $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0f(e eVar, dce dceVar, long j, float f, bj1 bj1Var, float f2, ah2 ah2Var) {
        super(2);
        this.$modifier = eVar;
        this.$shape = dceVar;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$border = bj1Var;
        this.$shadowElevation = f2;
        this.$content = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            e eVarO = b5e.b(l0f.c(this.$modifier, this.$shape, l0f.d(this.$color, this.$absoluteElevation, bVar2), this.$border, ((iy3) bVar2.M(um2.h)).t1(this.$shadowElevation)), false, yy5.e).o(new SuspendPointerInputElement(j6g.a, null, new f1f.a(new g0f(2, null)), 6));
            Function2<b, Integer, j6g> function2 = this.$content;
            ag9 ag9VarD = hl1.d(c20.a.a, true);
            int iG = bVar2.G();
            t8b t8bVarM = bVar2.m();
            e eVarC = c.c(bVar2, eVarO);
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
