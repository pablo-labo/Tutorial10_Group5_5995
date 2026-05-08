package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ejd {
    public final gf4 a;
    public final fjd b;
    public final djd c;

    public ejd(gf4 gf4Var, fjd fjdVar, djd djdVar) {
        gf4Var.getClass();
        fjdVar.getClass();
        this.a = gf4Var;
        this.b = fjdVar;
        this.c = djdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejd)) {
            return false;
        }
        ejd ejdVar = (ejd) obj;
        return wl7.b(this.a, ejdVar.a) && this.b == ejdVar.b && this.c.equals(ejdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewLocalData(insets=" + this.a + ", mode=" + this.b + ", edges=" + this.c + ")";
    }
}
