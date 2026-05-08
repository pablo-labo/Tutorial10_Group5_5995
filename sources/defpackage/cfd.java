package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {1984}, m = "invokeSuspend")
public final class cfd extends c1f implements Function2<e13, lu2<Object>, Object> {
    final /* synthetic */ Function1<lu2<Object>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cfd(Function1<? super lu2<Object>, ? extends Object> function1, lu2<? super cfd> lu2Var) {
        super(2, lu2Var);
        this.$block = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        cfd cfdVar = new cfd(this.$block, lu2Var);
        cfdVar.L$0 = obj;
        return cfdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<Object> lu2Var) {
        return ((cfd) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            java.lang.String r2 = "Transaction was never started or was already released."
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 != r3) goto L14
            java.lang.Object r5 = r5.L$0
            arf r5 = (defpackage.arf) r5
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L12
            goto L47
        L12:
            r6 = move-exception
            goto L58
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r1
        L1a:
            defpackage.r7d.b(r6)
            java.lang.Object r6 = r5.L$0
            e13 r6 = (defpackage.e13) r6
            v03 r6 = r6.getCoroutineContext()
            arf$a r0 = defpackage.arf.c
            v03$a r6 = r6.h1(r0)
            r6.getClass()
            arf r6 = (defpackage.arf) r6
            java.util.concurrent.atomic.AtomicInteger r0 = r6.b
            r0.incrementAndGet()
            kotlin.jvm.functions.Function1<lu2<java.lang.Object>, java.lang.Object> r0 = r5.$block     // Catch: java.lang.Throwable -> L54
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L54
            r5.label = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r5 = r0.invoke(r5)     // Catch: java.lang.Throwable -> L54
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L44
            return r0
        L44:
            r4 = r6
            r6 = r5
            r5 = r4
        L47:
            java.util.concurrent.atomic.AtomicInteger r5 = r5.b
            int r5 = r5.decrementAndGet()
            if (r5 < 0) goto L50
            return r6
        L50:
            defpackage.r6.g(r2)
            return r1
        L54:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L58:
            java.util.concurrent.atomic.AtomicInteger r5 = r5.b
            int r5 = r5.decrementAndGet()
            if (r5 >= 0) goto L64
            defpackage.r6.g(r2)
            return r1
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
