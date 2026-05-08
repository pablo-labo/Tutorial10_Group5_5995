package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.a;
import defpackage.j88;
import defpackage.wg0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.proctor.ProctorLoaderWrapper$loadInitGraphQL$1", f = "ProctorLoaderWrapper.kt", l = {105}, m = "invokeSuspend")
public final class dpb extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Function2<ApiError, Request, j6g> $callbackLogError;
    final /* synthetic */ Function1<p81, j6g> $errorCallback;
    final /* synthetic */ q98 $parameters;
    final /* synthetic */ Function1<hd7, j6g> $resultHandleCallback;
    int label;
    final /* synthetic */ epb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dpb(epb epbVar, q98 q98Var, Function2<? super ApiError, ? super Request, j6g> function2, Function1<? super p81, j6g> function1, Function1<? super hd7, j6g> function12, lu2<? super dpb> lu2Var) {
        super(2, lu2Var);
        this.this$0 = epbVar;
        this.$parameters = q98Var;
        this.$callbackLogError = function2;
        this.$errorCallback = function1;
        this.$resultHandleCallback = function12;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new dpb(this.this$0, this.$parameters, this.$callbackLogError, this.$errorCallback, this.$resultHandleCallback, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((dpb) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        dpb dpbVar;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            gsa gsaVar = (gsa) this.this$0.d.getValue();
            q98 q98Var = this.$parameters;
            String str = q98Var.c;
            String str2 = q98Var.d;
            String str3 = q98Var.e;
            boolean z = q98Var.f;
            mu9 mu9Var = q98Var.g;
            ArrayList arrayList = q98Var.i;
            List<String> list = q98Var.l;
            List<String> list2 = q98Var.h;
            gx0 gx0Var = q98Var.k;
            Function2<ApiError, Request, j6g> function2 = this.$callbackLogError;
            this.label = 1;
            dpbVar = this;
            obj = gsaVar.A(str2, str3, z, mu9Var, arrayList, list2, gx0Var, function2, list, dpbVar);
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
            dpbVar = this;
        }
        wg0 wg0Var = (wg0) obj;
        Function1<hd7, j6g> function1 = dpbVar.$resultHandleCallback;
        q98 q98Var2 = dpbVar.$parameters;
        Function1<p81, j6g> function12 = dpbVar.$errorCallback;
        if (wg0Var instanceof wg0.b) {
            try {
                j88.e eVar = ((j88.c) ((wg0.b) wg0Var).a).a;
                if (eVar == null) {
                    throw new IOException("Null GraphQL data object");
                }
                function1.invoke(v45.c(eVar, q98Var2.j));
                function12.invoke(null);
            } catch (Exception e) {
                a.f fVar = new a.f("oth", "Other error");
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                function12.invoke(new ApiError(fVar, message, null, e));
            }
        }
        Function1<p81, j6g> function13 = dpbVar.$errorCallback;
        if (wg0Var instanceof wg0.a) {
            function13.invoke(((wg0.a) wg0Var).a);
        }
        return j6g.a;
    }
}
