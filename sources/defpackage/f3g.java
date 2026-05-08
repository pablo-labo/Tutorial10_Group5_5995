package defpackage;

import com.indeed.android.jobsearch.uiplugin.HttpException;
import defpackage.c87;
import defpackage.e3g;
import defpackage.ez2;
import defpackage.xh8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f3g implements e3g, xh8 {
    public final Lazy a = boa.E(qt8.a, new b(this));

    public static final class a implements jv1<ResponseBody> {
        public final /* synthetic */ e3g.a a;

        public a(e3g.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.jv1
        public final void a(av1<ResponseBody> av1Var, Throwable th) {
            this.a.b(new Exception(th));
        }

        @Override // defpackage.jv1
        public final void b(av1<ResponseBody> av1Var, m6d<ResponseBody> m6dVar) {
            Response response = m6dVar.a;
            boolean zH = response.h();
            e3g.a aVar = this.a;
            if (!zH) {
                aVar.b(new HttpException(response.d));
                return;
            }
            ResponseBody responseBody = m6dVar.b;
            String strV = responseBody != null ? responseBody.v() : null;
            if (strV == null) {
                aVar.b(new IOException("Response body is null"));
                return;
            }
            try {
                aVar.a(new JSONObject(strV));
            } catch (Exception e) {
                aVar.b(e);
            }
        }
    }

    public static final class b extends mj8 implements gu5<gsa> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f3g f3gVar) {
            super(0);
            this.$this_inject = f3gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gsa, java.lang.Object] */
        @Override // defpackage.gu5
        public final gsa invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gsa.class), a9cVar);
        }
    }

    @Override // defpackage.e3g
    public final void a(LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ez2.a.getClass();
            ez2 ez2VarA = ez2.a.a(str);
            if (ez2VarA != null) {
                d2f d2fVar = c87.a;
                c87.a.d(ez2VarA, str2);
            }
        }
    }

    @Override // defpackage.e3g
    public final void b(String str, String str2, JSONObject jSONObject, String str3, String str4, JSONObject jSONObject2, e3g.a aVar) throws JSONException {
        int i;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("query", str);
        jSONObject3.put("variables", jSONObject);
        jSONObject3.put("operationName", str2);
        MediaType.e.getClass();
        MediaType mediaTypeA = MediaType.Companion.a("application/json");
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string = jSONObject3.toString();
        string.getClass();
        companion.getClass();
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(string, mediaTypeA);
        int i2 = 15;
        if (jSONObject2 != null && jSONObject2.has("timeoutSeconds")) {
            try {
                i = jSONObject2.getInt("timeoutSeconds");
            } catch (Exception e) {
                e = e;
                i = 15;
            }
            if (i < 1) {
                try {
                    ArrayList arrayList = lz2.a;
                    lz2.b("UIPReactNativeImpl", "Invalid \"timeoutSeconds\": value must be a positive integer. Defaulting to 15 seconds.", false, new IllegalArgumentException("\"timeoutSeconds\" is negative"));
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    ArrayList arrayList2 = lz2.a;
                    lz2.b("UIPReactNativeImpl", "Invalid \"timeoutSeconds\": value is not a valid Int. Defaulting to 15 seconds.", false, exc);
                    i2 = i;
                }
            } else {
                i2 = i;
            }
        }
        ArrayList arrayList3 = lz2.a;
        lz2.d("UIPReactNativeImpl", "postNativeOneGraphOperation: timeoutSeconds=" + i2, false, null);
        ((gsa) this.a.getValue()).w(i2).post("87a0749e1d2ea18f2cfe899d32d63a9a5d417e571991de20daaa66fb7bee8ad6", d93.a(), r03.p(d93.f()), null, str3, str4, requestBody$Companion$toRequestBody$2A).N(new a(aVar));
    }

    @Override // defpackage.e3g
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ez2.a.getClass();
            ez2 ez2VarA = ez2.a.a(str);
            if (ez2VarA != null) {
                d2f d2fVar = c87.a;
                c87.a.c(ez2VarA, "", 0L);
            }
        }
    }

    @Override // defpackage.e3g
    public final LinkedHashMap e(ArrayList arrayList) {
        String strA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ez2.a.getClass();
            ez2 ez2VarA = ez2.a.a(str);
            if (ez2VarA != null) {
                d2f d2fVar = c87.a;
                strA = c87.a.a(ez2VarA);
            } else {
                strA = null;
            }
            linkedHashMap.put(str, strA);
        }
        return linkedHashMap;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
