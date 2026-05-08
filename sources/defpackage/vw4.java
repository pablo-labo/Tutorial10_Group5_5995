package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class vw4 extends d37 {
    public final Drawable a;
    public final v27 b;
    public final Throwable c;

    public vw4(Drawable drawable, v27 v27Var, Throwable th) {
        this.a = drawable;
        this.b = v27Var;
        this.c = th;
    }

    @Override // defpackage.d37
    public final v27 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw4)) {
            return false;
        }
        vw4 vw4Var = (vw4) obj;
        return wl7.b(this.a, vw4Var.a) && wl7.b(this.b, vw4Var.b) && wl7.b(this.c, vw4Var.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
