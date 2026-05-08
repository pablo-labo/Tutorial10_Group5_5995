package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.q;
import defpackage.bg9;
import defpackage.de7;
import defpackage.eb4;
import defpackage.h3e;
import defpackage.le0;
import defpackage.lm8;
import defpackage.mte;
import defpackage.oa2;
import defpackage.pl7;
import defpackage.pn5;
import defpackage.r40;
import defpackage.sm8;
import defpackage.tia;
import defpackage.tjf;
import defpackage.vf9;
import defpackage.w59;
import defpackage.z96;
import defpackage.zs3;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zs3 implements lm8, eb4, z96 {
    public h3e f0;
    public final b g0;

    public a() {
        throw null;
    }

    public a(le0 le0Var, tjf tjfVar, pn5.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, h3e h3eVar, oa2 oa2Var) {
        this.f0 = h3eVar;
        b bVar = new b(le0Var, tjfVar, aVar, function1, i, z, i2, i3, list, function12, h3eVar, oa2Var, null);
        c2(bVar);
        this.g0 = bVar;
        if (this.f0 != null) {
            return;
        }
        de7.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        r40.e();
        throw null;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        return this.g0.d(qVar, vf9Var, j);
    }

    @Override // defpackage.z96
    public final void n0(tia tiaVar) {
        h3e h3eVar = this.f0;
        if (h3eVar != null) {
            h3eVar.d = mte.a(h3eVar.d, tiaVar, null, 2);
            h3eVar.b.c(h3eVar.a);
        }
    }

    @Override // defpackage.lm8
    public final int p(w59 w59Var, pl7 pl7Var, int i) {
        return this.g0.p(w59Var, pl7Var, i);
    }

    @Override // defpackage.lm8
    public final int r(w59 w59Var, pl7 pl7Var, int i) {
        return this.g0.r(w59Var, pl7Var, i);
    }

    @Override // defpackage.lm8
    public final int v(w59 w59Var, pl7 pl7Var, int i) {
        return this.g0.v(w59Var, pl7Var, i);
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) throws Throwable {
        this.g0.y(sm8Var);
    }

    @Override // defpackage.lm8
    public final int z(w59 w59Var, pl7 pl7Var, int i) {
        return this.g0.z(w59Var, pl7Var, i);
    }
}
