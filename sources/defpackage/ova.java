package defpackage;

import defpackage.fva;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ova implements kg8 {
    public final hu1 b = new hu1();

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            hu1 hu1Var = this.b;
            if (i >= hu1Var.c) {
                return;
            }
            fva fvaVar = (fva) hu1Var.h(i);
            V vL = this.b.l(i);
            fva.b<T> bVar = fvaVar.b;
            if (fvaVar.d == null) {
                fvaVar.d = fvaVar.c.getBytes(kg8.a);
            }
            bVar.a(fvaVar.d, vL, messageDigest);
            i++;
        }
    }

    public final <T> T c(fva<T> fvaVar) {
        hu1 hu1Var = this.b;
        return hu1Var.containsKey(fvaVar) ? (T) hu1Var.get(fvaVar) : fvaVar.a;
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof ova) {
            return this.b.equals(((ova) obj).b);
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
