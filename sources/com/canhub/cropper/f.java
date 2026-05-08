package com.canhub.cropper;

import defpackage.c1f;
import defpackage.e13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.uh3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", f = "BitmapLoadingWorkerJob.kt", l = {52, 66}, m = "invokeSuspend")
public final class f extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, lu2<? super f> lu2Var) {
        super(2, lu2Var);
        this.this$0 = dVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        f fVar = new f(this.this$0, lu2Var);
        fVar.L$0 = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((f) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        if (r15 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
    
        if (r14 == r4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        return r4;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
