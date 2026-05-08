package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class je2 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<Object> c;
    public final hva<Object> d;
    public final hva<ce2> e;
    public final hva<String> f;
    public final hva<String> g;

    public je2(hva.c cVar, hva.c cVar2, hva.c cVar3, int i) {
        hva<String> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva.a aVar = hva.a.a;
        hva<ce2> hvaVar2 = (i & 16) != 0 ? aVar : cVar2;
        hva<String> hvaVar3 = (i & 64) != 0 ? aVar : cVar3;
        hvaVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        hvaVar2.getClass();
        aVar.getClass();
        hvaVar3.getClass();
        this.a = hvaVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = hvaVar2;
        this.f = aVar;
        this.g = hvaVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je2)) {
            return false;
        }
        je2 je2Var = (je2) obj;
        return wl7.b(this.a, je2Var.a) && wl7.b(this.b, je2Var.b) && wl7.b(this.c, je2Var.c) && wl7.b(this.d, je2Var.d) && wl7.b(this.e, je2Var.e) && wl7.b(this.f, je2Var.f) && wl7.b(this.g, je2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b0.e(this.f, b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("CompleteButtonParameterInterviewInput(interviewId=", this.a, ", calendarId=", this.b, ", slotDuration=");
        w40.o(sbG, this.c, ", timezoneId=", this.d, ", destination=");
        w40.o(sbG, this.e, ", wayFinderRequestPayload=", this.f, ", rsvpUUID=");
        return akb.l(sbG, this.g, ")");
    }

    public je2() {
        this(null, null, null, 127);
    }
}
