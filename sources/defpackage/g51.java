package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g51 {
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;
    public final boolean e;

    public g51(Integer num, Integer num2, String str, String str2, boolean z) {
        str.getClass();
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g51)) {
            return false;
        }
        g51 g51Var = (g51) obj;
        return wl7.b(this.a, g51Var.a) && wl7.b(this.b, g51Var.b) && wl7.b(this.c, g51Var.c) && wl7.b(this.d, g51Var.d) && this.e == g51Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iD = akb.d((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutocompleteSuggestion(matchStart=");
        sb.append(this.a);
        sb.append(", matchEnd=");
        sb.append(this.b);
        sb.append(", suggestionText=");
        ia.r(sb, this.c, ", suid=", this.d, ", isCrowTaxoWithChildAttributes=");
        return z3.o(sb, this.e, ")");
    }

    public /* synthetic */ g51(Integer num, Integer num2, String str, String str2, int i) {
        this(num, num2, str, (i & 8) != 0 ? null : str2, false);
    }
}
