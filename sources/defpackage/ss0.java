package defpackage;

import defpackage.rs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.ArchivedTabViewModel$onTriggerEvent$1", f = "ArchivedTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class ss0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ rs0.b $event;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(rs0.b bVar, lu2<? super ss0> lu2Var) {
        super(2, lu2Var);
        this.$event = bVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new ss0(this.$event, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((ss0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        rs0.b bVar = this.$event;
        if (bVar instanceof rs0.b.C0411b) {
            Function1<lx5, j6g> function1 = c05.a;
            c05.g("ARCHIVED");
        } else {
            if (!(bVar instanceof rs0.b.a)) {
                l.g();
                return null;
            }
            Function1<lx5, j6g> function12 = c05.a;
            c05.a("ARCHIVED");
        }
        return j6g.a;
    }
}
