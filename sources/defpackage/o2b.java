package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {141, 158, 170, 173, 225, 228}, m = "invokeSuspend")
public final class o2b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ kza<Object> $event;
    final /* synthetic */ l2b<Object> $pagingData;
    int label;
    final /* synthetic */ n2b<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2b(kza<Object> kzaVar, n2b<Object> n2bVar, l2b<Object> l2bVar, lu2<? super o2b> lu2Var) {
        super(2, lu2Var);
        this.$event = kzaVar;
        this.this$0 = n2bVar;
        this.$pagingData = l2bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new o2b(this.$event, this.this$0, this.$pagingData, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((o2b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (defpackage.n2b.a(r0, r1, r2, r3, true, r5, r6, r7, r10) == r9) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r0.b() != r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
    
        if (r0.b() != r9) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3 A[LOOP:0: B:94:0x01bd->B:96:0x01c3, LOOP_END] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
