package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class oxg {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final g4b a = new g4b();
    public final StringBuilder b = new StringBuilder();

    public static String a(g4b g4bVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = g4bVar.b;
        int i2 = g4bVar.c;
        while (i < i2 && !z) {
            char c2 = (char) g4bVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        g4bVar.K(i - g4bVar.b);
        return sb.toString();
    }

    public static String b(g4b g4bVar, StringBuilder sb) {
        c(g4bVar);
        if (g4bVar.a() == 0) {
            return null;
        }
        String strA = a(g4bVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) g4bVar.x());
    }

    public static void c(g4b g4bVar) {
        while (true) {
            for (boolean z = true; g4bVar.a() > 0 && z; z = false) {
                int i = g4bVar.b;
                byte[] bArr = g4bVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    g4bVar.K(1);
                } else {
                    int i2 = g4bVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            g4bVar.K(i2 - g4bVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
