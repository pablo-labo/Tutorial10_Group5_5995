package defpackage;

import defpackage.ewc;
import defpackage.rw5;
import defpackage.te8;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class lf8 extends te8 {
    public final Class<?> b;
    public final Lazy<a> c;

    public final class a extends te8.a {
        public static final /* synthetic */ qf8<Object>[] g;
        public final ewc.a c;
        public final ewc.a d;
        public final Lazy e;
        public final Lazy f;

        static {
            l4c l4cVar = new l4c(a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
            iwc iwcVar = fwc.a;
            g = new qf8[]{iwcVar.g(l4cVar), z3.i(a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, iwcVar), z3.i(a.class, "members", "getMembers()Ljava/util/Collection;", 0, iwcVar)};
        }

        public a(lf8 lf8Var) {
            super(lf8Var);
            int i = 1;
            this.c = ewc.a(null, new be8(lf8Var, i));
            this.d = ewc.a(null, new ce8(this, i));
            m14 m14Var = new m14(1, this, lf8Var);
            qt8 qt8Var = qt8.b;
            this.e = boa.E(qt8Var, m14Var);
            this.f = boa.E(qt8Var, new uv7(this, 2));
            ewc.a(null, new kf8(lf8Var, this));
        }
    }

    public /* synthetic */ class b extends qv5 implements Function2<gn9, g5c, d4c> {
        public static final b a = new b(2, gn9.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);

        @Override // kotlin.jvm.functions.Function2
        public final d4c invoke(gn9 gn9Var, g5c g5cVar) {
            gn9 gn9Var2 = gn9Var;
            g5c g5cVar2 = g5cVar;
            gn9Var2.getClass();
            g5cVar2.getClass();
            return gn9Var2.f(g5cVar2);
        }
    }

    public lf8(Class<?> cls) {
        cls.getClass();
        this.b = cls;
        this.c = boa.E(qt8.b, new ae8(this, 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lf8) {
            return wl7.b(this.b, ((lf8) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.k52
    public final Class<?> j() {
        return this.b;
    }

    @Override // defpackage.te8
    public final Collection<uq2> t() {
        return zr4.a;
    }

    public final String toString() {
        return "file class " + wuc.a(this.b).a();
    }

    @Override // defpackage.te8
    public final Collection<kv5> v(n8a n8aVar) {
        ewc.a aVar = this.c.getValue().d;
        qf8<Object> qf8Var = a.g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return ((in9) objInvoke).e(n8aVar, dia.b);
    }

    @Override // defpackage.te8
    public final d4c w(int i) {
        muf mufVar = (muf) this.c.getValue().f.getValue();
        if (mufVar != null) {
            hd8 hd8Var = (hd8) mufVar.a();
            e5c e5cVar = (e5c) mufVar.b();
            us9 us9Var = (us9) mufVar.c();
            rw5.e<e5c, List<g5c>> eVar = od8.n;
            eVar.getClass();
            e5cVar.getClass();
            g5c g5cVar = (g5c) (i < e5cVar.n(eVar) ? e5cVar.m(eVar, i) : null);
            if (g5cVar != null) {
                m5c m5cVarF = e5cVar.F();
                m5cVarF.getClass();
                return (d4c) akg.f(this.b, g5cVar, hd8Var, new hyf(m5cVarF), us9Var, b.a);
            }
        }
        return null;
    }

    @Override // defpackage.te8
    public final Class<?> y() {
        Class<?> cls = (Class) this.c.getValue().e.getValue();
        return cls == null ? this.b : cls;
    }

    @Override // defpackage.te8
    public final Collection<d4c> z(n8a n8aVar) {
        ewc.a aVar = this.c.getValue().d;
        qf8<Object> qf8Var = a.g[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return ((in9) objInvoke).b(n8aVar, dia.b);
    }
}
