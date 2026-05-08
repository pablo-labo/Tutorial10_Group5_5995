package okhttp3.internal;

import defpackage.a32;
import defpackage.akb;
import defpackage.b0;
import defpackage.ct0;
import defpackage.h5;
import defpackage.ja;
import defpackage.pne;
import defpackage.pva;
import defpackage.pxc;
import defpackage.r6;
import defpackage.to1;
import defpackage.u63;
import defpackage.vr1;
import defpackage.wl7;
import defpackage.zn1;
import defpackage.zve;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http2.Header;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Util {
    public static final byte[] a;
    public static final Headers b;
    public static final ResponseBody$Companion$asResponseBody$1 c;
    public static final pva d;
    public static final TimeZone e;
    public static final pxc f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        Headers.b.getClass();
        b = Headers.Companion.d(new String[0]);
        ResponseBody.b.getClass();
        zn1 zn1Var = new zn1();
        zn1Var.write(bArr, 0, 0);
        c = new ResponseBody$Companion$asResponseBody$1(null, 0L, zn1Var);
        RequestBody.Companion.d(RequestBody.INSTANCE, bArr, null, 0, 7);
        vr1 vr1Var = vr1.c;
        d = pva.a.b(vr1.a.b("efbbbf"), vr1.a.b("feff"), vr1.a.b("fffe"), vr1.a.b("0000ffff"), vr1.a.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new pxc("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = zve.d0(zve.b0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return wl7.b(httpUrl.d, httpUrl2.d) && httpUrl.e == httpUrl2.e && wl7.b(httpUrl.a, httpUrl2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            akb.n("timeout".concat(" < 0"));
            return 0;
        }
        if (timeUnit == null) {
            r6.g("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            h5.k("timeout".concat(" too large."));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        h5.k("timeout".concat(" too small."));
        return 0;
    }

    public static final void c(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!wl7.b(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c2, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (zve.M(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(str, c2, i, i2);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                ct0 ct0Var = new ct0(strArr2);
                while (ct0Var.hasNext()) {
                    if (comparator.compare(str, (String) ct0Var.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(Response response) {
        String strA = response.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @SafeVarargs
    public static final <T> List<T> k(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(u63.a0(Arrays.copyOf(objArr, objArr.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (wl7.c(cCharAt, 31) <= 0 || wl7.c(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(to1 to1Var, Charset charset) {
        to1Var.getClass();
        charset.getClass();
        int iE0 = to1Var.E0(d);
        if (iE0 == -1) {
            return charset;
        }
        if (iE0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (iE0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (iE0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (iE0 == 3) {
            a32.a.getClass();
            Charset charset5 = a32.d;
            if (charset5 != null) {
                return charset5;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            a32.d = charsetForName;
            return charsetForName;
        }
        if (iE0 != 4) {
            b0.t();
            return null;
        }
        a32.a.getClass();
        Charset charset6 = a32.c;
        if (charset6 != null) {
            return charset6;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        a32.c = charsetForName2;
        return charsetForName2;
    }

    public static final int s(to1 to1Var) {
        to1Var.getClass();
        return (to1Var.readByte() & 255) | ((to1Var.readByte() & 255) << 16) | ((to1Var.readByte() & 255) << 8);
    }

    public static final int t(zn1 zn1Var) throws EOFException {
        int i = 0;
        while (!zn1Var.W0() && zn1Var.P(0L) == 61) {
            i++;
            zn1Var.readByte();
        }
        return i;
    }

    public static final boolean u(pne pneVar, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = pneVar.g().getA() ? pneVar.g().c() - jNanoTime : Long.MAX_VALUE;
        pneVar.g().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            zn1 zn1Var = new zn1();
            while (pneVar.f1(zn1Var, 8192L) != -1) {
                zn1Var.h();
            }
            if (jC == Long.MAX_VALUE) {
                pneVar.g().a();
                return true;
            }
            pneVar.g().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                pneVar.g().a();
                return false;
            }
            pneVar.g().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                pneVar.g().a();
            } else {
                pneVar.g().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final Headers v(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.c(header.a.A(), header.b.A());
        }
        return builder.e();
    }

    public static final String w(HttpUrl httpUrl, boolean z) {
        httpUrl.getClass();
        int i = httpUrl.e;
        String strF = httpUrl.d;
        if (zve.L(strF, ":", false)) {
            strF = ja.f(']', "[", strF);
        }
        if (!z) {
            HttpUrl.Companion companion = HttpUrl.k;
            String str = httpUrl.a;
            companion.getClass();
            if (i == HttpUrl.Companion.b(str)) {
                return strF;
            }
        }
        return strF + ':' + i;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        list.getClass();
        List<T> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int y(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String z(int i, int i2, String str) {
        str.getClass();
        int iM = m(i, i2, str);
        return str.substring(iM, n(iM, i2, str));
    }
}
