package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.profile.models.ProfileViewModel$deleteUploadedResumeFile$1", f = "ProfileViewModel.kt", l = {1185, 1189, 1195, 1198}, m = "invokeSuspend")
public final class y1c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $fileName;
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ x1c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1c(x1c x1cVar, String str, lu2<? super y1c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = x1cVar;
        this.$fileName = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new y1c(this.this$0, this.$fileName, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((y1c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r0 == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r0 == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r0 == r9) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5  */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
