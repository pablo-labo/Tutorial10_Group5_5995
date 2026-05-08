package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gie {
    public static final gie c = new gie(-1, -1);
    public final int a;
    public final int b;

    static {
        new gie(0, 0);
    }

    public gie(int i, int i2) {
        ka2.l((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof gie) {
            gie gieVar = (gie) obj;
            if (this.a == gieVar.a && this.b == gieVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
