package defpackage;

import android.icu.text.LocaleDisplayNames;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class mb5 {
    public final LocaleDisplayNames a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public mb5(LocaleDisplayNames localeDisplayNames) {
        this.a = localeDisplayNames;
    }

    public final String a(String str, Locale locale) {
        Object obj;
        Pair pair = new Pair(str, locale);
        LinkedHashMap linkedHashMap = this.b;
        Object obj2 = linkedHashMap.get(pair);
        if (obj2 == null) {
            LocaleDisplayNames localeDisplayNames = this.a;
            LocaleDisplayNames localeDisplayNames2 = localeDisplayNames;
            if (locale != null) {
                LinkedHashMap linkedHashMap2 = this.d;
                Object obj3 = linkedHashMap2.get(locale);
                if (obj3 == null) {
                    linkedHashMap2.put(locale, localeDisplayNames);
                    obj = localeDisplayNames;
                } else {
                    obj = obj3;
                }
                localeDisplayNames2 = (LocaleDisplayNames) obj;
            }
            String strRegionDisplayName = localeDisplayNames2.regionDisplayName(str);
            if (strRegionDisplayName != null) {
                str = strRegionDisplayName;
            }
            linkedHashMap.put(pair, str);
            obj2 = str;
        }
        return (String) obj2;
    }

    public final String b(String str, Locale locale) {
        Object obj;
        Pair pair = new Pair(str, locale);
        LinkedHashMap linkedHashMap = this.c;
        Object obj2 = linkedHashMap.get(pair);
        if (obj2 == null) {
            LocaleDisplayNames localeDisplayNames = this.a;
            LocaleDisplayNames localeDisplayNames2 = localeDisplayNames;
            if (locale != null) {
                LinkedHashMap linkedHashMap2 = this.d;
                Object obj3 = linkedHashMap2.get(locale);
                if (obj3 == null) {
                    linkedHashMap2.put(locale, localeDisplayNames);
                    obj = localeDisplayNames;
                } else {
                    obj = obj3;
                }
                localeDisplayNames2 = (LocaleDisplayNames) obj;
            }
            String strLanguageDisplayName = localeDisplayNames2.languageDisplayName(str);
            if (strLanguageDisplayName != null) {
                str = strLanguageDisplayName;
            }
            linkedHashMap.put(pair, str);
            obj2 = str;
        }
        return (String) obj2;
    }
}
