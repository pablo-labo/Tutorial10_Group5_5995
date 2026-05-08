package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.graphql.NotInitializedException;
import defpackage.hva;
import defpackage.om;
import defpackage.qc6;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.backendservices.graphql.api.tasks.OnegraphTasks$addJobSeekerProfileResumeFile$2", f = "OnegraphTasks.kt", l = {175}, m = "invokeSuspend")
public final class lsa extends c1f implements Function2<e13, lu2<? super wg0<om.b>>, Object> {
    final /* synthetic */ Function2<ApiError, Request, j6g> $callbackLogError;
    final /* synthetic */ mm $input;
    int label;
    final /* synthetic */ ksa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lsa(ksa ksaVar, mm mmVar, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super lsa> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ksaVar;
        this.$input = mmVar;
        this.$callbackLogError = function2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lsa(this.this$0, this.$input, this.$callbackLogError, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super wg0<om.b>> lu2Var) {
        return ((lsa) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws NotInitializedException {
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
        if (ewa.c == null) {
            throw new NotInitializedException();
        }
        String strA = d93.a();
        wg2 wg2Var = ewa.c;
        if (wg2Var == null) {
            throw new NotInitializedException();
        }
        String strH = wg2Var.H();
        om omVar = new om(new hva.c(this.$input));
        Function2<ApiError, Request, j6g> function2 = this.$callbackLogError;
        this.label = 1;
        Object objA = qc6.a.a(ksaVar, strA, strH, omVar, function2, this, 4);
        g13 g13Var = g13.a;
        return objA == g13Var ? g13Var : objA;
    }
}
