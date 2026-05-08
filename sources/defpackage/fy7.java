package defpackage;

import defpackage.ha;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fy7 implements ga<ey7> {
    public static final fy7 a = new fy7();

    @Override // defpackage.ga
    public final ey7 a(mb8 mb8Var, lb3 lb3Var) {
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
    public final void b(hc8 hc8Var, lb3 lb3Var, ey7 ey7Var) {
        ey7 ey7Var2 = ey7Var;
        hc8Var.getClass();
        lb3Var.getClass();
        ey7Var2.getClass();
        hva<String> hvaVar = ey7Var2.f;
        hva<String> hvaVar2 = ey7Var2.e;
        hva<String> hvaVar3 = ey7Var2.d;
        hva<Boolean> hvaVar4 = ey7Var2.c;
        hva<List<gy7>> hvaVar5 = ey7Var2.b;
        hva<List<String>> hvaVar6 = ey7Var2.a;
        if (hvaVar6 instanceof hva.c) {
            hc8Var.u0("jobKeys");
            hy8 hy8Var = new hy8(ha.a);
            V v = ((hva.c) hvaVar6).a;
            if (v == 0) {
                hc8Var.H1();
            } else {
                hy8Var.b(hc8Var, lb3Var, v);
            }
        }
        if (hvaVar5 instanceof hva.c) {
            hc8Var.u0("jobs");
            vw3 vw3Var = vw3.c;
            ha.g gVar = ha.a;
            hy8 hy8Var2 = new hy8(new ena(vw3Var, false));
            V v2 = ((hva.c) hvaVar5).a;
            if (v2 == 0) {
                hc8Var.H1();
            } else {
                hy8Var2.b(hc8Var, lb3Var, v2);
            }
        }
        if (hvaVar4 instanceof hva.c) {
            hc8Var.u0("useSearchlessPrice");
            ha.f.b(hc8Var, lb3Var, ((hva.c) hvaVar4).a);
        }
        if (hvaVar3 instanceof hva.c) {
            hc8Var.u0("placementId");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar3);
        }
        if (hvaVar2 instanceof hva.c) {
            hc8Var.u0("referrer");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar2);
        }
        if (hvaVar instanceof hva.c) {
            hc8Var.u0("pageTrackingKey");
            ha.a(ha.i).b(hc8Var, lb3Var, (hva.c) hvaVar);
        }
    }
}
