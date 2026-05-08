package com.facebook.hermes.intl;

import android.icu.util.ULocale;
import defpackage.f19;
import defpackage.g19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: com.facebook.hermes.intl.a$a, reason: collision with other inner class name */
    public static class C0127a {
        public g19 a;
        public HashMap<String, String> b = new HashMap<>();
    }

    public static String a(String str, String[] strArr) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static C0127a b(String[] strArr) throws JSRangeErrorException {
        C0127a c0127a = new C0127a();
        for (String str : strArr) {
            g19 g19VarA = f19.a(str);
            boolean[] zArr = new boolean[1];
            ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{g19VarA.g()}, ULocale.getAvailableLocales(), zArr);
            if (zArr[0] || uLocaleAcceptLanguage == null) {
                uLocaleAcceptLanguage = null;
            }
            if (uLocaleAcceptLanguage != null) {
                c0127a.a = new g19(uLocaleAcceptLanguage);
                c0127a.b = g19VarA.mo34a();
                return c0127a;
            }
        }
        c0127a.a = new g19(ULocale.getDefault(ULocale.Category.FORMAT));
        return c0127a;
    }

    public static String[] c(String[] strArr) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            boolean[] zArr = new boolean[1];
            ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{f19.a(str).g()}, ULocale.getAvailableLocales(), zArr);
            if (zArr[0] || uLocaleAcceptLanguage == null) {
                uLocaleAcceptLanguage = null;
            }
            if (uLocaleAcceptLanguage != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] d() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] e(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrD = d();
        for (String str : strArr) {
            String strA = a(f19.a(str).g().toLanguageTag(), strArrD);
            if (strA != null && !strA.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
