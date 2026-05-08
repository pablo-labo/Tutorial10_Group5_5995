package defpackage;

import defpackage.f2;

/* JADX INFO: loaded from: classes.dex */
public final class fbe<V> extends f2<V> {
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
    public final boolean i(V v) {
        if (v == null) {
            v = (V) f2.V;
        }
        if (!f2.f.b(this, null, v)) {
            return false;
        }
        f2.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!f2.f.b(this, null, new f2.c(th))) {
            return false;
        }
        f2.c(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(defpackage.hz8<? extends V> r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = defpackage.f2.f(r6)
            f2$a r0 = defpackage.f2.f
            boolean r6 = r0.b(r5, r3, r6)
            if (r6 == 0) goto L4f
            defpackage.f2.c(r5)
            return r2
        L20:
            f2$f r0 = new f2$f
            r0.<init>(r5, r6)
            f2$a r4 = defpackage.f2.f
            boolean r3 = r4.b(r5, r3, r0)
            if (r3 == 0) goto L42
            j54 r1 = defpackage.j54.a     // Catch: java.lang.Throwable -> L33
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            f2$c r1 = new f2$c     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            f2$c r1 = f2.c.b
        L3c:
            f2$a r6 = defpackage.f2.f
            r6.b(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.a
        L44:
            boolean r5 = r0 instanceof f2.b
            if (r5 == 0) goto L4f
            f2$b r0 = (f2.b) r0
            boolean r5 = r0.a
            r6.cancel(r5)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbe.k(hz8):boolean");
    }
}
