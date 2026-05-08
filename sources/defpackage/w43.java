package defpackage;

import defpackage.v43;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.CreateCancelOrRescheduleUrlUseCase$invoke$2", f = "CreateCancelOrRescheduleUrlUseCase.kt", l = {26, 28, 34, 39, 45, 51, 56}, m = "invokeSuspend")
public final class w43 extends c1f implements Function2<wi5<? super hf3<v43.a>>, lu2<? super j6g>, Object> {
    final /* synthetic */ v43.b $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v43 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w43(v43 v43Var, v43.b bVar, lu2<? super w43> lu2Var) {
        super(2, lu2Var);
        this.this$0 = v43Var;
        this.$param = bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        w43 w43Var = new w43(this.this$0, this.$param, lu2Var);
        w43Var.L$0 = obj;
        return w43Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<v43.a>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((w43) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        if (r0.a(r1, r8) == r5) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[PHI: r9
  0x0088: PHI (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v0 java.lang.Object) binds: [B:17:0x0084, B:11:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
