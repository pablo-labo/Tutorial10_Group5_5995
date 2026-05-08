package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.uiplugin.fragment.modals.BottomSheetViewModel$fireStartCloseEvent$1", f = "BottomSheetViewModel.kt", l = {44}, m = "invokeSuspend")
public final class vk1 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ xk1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk1(xk1 xk1Var, lu2<? super vk1> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xk1Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new vk1(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((vk1) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xk1 xk1Var = this.this$0;
            xk1Var.d = true;
            xk1Var.b.i();
            nde ndeVar = this.this$0.b;
            j6g j6gVar = j6g.a;
            this.label = 1;
            Object objA = ndeVar.a(j6gVar, this);
            g13 g13Var = g13.a;
            if (objA == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
