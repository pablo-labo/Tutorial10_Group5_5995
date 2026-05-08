package defpackage;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class jj9 {
    public static final HashSet<String> a = new HashSet<>();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        if (a.add(str)) {
            b += ", " + str;
        }
    }
}
