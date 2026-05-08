package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w1d {
    public static final w1d c = new w1d(0, false);
    public final int a;
    public final boolean b;

    public w1d(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w1d.class == obj.getClass()) {
            w1d w1dVar = (w1d) obj;
            if (this.a == w1dVar.a && this.b == w1dVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
