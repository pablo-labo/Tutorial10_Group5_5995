package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends e.c implements lm8, c5e {
    public Function1<? super cd6, j6g> d0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;
        final /* synthetic */ rh1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, rh1 rh1Var) {
            super(1);
            this.$placeable = wVar;
            this.this$0 = rh1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a.C(aVar, this.$placeable, 0, 0, this.this$0.d0, 4);
            return j6g.a;
        }
    }

    public rh1(Function1<? super cd6, j6g> function1) {
        this.d0 = function1;
    }

    @Override // defpackage.c5e
    public final boolean B() {
        return false;
    }

    @Override // defpackage.c5e
    public final void F0(s5e s5eVar) {
    }

    @Override // androidx.compose.ui.e.c
    public final boolean R1() {
        return false;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new a(wVarR, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.d0 + ')';
    }
}
