package defpackage;

import defpackage.ewc;
import defpackage.qv1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ye8 extends wd8<Object> implements fv5<Object>, ve8<Object>, gu5, Function1, hu5, iu5, ju5, ku5, lu5, mu5, nu5, ou5, pu5, qu5, Function2, su5, tu5, uu5, wu5, xu5, yu5, zu5, av5, bv5, cv5 {
    public static final /* synthetic */ qf8<Object>[] b0 = {fwc.a.g(new l4c(ye8.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};
    public final te8 V;
    public final String W;
    public final Object X;
    public final ewc.a Y;
    public final Lazy Z;
    public final Lazy a0;

    public ye8(te8 te8Var, String str, String str2, kv5 kv5Var, Object obj) {
        this.V = te8Var;
        this.W = str2;
        this.X = obj;
        int i = 0;
        this.Y = ewc.a(kv5Var, new we8(i, this, str));
        xe8 xe8Var = new xe8(this, i);
        qt8 qt8Var = qt8.b;
        this.Z = boa.E(qt8Var, xe8Var);
        this.a0 = boa.E(qt8Var, new qc8(this, 2));
    }

    @Override // defpackage.wd8
    public final boolean C() {
        return this.X != iv1.NO_RECEIVER;
    }

    public final qv1<Constructor<?>> D(Constructor<?> constructor, kv5 kv5Var, boolean z) {
        Object obj = this.X;
        Class<?> cls = null;
        if (!z) {
            m52 m52Var = kv5Var instanceof m52 ? (m52) kv5Var : null;
            if (m52Var != null && !d04.e(m52Var.getVisibility())) {
                t52 t52VarD0 = m52Var.d0();
                t52VarD0.getClass();
                if (!fe7.e(t52VarD0) && !yz3.q(m52Var.d0())) {
                    List<rlg> listI = m52Var.i();
                    listI.getClass();
                    List<rlg> list = listI;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ui8 type = ((rlg) it.next()).getType();
                            type.getClass();
                            if (hh2.E(type)) {
                                if (C()) {
                                    return new qv1.a(constructor, wuf.a(obj, z()));
                                }
                                Class<?> declaringClass = constructor.getDeclaringClass();
                                declaringClass.getClass();
                                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                genericParameterTypes.getClass();
                                return new qv1.b(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : pyd.n(genericParameterTypes, 0, genericParameterTypes.length - 1)));
                            }
                        }
                    }
                }
            }
        }
        if (C()) {
            return new qv1.c(constructor, wuf.a(obj, z()));
        }
        Class<?> declaringClass2 = constructor.getDeclaringClass();
        declaringClass2.getClass();
        Class<?> declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        genericParameterTypes2.getClass();
        return new qv1.d(constructor, declaringClass2, cls, genericParameterTypes2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final qv1.g E(java.lang.reflect.Method r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.C()
            r1 = 0
            if (r0 == 0) goto L50
            qv1$g$c r0 = new qv1$g$c
            kv5 r2 = r5.z()
            hsc r2 = r2.L()
            java.lang.Object r3 = r5.X
            if (r2 == 0) goto L44
            ui8 r2 = r2.getType()
            if (r2 == 0) goto L44
            int r4 = defpackage.fe7.a
            kwf r2 = r2.M0()
            v62 r2 = r2.d()
            if (r2 == 0) goto L2b
            boolean r1 = defpackage.fe7.b(r2)
        L2b:
            r2 = 1
            if (r1 != r2) goto L44
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            java.lang.Object r1 = defpackage.ut0.k0(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L44
            boolean r1 = r1.isInterface()
            if (r1 != r2) goto L44
            goto L4c
        L44:
            kv5 r5 = r5.z()
            java.lang.Object r3 = defpackage.wuf.a(r3, r5)
        L4c:
            r0.<init>(r6, r7, r3)
            return r0
        L50:
            qv1$g$g r5 = new qv1$g$g
            r7 = 6
            r5.<init>(r7, r6, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye8.E(java.lang.reflect.Method, boolean):qv1$g");
    }

    @Override // defpackage.wd8
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final kv5 z() {
        qf8<Object> qf8Var = b0[0];
        Object objInvoke = this.Y.invoke();
        objInvoke.getClass();
        return (kv5) objInvoke;
    }

    public final boolean equals(Object obj) {
        ye8 ye8VarB = akg.b(obj);
        return ye8VarB != null && wl7.b(this.V, ye8VarB.V) && getName().equals(ye8VarB.getName()) && wl7.b(this.W, ye8VarB.W) && wl7.b(this.X, ye8VarB.X);
    }

    @Override // defpackage.fv5
    public final int getArity() {
        pv1<?> pv1VarW = w();
        pv1VarW.getClass();
        return pv1VarW.a().size();
    }

    @Override // defpackage.ud8
    public final String getName() {
        String strC = z().getName().c();
        strC.getClass();
        return strC;
    }

    public final int hashCode() {
        return this.W.hashCode() + ((getName().hashCode() + (this.V.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // defpackage.ve8
    public final boolean isExternal() {
        return z().isExternal();
    }

    @Override // defpackage.ve8
    public final boolean isInfix() {
        return z().isInfix();
    }

    @Override // defpackage.ve8
    public final boolean isInline() {
        return z().isInline();
    }

    @Override // defpackage.ve8
    public final boolean isOperator() {
        return z().isOperator();
    }

    @Override // defpackage.ud8
    public final boolean isSuspend() {
        return z().isSuspend();
    }

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // defpackage.zu5
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // defpackage.yu5
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final String toString() {
        pz3 pz3Var = lwc.a;
        return lwc.b(z());
    }

    @Override // defpackage.wd8
    public final pv1<?> w() {
        return (pv1) this.Z.getValue();
    }

    @Override // defpackage.wd8
    public final te8 x() {
        return this.V;
    }

    @Override // defpackage.wd8
    public final pv1<?> y() {
        return (pv1) this.a0.getValue();
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ye8(te8 te8Var, kv5 kv5Var) {
        te8Var.getClass();
        kv5Var.getClass();
        String strC = kv5Var.getName().c();
        strC.getClass();
        this(te8Var, strC, rhd.c(kv5Var).a(), kv5Var, iv1.NO_RECEIVER);
    }
}
