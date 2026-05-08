package defpackage;

import defpackage.ad3;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c04 extends ad3.b<hv1, hv1> {
    public final /* synthetic */ luc<hv1> a;
    public final /* synthetic */ Function1<hv1, Boolean> b;

    public c04(Function1 function1, luc lucVar) {
        this.a = lucVar;
        this.b = function1;
    }

    @Override // ad3.d
    public final Object a() {
        return this.a.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, hv1, java.lang.Object] */
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
    @Override // ad3.b, ad3.d
    public final void b(Object obj) {
        ?? r3 = (hv1) obj;
        r3.getClass();
        luc<hv1> lucVar = this.a;
        if (lucVar.element == null && ((Boolean) this.b.invoke(r3)).booleanValue()) {
            lucVar.element = r3;
        }
    }

    @Override // ad3.d
    public final boolean c(Object obj) {
        ((hv1) obj).getClass();
        return this.a.element == null;
    }
}
