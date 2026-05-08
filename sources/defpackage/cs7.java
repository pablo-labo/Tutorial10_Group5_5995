package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cs7 {
    public final Double a;
    public final String b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final /* synthetic */ a[] V;
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;

        static {
            a aVar = new a("HOURLY", 0);
            a = aVar;
            a aVar2 = new a("DAILY", 1);
            b = aVar2;
            a aVar3 = new a("WEEKLY", 2);
            c = aVar3;
            a aVar4 = new a("BIWEEKLY", 3);
            d = aVar4;
            a aVar5 = new a("MONTHLY", 4);
            e = aVar5;
            a aVar6 = new a("YEARLY", 5);
            f = aVar6;
            V = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) V.clone();
        }
    }

    public cs7(Double d, String str, a aVar) {
        this.a = d;
        this.b = str;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs7)) {
            return false;
        }
        cs7 cs7Var = (cs7) obj;
        return wl7.b(this.a, cs7Var.a) && wl7.b(this.b, cs7Var.b) && this.c == cs7Var.c;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "JSTProfileMinimumPay(amount=" + this.a + ", currency=" + this.b + ", payPeriod=" + this.c + ")";
    }
}
