package androidx.paging;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.uh3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
public final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<lu2<? super j6g>, Object> $block;
    final /* synthetic */ int $priority;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(SingleRunner singleRunner, int i, Function1<? super lu2<? super j6g>, ? extends Object> function1, lu2<? super d> lu2Var) {
        super(2, lu2Var);
        this.this$0 = singleRunner;
        this.$priority = i;
        this.$block = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        d dVar = new d(this.this$0, this.$priority, this.$block, lu2Var);
        dVar.L$0 = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r9 != r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ex7] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v8, types: [ex7] */
    /* JADX WARN: Type inference failed for: r10v14, types: [androidx.paging.SingleRunner$a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.paging.SingleRunner$a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.paging.d, java.lang.Object, pu2] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.paging.d, pu2] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
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
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            g13 r6 = defpackage.g13.a
            if (r0 == 0) goto L39
            if (r0 == r5) goto L31
            if (r0 == r4) goto L27
            if (r0 == r3) goto L22
            if (r0 == r2) goto L19
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r1
        L19:
            java.lang.Object r9 = r9.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.r7d.b(r10)
            goto L96
        L22:
            defpackage.r7d.b(r10)
            goto L97
        L27:
            java.lang.Object r0 = r9.L$0
            ex7 r0 = (defpackage.ex7) r0
            defpackage.r7d.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L77
        L2f:
            r10 = move-exception
            goto L86
        L31:
            java.lang.Object r0 = r9.L$0
            ex7 r0 = (defpackage.ex7) r0
            defpackage.r7d.b(r10)
            goto L62
        L39:
            defpackage.r7d.b(r10)
            java.lang.Object r10 = r9.L$0
            e13 r10 = (defpackage.e13) r10
            v03 r10 = r10.getCoroutineContext()
            ex7$a r0 = ex7.a.a
            v03$a r10 = r10.h1(r0)
            if (r10 == 0) goto L9a
            ex7 r10 = (defpackage.ex7) r10
            androidx.paging.SingleRunner r0 = r9.this$0
            androidx.paging.SingleRunner$a r0 = r0.a
            int r7 = r9.$priority
            r9.L$0 = r10
            r9.label = r5
            java.lang.Object r0 = r0.b(r7, r10, r9)
            if (r0 != r6) goto L5f
            goto L94
        L5f:
            r8 = r0
            r0 = r10
            r10 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L97
            kotlin.jvm.functions.Function1<lu2<? super j6g>, java.lang.Object> r10 = r9.$block     // Catch: java.lang.Throwable -> L2f
            r9.L$0 = r0     // Catch: java.lang.Throwable -> L2f
            r9.label = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r10.invoke(r9)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r6) goto L77
            goto L94
        L77:
            androidx.paging.SingleRunner r10 = r9.this$0
            androidx.paging.SingleRunner$a r10 = r10.a
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r9 = r10.a(r0, r9)
            if (r9 != r6) goto L97
            goto L94
        L86:
            androidx.paging.SingleRunner r1 = r9.this$0
            androidx.paging.SingleRunner$a r1 = r1.a
            r9.L$0 = r10
            r9.label = r2
            java.lang.Object r9 = r1.a(r0, r9)
            if (r9 != r6) goto L95
        L94:
            return r6
        L95:
            r9 = r10
        L96:
            throw r9
        L97:
            j6g r9 = defpackage.j6g.a
            return r9
        L9a:
            java.lang.String r9 = "Internal error. coroutineScope should've created a job."
            defpackage.r6.g(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
