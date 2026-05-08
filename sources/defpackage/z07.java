package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z07 {
    public static final z07 c = new z07("UNKNOWN", null);
    public final String a;
    public final String b;

    public z07(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z07)) {
            return false;
        }
        z07 z07Var = (z07) obj;
        return this.a.equals(z07Var.a) && wl7.b(this.b, z07Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}
