package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
public final class g0f extends c1f implements Function2<efb, lu2<? super j6g>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new g0f(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
        return ((g0f) create(efbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return j6g.a;
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
