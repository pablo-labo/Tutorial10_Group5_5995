package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class rve {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
