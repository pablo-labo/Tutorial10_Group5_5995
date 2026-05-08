package defpackage;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import defpackage.p85;
import defpackage.w5b;
import io.jsonwebtoken.JwtParser;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ab5 implements p85 {
    public final lhg a;
    public final nva b;

    public static final class a implements p85.a<lhg> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            lhg lhgVar = (lhg) obj;
            String str = lhgVar.c;
            if ((str != null && !str.equals("file")) || lhgVar.e == null) {
                return null;
            }
            Bitmap.Config[] configArr = ukg.a;
            if (wl7.b(lhgVar.c, "file") && wl7.b(z92.Q0(pg8.z(lhgVar)), "android_asset")) {
                return null;
            }
            return new ab5(lhgVar, nvaVar);
        }
    }

    public ab5(lhg lhgVar, nva nvaVar) {
        this.a = lhgVar;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        String str = w5b.b;
        String strX = pg8.x(this.a);
        String mimeTypeFromExtension = null;
        if (strX == null) {
            r6.g("filePath == null");
            return null;
        }
        w5b w5bVarA = w5b.a.a(strX);
        q95 q95VarA = i37.a(w5bVarA, this.b.f, null, null, 28);
        String strO0 = zve.o0(JwtParser.SEPARATOR_CHAR, w5bVarA.c(), "");
        if (!zve.U(strO0)) {
            String lowerCase = strO0.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mimeTypeFromExtension = (String) tt9.a.get(lowerCase);
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new rne(q95VarA, mimeTypeFromExtension, we3.c);
    }
}
