package defpackage;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;

/* JADX INFO: loaded from: classes.dex */
public final class bwe extends ib4 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final n80 e;

    public bwe(float f, float f2, int i, int i2, n80 n80Var, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        n80Var = (i3 & 16) != 0 ? null : n80Var;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = n80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwe)) {
            return false;
        }
        bwe bweVar = (bwe) obj;
        return this.a == bweVar.a && this.b == bweVar.b && this.c == bweVar.c && this.d == bweVar.d && wl7.b(this.e, bweVar.e);
    }

    public final int hashCode() {
        int iC = w40.c(this.d, w40.c(this.c, k6.c(Float.hashCode(this.a) * 31, this.b, 31), 31), 31);
        n80 n80Var = this.e;
        return iC + (n80Var != null ? n80Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        String str = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        int i = this.c;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : ViewUtilsKt.UNKNOWN_DESTINATION_URL));
        sb.append(", join=");
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
