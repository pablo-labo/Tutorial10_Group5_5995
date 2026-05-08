package defpackage;

import android.util.Log;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.messaging.api.messaging.logging.MessagingLoggingRetrofitApiResolver;
import defpackage.bad;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class sr9 implements wr9 {
    public final MessagingLoggingRetrofitApiResolver a;

    public sr9() {
        ra8 ra8VarA = sa8.a(new rg(8));
        bad.b bVar = new bad.b();
        bVar.c((OkHttpClient) mq9.a.getValue());
        bVar.a(((v1g) cr8.p(v1g.class)).a());
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        MessagingLoggingRetrofitApiResolver messagingLoggingRetrofitApiResolver = (MessagingLoggingRetrofitApiResolver) bVar.b().b(MessagingLoggingRetrofitApiResolver.class);
        messagingLoggingRetrofitApiResolver.getClass();
        this.a = messagingLoggingRetrofitApiResolver;
    }

    public final Object T(xig xigVar, Function2 function2, c1f c1fVar) {
        ArrayList arrayList = lz2.a;
        Log.d("MessagingLogger", "posting userAction:\n" + xigVar, null);
        return b.a.a(this, new vr9(this, xigVar, null), function2, c1fVar);
    }

    public final Object d(m47 m47Var, Function2 function2, c1f c1fVar) {
        ArrayList arrayList = lz2.a;
        Log.d("MessagingLogger", "posting impression:\n" + m47Var, null);
        return b.a.a(this, new tr9(this, m47Var, null), function2, c1fVar);
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var) {
        throw null;
    }
}
