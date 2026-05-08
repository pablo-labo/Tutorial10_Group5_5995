package defpackage;

import defpackage.js9;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kw5 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = vjg.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(js9 js9Var) {
        int i = 0;
        while (true) {
            js9.a[] aVarArr = js9Var.a;
            if (i >= aVarArr.length) {
                return;
            }
            js9.a aVar = aVarArr[i];
            if (aVar instanceof jc2) {
                jc2 jc2Var = (jc2) aVar;
                if ("iTunSMPB".equals(jc2Var.c) && a(jc2Var.d)) {
                    return;
                }
            } else if (aVar instanceof si7) {
                si7 si7Var = (si7) aVar;
                if ("com.apple.iTunes".equals(si7Var.b) && "iTunSMPB".equals(si7Var.c) && a(si7Var.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
