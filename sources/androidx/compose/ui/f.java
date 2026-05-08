package androidx.compose.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.l6;
import defpackage.lm8;
import defpackage.mj8;
import defpackage.vf9;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e.c implements lm8 {
    public float d0;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, f fVar) {
            super(1);
            this.$placeable = wVar;
            this.this$0 = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            aVar.r(this.$placeable, 0, 0, this.this$0.d0);
            return j6g.a;
        }
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new a(wVarR, this));
    }

    public final String toString() {
        return l6.h(new StringBuilder("ZIndexModifier(zIndex="), this.d0, ')');
    }
}
