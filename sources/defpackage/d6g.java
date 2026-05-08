package defpackage;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d6g {
    public static final a a;
    public static final b b;
    public static final c c;
    public static final d d;
    public static final e e;

    public class a extends HashMap<String, String> {
    }

    public class b extends HashMap<String, String> {
    }

    public class c extends HashMap<String, String> {
    }

    public class d extends HashMap<String, String> {
    }

    public class e extends HashMap<String, String> {
    }

    public class f extends HashMap<String, String[]> {
    }

    static {
        a aVar = new a();
        aVar.put("ca", "calendar");
        aVar.put("nu", "numbers");
        aVar.put("hc", "hours");
        aVar.put("co", "collation");
        aVar.put("kn", "colnumeric");
        aVar.put("kf", "colcasefirst");
        a = aVar;
        b bVar = new b();
        bVar.put("calendar", "ca");
        bVar.put("numbers", "nu");
        bVar.put("hours", "hc");
        bVar.put("collation", "co");
        bVar.put("colnumeric", "kn");
        bVar.put("colcasefirst", "kf");
        b = bVar;
        c cVar = new c();
        cVar.put("dictionary", "dict");
        cVar.put("phonebook", "phonebk");
        cVar.put("traditional", "trad");
        cVar.put("gb2312han", "gb2312");
        c = cVar;
        d dVar = new d();
        dVar.put("gregorian", "gregory");
        d = dVar;
        e eVar = new e();
        eVar.put("traditional", "traditio");
        e = eVar;
        f fVar = new f();
        fVar.put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
        fVar.put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
        fVar.put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
    }

    public static boolean a(String str, String str2, in6 in6Var) {
        ULocale uLocaleB = in6Var.b();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocaleB, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocaleB, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String b(String str) {
        c cVar = c;
        return !cVar.containsKey(str) ? str : cVar.get(str);
    }

    public static Object c(Object obj, String str) {
        if (str.equals("ca") && (obj instanceof String)) {
            String str2 = (String) obj;
            d dVar = d;
            return !dVar.containsKey(str2) ? str2 : dVar.get(str2);
        }
        if (!str.equals("nu") || !(obj instanceof String)) {
            return (str.equals("co") && (obj instanceof String)) ? b((String) obj) : (str.equals("kn") && (obj instanceof String) && obj.equals("yes")) ? "true" : ((str.equals("kn") || str.equals("kf")) && (obj instanceof String) && obj.equals("no")) ? "false" : obj;
        }
        String str3 = (String) obj;
        e eVar = e;
        return !eVar.containsKey(str3) ? str3 : eVar.get(str3);
    }
}
