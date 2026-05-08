package okhttp3;

import defpackage.akb;
import defpackage.bs4;
import defpackage.kc9;
import defpackage.wve;
import defpackage.zr4;
import java.io.EOFException;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.Cookie;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "okhttp-urlconnection"}, k = 1, mv = {1, 4, 0})
public final class JavaNetCookieJar implements CookieJar {
    public final CookieHandler b;

    public JavaNetCookieJar(CookieHandler cookieHandler) {
        cookieHandler.getClass();
        this.b = cookieHandler;
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> b(HttpUrl httpUrl) throws EOFException {
        zr4 zr4Var = zr4.a;
        httpUrl.getClass();
        try {
            Map<String, List<String>> map = this.b.get(httpUrl.i(), bs4.a);
            map.getClass();
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                    value.getClass();
                    if (!value.isEmpty()) {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            str.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i = 0;
                            while (i < length) {
                                int iF = Util.f(str, i, length, ";,");
                                int iE = Util.e(str, '=', i, iF);
                                String strZ = Util.z(i, iE, str);
                                if (!wve.K(strZ, "$", false)) {
                                    String strZ2 = iE < iF ? Util.z(iE + 1, iF, str) : "";
                                    if (wve.K(strZ2, "\"", false) && wve.D(strZ2, "\"", false)) {
                                        strZ2 = akb.j(1, 1, strZ2);
                                    }
                                    Cookie.Builder builder = new Cookie.Builder();
                                    builder.c(strZ);
                                    builder.d(strZ2);
                                    builder.b(httpUrl.d);
                                    arrayList2.add(builder.a());
                                }
                                i = iF + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return zr4Var;
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
            return listUnmodifiableList;
        } catch (IOException e) {
            Platform.a.getClass();
            Platform platform = Platform.b;
            StringBuilder sb = new StringBuilder("Loading cookies failed for ");
            HttpUrl httpUrlH = httpUrl.h("/...");
            httpUrlH.getClass();
            sb.append(httpUrlH);
            String string = sb.toString();
            platform.getClass();
            Platform.i(5, string, e);
            return zr4Var;
        }
    }

    @Override // okhttp3.CookieJar
    public final void d(HttpUrl httpUrl, List<Cookie> list) throws EOFException {
        httpUrl.getClass();
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : list) {
            cookie.getClass();
            arrayList.add(cookie.a(true));
        }
        try {
            this.b.put(httpUrl.i(), kc9.W(new Pair("Set-Cookie", arrayList)));
        } catch (IOException e) {
            Platform.a.getClass();
            Platform platform = Platform.b;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            HttpUrl httpUrlH = httpUrl.h("/...");
            httpUrlH.getClass();
            sb.append(httpUrlH);
            String string = sb.toString();
            platform.getClass();
            Platform.i(5, string, e);
        }
    }
}
