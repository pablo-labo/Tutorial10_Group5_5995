package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jud {
    public final String a;
    public final String b;

    public jud(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public static jud a(jud judVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = judVar.a;
        }
        if ((i & 2) != 0) {
            str2 = judVar.b;
        }
        judVar.getClass();
        str.getClass();
        str2.getClass();
        return new jud(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jud)) {
            return false;
        }
        jud judVar = (jud) obj;
        return wl7.b(this.a, judVar.a) && wl7.b(this.b, judVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("SearchQuery(what=", this.a, ", where=", this.b, ")");
    }
}
