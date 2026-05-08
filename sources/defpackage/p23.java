package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p23 {
    public static final List<String> a = u63.a0("AK", "AL", "AR", "AS", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "FM", "GA", "GU", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MH", "MI", "MN", "MO", "MP", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "PR", "PW", "RI", "SC", "SD", "TN", "TX", "UM", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY");

    public static final String a(String str) {
        if (str.length() < 2 || !new pxc("^[A-Z]{2}$").d(str)) {
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
}
