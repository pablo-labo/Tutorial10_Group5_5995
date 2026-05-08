package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class yb5<E> implements Iterator<E>, ze8 {
    public final Iterator<E> a;
    public final i35 b;
    public E c;

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
    public yb5(Iterator it, i35 i35Var) {
        it.getClass();
        this.a = it;
        this.b = i35Var;
        while (it.hasNext()) {
            E e = (E) it.next();
            this.c = e;
            if (this.b.b(e)) {
                return;
            }
        }
        this.c = null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != null;
    }

    @Override // java.util.Iterator
    public final E next() {
        E next;
        E e = this.c;
        e.getClass();
        do {
            Iterator<E> it = this.a;
            if (!it.hasNext()) {
                this.c = null;
                return e;
            }
            next = it.next();
            this.c = next;
        } while (!this.b.b(next));
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
