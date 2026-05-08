package defpackage;

import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.FetchEmployerInvitationsUseCase$invoke$2", f = "FetchEmployerInvitationsUseCase.kt", l = {22, 25, 32, 42, 47, 52}, m = "invokeSuspend")
public final class b85 extends c1f implements Function2<wi5<? super hf3<EmployerInvitationDto>>, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c85 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b85(c85 c85Var, lu2<? super b85> lu2Var) {
        super(2, lu2Var);
        this.this$0 = c85Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        b85 b85Var = new b85(this.this$0, lu2Var);
        b85Var.L$0 = obj;
        return b85Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<EmployerInvitationDto>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((b85) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r0.a(r1, r9) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r0.a(r10, r9) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r0.a(r10, r9) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
    
        if (r0.a(r10, r9) == r3) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[PHI: r1
  0x005a: PHI (r1v4 ub6) = (r1v3 ub6), (r1v16 ub6) binds: [B:14:0x0056, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b85.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
