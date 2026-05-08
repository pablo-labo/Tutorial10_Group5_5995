package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class sli extends zli {
    public final jnh g;
    public final /* synthetic */ rji h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sli(rji rjiVar, String str, int i, jnh jnhVar) {
        super(str, i);
        this.h = rjiVar;
        this.g = jnhVar;
    }

    @Override // defpackage.zli
    public final int a() {
        return this.g.t();
    }

    @Override // defpackage.zli
    public final boolean e() {
        return true;
    }

    @Override // defpackage.zli
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final boolean g(Long l, Long l2, rph rphVar, boolean z) {
        eei.a();
        rji rjiVar = this.h;
        boolean zK = rjiVar.a.V.k(this.a, djh.d0);
        jnh jnhVar = this.g;
        boolean zW = jnhVar.w();
        boolean zX = jnhVar.x();
        boolean z2 = jnhVar.z();
        byte b = zW || zX || z2;
        Boolean boolD = null;
        boolC = null;
        Boolean boolC = null;
        Boolean boolC2 = null;
        boolD = null;
        boolD = null;
        boolD = null;
        Boolean boolC3 = null;
        boolD = null;
        if (z && b != true) {
            rjiVar.zzr().c0.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), jnhVar.s() ? Integer.valueOf(jnhVar.t()) : null);
            return true;
        }
        hnh hnhVarV = jnhVar.v();
        boolean zX2 = hnhVarV.x();
        if (rphVar.E()) {
            if (hnhVarV.u()) {
                try {
                    boolC2 = zli.c(new BigDecimal(rphVar.F()), hnhVarV.v(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                boolD = zli.d(zX2, boolC2);
            } else {
                rjiVar.zzr().X.a(rjiVar.d().p(rphVar.A()), "No number filter for long property. property");
            }
        } else if (rphVar.G()) {
            if (hnhVarV.u()) {
                double dH = rphVar.H();
                try {
                    boolC = zli.c(new BigDecimal(dH), hnhVarV.v(), Math.ulp(dH));
                } catch (NumberFormatException unused2) {
                }
                boolD = zli.d(zX2, boolC);
            } else {
                rjiVar.zzr().X.a(rjiVar.d().p(rphVar.A()), "No number filter for double property. property");
            }
        } else if (!rphVar.C()) {
            rjiVar.zzr().X.a(rjiVar.d().p(rphVar.A()), "User property has no value, property");
        } else if (hnhVarV.s()) {
            boolD = zli.d(zX2, zli.b(rphVar.D(), hnhVarV.t(), rjiVar.zzr()));
        } else if (!hnhVarV.u()) {
            rjiVar.zzr().X.a(rjiVar.d().p(rphVar.A()), "No string or number filter defined. property");
        } else if (nei.F(rphVar.D())) {
            String strD = rphVar.D();
            inh inhVarV = hnhVarV.v();
            if (nei.F(strD)) {
                try {
                    boolC3 = zli.c(new BigDecimal(strD), inhVarV, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            boolD = zli.d(zX2, boolC3);
        } else {
            rjiVar.zzr().X.c("Invalid user property value for Numeric number filter. property, value", rjiVar.d().p(rphVar.A()), rphVar.D());
        }
        rjiVar.zzr().c0.a(boolD == null ? "null" : boolD, "Property filter result");
        if (boolD == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolD.booleanValue()) {
            if (!z || jnhVar.w()) {
                this.d = boolD;
            }
            if (boolD.booleanValue() && b != false && rphVar.u()) {
                long jW = rphVar.w();
                if (l != null) {
                    jW = l.longValue();
                }
                if (zK && jnhVar.w() && !jnhVar.x() && l2 != null) {
                    jW = l2.longValue();
                }
                if (jnhVar.x()) {
                    this.f = Long.valueOf(jW);
                } else {
                    this.e = Long.valueOf(jW);
                }
            }
        }
        return true;
    }
}
