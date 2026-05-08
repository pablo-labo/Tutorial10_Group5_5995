package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.searchoverlay.network.NetworkProfileLocationRepository$getFormattedLocation$2", f = "ProfileLocationRepository.kt", l = {41}, m = "invokeSuspend")
public final class pga extends c1f implements Function2<e13, lu2<? super String>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qga this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pga(qga qgaVar, lu2<? super pga> lu2Var) {
        super(2, lu2Var);
        this.this$0 = qgaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new pga(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super String> lu2Var) {
        return ((pga) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[Catch: SerializationException -> 0x0017, IOException -> 0x001d, TryCatch #4 {IOException -> 0x001d, SerializationException -> 0x0017, blocks: (B:6:0x0013, B:21:0x0057, B:23:0x005f, B:25:0x0067, B:27:0x006b, B:29:0x006f, B:31:0x0073, B:33:0x0077, B:35:0x007b, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:45:0x0095, B:47:0x0099, B:50:0x009f, B:52:0x00a3, B:60:0x00af, B:62:0x00b5), top: B:83:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af A[Catch: SerializationException -> 0x0017, IOException -> 0x001d, TryCatch #4 {IOException -> 0x001d, SerializationException -> 0x0017, blocks: (B:6:0x0013, B:21:0x0057, B:23:0x005f, B:25:0x0067, B:27:0x006b, B:29:0x006f, B:31:0x0073, B:33:0x0077, B:35:0x007b, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:45:0x0095, B:47:0x0099, B:50:0x009f, B:52:0x00a3, B:60:0x00af, B:62:0x00b5), top: B:83:0x0013 }] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pga.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
