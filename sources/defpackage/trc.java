package defpackage;

import defpackage.qn9;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class trc implements dwe {
    public final nug a;
    public final a b;

    public static final class a extends y79<qn9.b, b> {
        public final /* synthetic */ trc d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, trc trcVar) {
            super(j);
            this.d = trcVar;
        }

        @Override // defpackage.y79
        public final void a(qn9.b bVar, b bVar2, b bVar3) {
            b bVar4 = bVar2;
            this.d.a.c(bVar, bVar4.a, bVar4.b, bVar4.c);
        }
    }

    public static final class b {
        public final k07 a;
        public final Map<String, Object> b;
        public final long c;

        public b(k07 k07Var, Map<String, ? extends Object> map, long j) {
            this.a = k07Var;
            this.b = map;
            this.c = j;
        }
    }

    public trc(long j, nug nugVar) {
        this.a = nugVar;
        this.b = new a(j, this);
    }

    @Override // defpackage.dwe
    public final long a() {
        return this.b.b();
    }

    @Override // defpackage.dwe
    public final qn9.c b(qn9.b bVar) {
        b bVar2 = (b) this.b.b.get(bVar);
        if (bVar2 != null) {
            return new qn9.c(bVar2.a, bVar2.b);
        }
        return null;
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
    @Override // defpackage.dwe
    public final void c(qn9.b bVar, k07 k07Var, Map<String, ? extends Object> map, long j) {
        a aVar = this.b;
        long j2 = aVar.a;
        LinkedHashMap linkedHashMap = aVar.b;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(bVar);
            if (objRemove != null) {
                aVar.c = aVar.b() - aVar.c(bVar, objRemove);
                aVar.a(bVar, objRemove, null);
            }
            this.a.c(bVar, k07Var, map, j);
            return;
        }
        b bVar2 = new b(k07Var, map, j);
        Object objPut = linkedHashMap.put(bVar, bVar2);
        aVar.c = aVar.c(bVar, bVar2) + aVar.b();
        if (objPut != null) {
            aVar.c = aVar.b() - aVar.c(bVar, objPut);
            aVar.a(bVar, objPut, bVar2);
        }
        aVar.d(aVar.a);
    }

    @Override // defpackage.dwe
    public final void clear() {
        this.b.d(-1L);
    }

    @Override // defpackage.dwe
    public final void d(long j) {
        this.b.d(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwe
    public final boolean e(qn9.b bVar) {
        a aVar = this.b;
        Object objRemove = aVar.b.remove(bVar);
        if (objRemove != null) {
            aVar.c = aVar.b() - aVar.c(bVar, objRemove);
            aVar.a(bVar, objRemove, null);
        }
        return objRemove != null;
    }
}
