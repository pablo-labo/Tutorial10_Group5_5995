package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class vxg {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(g4b g4bVar) {
        g4bVar.getClass();
        String strK = g4bVar.k(StandardCharsets.UTF_8);
        return strK != null && strK.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = vjg.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                l5.q("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(g4b g4bVar) throws ParserException {
        int i = g4bVar.b;
        if (a(g4bVar)) {
            return;
        }
        g4bVar.J(i);
        throw ParserException.a(null, "Expected WEBVTT. Got " + g4bVar.k(StandardCharsets.UTF_8));
    }
}
