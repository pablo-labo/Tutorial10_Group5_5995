package defpackage;

import defpackage.d0a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", l = {227}, m = "invokeSuspend")
public final class j0a extends c1f implements Function2<e13, lu2<? super d0a.a>, Object> {
    int label;
    final /* synthetic */ d0a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0a(d0a d0aVar, lu2<? super j0a> lu2Var) {
        super(2, lu2Var);
        this.this$0 = d0aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new j0a(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super d0a.a> lu2Var) {
        return ((j0a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        go1 go1Var = this.this$0.e;
        this.label = 1;
        Object objD = f13.d(new e0a(go1Var, null), this);
        g13 g13Var = g13.a;
        return objD == g13Var ? g13Var : objD;
    }
}
