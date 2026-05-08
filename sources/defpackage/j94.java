package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class j94 implements Comparable<j94> {
    public final float a;

    public /* synthetic */ j94(float f) {
        this.a = f;
    }

    public static final /* synthetic */ j94 a() {
        return new j94(0.0f);
    }

    public static final boolean c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String e(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(j94 j94Var) {
        return Float.compare(this.a, j94Var.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j94) {
            return Float.compare(this.a, ((j94) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
