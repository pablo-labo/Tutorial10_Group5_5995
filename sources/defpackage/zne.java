package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zne extends m85 {
    public final f37 a;
    public final String b;
    public final ze3 c;

    public zne(f37 f37Var, String str, ze3 ze3Var) {
        this.a = f37Var;
        this.b = str;
        this.c = ze3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zne)) {
            return false;
        }
        zne zneVar = (zne) obj;
        return wl7.b(this.a, zneVar.a) && wl7.b(this.b, zneVar.b) && this.c == zneVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
