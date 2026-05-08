package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsc {
    public final String a;
    public final jud b;
    public final long c;
    public final Integer d;
    public final boolean e;

    public /* synthetic */ lsc(String str, jud judVar, long j, Integer num, int i) {
        this(str, judVar, j, (i & 8) != 0 ? null : num, false);
    }

    public static lsc a(lsc lscVar, Integer num, int i) {
        String str = lscVar.a;
        jud judVar = lscVar.b;
        long j = lscVar.c;
        if ((i & 8) != 0) {
            num = lscVar.d;
        }
        Integer num2 = num;
        boolean z = (i & 16) != 0 ? lscVar.e : true;
        str.getClass();
        judVar.getClass();
        return new lsc(str, judVar, j, num2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc)) {
            return false;
        }
        lsc lscVar = (lsc) obj;
        return wl7.b(this.a, lscVar.a) && wl7.b(this.b, lscVar.b) && this.c == lscVar.c && wl7.b(this.d, lscVar.d) && this.e == lscVar.e;
    }

    public final int hashCode() {
        int iD = ia.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "RecentSearch(uid=" + this.a + ", searchQuery=" + this.b + ", timestamp=" + this.c + ", newJobs=" + this.d + ", deleted=" + this.e + ")";
    }

    public lsc(String str, jud judVar, long j, Integer num, boolean z) {
        this.a = str;
        this.b = judVar;
        this.c = j;
        this.d = num;
        this.e = z;
    }
}
