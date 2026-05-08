package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j9g {
    public final String a;
    public final hva<d18> b;
    public final hva<String> c;
    public final String d;

    public j9g(String str, hva<d18> hvaVar, hva<String> hvaVar2, String str2) {
        hvaVar.getClass();
        hvaVar2.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9g)) {
            return false;
        }
        j9g j9gVar = (j9g) obj;
        return this.a.equals(j9gVar.a) && wl7.b(this.b, j9gVar.b) && wl7.b(this.c, j9gVar.c) && this.d.equals(j9gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "UpdateJobSeekerProfileAwardInput(id=" + this.a + ", date=" + this.b + ", description=" + this.c + ", title=" + this.d + ")";
    }
}
