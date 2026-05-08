package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {68}, m = "invokeSuspend")
public final class aj5 extends c1f implements Function2<wi5<Object>, lu2<? super j6g>, Object> {
    final /* synthetic */ wu5<Object, Object, lu2<Object>, Object> $operation;
    final /* synthetic */ vi5<Object> $this_simpleRunningReduce;
    private /* synthetic */ Object L$0;
    int label;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ luc<Object> a;
        public final /* synthetic */ wu5<T, T, lu2<? super T>, Object> b;
        public final /* synthetic */ wi5<T> c;

        /* JADX INFO: renamed from: aj5$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", l = {73, 76}, m = "emit")
        public static final class C0003a extends pu2 {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0003a(a<? super T> aVar, lu2<? super C0003a> lu2Var) {
                super(lu2Var);
                this.this$0 = aVar;
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(luc<Object> lucVar, wu5<? super T, ? super T, ? super lu2<? super T>, ? extends Object> wu5Var, wi5<? super T> wi5Var) {
            this.a = lucVar;
            this.b = wu5Var;
            this.c = wi5Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        
            if (r9.a(r8, r0) != r5) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // defpackage.wi5
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(T r9, defpackage.lu2<? super defpackage.j6g> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof aj5.a.C0003a
                if (r0 == 0) goto L13
                r0 = r10
                aj5$a$a r0 = (aj5.a.C0003a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                aj5$a$a r0 = new aj5$a$a
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 2
                r4 = 1
                g13 r5 = defpackage.g13.a
                if (r1 == 0) goto L3d
                if (r1 == r4) goto L31
                if (r1 != r3) goto L2b
                defpackage.r7d.b(r10)
                goto L75
            L2b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r2
            L31:
                java.lang.Object r8 = r0.L$1
                luc r8 = (defpackage.luc) r8
                java.lang.Object r9 = r0.L$0
                aj5$a r9 = (aj5.a) r9
                defpackage.r7d.b(r10)
                goto L5c
            L3d:
                defpackage.r7d.b(r10)
                luc<java.lang.Object> r10 = r8.a
                T r1 = r10.element
                java.lang.Object r6 = defpackage.ka2.V
                if (r1 != r6) goto L49
                goto L60
            L49:
                r0.L$0 = r8
                r0.L$1 = r10
                r0.label = r4
                wu5<T, T, lu2<? super T>, java.lang.Object> r4 = r8.b
                java.lang.Object r9 = r4.q(r1, r9, r0)
                if (r9 != r5) goto L58
                goto L74
            L58:
                r7 = r9
                r9 = r8
                r8 = r10
                r10 = r7
            L5c:
                r7 = r10
                r10 = r8
                r8 = r9
                r9 = r7
            L60:
                r10.element = r9
                wi5<T> r9 = r8.c
                luc<java.lang.Object> r8 = r8.a
                T r8 = r8.element
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r9.a(r8, r0)
                if (r8 != r5) goto L75
            L74:
                return r5
            L75:
                j6g r8 = defpackage.j6g.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: aj5.a.a(java.lang.Object, lu2):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aj5(vi5<Object> vi5Var, wu5<Object, Object, ? super lu2<Object>, ? extends Object> wu5Var, lu2<? super aj5> lu2Var) {
        super(2, lu2Var);
        this.$this_simpleRunningReduce = vi5Var;
        this.$operation = wu5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        aj5 aj5Var = new aj5(this.$this_simpleRunningReduce, this.$operation, lu2Var);
        aj5Var.L$0 = obj;
        return aj5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<Object> wi5Var, lu2<? super j6g> lu2Var) {
        return ((aj5) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            wi5 wi5Var = (wi5) this.L$0;
            luc lucVar = new luc();
            lucVar.element = ka2.V;
            vi5<Object> vi5Var = this.$this_simpleRunningReduce;
            a aVar = new a(lucVar, this.$operation, wi5Var);
            this.label = 1;
            Object objE = vi5Var.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
