package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import defpackage.dye;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gxe implements dye {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList<String> b = new ArrayList<>();
    public final g4b c = new g4b();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.n83 d(android.text.Spanned r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxe.d(android.text.Spanned, java.lang.String):n83");
    }

    public static long e(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.dye
    public final void b(byte[] bArr, int i, int i2, dye.b bVar, wq2<s83> wq2Var) {
        String strK;
        String str;
        gxe gxeVar = this;
        long j = bVar.a;
        g4b g4bVar = gxeVar.c;
        g4bVar.H(i + i2, bArr);
        g4bVar.J(i);
        Charset charsetF = g4bVar.F();
        if (charsetF == null) {
            charsetF = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        while (true) {
            String strK2 = g4bVar.k(charsetF);
            if (strK2 == null) {
                break;
            }
            if (!strK2.isEmpty()) {
                try {
                    Integer.parseInt(strK2);
                    strK = g4bVar.k(charsetF);
                } catch (NumberFormatException unused) {
                    zkd.T("SubripParser", "Skipping invalid index: ".concat(strK2));
                }
                if (strK == null) {
                    zkd.T("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(strK);
                if (matcher.matches()) {
                    long jE = e(matcher, 1);
                    long jE2 = e(matcher, 6);
                    StringBuilder sb = gxeVar.a;
                    long j3 = j2;
                    sb.setLength(0);
                    ArrayList<String> arrayList2 = gxeVar.b;
                    arrayList2.clear();
                    for (String strK3 = g4bVar.k(charsetF); !TextUtils.isEmpty(strK3); strK3 = g4bVar.k(charsetF)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strK3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = e.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String strGroup = matcher3.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher3.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            matcher2 = matcher3;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || jE2 >= j4) {
                        wq2Var.accept(new s83(jE, jE2 - jE, e47.n(d(spannedFromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new s83(jE, jE2 - jE, e47.n(d(spannedFromHtml, str))));
                    }
                    gxeVar = this;
                    j2 = j3;
                    j = j4;
                } else {
                    zkd.T("SubripParser", "Skipping invalid timing: ".concat(strK));
                    gxeVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wq2Var.accept((s83) it.next());
            }
        }
    }

    @Override // defpackage.dye
    public final int c() {
        return 1;
    }
}
