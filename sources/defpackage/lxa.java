package defpackage;

import androidx.compose.foundation.layout.f;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class lxa {
    public final long a;
    public final hza b;

    public lxa() {
        long jG = pnb.g(4284900966L);
        hza hzaVarA = f.a(0.0f, 0.0f, 3);
        this.a = jG;
        this.b = hzaVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lxa.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lxa lxaVar = (lxa) obj;
        return da2.c(this.a, lxaVar.a) && wl7.b(this.b, lxaVar.b);
    }

    public final int hashCode() {
        int i = da2.j;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        h5.j(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
