package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.vl8;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends w.a {
    public final int b;
    public final vl8 c;
    public final float d;
    public final float e;

    public c0(int i, vl8 vl8Var, float f, float f2) {
        this.b = i;
        this.c = vl8Var;
        this.d = f;
        this.e = f2;
    }

    @Override // androidx.compose.ui.layout.w.a, defpackage.iy3
    public final float getDensity() {
        return this.d;
    }

    @Override // androidx.compose.ui.layout.w.a
    public final vl8 k() {
        return this.c;
    }

    @Override // androidx.compose.ui.layout.w.a
    public final int p() {
        return this.b;
    }

    @Override // androidx.compose.ui.layout.w.a, defpackage.iy3
    public final float p1() {
        return this.e;
    }
}
