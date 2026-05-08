package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfilePreferencesViewModel$updatePreferredMinimumPay$1", f = "ProfilePreferencesViewModel.kt", l = {262, 284}, m = "invokeSuspend")
public final class ttb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ hva<d68> $minimumPayForInput;
    final /* synthetic */ Function1<cs7, j6g> $onComplete;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ aub this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ttb(aub aubVar, hva<d68> hvaVar, Function1<? super cs7, j6g> function1, lu2<? super ttb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aubVar;
        this.$minimumPayForInput = hvaVar;
        this.$onComplete = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ttb ttbVar = new ttb(this.this$0, this.$minimumPayForInput, this.$onComplete, lu2Var);
        ttbVar.L$0 = obj;
        return ttbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ttb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r0 == r9) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:7:0x0021, B:36:0x013a, B:38:0x013e, B:40:0x0146, B:43:0x014c, B:46:0x0152, B:49:0x0158, B:51:0x015c, B:53:0x019a, B:55:0x01a4, B:56:0x01a8, B:57:0x01ac, B:58:0x01b0, B:14:0x003f, B:26:0x00a2, B:28:0x00a6, B:30:0x00f1, B:31:0x00f5, B:32:0x00fd, B:17:0x0055, B:20:0x0066, B:23:0x0074, B:33:0x0106), top: B:69:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:7:0x0021, B:36:0x013a, B:38:0x013e, B:40:0x0146, B:43:0x014c, B:46:0x0152, B:49:0x0158, B:51:0x015c, B:53:0x019a, B:55:0x01a4, B:56:0x01a8, B:57:0x01ac, B:58:0x01b0, B:14:0x003f, B:26:0x00a2, B:28:0x00a6, B:30:0x00f1, B:31:0x00f5, B:32:0x00fd, B:17:0x0055, B:20:0x0066, B:23:0x0074, B:33:0x0106), top: B:69:0x000f }] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
