package defpackage;

import android.net.Uri;
import com.datadog.android.log.Logger;
import com.indeed.android.rnjobcard.RNJobCardModule;
import defpackage.v03;
import defpackage.xh8;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
public final class v2g implements u2g, xh8 {
    public final Lazy a;
    public final Lazy b;
    public final d2f c;

    public static final class a implements Callback {
        public final /* synthetic */ String a;

        public a(v2g v2gVar, String str) {
            this.a = str;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            ((np7) cr8.p(np7.class)).c("UIPRNJobCardImpl", "logJobClick onFailure", false, iOException);
            v2g.c(this.a, "onFailure", iOException, null);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            int i = response.d;
            if (response.h()) {
                return;
            }
            IOException iOException = new IOException(p6.c(i, "logJobClick error: Unexpected code: "));
            ((np7) cr8.p(np7.class)).c("UIPRNJobCardImpl", p6.c(i, "logJobClick error: Unexpected code: "), false, iOException);
            v2g.c(this.a, "onResponse", iOException, Integer.valueOf(i));
        }
    }

    public v2g() {
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        f13.a(v03.a.C0438a.c(ezeVarA, no3.c));
        w2g w2gVar = new w2g(this);
        qt8 qt8Var = qt8.a;
        this.a = boa.E(qt8Var, w2gVar);
        this.b = boa.E(qt8Var, new x2g(this));
        sa8.a(new tr(19));
        this.c = new d2f(new ag3(14));
    }

    public static void c(String str, String str2, IOException iOException, Integer num) {
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair("jobClickLog.url", str), new Pair("jobClickLog.context", str2));
        linkedHashMapB0.put("jobClickLog.errorDescription", iOException.getMessage());
        if (num != null) {
            linkedHashMapB0.put("jobClickLog.responseCode", num);
        }
        ((Logger) bg3.e.getValue()).e("JobClickLogger.failure", null, linkedHashMapB0);
    }

    @Override // defpackage.u2g
    public final void a(String str) {
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = Uri.parse(str).buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            str2.getClass();
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("vjs")) {
                builderClearQuery.appendQueryParameter("vjs", "2");
            } else {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        String string = builderClearQuery.build().toString();
        string.getClass();
        String string2 = Uri.parse(string).buildUpon().clearQuery().build().toString();
        string2.getClass();
        ((tp7) cr8.p(tp7.class)).a(new lx5("logJobClickWillLoad", "other", "logJobClickWillLoad", 1, zr4.a, new oz4(string2, 4)));
        Request.Builder builder = new Request.Builder();
        builder.g(string);
        Request requestB = builder.b();
        OkHttpClient okHttpClient = (OkHttpClient) this.c.getValue();
        okHttpClient.getClass();
        new RealCall(okHttpClient, requestB, false).R0(new a(this, string2));
    }

    @Override // defpackage.u2g
    public final void b(String str, String str2, boolean z, String str3, RNJobCardModule.a aVar) throws UnsupportedEncodingException {
        Request.Builder builder = new Request.Builder();
        StringBuilder sb = new StringBuilder(((p87) this.a.getValue()).h());
        sb.append("rpc/log/dislikeJobClick?jobKey=");
        Charset charset = StandardCharsets.UTF_8;
        String strEncode = URLEncoder.encode(str, charset.toString());
        strEncode.getClass();
        sb.append(strEncode);
        sb.append("&pageId=");
        String strEncode2 = URLEncoder.encode(str2, charset.toString());
        strEncode2.getClass();
        sb.append(strEncode2);
        sb.append("&undo=");
        String strEncode3 = URLEncoder.encode(String.valueOf(z), charset.toString());
        strEncode3.getClass();
        sb.append(strEncode3);
        sb.append("&tk=");
        if (str3 == null) {
            str3 = "";
        }
        String strEncode4 = URLEncoder.encode(str3, charset.toString());
        strEncode4.getClass();
        sb.append(strEncode4);
        builder.g(sb.toString());
        Request requestB = builder.b();
        epa epaVar = epa.a;
        OkHttpClient okHttpClientB = epa.b();
        okHttpClientB.getClass();
        new RealCall(okHttpClientB, requestB, false).R0(aVar);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
