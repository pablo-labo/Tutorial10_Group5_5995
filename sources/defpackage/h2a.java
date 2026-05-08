package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$1", f = "multipart.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class h2a extends c1f implements Function2<wi5<? super to1>, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<j2a> $multipartReader;
    final /* synthetic */ bm6 $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2a(luc<j2a> lucVar, bm6 bm6Var, lu2<? super h2a> lu2Var) {
        super(2, lu2Var);
        this.$multipartReader = lucVar;
        this.$response = bm6Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        h2a h2aVar = new h2a(this.$multipartReader, this.$response, lu2Var);
        h2aVar.L$0 = obj;
        return h2aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super to1> wi5Var, lu2<? super j6g> lu2Var) {
        return ((h2a) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bf  */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, j2a] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
