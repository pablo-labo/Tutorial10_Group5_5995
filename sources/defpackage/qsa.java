package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import defpackage.hva;
import defpackage.qc6;
import defpackage.v26;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.backendservices.graphql.api.tasks.OnegraphTasks$getPreferenceAttributesByCustomClass$2", f = "OnegraphTasks.kt", l = {122}, m = "invokeSuspend")
public final class qsa extends c1f implements Function2<e13, lu2<? super wg0<v26.b>>, Object> {
    final /* synthetic */ Function2<ApiError, Request, j6g> $callbackLogError;
    final /* synthetic */ u58 $input;
    int label;
    final /* synthetic */ ksa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qsa(ksa ksaVar, u58 u58Var, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super qsa> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ksaVar;
        this.$input = u58Var;
        this.$callbackLogError = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new qsa(this.this$0, this.$input, this.$callbackLogError, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super wg0<v26.b>> lu2Var) {
        return ((qsa) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
        ksa ksaVar = this.this$0;
        v26 v26Var = new v26(new hva.c(this.$input));
        Function2<ApiError, Request, j6g> function2 = this.$callbackLogError;
        this.label = 1;
        Object objA = qc6.a.a(ksaVar, null, null, v26Var, function2, this, 7);
        g13 g13Var = g13.a;
        return objA == g13Var ? g13Var : objA;
    }
}
