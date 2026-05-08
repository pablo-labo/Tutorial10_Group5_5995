package defpackage;

import defpackage.ewc;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eg8 implements dg8, pe8 {
    public static final /* synthetic */ qf8<Object>[] d = {fwc.a.g(new l4c(eg8.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};
    public final rxf a;
    public final ewc.a b = ewc.a(null, new x4(this, 2));
    public final fg8 c;

    public eg8(fg8 fg8Var, rxf rxfVar) {
        Class<?> cls;
        ke8 ke8VarA;
        Object objO0;
        this.a = rxfVar;
        if (fg8Var == null) {
            aj3 aj3VarD = rxfVar.d();
            aj3VarD.getClass();
            if (aj3VarD instanceof t52) {
                objO0 = a((t52) aj3VarD);
            } else {
                if (!(aj3VarD instanceof hv1)) {
                    s6.i(aj3VarD, "Unknown type parameter container: ");
                    throw null;
                }
                aj3 aj3VarD2 = ((hv1) aj3VarD).d();
                aj3VarD2.getClass();
                if (aj3VarD2 instanceof t52) {
                    ke8VarA = a((t52) aj3VarD2);
                } else {
                    g14 g14Var = aj3VarD instanceof g14 ? (g14) aj3VarD : null;
                    if (g14Var == null) {
                        s6.i(aj3VarD, "Non-class callable descriptor must be deserialized: ");
                        throw null;
                    }
                    c14 c14VarJ = g14Var.J();
                    jd8 jd8Var = c14VarJ instanceof jd8 ? (jd8) c14VarJ : null;
                    oi8 oi8Var = jd8Var != null ? jd8Var.c : null;
                    awc awcVar = oi8Var instanceof awc ? (awc) oi8Var : null;
                    if (awcVar == null || (cls = awcVar.a) == null) {
                        s6.i(g14Var, "Container of deserialized member is not resolved: ");
                        throw null;
                    }
                    ke8VarA = (ke8) fwc.a.b(cls);
                }
                objO0 = aj3VarD.o0(new hzh(ke8VarA), j6g.a);
            }
            fg8Var = (fg8) objO0;
        }
        this.c = fg8Var;
    }

    public static ke8 a(t52 t52Var) {
        Class<?> clsJ = akg.j(t52Var);
        ke8 ke8Var = (ke8) (clsJ != null ? fwc.a.b(clsJ) : null);
        if (ke8Var != null) {
            return ke8Var;
        }
        l.h(t52Var.d(), "Type parameter container is not resolved: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eg8)) {
            return false;
        }
        eg8 eg8Var = (eg8) obj;
        return wl7.b(this.c, eg8Var.c) && getName().equals(eg8Var.getName());
    }

    @Override // defpackage.pe8
    public final v62 getDescriptor() {
        return this.a;
    }

    @Override // defpackage.dg8
    public final String getName() {
        String strC = this.a.getName().c();
        strC.getClass();
        return strC;
    }

    @Override // defpackage.dg8
    public final List<zf8> getUpperBounds() {
        qf8<Object> qf8Var = d[0];
        Object objInvoke = this.b.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        ig8 ig8Var;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.a.z().ordinal();
        if (iOrdinal == 0) {
            ig8Var = ig8.a;
        } else if (iOrdinal == 1) {
            ig8Var = ig8.b;
        } else {
            if (iOrdinal != 2) {
                l.g();
                return null;
            }
            ig8Var = ig8.c;
        }
        int iOrdinal2 = ig8Var.ordinal();
        if (iOrdinal2 == 0) {
            j6g j6gVar = j6g.a;
        } else if (iOrdinal2 == 1) {
            sb.append("in ");
        } else {
            if (iOrdinal2 != 2) {
                l.g();
                return null;
            }
            sb.append("out ");
        }
        sb.append(getName());
        return sb.toString();
    }
}
