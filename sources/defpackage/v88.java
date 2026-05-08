package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v88 {
    public final Integer a;
    public final Object b;

    public v88(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v88)) {
            return false;
        }
        v88 v88Var = (v88) obj;
        return this.a.equals(v88Var.a) && wl7.b(this.b, v88Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
