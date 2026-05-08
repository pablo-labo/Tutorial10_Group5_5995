package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o69 extends e.c implements lm8 {
    public int d0;
    public int e0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar) {
            super(1);
            this.$placeable = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            aVar2.getClass();
            w.a.y(aVar2, this.$placeable, 0, 0);
            return j6g.a;
        }
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        long jA;
        vf9Var.getClass();
        long jD = mq2.d(j, hh1.g(this.d0, this.e0));
        if (iq2.g(j) == Integer.MAX_VALUE && iq2.h(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.e0 * i) / this.d0;
            jA = mq2.a(i, i, i2, i2);
        } else if (iq2.h(j) != Integer.MAX_VALUE || iq2.g(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = mq2.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.d0 * i5) / this.e0;
            jA = mq2.a(i6, i6, i5, i5);
        }
        w wVarR = vf9Var.R(jA);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new a(wVarR));
    }
}
