package defpackage;

import defpackage.k36;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetRemainingTopChoicesUseCase$invoke$2", f = "GetRemainingTopChoicesUseCase.kt", l = {22, 23, 28, 32, 37}, m = "invokeSuspend")
public final class l36 extends c1f implements Function2<wi5<? super hf3<k36.a>>, lu2<? super j6g>, Object> {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ k36 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l36(k36 k36Var, lu2<? super l36> lu2Var) {
        super(2, lu2Var);
        this.this$0 = k36Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        l36 l36Var = new l36(this.this$0, lu2Var);
        l36Var.L$0 = obj;
        return l36Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<k36.a>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((l36) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[PHI: r1
  0x00db: PHI (r1v4 wg0) = (r1v2 wg0), (r1v2 wg0), (r1v12 wg0) binds: [B:25:0x008e, B:40:0x00d8, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l36.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
