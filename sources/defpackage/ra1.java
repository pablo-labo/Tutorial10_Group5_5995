package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.BaseRemoteDataSource$getResult$2", f = "BaseRemoteDataSource.kt", l = {21, 24, 27, 34}, m = "invokeSuspend")
public final class ra1 extends c1f implements Function2<wi5<? super hf3<Object>>, lu2<? super j6g>, Object> {
    final /* synthetic */ Function1<lu2<? super m6d<Object>>, Object> $call;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ra1(Function1<? super lu2<? super m6d<Object>>, ? extends Object> function1, lu2<? super ra1> lu2Var) {
        super(2, lu2Var);
        this.$call = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ra1 ra1Var = new ra1(this.$call, lu2Var);
        ra1Var.L$0 = obj;
        return ra1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super hf3<Object>> wi5Var, lu2<? super j6g> lu2Var) {
        return ((ra1) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r0.a(r1, r11) == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r0.a(r12, r11) == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r0.a(r1, r11) == r7) goto L34;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
