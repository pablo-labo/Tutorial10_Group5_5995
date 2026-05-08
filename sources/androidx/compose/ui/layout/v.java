package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.rxa;
import defpackage.vl8;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w.a {
    public final rxa b;

    public v(rxa rxaVar) {
        this.b = rxaVar;
    }

    @Override // androidx.compose.ui.layout.w.a, defpackage.iy3
    public final float getDensity() {
        return this.b.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.w.a
    public final vl8 k() {
        return this.b.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.w.a
    public final int p() {
        return this.b.getRoot().u0.p.a;
    }

    @Override // androidx.compose.ui.layout.w.a, defpackage.iy3
    public final float p1() {
        return this.b.getDensity().p1();
    }
}
