package defpackage;

import android.webkit.CookieManager;
import java.net.CookieHandler;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class tp5 extends CookieHandler {
    public CookieManager a;

    public final CookieManager a() {
        if (this.a == null) {
            try {
                this.a = CookieManager.getInstance();
            } catch (IllegalArgumentException | Exception unused) {
                return null;
            }
        }
        return this.a;
    }

    @Override // java.net.CookieHandler
    public final Map<String, List<String>> get(URI uri, Map<String, ? extends List<String>> map) {
        uri.getClass();
        map.getClass();
        CookieManager cookieManagerA = a();
        String cookie = cookieManagerA != null ? cookieManagerA.getCookie(uri.toString()) : null;
        return (cookie == null || cookie.length() == 0) ? bs4.a : kc9.W(new Pair("Cookie", u63.Z(cookie)));
    }

    @Override // java.net.CookieHandler
    public final void put(URI uri, Map<String, ? extends List<String>> map) {
        uri.getClass();
        map.getClass();
        String string = uri.toString();
        string.getClass();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (wve.E(key, "Set-cookie", true) || wve.E(key, "Set-cookie2", true)) {
                value.getClass();
                for (String str : value) {
                    CookieManager cookieManagerA = a();
                    if (cookieManagerA != null) {
                        cookieManagerA.setCookie(string, str, null);
                    }
                }
                CookieManager cookieManagerA2 = a();
                if (cookieManagerA2 != null) {
                    cookieManagerA2.flush();
                }
            }
        }
    }
}
