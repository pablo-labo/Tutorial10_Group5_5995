package defpackage;

import defpackage.ere;
import defpackage.ewc;
import defpackage.hi8;
import defpackage.rw5;
import defpackage.te8;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ke8<T> extends te8 implements yd8<T>, pe8, fg8 {
    public static final /* synthetic */ int d = 0;
    public final Class<T> b;
    public final Lazy<ke8<T>.a> c;

    public final class a extends te8.a {
        public static final /* synthetic */ qf8<Object>[] q;
        public final ewc.a c;
        public final ewc.a d;
        public final ewc.a e;
        public final ewc.a f;
        public final ewc.a g;
        public final ewc.a h;
        public final Lazy i;
        public final ewc.a j;
        public final ewc.a k;
        public final ewc.a l;
        public final ewc.a m;
        public final ewc.a n;
        public final ewc.a o;
        public final ewc.a p;

        static {
            l4c l4cVar = new l4c(a.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
            iwc iwcVar = fwc.a;
            q = new qf8[]{iwcVar.g(l4cVar), z3.i(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0, iwcVar), z3.i(a.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0, iwcVar), z3.i(a.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0, iwcVar), z3.i(a.class, "constructors", "getConstructors()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0, iwcVar), z3.i(a.class, "supertypes", "getSupertypes()Ljava/util/List;", 0, iwcVar), z3.i(a.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0, iwcVar), z3.i(a.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0, iwcVar), z3.i(a.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0, iwcVar)};
        }

        public a(ke8 ke8Var) {
            super(ke8Var);
            int i = 2;
            this.c = ewc.a(null, new ve0(ke8Var, i));
            int i2 = 1;
            this.d = ewc.a(null, new t14(this, i2));
            this.e = ewc.a(null, new ge8(this, ke8Var));
            this.f = ewc.a(null, new kd8(ke8Var, i2));
            this.g = ewc.a(null, new n04(ke8Var, i2));
            this.h = ewc.a(null, new o04(this, i2));
            this.i = boa.E(qt8.b, new he8(this, ke8Var));
            int i3 = 0;
            ewc.a(null, new ie8(i3, this, ke8Var));
            this.j = ewc.a(null, new je8(this, ke8Var));
            ewc.a(null, new q04(this, 3));
            this.k = ewc.a(null, new h14(ke8Var, i));
            this.l = ewc.a(null, new i14(ke8Var, i2));
            this.m = ewc.a(null, new c5(ke8Var, i2));
            this.n = ewc.a(null, new ae8(ke8Var, i3));
            this.o = ewc.a(null, new be8(this, i3));
            this.p = ewc.a(null, new ce8(this, i3));
            ewc.a(null, new de8(this, i3));
            ewc.a(null, new uv7(this, i2));
        }

        public final Collection<wd8<?>> a() {
            qf8<Object> qf8Var = q[9];
            Object objInvoke = this.k.invoke();
            objInvoke.getClass();
            return (Collection) objInvoke;
        }

        public final t52 b() {
            qf8<Object> qf8Var = q[0];
            Object objInvoke = this.c.invoke();
            objInvoke.getClass();
            return (t52) objInvoke;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[hi8.a.values().length];
            try {
                hi8.a.C0256a c0256a = hi8.a.a;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hi8.a.C0256a c0256a2 = hi8.a.a;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hi8.a.C0256a c0256a3 = hi8.a.a;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hi8.a.C0256a c0256a4 = hi8.a.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hi8.a.C0256a c0256a5 = hi8.a.a;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hi8.a.C0256a c0256a6 = hi8.a.a;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ class c extends qv5 implements Function2<gn9, g5c, d4c> {
        public static final c a = new c(2, gn9.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);

        @Override // kotlin.jvm.functions.Function2
        public final d4c invoke(gn9 gn9Var, g5c g5cVar) {
            gn9 gn9Var2 = gn9Var;
            g5c g5cVar2 = g5cVar;
            gn9Var2.getClass();
            g5cVar2.getClass();
            return gn9Var2.f(g5cVar2);
        }
    }

    public ke8(Class<T> cls) {
        cls.getClass();
        this.b = cls;
        this.c = boa.E(qt8.b, new x4(this, 1));
    }

    public static w52 F(a62 a62Var, phd phdVar) {
        g04 g04Var = phdVar.a;
        es4 es4Var = new es4(g04Var.b, a62Var.a);
        n8a n8aVarF = a62Var.f();
        List listZ = u63.Z(g04Var.b.l().k("Any").o());
        j29 j29Var = g04Var.a;
        w52 w52Var = new w52(es4Var, n8aVarF, ax9.b, c62.CLASS, listZ, j29Var);
        w52Var.K0(new le8(j29Var, w52Var), is4.a, null);
        return w52Var;
    }

    public final a62 G() {
        bnb bnbVarH;
        a62 a62Var = rhd.a;
        Class<T> cls = this.b;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            bnbVarH = componentType.isPrimitive() ? md8.c(componentType.getSimpleName()).h() : null;
            if (bnbVarH != null) {
                return new a62(ere.l, bnbVarH.f());
            }
            mq5 mq5VarG = ere.a.g.g();
            return new a62(mq5VarG.b(), mq5VarG.a.f());
        }
        if (cls.equals(Void.TYPE)) {
            return rhd.a;
        }
        bnbVarH = cls.isPrimitive() ? md8.c(cls.getSimpleName()).h() : null;
        if (bnbVarH != null) {
            return new a62(ere.l, bnbVarH.m());
        }
        a62 a62VarA = wuc.a(cls);
        if (!a62VarA.c) {
            String str = iw7.a;
            a62 a62VarF = iw7.f(a62VarA.a());
            if (a62VarF != null) {
                return a62VarF;
            }
        }
        return a62VarA;
    }

    @Override // defpackage.pe8
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final t52 getDescriptor() {
        return this.c.getValue().b();
    }

    @Override // defpackage.yd8
    public final List<zf8> b() {
        ewc.a aVar = this.c.getValue().j;
        qf8<Object> qf8Var = a.q[7];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ke8) && jh2.q(this).equals(jh2.q((yd8) obj));
    }

    @Override // defpackage.td8
    public final List<Annotation> getAnnotations() {
        ewc.a aVar = this.c.getValue().d;
        qf8<Object> qf8Var = a.q[1];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.yd8
    public final Collection<yd8<?>> h() {
        ewc.a aVar = this.c.getValue().h;
        qf8<Object> qf8Var = a.q[5];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // defpackage.yd8
    public final int hashCode() {
        return jh2.q(this).hashCode();
    }

    @Override // defpackage.k52
    public final Class<T> j() {
        return this.b;
    }

    @Override // defpackage.yd8
    public final Collection<ve8<T>> k() {
        ewc.a aVar = this.c.getValue().g;
        qf8<Object> qf8Var = a.q[4];
        Object objInvoke = aVar.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    @Override // defpackage.yd8
    public final boolean n(Object obj) {
        List<yd8<? extends Object>> list = wuc.a;
        Class<T> cls = this.b;
        cls.getClass();
        Integer num = wuc.d.get(cls);
        if (num != null) {
            return pxf.e(num.intValue(), obj);
        }
        Class<T> cls2 = (Class) wuc.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // defpackage.yd8
    public final String p() {
        ewc.a aVar = this.c.getValue().f;
        qf8<Object> qf8Var = a.q[3];
        return (String) aVar.invoke();
    }

    @Override // defpackage.yd8
    public final String r() {
        ewc.a aVar = this.c.getValue().e;
        qf8<Object> qf8Var = a.q[2];
        return (String) aVar.invoke();
    }

    @Override // defpackage.yd8
    public final boolean s() {
        return getDescriptor().s();
    }

    @Override // defpackage.te8
    public final Collection<uq2> t() {
        t52 descriptor = getDescriptor();
        if (descriptor.f() == c62.INTERFACE || descriptor.f() == c62.OBJECT) {
            return zr4.a;
        }
        Collection<m52> collectionK = descriptor.k();
        collectionK.getClass();
        return collectionK;
    }

    public final String toString() {
        a62 a62VarG = G();
        mq5 mq5Var = a62VarG.a;
        return "class ".concat((mq5Var.a.c() ? "" : w40.f(new StringBuilder(), mq5Var.a.a, JwtParser.SEPARATOR_CHAR)).concat(wve.H(a62VarG.b.a.a, JwtParser.SEPARATOR_CHAR, '$')));
    }

    @Override // defpackage.te8
    public final Collection<kv5> v(n8a n8aVar) {
        in9 in9VarN = getDescriptor().o().n();
        dia diaVar = dia.b;
        Collection<? extends sfe> collectionE = in9VarN.e(n8aVar, diaVar);
        in9 in9VarL0 = getDescriptor().l0();
        in9VarL0.getClass();
        return z92.h1(collectionE, in9VarL0.e(n8aVar, diaVar));
    }

    @Override // defpackage.te8
    public final d4c w(int i) {
        Class<?> declaringClass;
        Class<T> cls = this.b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((ke8) fwc.a.b(declaringClass)).w(i);
        }
        t52 descriptor = getDescriptor();
        v04 v04Var = descriptor instanceof v04 ? (v04) descriptor : null;
        if (v04Var != null) {
            u4c u4cVar = v04Var.e;
            rw5.e<u4c, List<g5c>> eVar = od8.j;
            eVar.getClass();
            u4cVar.getClass();
            g5c g5cVar = (g5c) (i < u4cVar.n(eVar) ? u4cVar.m(eVar, i) : null);
            if (g5cVar != null) {
                h04 h04Var = v04Var.a0;
                return (d4c) akg.f(this.b, g5cVar, h04Var.b, h04Var.d, v04Var.f, c.a);
            }
        }
        return null;
    }

    @Override // defpackage.te8
    public final Collection<d4c> z(n8a n8aVar) {
        in9 in9VarN = getDescriptor().o().n();
        dia diaVar = dia.b;
        Collection collectionB = in9VarN.b(n8aVar, diaVar);
        in9 in9VarL0 = getDescriptor().l0();
        in9VarL0.getClass();
        return z92.h1(collectionB, in9VarL0.b(n8aVar, diaVar));
    }
}
