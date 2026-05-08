package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i6e implements ga<h6e> {
    public static final i6e a = new i6e();

    @Override // defpackage.ga
    public final h6e a(mb8 mb8Var, lb3 lb3Var) {
        throw ja.e(mb8Var, lb3Var, "Input type used in output position");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, h6e h6eVar) {
        hva<pz> hvaVar;
        h6e h6eVar2 = h6eVar;
        hc8Var.getClass();
        lb3Var.getClass();
        h6eVar2.getClass();
        hva<List<ix9>> hvaVar2 = h6eVar2.p;
        hva<pz> hvaVar3 = h6eVar2.o;
        hva<ow2> hvaVar4 = h6eVar2.n;
        hva<String> hvaVar5 = h6eVar2.m;
        hva<Boolean> hvaVar6 = h6eVar2.l;
        hva<String> hvaVar7 = h6eVar2.k;
        hva<List<lw2>> hvaVar8 = h6eVar2.j;
        hva<List<nw2>> hvaVar9 = h6eVar2.i;
        hva<List<yu2>> hvaVar10 = h6eVar2.h;
        hva<String> hvaVar11 = h6eVar2.f;
        hva<String> hvaVar12 = h6eVar2.e;
        hva<qw2> hvaVar13 = h6eVar2.d;
        hc8Var.u0("conversation");
        ha.g gVar = ha.a;
        sy2 sy2Var = h6eVar2.a;
        hc8Var.j();
        ty2.a.b(hc8Var, lb3Var, sy2Var);
        hc8Var.t();
        hva<hw2> hvaVar14 = h6eVar2.b;
        if (hvaVar14 instanceof hva.c) {
            hc8Var.u0("author");
            hvaVar = hvaVar3;
            ena enaVar = new ena(iw2.a, false);
            V v = ((hva.c) hvaVar14).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                enaVar.b(hc8Var, lb3Var, v);
            }
        } else {
            hvaVar = hvaVar3;
        }
        hc8Var.u0("type");
        sw2 sw2Var = h6eVar2.c;
        sw2Var.getClass();
        hc8Var.T0(sw2Var.a());
        if (hvaVar13 instanceof hva.c) {
            hc8Var.u0("subType");
            rw2 rw2Var = rw2.a;
            V v2 = ((hva.c) hvaVar13).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                rw2Var.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar12 instanceof hva.c) {
            hc8Var.u0("messageContentFormat");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar12);
        }
        if (hvaVar11 instanceof hva.c) {
            hc8Var.u0("messageBody");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar11);
        }
        hc8Var.u0("source");
        ha.a.b(hc8Var, lb3Var, h6eVar2.g);
        if (hvaVar10 instanceof hva.c) {
            hc8Var.u0("attachments");
            hy8 hy8Var = new hy8(new ena(zu2.b, false));
            Object obj = ((hva.c) hvaVar10).a;
            if (obj == null) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, obj);
            }
        }
        if (hvaVar9 instanceof hva.c) {
            hc8Var.u0("recipients");
            hy8 hy8Var2 = new hy8(new ena(tx.c, false));
            Object obj2 = ((hva.c) hvaVar9).a;
            if (obj2 == null) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, obj2);
            }
        }
        if (hvaVar8 instanceof hva.c) {
            hc8Var.u0("payload");
            hy8 hy8Var3 = new hy8(new ena(mw2.b, false));
            Object obj3 = ((hva.c) hvaVar8).a;
            if (obj3 == null) {
                hc8Var.H1();
            } else {
                hy8Var3.b(hc8Var, lb3Var, obj3);
            }
        }
        if (hvaVar7 instanceof hva.c) {
            hc8Var.u0("replyToEventId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar7);
        }
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("suppressNotification");
            ha.a(ha.l).b(hc8Var, lb3Var, (hva.c) hvaVar6);
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("eventId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar5);
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("reminders");
            ena enaVar2 = new ena(pw2.a, false);
            V v3 = ((hva.c) hvaVar4).a;
            if (v3 == 0) {
                hc8Var.H1();
            } else {
                enaVar2.b(hc8Var, lb3Var, v3);
            }
        }
        hva<pz> hvaVar15 = hvaVar;
        if (hvaVar15 instanceof hva.c) {
            hc8Var.u0("additionalParticipants");
            ena enaVar3 = new ena(qz.a, false);
            V v4 = ((hva.c) hvaVar15).a;
            if (v4 == 0) {
                hc8Var.H1();
            } else {
                enaVar3.b(hc8Var, lb3Var, v4);
            }
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("moderationMetadata");
            hy8 hy8Var4 = new hy8(new ena(fv3.c, false));
            Object obj4 = ((hva.c) hvaVar2).a;
            if (obj4 == null) {
                hc8Var.H1();
            } else {
                hy8Var4.b(hc8Var, lb3Var, obj4);
            }
        }
    }
}
