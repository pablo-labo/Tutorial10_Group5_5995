package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r2h {
    public final String a;
    public final int b;

    public r2h(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2h)) {
            return false;
        }
        r2h r2hVar = (r2h) obj;
        return wl7.b(this.a, r2hVar.a) && this.b == r2hVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return k6.h(sb, this.b, ')');
    }
}
