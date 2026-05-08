package defpackage;

import com.bumptech.glide.load.engine.e;
import com.bumptech.glide.load.engine.j;
import defpackage.fx9;
import defpackage.ke3;

/* JADX INFO: loaded from: classes.dex */
public final class tne implements ke3.a<Object> {
    public final /* synthetic */ fx9.a a;
    public final /* synthetic */ j b;

    public tne(j jVar, fx9.a aVar) {
        this.b = jVar;
        this.a = aVar;
    }

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
    @Override // ke3.a
    public final void c(Exception exc) {
        j jVar = this.b;
        fx9.a<?> aVar = this.a;
        fx9.a<?> aVar2 = jVar.f;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        j jVar2 = this.b;
        fx9.a aVar3 = this.a;
        e eVar = jVar2.b;
        kg8 kg8Var = jVar2.V;
        ke3<Data> ke3Var = aVar3.c;
        eVar.e(kg8Var, exc, ke3Var, ke3Var.e());
    }

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
    @Override // ke3.a
    public final void f(Object obj) {
        j jVar = this.b;
        fx9.a<?> aVar = this.a;
        fx9.a<?> aVar2 = jVar.f;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        j jVar2 = this.b;
        fx9.a aVar3 = this.a;
        d64 d64Var = jVar2.a.p;
        if (obj != null && d64Var.c(aVar3.c.e())) {
            jVar2.e = obj;
            jVar2.b.t(e.EnumC0117e.b);
        } else {
            e eVar = jVar2.b;
            kg8 kg8Var = aVar3.a;
            ke3<Data> ke3Var = aVar3.c;
            eVar.f(kg8Var, obj, ke3Var, ke3Var.e(), jVar2.V);
        }
    }
}
