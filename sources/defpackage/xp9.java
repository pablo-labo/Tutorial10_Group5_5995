package defpackage;

import com.indeed.android.jobsearch.backend.api.messages.MessagesRetrofitApiResolver;
import defpackage.bad;
import defpackage.xh8;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class xp9 implements wp9, xh8 {
    public final p87 a;
    public final MessagesRetrofitApiResolver b;

    public xp9(p87 p87Var, OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.a = p87Var;
        ra8 ra8VarA = sa8.a(new ue(11));
        String strE = p87Var.e();
        bad.b bVar = new bad.b();
        bVar.b = okHttpClient;
        bVar.a(strE);
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        MessagesRetrofitApiResolver messagesRetrofitApiResolver = (MessagesRetrofitApiResolver) bVar.b().b(MessagesRetrofitApiResolver.class);
        messagesRetrofitApiResolver.getClass();
        this.b = messagesRetrofitApiResolver;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
