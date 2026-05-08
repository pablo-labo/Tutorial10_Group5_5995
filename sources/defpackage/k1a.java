package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class k1a {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public k1a(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String string = obj.toString();
        if (!b.matcher(string).matches()) {
            l5.q(l5.l("Invalid key: ", string));
            return null;
        }
        return this.a + obj;
    }
}
