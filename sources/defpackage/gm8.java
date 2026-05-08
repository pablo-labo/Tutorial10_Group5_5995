package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.CompositionLocalMapInjectionElement;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.gl2;

/* JADX INFO: loaded from: classes.dex */
public final class gm8 extends mj8 implements wu5<ake<gl2>, b, Integer, j6g> {
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm8(e eVar) {
        super(3);
        this.$modifier = eVar;
    }

    @Override // defpackage.wu5
    public final j6g q(ake<gl2> akeVar, b bVar, Integer num) {
        b bVar2 = akeVar.a;
        b bVar3 = bVar;
        num.intValue();
        int iHashCode = Integer.hashCode(bVar3.G());
        e eVarC = this.$modifier;
        if (eVarC != e.a.b) {
            eVarC = c.c(bVar3, new CompositionLocalMapInjectionElement(bVar3.m()).o(eVarC));
        }
        bVar2.u(509942095);
        gl2.j.getClass();
        ygg.y(bVar2, eVarC, gl2.a.d);
        gl2.a.C0251a c0251a = gl2.a.j;
        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
            uz.g(iHashCode, bVar2, iHashCode, c0251a);
        }
        bVar2.J();
        return j6g.a;
    }
}
