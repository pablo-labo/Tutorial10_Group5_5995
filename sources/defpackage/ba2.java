package defpackage;

import okhttp3.Cookie;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ba2 {
    public final Cookie a;

    public ba2(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        Cookie.Builder builder = new Cookie.Builder();
        String string = jSONObject.getString("name");
        string.getClass();
        builder.c(string);
        String string2 = jSONObject.getString("value");
        string2.getClass();
        builder.d(string2);
        long j = jSONObject.getLong("expiresAt");
        j = j <= 0 ? Long.MIN_VALUE : j;
        builder.c = j > 253402300799999L ? 253402300799999L : j;
        builder.f = true;
        String string3 = jSONObject.getString("domain");
        string3.getClass();
        builder.b(string3);
        String string4 = jSONObject.getString("path");
        string4.getClass();
        if (!wve.K(string4, "/", false)) {
            l5.q("path must start with '/'");
            throw null;
        }
        builder.e = string4;
        this.a = builder.a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        Cookie cookie = this.a;
        sb.append(cookie.f ? "https" : "http");
        sb.append("://");
        sb.append(cookie.d);
        sb.append(cookie.e);
        sb.append('|');
        sb.append(cookie.a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ba2)) {
            return false;
        }
        Cookie cookie = ((ba2) obj).a;
        String str = cookie.a;
        Cookie cookie2 = this.a;
        return wl7.b(str, cookie2.a) && wl7.b(cookie.d, cookie2.d) && cookie.e.equals(cookie2.e);
    }

    public final int hashCode() {
        Cookie cookie = this.a;
        return cookie.e.hashCode() + akb.d(akb.d(527, 31, cookie.a), 31, cookie.d);
    }

    public ba2(Cookie cookie) {
        cookie.getClass();
        this.a = cookie;
    }
}
