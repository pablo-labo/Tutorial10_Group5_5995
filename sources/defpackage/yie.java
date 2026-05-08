package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yie {
    public final String a;
    public final String b;

    public /* synthetic */ yie(int i) {
        this((i & 1) != 0 ? null : "DEFAULT_GROUP_ID", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yie)) {
            return false;
        }
        yie yieVar = (yie) obj;
        return wl7.b(this.a, yieVar.a) && wl7.b(this.b, yieVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return akb.k("SkillGroup(suid=", this.a, ", label=", this.b, ")");
    }

    public yie() {
        this(3);
    }

    public yie(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
