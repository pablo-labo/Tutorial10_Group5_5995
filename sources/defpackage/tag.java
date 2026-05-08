package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tag {
    public final String a;
    public final hva<String> b;
    public final hva<d18> c;
    public final hva<String> d;
    public final hva<String> e;

    public tag(String str, hva<String> hvaVar, hva<d18> hvaVar2, hva<String> hvaVar3, hva<String> hvaVar4) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = hvaVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tag)) {
            return false;
        }
        tag tagVar = (tag) obj;
        return this.a.equals(tagVar.a) && wl7.b(this.b, tagVar.b) && wl7.b(this.c, tagVar.c) && wl7.b(this.d, tagVar.d) && wl7.b(this.e, tagVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfilePublicationInput(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", date=");
        w40.o(sb, this.c, ", description=", this.d, ", url=");
        return akb.l(sb, this.e, ")");
    }
}
