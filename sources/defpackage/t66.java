package defpackage;

import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.b;
import com.indeed.android.ghostwriter.debug.GhostwriterDebugFragment;
import com.indeed.android.ghostwriter.services.GhostwriterRetrofitApiResolver;
import defpackage.bad;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class t66 implements s66 {
    public final GhostwriterRetrofitApiResolver a;

    public t66(OkHttpClient okHttpClient) {
        ra8 ra8VarA = sa8.a(new bh(4));
        bad.b bVar = new bad.b();
        bVar.b = okHttpClient;
        bVar.a("https://ghostwriter.sandbox.qa.indeed.net/api/v1/");
        MediaType.e.getClass();
        bVar.d.add(ewa.q(ra8VarA, MediaType.Companion.a("application/json")));
        GhostwriterRetrofitApiResolver ghostwriterRetrofitApiResolver = (GhostwriterRetrofitApiResolver) bVar.b().b(GhostwriterRetrofitApiResolver.class);
        ghostwriterRetrofitApiResolver.getClass();
        this.a = ghostwriterRetrofitApiResolver;
    }

    @Override // defpackage.r86
    public final Serializable F(zh1 zh1Var, t76 t76Var) {
        return r86.G(this, zh1Var, t76Var);
    }

    @Override // defpackage.r86
    public final Object I(String str, uv uvVar, GhostwriterDebugFragment.f fVar) {
        return r86.s(this, str, uvVar, fVar);
    }

    @Override // defpackage.r86
    public final Serializable L(c10 c10Var, v76 v76Var) {
        return r86.P(this, c10Var, v76Var);
    }

    @Override // defpackage.r86
    public final Object S(String str, String str2, String str3, xd xdVar, GhostwriterDebugFragment.g gVar) {
        return r86.n(this, str, str2, str3, xdVar, gVar);
    }

    @Override // defpackage.u66
    public final GhostwriterRetrofitApiResolver c() {
        return this.a;
    }

    @Override // defpackage.r86
    public final List i(u76 u76Var) {
        return super.i(u76Var);
    }

    @Override // com.indeed.android.backendservices.common.api.b
    public final <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var) {
        return b.a.a(this, function1, function2, lu2Var);
    }

    @Override // defpackage.r86
    public final Object y(String str, ug2 ug2Var, s76 s76Var) {
        return r86.g(this, str, ug2Var, s76Var);
    }
}
