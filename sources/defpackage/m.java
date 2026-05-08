package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.t44;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final Bitmap.Config[] a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};
    public static final Bitmap.Config b = Bitmap.Config.HARDWARE;
    public static final Headers c = new Headers.Builder().e();

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || zve.U(str)) {
            return null;
        }
        String strR0 = zve.r0(zve.r0(str, '#'), TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR);
        return mimeTypeMap.getMimeTypeFromExtension(zve.o0(JwtParser.SEPARATOR_CHAR, zve.o0('/', strR0, strR0), ""));
    }

    public static final boolean c(Uri uri) {
        return wl7.b(uri.getScheme(), "file") && wl7.b((String) z92.Q0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(t44 t44Var, tmd tmdVar) {
        if (t44Var instanceof t44.a) {
            return ((t44.a) t44Var).a;
        }
        int iOrdinal = tmdVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        l.g();
        return 0;
    }
}
