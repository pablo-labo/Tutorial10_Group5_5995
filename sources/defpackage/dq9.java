package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.messaging.api.messaging.MessagingRetrofitApiResolver;
import defpackage.bad;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class dq9 implements gs9 {
    public final MessagingRetrofitApiResolver a;

    public dq9() {
        ra8 ra8VarA = sa8.a(new tb(7));
        bad.b bVar = new bad.b();
        bVar.c((OkHttpClient) mq9.a.getValue());
        bVar.a(((v1g) cr8.p(v1g.class)).a());
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        MessagingRetrofitApiResolver messagingRetrofitApiResolver = (MessagingRetrofitApiResolver) bVar.b().b(MessagingRetrofitApiResolver.class);
        messagingRetrofitApiResolver.getClass();
        this.a = messagingRetrofitApiResolver;
    }

    @Override // defpackage.gs9
    public final MessagingRetrofitApiResolver c() {
        return this.a;
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var) {
        return b.a.a(this, function1, function2, lu2Var);
    }
}
