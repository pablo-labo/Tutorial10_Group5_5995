package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m8e<T> {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        throw defpackage.fkg.i(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08c5 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.fm6 b(defpackage.bad r27, java.lang.reflect.Method r28) {
        /*
            Method dump skipped, instruction units count: 2733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8e.b(bad, java.lang.reflect.Method):fm6");
    }

    public abstract T a(Object[] objArr);
}
