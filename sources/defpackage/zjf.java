package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zjf {
    public static final /* synthetic */ zjf[] V;
    public static final a a;
    public static final zjf b;
    public static final zjf c;
    public static final zjf d;
    public static final zjf e;
    public static final zjf f;

    public static final class a {
        public static String a(String str, zjf zjfVar) {
            str.getClass();
            int i = zjfVar == null ? -1 : akf.a[zjfVar.ordinal()];
            if (i == 1) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                return upperCase;
            }
            if (i == 2) {
                Locale locale2 = Locale.getDefault();
                locale2.getClass();
                String lowerCase = str.toLowerCase(locale2);
                lowerCase.getClass();
                return lowerCase;
            }
            if (i != 3) {
                return str;
            }
            BreakIterator wordInstance = BreakIterator.getWordInstance();
            wordInstance.setText(str);
            StringBuilder sb = new StringBuilder(str.length());
            int iFirst = wordInstance.first();
            int next = wordInstance.next();
            while (true) {
                int i2 = next;
                int i3 = iFirst;
                iFirst = i2;
                if (iFirst == -1) {
                    return sb.toString();
                }
                String strSubstring = str.substring(i3, iFirst);
                if (strSubstring.length() > 0) {
                    strSubstring = Character.toUpperCase(strSubstring.charAt(0)) + strSubstring.substring(1);
                }
                sb.append(strSubstring);
                next = wordInstance.next();
            }
        }
    }

    static {
        zjf zjfVar = new zjf("NONE", 0);
        b = zjfVar;
        zjf zjfVar2 = new zjf("UPPERCASE", 1);
        c = zjfVar2;
        zjf zjfVar3 = new zjf("LOWERCASE", 2);
        d = zjfVar3;
        zjf zjfVar4 = new zjf("CAPITALIZE", 3);
        e = zjfVar4;
        zjf zjfVar5 = new zjf("UNSET", 4);
        f = zjfVar5;
        V = new zjf[]{zjfVar, zjfVar2, zjfVar3, zjfVar4, zjfVar5};
        a = new a();
    }

    public zjf() {
        throw null;
    }

    public static zjf valueOf(String str) {
        return (zjf) Enum.valueOf(zjf.class, str);
    }

    public static zjf[] values() {
        return (zjf[]) V.clone();
    }
}
