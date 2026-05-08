package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
public final class h0d extends c1f implements wu5<Integer, Throwable, lu2<? super Boolean>, Object> {
    int label;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return Boolean.FALSE;
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.wu5
    public final Object q(Integer num, Throwable th, lu2<? super Boolean> lu2Var) {
        num.intValue();
        new h0d(3, lu2Var).invokeSuspend(j6g.a);
        return Boolean.FALSE;
    }
}
