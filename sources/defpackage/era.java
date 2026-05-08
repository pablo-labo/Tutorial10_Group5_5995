package defpackage;

import android.net.http.SslError;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public interface era extends xw9 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("Pass", 0);
            a = aVar;
            a aVar2 = new a("Proceed", 1);
            a aVar3 = new a("Cancel", 2);
            b = aVar3;
            c = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    a c(WebView webView, SslError sslError);
}
