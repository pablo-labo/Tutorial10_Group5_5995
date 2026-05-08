package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m61 {
    public final String a;
    public final tg3 b;
    public final String c;
    public final String d;

    public /* synthetic */ m61(tg3 tg3Var, String str, String str2, int i) {
        this((String) null, (i & 2) != 0 ? null : tg3Var, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public static m61 a(m61 m61Var, tg3 tg3Var, String str, String str2, int i) {
        String str3 = m61Var.a;
        if ((i & 2) != 0) {
            tg3Var = m61Var.b;
        }
        if ((i & 4) != 0) {
            str = m61Var.c;
        }
        if ((i & 8) != 0) {
            str2 = m61Var.d;
        }
        m61Var.getClass();
        return new m61(str3, tg3Var, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m61)) {
            return false;
        }
        m61 m61Var = (m61) obj;
        return wl7.b(this.a, m61Var.a) && wl7.b(this.b, m61Var.b) && wl7.b(this.c, m61Var.c) && wl7.b(this.d, m61Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        tg3 tg3Var = this.b;
        int iHashCode2 = (iHashCode + (tg3Var == null ? 0 : tg3Var.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwardItem(id=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", description=");
        return z3.n(sb, this.c, ", title=", this.d, ")");
    }

    public m61() {
        this((tg3) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 15);
    }

    public m61(String str, tg3 tg3Var, String str2, String str3) {
        this.a = str;
        this.b = tg3Var;
        this.c = str2;
        this.d = str3;
    }
}
