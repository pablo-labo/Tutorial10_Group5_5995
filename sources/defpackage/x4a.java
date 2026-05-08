package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {211, 167}, m = "invokeSuspend")
public final class x4a extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function2<Object, lu2<Object>, Object> $block;
    final /* synthetic */ n4a $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ y4a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x4a(n4a n4aVar, y4a y4aVar, Function2<Object, ? super lu2<Object>, ? extends Object> function2, Object obj, lu2<? super x4a> lu2Var) {
        super(2, lu2Var);
        this.$priority = n4aVar;
        this.this$0 = y4aVar;
        this.$block = function2;
        this.$receiver = obj;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        x4a x4aVar = new x4a(this.$priority, this.this$0, this.$block, this.$receiver, lu2Var);
        x4aVar.L$0 = obj;
        return x4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((x4a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.x81
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L42
            if (r0 == r2) goto L27
            if (r0 != r1) goto L21
            java.lang.Object r0 = r8.L$2
            y4a r0 = (defpackage.y4a) r0
            java.lang.Object r1 = r8.L$1
            z4a r1 = (defpackage.z4a) r1
            java.lang.Object r8 = r8.L$0
            y4a$a r8 = (y4a.a) r8
            defpackage.r7d.b(r9)     // Catch: java.lang.Throwable -> L1e
            goto L98
        L1e:
            r9 = move-exception
            goto Lb3
        L21:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r3
        L27:
            java.lang.Object r0 = r8.L$4
            y4a r0 = (defpackage.y4a) r0
            java.lang.Object r2 = r8.L$3
            java.lang.Object r5 = r8.L$2
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = r8.L$1
            z4a r6 = (defpackage.z4a) r6
            java.lang.Object r7 = r8.L$0
            y4a$a r7 = (y4a.a) r7
            defpackage.r7d.b(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L80
        L42:
            defpackage.r7d.b(r9)
            java.lang.Object r9 = r8.L$0
            e13 r9 = (defpackage.e13) r9
            y4a$a r0 = new y4a$a
            n4a r5 = r8.$priority
            v03 r9 = r9.getCoroutineContext()
            ex7$a r6 = ex7.a.a
            v03$a r9 = r9.h1(r6)
            r9.getClass()
            ex7 r9 = (defpackage.ex7) r9
            r0.<init>(r5, r9)
            y4a r9 = r8.this$0
            defpackage.y4a.a(r9, r0)
            y4a r9 = r8.this$0
            a5a r5 = r9.b
            kotlin.jvm.functions.Function2<java.lang.Object, lu2<java.lang.Object>, java.lang.Object> r6 = r8.$block
            java.lang.Object r7 = r8.$receiver
            r8.L$0 = r0
            r8.L$1 = r5
            r8.L$2 = r6
            r8.L$3 = r7
            r8.L$4 = r9
            r8.label = r2
            java.lang.Object r2 = r5.h(r8)
            if (r2 != r4) goto L7f
            goto L92
        L7f:
            r2 = r7
        L80:
            r8.L$0 = r0     // Catch: java.lang.Throwable -> Lad
            r8.L$1 = r5     // Catch: java.lang.Throwable -> Lad
            r8.L$2 = r9     // Catch: java.lang.Throwable -> Lad
            r8.L$3 = r3     // Catch: java.lang.Throwable -> Lad
            r8.L$4 = r3     // Catch: java.lang.Throwable -> Lad
            r8.label = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> Lad
            if (r8 != r4) goto L93
        L92:
            return r4
        L93:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L98:
            java.util.concurrent.atomic.AtomicReference<y4a$a> r0 = r0.a     // Catch: java.lang.Throwable -> Lab
        L9a:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto La1
            goto La7
        La1:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lab
            if (r2 == r8) goto L9a
        La7:
            r1.p(r3)
            return r9
        Lab:
            r8 = move-exception
            goto Lc3
        Lad:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lb3:
            java.util.concurrent.atomic.AtomicReference<y4a$a> r0 = r0.a     // Catch: java.lang.Throwable -> Lab
        Lb5:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto Lc2
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lab
            if (r2 != r8) goto Lc2
            goto Lb5
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> Lab
        Lc3:
            r1.p(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
