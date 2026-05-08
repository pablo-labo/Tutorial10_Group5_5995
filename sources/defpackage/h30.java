package defpackage;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class h30 extends c1f implements xu5<y20, oa4<Object>, Object, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        y20 y20Var = (y20) this.L$0;
        float f = ((oa4) this.L$1).f(this.L$2);
        if (!Float.isNaN(f)) {
            y20Var.a(f, 0.0f);
        }
        return j6g.a;
    }

    @Override // defpackage.xu5
    public final Object j(y20 y20Var, oa4<Object> oa4Var, Object obj, lu2<? super j6g> lu2Var) {
        h30 h30Var = new h30(4, lu2Var);
        h30Var.L$0 = y20Var;
        h30Var.L$1 = oa4Var;
        h30Var.L$2 = obj;
        return h30Var.invokeSuspend(j6g.a);
    }
}
