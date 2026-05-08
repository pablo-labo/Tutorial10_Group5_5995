package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u2f {
    public final String a;
    public final int b;
    public final int c;

    public u2f(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2f)) {
            return false;
        }
        u2f u2fVar = (u2f) obj;
        return wl7.b(this.a, u2fVar.a) && this.b == u2fVar.b && this.c == u2fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + w40.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return k6.h(sb, this.c, ')');
    }
}
