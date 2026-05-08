package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ao8 extends r5i {
    public final /* synthetic */ int V;
    public final /* synthetic */ int W;
    public final /* synthetic */ long X;
    public final sn8 b;
    public final ar8 c;
    public final int d;
    public final /* synthetic */ ar8 e;
    public final /* synthetic */ so8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao8(sn8 sn8Var, ar8 ar8Var, int i, so8 so8Var, int i2, int i3, long j) {
        super(2);
        this.e = ar8Var;
        this.f = so8Var;
        this.V = i2;
        this.W = i3;
        this.X = j;
        this.b = sn8Var;
        this.c = ar8Var;
        this.d = i;
    }

    @Override // defpackage.r5i
    public final br8 a(int i, int i2, int i3, long j) {
        return l(i, j, i2, i3, this.d);
    }

    public final ho8 l(int i, long j, int i2, int i3, int i4) {
        int i5;
        sn8 sn8Var = this.b;
        Object objG = sn8Var.g(i);
        Object objE = sn8Var.e(i);
        List listB = b(this.c, i, j);
        if (iq2.f(j)) {
            i5 = iq2.j(j);
        } else {
            if (!iq2.e(j)) {
                de7.a("does not have fixed height");
            }
            i5 = iq2.i(j);
        }
        vl8 layoutDirection = this.e.b.getLayoutDirection();
        LazyLayoutItemAnimator<ho8> lazyLayoutItemAnimator = this.f.m;
        return new ho8(i, objG, i5, i4, layoutDirection, this.V, this.W, listB, this.X, objE, lazyLayoutItemAnimator, j, i2, i3);
    }
}
