package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class dsh {
    public static final Logger a = Logger.getLogger(dsh.class.getName());

    public static abstract class a {
        public String a;
        public String b;

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }
    }

    public static String a(String str) {
        if (str != null) {
            return !str.endsWith("/") ? str.concat("/") : str;
        }
        ja.k("root URL cannot be null.");
        return null;
    }

    public static String b(String str) {
        if (str == null) {
            ja.k("service path cannot be null");
            return null;
        }
        if (str.length() == 1) {
            if ("/".equals(str)) {
                return "";
            }
            l5.q("service path must equal \"/\" if it is of length 1.");
            return null;
        }
        if (str.length() <= 0) {
            return str;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return str.startsWith("/") ? str.substring(1) : str;
    }
}
