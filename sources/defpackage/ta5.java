package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ta5 {
    public static final String a = qa5.class.getSimpleName();

    public static final String a(String str) {
        if (str == null) {
            return null;
        }
        return wve.K(str, "file:///", false) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
