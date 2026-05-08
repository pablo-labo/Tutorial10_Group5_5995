package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public interface jra extends xw9 {

    public static abstract class a {

        /* JADX INFO: renamed from: jra$a$a, reason: collision with other inner class name */
        public static final class C0281a extends a {
            public C0281a(pgd pgdVar) {
                pgdVar.getClass();
            }
        }

        public static final class b extends a {
            public static final b a = new b();
        }
    }

    a h(WebView webView, WebResourceRequest webResourceRequest);
}
