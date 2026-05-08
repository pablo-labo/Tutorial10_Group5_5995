package defpackage;

import defpackage.ewc;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cg8 implements ag8 {
    public static final /* synthetic */ qf8<Object>[] e;
    public final ui8 a;
    public final ewc.a<Type> b;
    public final ewc.a c;
    public final ewc.a d;

    static {
        l4c l4cVar = new l4c(cg8.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        iwc iwcVar = fwc.a;
        e = new qf8[]{iwcVar.g(l4cVar), z3.i(cg8.class, "arguments", "getArguments()Ljava/util/List;", 0, iwcVar)};
    }

    public cg8(ui8 ui8Var, gu5<? extends Type> gu5Var) {
        ui8Var.getClass();
        this.a = ui8Var;
        ewc.a<Type> aVar = gu5Var instanceof ewc.a ? (ewc.a) gu5Var : null;
        this.b = aVar == null ? gu5Var != null ? ewc.a(null, gu5Var) : null : aVar;
        this.c = ewc.a(null, new r4(this, 4));
        this.d = ewc.a(null, new we8(1, this, gu5Var));
    }

    @Override // defpackage.zf8
    public final oe8 a() {
        qf8<Object> qf8Var = e[0];
        return (oe8) this.c.invoke();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cg8)) {
            return false;
        }
        cg8 cg8Var = (cg8) obj;
        return wl7.b(this.a, cg8Var.a) && wl7.b(a(), cg8Var.a()) && g().equals(cg8Var.g());
    }

    @Override // defpackage.zf8
    public final List<gg8> g() {
        qf8<Object> qf8Var = e[1];
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        return akg.d(this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        oe8 oe8VarA = a();
        return g().hashCode() + ((iHashCode + (oe8VarA != null ? oe8VarA.hashCode() : 0)) * 31);
    }

    @Override // defpackage.zf8
    public final boolean i() {
        return this.a.N0();
    }

    public final oe8 j(ui8 ui8Var) {
        ui8 type;
        v62 v62VarD = ui8Var.M0().d();
        if (v62VarD instanceof t52) {
            Class<?> clsJ = akg.j((t52) v62VarD);
            if (clsJ != null) {
                if (!clsJ.isArray()) {
                    if (kyf.e(ui8Var)) {
                        return new ke8(clsJ);
                    }
                    Class<? extends Object> cls = wuc.b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new ke8(clsJ);
                }
                wxf wxfVar = (wxf) z92.m1(ui8Var.K0());
                if (wxfVar == null || (type = wxfVar.getType()) == null) {
                    return new ke8(clsJ);
                }
                oe8 oe8VarJ = j(type);
                if (oe8VarJ != null) {
                    return new ke8(Array.newInstance((Class<?>) jh2.p(pyd.u(oe8VarJ)), 0).getClass());
                }
                s6.i(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else {
            if (v62VarD instanceof rxf) {
                return new eg8(null, (rxf) v62VarD);
            }
            if (v62VarD instanceof zvf) {
                throw new ela("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    @Override // defpackage.ag8
    public final Type l() {
        ewc.a<Type> aVar = this.b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public final String toString() {
        pz3 pz3Var = lwc.a;
        ui8 ui8Var = this.a;
        ui8Var.getClass();
        return lwc.a.X(ui8Var);
    }
}
