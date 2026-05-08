package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {841, 841}, m = "invokeSuspend")
public final class tgf extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ rgf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgf(rgf rgfVar, lu2<? super tgf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = rgfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new tgf(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((tgf) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a1, code lost:
    
        if (r1 == r5) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r6 = r1;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r6 = r1;
        r18 = 2;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
