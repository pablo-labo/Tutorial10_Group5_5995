package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class t7d {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<String> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;

    public t7d() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7d)) {
            return false;
        }
        t7d t7dVar = (t7d) obj;
        return wl7.b(this.a, t7dVar.a) && wl7.b(this.b, t7dVar.b) && wl7.b(this.c, t7dVar.c) && wl7.b(this.d, t7dVar.d) && wl7.b(this.e, t7dVar.e) && wl7.b(this.f, t7dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("ResumeConversationScopeDataInput(jobSeekerEmail=", this.a, ", advertiserEmail=", this.b, ", advertiserKey=");
        w40.o(sbG, this.c, ", employerAccountKey=", this.d, ", jobSeekerAccountKey=");
        return uz.e(sbG, this.e, ", contactTrackingKey=", this.f, ")");
    }
}
