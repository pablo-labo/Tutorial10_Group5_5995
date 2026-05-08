package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
public final class gb0 extends c1f implements Function2<e13, lu2<? super Choreographer>, Object> {
    int label;

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new gb0(2, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super Choreographer> lu2Var) {
        return ((gb0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            r7d.b(obj);
            return Choreographer.getInstance();
        }
        r6.g("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
