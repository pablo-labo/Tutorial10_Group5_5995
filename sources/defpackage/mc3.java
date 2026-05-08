package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mc3 extends tc3 {
    public static final mc3 e = new mc3(-1, "18446744073709551615");
    public final long b;
    public String c;
    public String d;

    public mc3(long j, String str) {
        this.b = j;
        this.c = str;
    }

    public static mc3 b(long j) {
        mc3 mc3Var;
        return (j != 0 || (mc3Var = tc3.a) == null) ? j == -1 ? e : new mc3(j, null) : mc3Var;
    }

    @Override // defpackage.tc3
    public final String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strX = hh1.X(32, this.b);
        this.d = strX;
        return strX;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc3) && this.b == ((mc3) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.b);
        this.c = unsignedString;
        return unsignedString;
    }
}
