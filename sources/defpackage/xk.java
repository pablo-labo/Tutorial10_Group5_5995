package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xk {
    public final String a;
    public final String b;
    public final hva<d18> c;
    public final hva<String> d;
    public final hva<String> e;

    public xk(String str, String str2, hva<d18> hvaVar, hva<String> hvaVar2, hva<String> hvaVar3) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        this.a = str;
        this.b = str2;
        this.c = hvaVar;
        this.d = hvaVar2;
        this.e = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        return this.a.equals(xkVar.a) && this.b.equals(xkVar.b) && wl7.b(this.c, xkVar.c) && wl7.b(this.d, xkVar.d) && wl7.b(this.e, xkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AddJobSeekerProfilePatentInput(title=", this.a, ", patentNumber=", this.b, ", date=");
        w40.o(sbF, this.c, ", description=", this.d, ", url=");
        return akb.l(sbF, this.e, ")");
    }
}
