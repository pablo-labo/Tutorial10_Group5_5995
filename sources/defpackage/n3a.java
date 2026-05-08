package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n3a<K, V> extends nb9<K, V> {
    public final z8b<K, V> c;
    public V d;

    public n3a(z8b<K, V> z8bVar, K k, V v) {
        super(k, v);
        this.c = z8bVar;
        this.d = v;
    }

    @Override // defpackage.nb9, java.util.Map.Entry
    public final V getValue() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.nb9, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.d;
        this.d = v;
        x8b<K, V, Map.Entry<K, V>> x8bVar = this.c.a;
        w8b<K, V> w8bVar = x8bVar.d;
        K k = this.a;
        if (!w8bVar.containsKey(k)) {
            return v2;
        }
        boolean z = x8bVar.c;
        if (!z) {
            w8bVar.put(k, v);
        } else {
            if (!z) {
                k20.p();
                return null;
            }
            ttf ttfVar = x8bVar.a[x8bVar.b];
            Object obj = ttfVar.a[ttfVar.c];
            w8bVar.put(k, v);
            x8bVar.d(obj != null ? obj.hashCode() : 0, w8bVar.c, obj, 0);
        }
        x8bVar.V = w8bVar.e;
        return v2;
    }
}
