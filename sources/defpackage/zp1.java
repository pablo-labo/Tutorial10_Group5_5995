package defpackage;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.xp1;
import java.io.File;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zp1 {
    public final /* synthetic */ Response a;
    public final /* synthetic */ xp1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ File d;
    public final /* synthetic */ xp1.a e;
    public final /* synthetic */ l34 f;

    public zp1(Response response, xp1 xp1Var, String str, File file, xp1.a aVar, l34 l34Var) {
        this.a = response;
        this.b = xp1Var;
        this.c = str;
        this.d = file;
        this.e = aVar;
        this.f = l34Var;
    }

    public final void a(Map<String, String> map, zn1 zn1Var, boolean z) {
        l34 l34Var = this.f;
        if (z) {
            int i = this.a.d;
            if (map.containsKey("X-Http-Status")) {
                i = Integer.parseInt(map.getOrDefault("X-Http-Status", "0"));
            }
            Headers.b.getClass();
            xp1.a(this.b, this.c, i, Headers.Companion.a(map), zn1Var, this.d, this.e, l34Var);
            return;
        }
        if (map.containsKey(TracingInterceptor.HEADER_CT) && wl7.b(map.get(TracingInterceptor.HEADER_CT), "application/json")) {
            try {
                JSONObject jSONObject = new JSONObject(zn1Var.z1());
                l34Var.b(jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null, jSONObject.has("status") ? jSONObject.getString("status") : "Bundling");
            } catch (JSONException e) {
                s55.f("ReactNative", "Error parsing progress JSON. " + e);
            }
        }
    }
}
