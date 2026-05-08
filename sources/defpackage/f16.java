package defpackage;

import defpackage.e16;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetJobSeekerProStatusUseCase$invoke$2", f = "GetJobSeekerProStatusUseCase.kt", l = {24, 25, 28, 37, 42}, m = "invokeSuspend")
public final class f16 extends c1f implements Function2<wi5<? super hf3<e16.a>>, lu2<? super j6g>, Object> {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e16 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f16(e16 e16Var, lu2<? super f16> lu2Var) {
        super(2, lu2Var);
        this.this$0 = e16Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        f16 f16Var = new f16(this.this$0, lu2Var);
        f16Var.L$0 = obj;
        return f16Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<e16.a>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((f16) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        if (r15 != null) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f16.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
