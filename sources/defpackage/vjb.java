package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
public final class vjb extends c1f implements Function2<rjb, lu2<? super rjb>, Object> {
    final /* synthetic */ Function2<s3a, lu2<? super j6g>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vjb(Function2<? super s3a, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super vjb> lu2Var) {
        super(2, lu2Var);
        this.$transform = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        vjb vjbVar = new vjb(this.$transform, lu2Var);
        vjbVar.L$0 = obj;
        return vjbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rjb rjbVar, lu2<? super rjb> lu2Var) {
        return ((vjb) create(rjbVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s3a s3aVar = (s3a) this.L$0;
            r7d.b(obj);
            return s3aVar;
        }
        r7d.b(obj);
        s3a s3aVar2 = new s3a(new LinkedHashMap(((rjb) this.L$0).a()), false);
        Function2<s3a, lu2<? super j6g>, Object> function2 = this.$transform;
        this.L$0 = s3aVar2;
        this.label = 1;
        Object objInvoke = function2.invoke(s3aVar2, this);
        g13 g13Var = g13.a;
        return objInvoke == g13Var ? g13Var : s3aVar2;
    }
}
