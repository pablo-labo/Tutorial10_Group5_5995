package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r2c {
    public static final r2c c = new r2c(0.0f, new s82(0.0f, 0.0f));
    public final float a;
    public final s82 b;

    public r2c(float f, s82 s82Var) {
        this.a = f;
        this.b = s82Var;
        if (Float.isNaN(f)) {
            l5.q("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2c)) {
            return false;
        }
        r2c r2cVar = (r2c) obj;
        return this.a == r2cVar.a && wl7.b(this.b, r2cVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
