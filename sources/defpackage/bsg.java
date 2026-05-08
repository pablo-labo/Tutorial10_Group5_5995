package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "coil3.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
public final class bsg extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ csg this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsg(csg csgVar, lu2<? super bsg> lu2Var) {
        super(2, lu2Var);
        this.this$0 = csgVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new bsg(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((bsg) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        csg csgVar = this.this$0;
        asg asgVar = csgVar.d;
        if (asgVar != null) {
            asgVar.e();
        }
        csgVar.d = null;
        return j6g.a;
    }
}
