package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.apollographql.apollo.internal.MultipartKt$multipartBodyFlow$2", f = "multipart.kt", l = {}, m = "invokeSuspend", v = 1)
public final class i2a extends c1f implements wu5<wi5<? super to1>, Throwable, lu2<? super j6g>, Object> {
    final /* synthetic */ luc<j2a> $multipartReader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2a(lu2 lu2Var, luc lucVar) {
        super(3, lu2Var);
        this.$multipartReader = lucVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        try {
            j2a j2aVar = this.$multipartReader.element;
            if (j2aVar != null) {
                j2aVar.close();
                j6g j6gVar = j6g.a;
            }
        } catch (Throwable unused) {
        }
        return j6g.a;
    }

    @Override // defpackage.wu5
    public final Object q(wi5<? super to1> wi5Var, Throwable th, lu2<? super j6g> lu2Var) {
        i2a i2aVar = new i2a(lu2Var, this.$multipartReader);
        i2aVar.L$0 = wi5Var;
        return i2aVar.invokeSuspend(j6g.a);
    }
}
