package defpackage;

import com.datadog.android.trace.AndroidTracer;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, AndroidTracer.SPAN_ID_BIT_SIZE}, m = "invokeSuspend")
public final class u9e extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ AtomicReference<t9e<Object>> $arg0;
    final /* synthetic */ Function2<Object, lu2<Object>, Object> $session;
    final /* synthetic */ Function1<e13, Object> $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u9e(Function1<? super e13, Object> function1, AtomicReference<t9e<Object>> atomicReference, Function2<Object, ? super lu2<Object>, ? extends Object> function2, lu2<? super u9e> lu2Var) {
        super(2, lu2Var);
        this.$sessionInitializer = function1;
        this.$arg0 = atomicReference;
        this.$session = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        u9e u9eVar = new u9e(this.$sessionInitializer, this.$arg0, this.$session, lu2Var);
        u9eVar.L$0 = obj;
        return u9eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((u9e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r8 == r4) goto L21;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L18
            java.lang.Object r0 = r7.L$0
            t9e r0 = (defpackage.t9e) r0
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L16
        L14:
            r2 = r0
            goto L66
        L16:
            r8 = move-exception
            goto L76
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r1
        L1e:
            java.lang.Object r0 = r7.L$0
            t9e r0 = (defpackage.t9e) r0
            defpackage.r7d.b(r8)
            goto L57
        L26:
            defpackage.r7d.b(r8)
            java.lang.Object r8 = r7.L$0
            e13 r8 = (defpackage.e13) r8
            t9e r0 = new t9e
            v03 r5 = r8.getCoroutineContext()
            ex7 r5 = defpackage.u63.I(r5)
            kotlin.jvm.functions.Function1<e13, java.lang.Object> r6 = r7.$sessionInitializer
            java.lang.Object r8 = r6.invoke(r8)
            r0.<init>(r5, r8)
            java.util.concurrent.atomic.AtomicReference<t9e<java.lang.Object>> r8 = r7.$arg0
            java.lang.Object r8 = r8.getAndSet(r0)
            t9e r8 = (defpackage.t9e) r8
            if (r8 == 0) goto L57
            ex7 r8 = r8.a
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = defpackage.u63.p(r8, r7)
            if (r8 != r4) goto L57
            goto L65
        L57:
            kotlin.jvm.functions.Function2<java.lang.Object, lu2<java.lang.Object>, java.lang.Object> r8 = r7.$session     // Catch: java.lang.Throwable -> L16
            T r3 = r0.b     // Catch: java.lang.Throwable -> L16
            r7.L$0 = r0     // Catch: java.lang.Throwable -> L16
            r7.label = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r8.invoke(r3, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r4) goto L14
        L65:
            return r4
        L66:
            java.util.concurrent.atomic.AtomicReference<t9e<java.lang.Object>> r3 = r7.$arg0
        L68:
            boolean r7 = r3.compareAndSet(r2, r1)
            if (r7 == 0) goto L6f
            goto L75
        L6f:
            java.lang.Object r7 = r3.get()
            if (r7 == r2) goto L68
        L75:
            return r8
        L76:
            java.util.concurrent.atomic.AtomicReference<t9e<java.lang.Object>> r7 = r7.$arg0
        L78:
            boolean r2 = r7.compareAndSet(r0, r1)
            if (r2 != 0) goto L85
            java.lang.Object r2 = r7.get()
            if (r2 != r0) goto L85
            goto L78
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
