package defpackage;

import defpackage.xh8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class on0 implements xh8 {
    public static final on0 a = new on0();

    public final String a(String str) {
        if (str.length() < 2 || !new pxc("^[A-Z]{2}$").d(str)) {
            ArrayList arrayList = lz2.a;
            lz2.b("AppUtils", "Invalid country code: ".concat(str), false, new Exception("Received invalid country code in getFlagEmojiByCountryCode: ".concat(str)));
            return "";
        }
        int iCodePointAt = Character.codePointAt(str, 0) - (-127397);
        int iCodePointAt2 = Character.codePointAt(str, 1) - (-127397);
        char[] chars = Character.toChars(iCodePointAt);
        chars.getClass();
        String str2 = new String(chars);
        char[] chars2 = Character.toChars(iCodePointAt2);
        chars2.getClass();
        return str2.concat(new String(chars2));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
