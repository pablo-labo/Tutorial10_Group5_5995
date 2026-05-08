package defpackage;

import defpackage.w56;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.domain.usecase.GetTopChoicesUseCase$invoke$2", f = "GetTopChoicesUseCase.kt", l = {27, 28, 32, 36, 41}, m = "invokeSuspend")
public final class x56 extends c1f implements Function2<wi5<? super hf3<List<? extends w56.b>>>, lu2<? super j6g>, Object> {
    final /* synthetic */ w56.a $param;
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
    final /* synthetic */ w56 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x56(w56 w56Var, w56.a aVar, lu2<? super x56> lu2Var) {
        super(2, lu2Var);
        this.this$0 = w56Var;
        this.$param = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        x56 x56Var = new x56(this.this$0, this.$param, lu2Var);
        x56Var.L$0 = obj;
        return x56Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<List<? extends w56.b>>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((x56) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0148, code lost:
    
        if (r15 != null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Type inference failed for: r7v1, types: [zr4] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x56.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
