package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class wm9 {
    public static final Map<String, String> a = lc9.a0(new Pair("mkv", "video/x-matroska"), new Pair("glb", "model/gltf-binary"));

    public static final String a(String str) {
        str.getClass();
        int iV = zve.V(str, JwtParser.SEPARATOR_CHAR, 0, 6);
        String strSubstring = (iV < 0 || iV == str.length() + (-1)) ? null : str.substring(iV + 1);
        if (strSubstring == null) {
            return null;
        }
        Locale locale = Locale.US;
        String strF = r6.f(locale, strSubstring, locale);
        String mimeTypeFromExtension = rt9.c.get(strF);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = rt9.a.getMimeTypeFromExtension(strF);
        }
        return mimeTypeFromExtension == null ? a.get(strF) : mimeTypeFromExtension;
    }
}
