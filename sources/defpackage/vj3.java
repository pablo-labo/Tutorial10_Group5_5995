package defpackage;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class vj3 {
    public final BitmapDrawable a;
    public final boolean b;

    public vj3(BitmapDrawable bitmapDrawable, boolean z) {
        this.a = bitmapDrawable;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj3)) {
            return false;
        }
        vj3 vj3Var = (vj3) obj;
        return this.a.equals(vj3Var.a) && this.b == vj3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
