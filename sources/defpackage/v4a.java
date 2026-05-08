package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {211, 127}, m = "invokeSuspend")
public final class v4a extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function1<lu2<Object>, Object> $block;
    final /* synthetic */ n4a $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ y4a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v4a(n4a n4aVar, y4a y4aVar, Function1<? super lu2<Object>, ? extends Object> function1, lu2<? super v4a> lu2Var) {
        super(2, lu2Var);
        this.$priority = n4aVar;
        this.this$0 = y4aVar;
        this.$block = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        v4a v4aVar = new v4a(this.$priority, this.this$0, this.$block, lu2Var);
        v4aVar.L$0 = obj;
        return v4aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((v4a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            r3 = 0
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L27
            if (r0 != r1) goto L21
            java.lang.Object r0 = r7.L$2
            y4a r0 = (defpackage.y4a) r0
            java.lang.Object r1 = r7.L$1
            z4a r1 = (defpackage.z4a) r1
            java.lang.Object r7 = r7.L$0
            y4a$a r7 = (y4a.a) r7
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L1e
            goto L8d
        L1e:
            r8 = move-exception
            goto La8
        L21:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r3
        L27:
            java.lang.Object r0 = r7.L$3
            y4a r0 = (defpackage.y4a) r0
            java.lang.Object r2 = r7.L$2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r5 = r7.L$1
            z4a r5 = (defpackage.z4a) r5
            java.lang.Object r6 = r7.L$0
            y4a$a r6 = (y4a.a) r6
            defpackage.r7d.b(r8)
            r8 = r0
            r0 = r6
            goto L77
        L3d:
            defpackage.r7d.b(r8)
            java.lang.Object r8 = r7.L$0
            e13 r8 = (defpackage.e13) r8
            y4a$a r0 = new y4a$a
            n4a r5 = r7.$priority
            v03 r8 = r8.getCoroutineContext()
            ex7$a r6 = ex7.a.a
            v03$a r8 = r8.h1(r6)
            r8.getClass()
            ex7 r8 = (defpackage.ex7) r8
            r0.<init>(r5, r8)
            y4a r8 = r7.this$0
            defpackage.y4a.a(r8, r0)
            y4a r8 = r7.this$0
            a5a r5 = r8.b
            kotlin.jvm.functions.Function1<lu2<java.lang.Object>, java.lang.Object> r6 = r7.$block
            r7.L$0 = r0
            r7.L$1 = r5
            r7.L$2 = r6
            r7.L$3 = r8
            r7.label = r2
            java.lang.Object r2 = r5.h(r7)
            if (r2 != r4) goto L76
            goto L87
        L76:
            r2 = r6
        L77:
            r7.L$0 = r0     // Catch: java.lang.Throwable -> La2
            r7.L$1 = r5     // Catch: java.lang.Throwable -> La2
            r7.L$2 = r8     // Catch: java.lang.Throwable -> La2
            r7.L$3 = r3     // Catch: java.lang.Throwable -> La2
            r7.label = r1     // Catch: java.lang.Throwable -> La2
            java.lang.Object r7 = r2.invoke(r7)     // Catch: java.lang.Throwable -> La2
            if (r7 != r4) goto L88
        L87:
            return r4
        L88:
            r1 = r8
            r8 = r7
            r7 = r0
            r0 = r1
            r1 = r5
        L8d:
            java.util.concurrent.atomic.AtomicReference<y4a$a> r0 = r0.a     // Catch: java.lang.Throwable -> La0
        L8f:
            boolean r2 = r0.compareAndSet(r7, r3)     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L96
            goto L9c
        L96:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            if (r2 == r7) goto L8f
        L9c:
            r1.p(r3)
            return r8
        La0:
            r7 = move-exception
            goto Lb8
        La2:
            r7 = move-exception
            r1 = r8
            r8 = r7
            r7 = r0
            r0 = r1
            r1 = r5
        La8:
            java.util.concurrent.atomic.AtomicReference<y4a$a> r0 = r0.a     // Catch: java.lang.Throwable -> La0
        Laa:
            boolean r2 = r0.compareAndSet(r7, r3)     // Catch: java.lang.Throwable -> La0
            if (r2 != 0) goto Lb7
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            if (r2 != r7) goto Lb7
            goto Laa
        Lb7:
            throw r8     // Catch: java.lang.Throwable -> La0
        Lb8:
            r1.p(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
