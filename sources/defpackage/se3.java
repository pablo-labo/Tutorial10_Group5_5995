package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class se3 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3Var = (se3) obj;
        return this.a == se3Var.a && Float.compare(this.b, se3Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return l6.h(sb, this.b, ')');
    }
}
