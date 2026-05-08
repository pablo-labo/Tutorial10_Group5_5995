package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.rnmessaging.api.logging.MessagingLoggingRetrofitApiResolver;
import defpackage.bad;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class rr9 implements nq9 {
    public final MessagingLoggingRetrofitApiResolver a;

    public rr9() {
        ra8 ra8VarA = sa8.a(new he(10));
        bad.b bVar = new bad.b();
        bVar.c((OkHttpClient) lq9.a.getValue());
        bVar.a(((v1g) cr8.p(v1g.class)).a());
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        MessagingLoggingRetrofitApiResolver messagingLoggingRetrofitApiResolver = (MessagingLoggingRetrofitApiResolver) bVar.b().b(MessagingLoggingRetrofitApiResolver.class);
        messagingLoggingRetrofitApiResolver.getClass();
        this.a = messagingLoggingRetrofitApiResolver;
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var) {
        throw null;
    }
}
