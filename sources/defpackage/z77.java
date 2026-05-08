package defpackage;

import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public class z77 implements y77 {
    public static final d2f c = new d2f(new ao0(5));
    public final ojh b;

    public z77(int i) {
        this.b = new ojh(14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    @Override // okhttp3.CookieJar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<okhttp3.Cookie> b(okhttp3.HttpUrl r5) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z77.b(okhttp3.HttpUrl):java.util.List");
    }

    @Override // okhttp3.CookieJar
    public final void d(HttpUrl httpUrl, List<Cookie> list) {
        httpUrl.getClass();
        String str = httpUrl.i;
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            String strA = it.next().a(false);
            CookieManager cookieManager = (CookieManager) c.getValue();
            if (cookieManager != null) {
                cookieManager.setCookie(str, strA);
            }
        }
        this.b.getClass();
        httpUrl.getClass();
    }

    public z77() {
        this(0);
    }
}
