package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rag {
    public final String a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<d18> d;
    public final hva<String> e;
    public final hva<String> f;

    public rag(hva hvaVar, hva hvaVar2, hva hvaVar3, hva hvaVar4, hva hvaVar5, String str) {
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        this.a = str;
        this.b = hvaVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = hvaVar4;
        this.f = hvaVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rag)) {
            return false;
        }
        rag ragVar = (rag) obj;
        return this.a.equals(ragVar.a) && wl7.b(this.b, ragVar.b) && wl7.b(this.c, ragVar.c) && wl7.b(this.d, ragVar.d) && wl7.b(this.e, ragVar.e) && wl7.b(this.f, ragVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfilePatentInput(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", patentNumber=");
        w40.o(sb, this.c, ", date=", this.d, ", description=");
        return uz.e(sb, this.e, ", url=", this.f, ")");
    }
}
