package defpackage;

import defpackage.hva;

/* JADX INFO: loaded from: classes2.dex */
public final class ke2 {
    public final hva<String> a;
    public final hva<String> b;
    public final hva<Object> c;
    public final hva<Object> d;
    public final hva<be2> e;
    public final hva<String> f;
    public final hva<String> g;

    public ke2(hva.c cVar, hva.c cVar2, hva.c cVar3, hva.c cVar4, int i) {
        hva<String> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva.a aVar = hva.a.a;
        hva<Object> hvaVar2 = (i & 4) != 0 ? aVar : cVar2;
        hva<Object> hvaVar3 = (i & 8) != 0 ? aVar : cVar3;
        hva<be2> hvaVar4 = (i & 16) != 0 ? aVar : cVar4;
        hvaVar.getClass();
        aVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = aVar;
        this.c = hvaVar2;
        this.d = hvaVar3;
        this.e = hvaVar4;
        this.f = aVar;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke2)) {
            return false;
        }
        ke2 ke2Var = (ke2) obj;
        return wl7.b(this.a, ke2Var.a) && wl7.b(this.b, ke2Var.b) && wl7.b(this.c, ke2Var.c) && wl7.b(this.d, ke2Var.d) && wl7.b(this.e, ke2Var.e) && wl7.b(this.f, ke2Var.f) && wl7.b(this.g, ke2Var.g);
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

    public ke2() {
        this(null, null, null, null, 127);
    }
}
