package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vj {
    public final hva<d18> a;
    public final hva<String> b;
    public final String c;

    public vj(hva<d18> hvaVar, hva<String> hvaVar2, String str) {
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = hvaVar;
        this.b = hvaVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj)) {
            return false;
        }
        vj vjVar = (vj) obj;
        return wl7.b(this.a, vjVar.a) && wl7.b(this.b, vjVar.b) && this.c.equals(vjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return l6.i(v40.g("AddJobSeekerProfileAwardInput(date=", this.a, ", description=", this.b, ", title="), this.c, ")");
    }
}
