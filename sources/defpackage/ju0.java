package defpackage;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import defpackage.p85;
import io.jsonwebtoken.JwtParser;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ju0 implements p85 {
    public final lhg a;
    public final nva b;

    public static final class a implements p85.a<lhg> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            lhg lhgVar = (lhg) obj;
            Bitmap.Config[] configArr = ukg.a;
            if (wl7.b(lhgVar.c, "file") && wl7.b(z92.Q0(pg8.z(lhgVar)), "android_asset")) {
                return new ju0(lhgVar, nvaVar);
            }
            return null;
        }
    }

    public ju0(lhg lhgVar, nva nvaVar) {
        this.a = lhgVar;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) throws IOException {
        String strW0 = z92.W0(z92.J0(pg8.z(this.a), 1), "/", null, null, null, 62);
        nva nvaVar = this.b;
        une uneVar = new une(new uqc(c0h.S(nvaVar.a.getAssets().open(strW0))), nvaVar.f, new fu0(strW0));
        String mimeTypeFromExtension = null;
        if (!zve.U(strW0)) {
            String strR0 = zve.r0(zve.r0(strW0, '#'), TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR);
            String strO0 = zve.o0(JwtParser.SEPARATOR_CHAR, zve.o0('/', strR0, strR0), "");
            if (!zve.U(strO0)) {
                String lowerCase = strO0.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                mimeTypeFromExtension = (String) tt9.a.get(lowerCase);
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                }
            }
        }
        return new rne(uneVar, mimeTypeFromExtension, we3.c);
    }
}
