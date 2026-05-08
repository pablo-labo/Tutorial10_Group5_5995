package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.JavaNetCookieJar;

/* JADX INFO: loaded from: classes2.dex */
public final class bkc implements dz2 {
    public JavaNetCookieJar b;

    @Override // defpackage.dz2
    public final void a() {
        this.b = null;
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> b(HttpUrl httpUrl) throws EOFException {
        httpUrl.getClass();
        JavaNetCookieJar javaNetCookieJar = this.b;
        if (javaNetCookieJar == null) {
            return zr4.a;
        }
        List<Cookie> listB = javaNetCookieJar.b(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : listB) {
            try {
                new Headers.Builder().a(cookie.a, cookie.b);
                arrayList.add(cookie);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // defpackage.dz2
    public final void c(JavaNetCookieJar javaNetCookieJar) {
        this.b = javaNetCookieJar;
    }

    @Override // okhttp3.CookieJar
    public final void d(HttpUrl httpUrl, List<Cookie> list) throws EOFException {
        httpUrl.getClass();
        JavaNetCookieJar javaNetCookieJar = this.b;
        if (javaNetCookieJar != null) {
            javaNetCookieJar.d(httpUrl, list);
        }
    }
}
