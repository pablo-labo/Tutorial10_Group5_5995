package okhttp3.internal.http;

import defpackage.a32;
import defpackage.vr1;
import defpackage.wl7;
import defpackage.zn1;
import defpackage.zr4;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpHeaders {
    public static final vr1 a;
    public static final vr1 b;

    static {
        vr1 vr1Var = vr1.c;
        a = vr1.a.c("\"\\");
        b = vr1.a.c("\t ,=");
    }

    public static final boolean a(Response response) {
        if (wl7.b(response.a.b, "HEAD")) {
            return false;
        }
        int i = response.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || Util.j(response) != -1) {
            return true;
        }
        String strA = response.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.zn1 r17, java.util.ArrayList r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.b(zn1, java.util.ArrayList):void");
    }

    public static final String c(zn1 zn1Var) {
        long jZ = zn1Var.Z(b);
        if (jZ == -1) {
            jZ = zn1Var.b;
        }
        if (jZ != 0) {
            return zn1Var.h0(jZ, a32.b);
        }
        return null;
    }

    public static final void d(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        List<Cookie> listUnmodifiableList;
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.a) {
            return;
        }
        Cookie.j.getClass();
        List<String> listI = headers.i("Set-Cookie");
        int size = listI.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Cookie cookieC = Cookie.Companion.c(httpUrl, listI.get(i));
            if (cookieC != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cookieC);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = zr4.a;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        cookieJar.d(httpUrl, listUnmodifiableList);
    }

    public static final boolean e(zn1 zn1Var) throws EOFException {
        boolean z = false;
        while (!zn1Var.W0()) {
            byte bP = zn1Var.P(0L);
            if (bP == 44) {
                zn1Var.readByte();
                z = true;
            } else {
                if (bP != 32 && bP != 9) {
                    break;
                }
                zn1Var.readByte();
            }
        }
        return z;
    }
}
