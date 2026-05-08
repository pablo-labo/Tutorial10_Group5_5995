package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ew4 {
    public final String a;
    public final String b;
    public final String c;

    public ew4(String str) {
        String strConcat = "https://".concat(str);
        String strK = t40.k(strConcat, "/signals/v1/log");
        this.a = str;
        this.b = strConcat;
        this.c = strK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew4)) {
            return false;
        }
        ew4 ew4Var = (ew4) obj;
        return wl7.b(this.a, ew4Var.a) && wl7.b(this.b, ew4Var.b) && wl7.b(this.c, ew4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return l6.i(u40.f("Environment(signalsHostname=", this.a, ", signalsBaseApiUrl=", this.b, ", signalsLoggingUrl="), this.c, ")");
    }
}
