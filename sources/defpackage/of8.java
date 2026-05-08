package defpackage;

import defpackage.ewc;
import defpackage.mf8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class of8 implements mf8 {
    public static final /* synthetic */ qf8<Object>[] e;
    public final wd8<?> a;
    public final int b;
    public final mf8.a c;
    public final ewc.a d;

    public static final class a implements Type {
        public final Type[] a;
        public final int b;

        public a(Type[] typeArr) {
            this.a = typeArr;
            this.b = Arrays.hashCode(typeArr);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.a, ((a) obj).a);
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        public final String getTypeName() {
            return ut0.t0(this.a, ", ", "[", "]", null, 56);
        }

        public final int hashCode() {
            return this.b;
        }

        public final String toString() {
            return getTypeName();
        }
    }

    static {
        l4c l4cVar = new l4c(of8.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0);
        iwc iwcVar = fwc.a;
        e = new qf8[]{iwcVar.g(l4cVar), z3.i(of8.class, "annotations", "getAnnotations()Ljava/util/List;", 0, iwcVar)};
    }

    public of8(wd8<?> wd8Var, int i, mf8.a aVar, gu5<? extends o3b> gu5Var) {
        this.a = wd8Var;
        this.b = i;
        this.c = aVar;
        this.d = ewc.a(null, gu5Var);
        ewc.a(null, new nf8(this, 0));
    }

    @Override // defpackage.mf8
    public final boolean d() {
        o3b o3bVarJ = j();
        return (o3bVarJ instanceof rlg) && ((rlg) o3bVarJ).u0() != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof of8)) {
            return false;
        }
        of8 of8Var = (of8) obj;
        return this.a.equals(of8Var.a) && this.b == of8Var.b;
    }

    @Override // defpackage.mf8
    public final mf8.a f() {
        return this.c;
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        throw null;
    }

    @Override // defpackage.mf8
    public final int getIndex() {
        return this.b;
    }

    @Override // defpackage.mf8
    public final String getName() {
        o3b o3bVarJ = j();
        rlg rlgVar = o3bVarJ instanceof rlg ? (rlg) o3bVarJ : null;
        if (rlgVar != null && !rlgVar.d().g0()) {
            n8a name = rlgVar.getName();
            name.getClass();
            if (!name.b) {
                return name.c();
            }
        }
        return null;
    }

    @Override // defpackage.mf8
    public final cg8 getType() {
        ui8 type = j().getType();
        type.getClass();
        return new cg8(type, new t14(this, 2));
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final o3b j() {
        qf8<Object> qf8Var = e[0];
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (o3b) objInvoke;
    }

    public final String toString() {
        String strB;
        pz3 pz3Var = lwc.a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 2) {
                l.g();
                return null;
            }
            sb.append("parameter #" + this.b + ' ' + getName());
        }
        sb.append(" of ");
        hv1 hv1VarZ = this.a.z();
        if (hv1VarZ instanceof d4c) {
            strB = lwc.c((d4c) hv1VarZ);
        } else {
            if (!(hv1VarZ instanceof kv5)) {
                ja.i(hv1VarZ, "Illegal callable: ");
                return null;
            }
            strB = lwc.b((kv5) hv1VarZ);
        }
        sb.append(strB);
        return sb.toString();
    }

    @Override // defpackage.mf8
    public final boolean u() {
        o3b o3bVarJ = j();
        rlg rlgVar = o3bVarJ instanceof rlg ? (rlg) o3bVarJ : null;
        if (rlgVar != null) {
            return b04.a(rlgVar);
        }
        return false;
    }
}
