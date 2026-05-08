package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tog {
    public static final tog d = new tog(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = vjg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public tog(int i, float f2, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tog) {
            tog togVar = (tog) obj;
            if (this.a == togVar.a && this.b == togVar.b && this.c == togVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public tog(int i, int i2) {
        this(i, 1.0f, i2);
    }
}
