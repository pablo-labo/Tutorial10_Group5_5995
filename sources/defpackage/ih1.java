package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ih1 extends ga2 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public ih1(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            lh1.a();
            porterDuffColorFilter = kh1.a(pnb.P(j), x40.a(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(pnb.P(j), x40.b(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1)) {
            return false;
        }
        ih1 ih1Var = (ih1) obj;
        return da2.c(this.b, ih1Var.b) && this.c == ih1Var.c;
    }

    public final int hashCode() {
        int i = da2.j;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        h5.j(this.b, ", blendMode=", sb);
        sb.append((Object) hh1.Z(this.c));
        sb.append(')');
        return sb.toString();
    }
}
