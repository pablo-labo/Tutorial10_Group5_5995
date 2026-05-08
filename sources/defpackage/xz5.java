package defpackage;

import defpackage.wz5;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetApplyLinkUrlUseCase$invoke$2", f = "GetApplyLinkUrlUseCase.kt", l = {24, 26, 33, 38, 44, 50, 56, 62}, m = "invokeSuspend")
public final class xz5 extends c1f implements Function2<wi5<? super hf3<wz5.a>>, lu2<? super j6g>, Object> {
    final /* synthetic */ wz5.b $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ wz5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz5(wz5 wz5Var, wz5.b bVar, lu2<? super xz5> lu2Var) {
        super(2, lu2Var);
        this.this$0 = wz5Var;
        this.$param = bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        xz5 xz5Var = new xz5(this.this$0, this.$param, lu2Var);
        xz5Var.L$0 = obj;
        return xz5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<wz5.a>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((xz5) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        if (r0.a(r10, r9) == r6) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[PHI: r10
  0x00ab: PHI (r10v6 java.lang.Object) = (r10v5 java.lang.Object), (r10v0 java.lang.Object) binds: [B:18:0x00a7, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b7  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
