package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class xb4 extends m85 {
    public final Drawable a;
    public final boolean b;
    public final ze3 c;

    public xb4(Drawable drawable, boolean z, ze3 ze3Var) {
        this.a = drawable;
        this.b = z;
        this.c = ze3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb4)) {
            return false;
        }
        xb4 xb4Var = (xb4) obj;
        return wl7.b(this.a, xb4Var.a) && this.b == xb4Var.b && this.c == xb4Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ia.f(this.a.hashCode() * 31, 31, this.b);
    }
}
