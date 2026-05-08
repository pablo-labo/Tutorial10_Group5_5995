package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vbe {
    public static final vbe d = new vbe();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ vbe() {
        this(pnb.g(4278190080L), 0L, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbe)) {
            return false;
        }
        vbe vbeVar = (vbe) obj;
        return da2.c(this.a, vbeVar.a) && ooa.c(this.b, vbeVar.b) && this.c == vbeVar.c;
    }

    public final int hashCode() {
        int i = da2.j;
        return Float.hashCode(this.c) + ia.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        h5.j(this.a, ", offset=", sb);
        sb.append((Object) ooa.h(this.b));
        sb.append(", blurRadius=");
        return l6.h(sb, this.c, ')');
    }

    public vbe(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
