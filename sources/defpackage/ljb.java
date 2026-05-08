package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
public final class ljb extends c1f implements Function2<rjb, lu2<? super rjb>, Object> {
    final /* synthetic */ Function2<rjb, lu2<? super rjb>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ljb(Function2<? super rjb, ? super lu2<? super rjb>, ? extends Object> function2, lu2<? super ljb> lu2Var) {
        super(2, lu2Var);
        this.$transform = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        ljb ljbVar = new ljb(this.$transform, lu2Var);
        ljbVar.L$0 = obj;
        return ljbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rjb rjbVar, lu2<? super rjb> lu2Var) {
        return ((ljb) create(rjbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            rjb rjbVar = (rjb) this.L$0;
            Function2<rjb, lu2<? super rjb>, Object> function2 = this.$transform;
            this.label = 1;
            obj = function2.invoke(rjbVar, this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        rjb rjbVar2 = (rjb) obj;
        ((s3a) rjbVar2).b.set(true);
        return rjbVar2;
    }
}
