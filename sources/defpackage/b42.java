package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b42 {
    public final String a;
    public final String b;
    public final String c;

    public b42(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b42)) {
            return false;
        }
        b42 b42Var = (b42) obj;
        if (!wl7.b(this.a, b42Var.a) || !wl7.b(this.b, b42Var.b) || !this.c.equals(b42Var.c)) {
            return false;
        }
        Object obj2 = Boolean.FALSE;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return (Boolean.FALSE.hashCode() + akb.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 961, this.c)) * 961;
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        StringBuilder sbF = u40.f("ChildAchievementSkill(suid=", this.a, ", label=", this.b, ", id=");
        sbF.append(this.c);
        sbF.append(", taxonomyConceptTitle=null, isParentCrowtaxoAttribute=");
        sbF.append(bool);
        sbF.append(", childAchievementSkill=null, taxonomyConceptTitleItem=null)");
        return sbF.toString();
    }
}
