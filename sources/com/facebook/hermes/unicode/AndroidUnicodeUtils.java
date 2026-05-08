package com.facebook.hermes.unicode;

import defpackage.b0;
import defpackage.f84;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@f84
public class AndroidUnicodeUtils {
    @f84
    public static String convertToCase(String str, int i, boolean z) {
        Locale locale = z ? Locale.getDefault() : Locale.ENGLISH;
        if (i == 0) {
            return str.toUpperCase(locale);
        }
        if (i == 1) {
            return str.toLowerCase(locale);
        }
        b0.o("Invalid target case");
        return null;
    }

    @f84
    public static String dateFormat(double d, boolean z, boolean z2) {
        DateFormat timeInstance;
        if (z && z2) {
            timeInstance = DateFormat.getDateTimeInstance(2, 2);
        } else if (z) {
            timeInstance = DateFormat.getDateInstance(2);
        } else {
            if (!z2) {
                b0.o("Bad dateFormat configuration");
                return null;
            }
            timeInstance = DateFormat.getTimeInstance(2);
        }
        return timeInstance.format(Long.valueOf((long) d)).toString();
    }

    @f84
    public static int localeCompare(String str, String str2) {
        return Collator.getInstance().compare(str, str2);
    }

    @f84
    public static String normalize(String str, int i) {
        if (i == 0) {
            return Normalizer.normalize(str, Normalizer.Form.NFC);
        }
        if (i == 1) {
            return Normalizer.normalize(str, Normalizer.Form.NFD);
        }
        if (i == 2) {
            return Normalizer.normalize(str, Normalizer.Form.NFKC);
        }
        if (i == 3) {
            return Normalizer.normalize(str, Normalizer.Form.NFKD);
        }
        b0.o("Invalid form");
        return null;
    }
}
