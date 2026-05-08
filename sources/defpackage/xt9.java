package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xt9 extends e.c implements nm2, lm8 {

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ int $height;
        final /* synthetic */ w $placeable;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, w wVar) {
            super(1);
            this.$width = i;
            this.$placeable = wVar;
            this.$height = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            aVar.r(this.$placeable, gf9.b((this.$width - this.$placeable.a) / 2.0f), gf9.b((this.$height - this.$placeable.b) / 2.0f), 0.0f);
            return j6g.a;
        }
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        float f = ((j94) om2.a(this, fi7.a)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        w wVarR = vf9Var.R(j);
        boolean z = this.c0 && !Float.isNaN(f) && Float.compare(f, 0.0f) > 0;
        int iX0 = Float.isNaN(f) ? 0 : qVar.x0(f);
        int iMax = wVarR.a;
        if (z) {
            iMax = Math.max(iMax, iX0);
        }
        int iMax2 = wVarR.b;
        if (z) {
            iMax2 = Math.max(iMax2, iX0);
        }
        return qVar.Y0(iMax, iMax2, bs4.a, new a(iMax, iMax2, wVarR));
    }
}
