package defpackage;

import android.webkit.MimeTypeMap;
import defpackage.p85;
import defpackage.w5b;
import io.jsonwebtoken.JwtParser;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bu7 implements p85 {
    public final lhg a;
    public final nva b;

    public static final class a implements p85.a<lhg> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            lhg lhgVar = (lhg) obj;
            if (wl7.b(lhgVar.c, "jar:file")) {
                return new bu7(lhgVar, nvaVar);
            }
            return null;
        }
    }

    public bu7(lhg lhgVar, nva nvaVar) {
        this.a = lhgVar;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        lhg lhgVar = this.a;
        String str = lhgVar.e;
        if (str == null) {
            str = "";
        }
        int iR = zve.R(str, '!', 0, false, 6);
        String mimeTypeFromExtension = null;
        if (iR == -1) {
            r40.g(lhgVar, "Invalid jar:file URI: ");
            return null;
        }
        String str2 = w5b.b;
        w5b w5bVarA = w5b.a.a(str.substring(0, iR));
        w5b w5bVarA2 = w5b.a.a(str.substring(iR + 1, str.length()));
        pa5 pa5Var = this.b.f;
        pa5Var.getClass();
        q95 q95VarA = i37.a(w5bVarA2, y6h.c(w5bVarA, pa5Var, mm5.c), null, null, 28);
        String strO0 = zve.o0(JwtParser.SEPARATOR_CHAR, w5bVarA2.c(), "");
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
