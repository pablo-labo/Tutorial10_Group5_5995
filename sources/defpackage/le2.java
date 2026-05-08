package defpackage;

import defpackage.ha;
import defpackage.hva;

/* JADX INFO: loaded from: classes3.dex */
public final class le2 implements ga<je2> {
    public static final le2 a = new le2();

    @Override // defpackage.ga
    public final je2 a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, je2 je2Var) {
        je2 je2Var2 = je2Var;
        hc8Var.getClass();
        lb3Var.getClass();
        je2Var2.getClass();
        hva<String> hvaVar = je2Var2.g;
        hva<String> hvaVar2 = je2Var2.f;
        hva<ce2> hvaVar3 = je2Var2.e;
        hva<Object> hvaVar4 = je2Var2.d;
        hva<Object> hvaVar5 = je2Var2.c;
        hva<String> hvaVar6 = je2Var2.b;
        hva<String> hvaVar7 = je2Var2.a;
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("interviewId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar7);
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("calendarId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("slotDuration");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("timezoneId");
            ha.a(ha.m).b(hc8Var, lb3Var, (hva.c) hvaVar4);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("destination");
            ha.g gVar = ha.a;
            de2 de2Var = de2.a;
            V v = ((hva.c) hvaVar3).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                de2Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("wayFinderRequestPayload");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("rsvpUUID");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
