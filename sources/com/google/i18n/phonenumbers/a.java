package com.google.i18n.phonenumbers;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.i18n.phonenumbers.NumberParseException;
import defpackage.bab;
import defpackage.bg;
import defpackage.fb9;
import defpackage.g62;
import defpackage.jp3;
import defpackage.k1a;
import defpackage.l5;
import defpackage.l6;
import defpackage.ln2;
import defpackage.p6;
import defpackage.rlf;
import defpackage.sxc;
import defpackage.sz5;
import defpackage.v40;
import defpackage.w74;
import defpackage.yl2;
import defpackage.z9b;
import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final Logger h;
    public static final Map<Integer, String> i;
    public static final Set<Integer> j;
    public static final Set<Integer> k;
    public static final Map<Character, Character> l;
    public static final Map<Character, Character> m;
    public static final Map<Character, Character> n;
    public static final Map<Character, Character> o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static a y;
    public final ln2 a;
    public final HashMap b;
    public final sz5 c = new sz5();
    public final HashSet d = new HashSet(35);
    public final sxc e = new sxc(100);
    public final HashSet f = new HashSet(320);
    public final HashSet g = new HashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.i18n.phonenumbers.a$a, reason: collision with other inner class name */
    public static final class EnumC0158a {
        public static final EnumC0158a V;
        public static final EnumC0158a W;
        public static final EnumC0158a X;
        public static final EnumC0158a Y;
        public static final EnumC0158a Z;
        public static final EnumC0158a a;
        public static final EnumC0158a a0;
        public static final EnumC0158a b;
        public static final /* synthetic */ EnumC0158a[] b0;
        public static final EnumC0158a c;
        public static final EnumC0158a d;
        public static final EnumC0158a e;
        public static final EnumC0158a f;

        static {
            EnumC0158a enumC0158a = new EnumC0158a("FIXED_LINE", 0);
            a = enumC0158a;
            EnumC0158a enumC0158a2 = new EnumC0158a("MOBILE", 1);
            b = enumC0158a2;
            EnumC0158a enumC0158a3 = new EnumC0158a("FIXED_LINE_OR_MOBILE", 2);
            c = enumC0158a3;
            EnumC0158a enumC0158a4 = new EnumC0158a("TOLL_FREE", 3);
            d = enumC0158a4;
            EnumC0158a enumC0158a5 = new EnumC0158a("PREMIUM_RATE", 4);
            e = enumC0158a5;
            EnumC0158a enumC0158a6 = new EnumC0158a("SHARED_COST", 5);
            f = enumC0158a6;
            EnumC0158a enumC0158a7 = new EnumC0158a("VOIP", 6);
            V = enumC0158a7;
            EnumC0158a enumC0158a8 = new EnumC0158a("PERSONAL_NUMBER", 7);
            W = enumC0158a8;
            EnumC0158a enumC0158a9 = new EnumC0158a("PAGER", 8);
            X = enumC0158a9;
            EnumC0158a enumC0158a10 = new EnumC0158a("UAN", 9);
            Y = enumC0158a10;
            EnumC0158a enumC0158a11 = new EnumC0158a("VOICEMAIL", 10);
            Z = enumC0158a11;
            EnumC0158a enumC0158a12 = new EnumC0158a("UNKNOWN", 11);
            a0 = enumC0158a12;
            b0 = new EnumC0158a[]{enumC0158a, enumC0158a2, enumC0158a3, enumC0158a4, enumC0158a5, enumC0158a6, enumC0158a7, enumC0158a8, enumC0158a9, enumC0158a10, enumC0158a11, enumC0158a12};
        }

        public EnumC0158a() {
            throw null;
        }

        public static EnumC0158a valueOf(String str) {
            return (EnumC0158a) Enum.valueOf(EnumC0158a.class, str);
        }

        public static EnumC0158a[] values() {
            return (EnumC0158a[]) b0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] f;

        static {
            b bVar = new b("IS_POSSIBLE", 0);
            a = bVar;
            b bVar2 = new b("IS_POSSIBLE_LOCAL_ONLY", 1);
            b = bVar2;
            b bVar3 = new b("INVALID_COUNTRY_CODE", 2);
            b bVar4 = new b("TOO_SHORT", 3);
            c = bVar4;
            b bVar5 = new b("INVALID_LENGTH", 4);
            d = bVar5;
            b bVar6 = new b("TOO_LONG", 5);
            e = bVar6;
            f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }
    }

    static {
        Character chValueOf = Character.valueOf(JwtParser.SEPARATOR_CHAR);
        h = Logger.getLogger(a.class.getName());
        HashMap map = new HashMap();
        map.put(54, "9");
        i = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        j = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        k = Collections.unmodifiableSet(hashSet2);
        HashMap map2 = new HashMap();
        map2.put('0', '0');
        map2.put('1', '1');
        map2.put('2', '2');
        map2.put('3', '3');
        map2.put('4', '4');
        map2.put('5', '5');
        map2.put('6', '6');
        map2.put('7', '7');
        map2.put('8', '8');
        map2.put('9', '9');
        HashMap map3 = new HashMap(40);
        map3.put('A', '2');
        map3.put('B', '2');
        map3.put('C', '2');
        map3.put('D', '3');
        map3.put('E', '3');
        map3.put('F', '3');
        map3.put('G', '4');
        map3.put('H', '4');
        map3.put('I', '4');
        map3.put('J', '5');
        map3.put('K', '5');
        map3.put('L', '5');
        map3.put('M', '6');
        map3.put('N', '6');
        map3.put('O', '6');
        map3.put('P', '7');
        map3.put('Q', '7');
        map3.put('R', '7');
        map3.put('S', '7');
        map3.put('T', '8');
        map3.put('U', '8');
        map3.put('V', '8');
        map3.put('W', '9');
        map3.put('X', '9');
        map3.put('Y', '9');
        map3.put('Z', '9');
        Map<Character, Character> mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        m = mapUnmodifiableMap;
        HashMap map4 = new HashMap(100);
        map4.putAll(mapUnmodifiableMap);
        map4.putAll(map2);
        n = Collections.unmodifiableMap(map4);
        HashMap map5 = new HashMap();
        map5.putAll(map2);
        map5.put('+', '+');
        map5.put('*', '*');
        map5.put('#', '#');
        l = Collections.unmodifiableMap(map5);
        HashMap map6 = new HashMap();
        for (Character ch : mapUnmodifiableMap.keySet()) {
            map6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            map6.put(ch, ch);
        }
        map6.putAll(map2);
        map6.put('-', '-');
        map6.put((char) 65293, '-');
        map6.put((char) 8208, '-');
        map6.put((char) 8209, '-');
        map6.put((char) 8210, '-');
        map6.put((char) 8211, '-');
        map6.put((char) 8212, '-');
        map6.put((char) 8213, '-');
        map6.put((char) 8722, '-');
        map6.put('/', '/');
        map6.put((char) 65295, '/');
        map6.put(' ', ' ');
        map6.put((char) 12288, ' ');
        map6.put((char) 8288, ' ');
        map6.put(chValueOf, chValueOf);
        map6.put((char) 65294, chValueOf);
        o = Collections.unmodifiableMap(map6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map7 = m;
        sb.append(Arrays.toString(map7.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map7.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String string = sb.toString();
        p = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        q = Pattern.compile("(\\p{Nd})");
        r = Pattern.compile("[+＋\\p{Nd}]");
        s = Pattern.compile("[\\\\/] *x");
        t = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        u = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String strM = l5.m("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", string, "\\p{Nd}]*");
        String strA = a(true);
        a(false);
        v = Pattern.compile("(?:" + strA + ")$", 66);
        w = Pattern.compile(strM + "(?:" + strA + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        x = Pattern.compile("\\(?\\$1\\)?");
        y = null;
    }

    public a(ln2 ln2Var, HashMap map) {
        this.a = ln2Var;
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.g.add(entry.getKey());
            } else {
                this.f.addAll(list);
            }
        }
        if (this.f.remove("001")) {
            h.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.d.addAll((Collection) map.get(1));
    }

    public static String a(boolean z) {
        String strConcat = ";ext=".concat(b(20));
        String str = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + b(20) + "#?";
        String str2 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + b(9) + "#?";
        String str3 = "[- ]+" + b(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(strConcat);
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        String strI = l6.i(sb, "|", str3);
        if (!z) {
            return strI;
        }
        return strI + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + b(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + b(9) + "#?");
    }

    public static String b(int i2) {
        return bg.d(i2, "(\\p{Nd}{1,", "})");
    }

    public static synchronized a e() {
        try {
            if (y == null) {
                jp3 jp3Var = jp3.d;
                g62 g62Var = jp3Var.b;
                if (g62Var == null) {
                    throw new IllegalArgumentException("metadataLoader could not be null.");
                }
                a aVar = new a(new ln2(jp3Var.c, g62Var, jp3Var.a), w74.k());
                synchronized (a.class) {
                    y = aVar;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return y;
    }

    public static String h(com.google.i18n.phonenumbers.b bVar) {
        StringBuilder sb = new StringBuilder();
        if (bVar.d() && bVar.c() > 0) {
            char[] cArr = new char[bVar.c()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(bVar.b());
        return sb.toString();
    }

    public static bab i(z9b z9bVar, EnumC0158a enumC0158a) {
        switch (enumC0158a.ordinal()) {
            case 0:
            case 2:
                return z9bVar.b();
            case 1:
                return z9bVar.i();
            case 3:
                return z9bVar.r();
            case 4:
                return z9bVar.o();
            case 5:
                return z9bVar.q();
            case 6:
                return z9bVar.u();
            case 7:
                return z9bVar.n();
            case 8:
                return z9bVar.m();
            case DatadogLogGenerator.CRASH /* 9 */:
                return z9bVar.s();
            case 10:
                return z9bVar.t();
            default:
                return z9bVar.c();
        }
    }

    public static void p(StringBuilder sb) {
        if (u.matcher(sb).matches()) {
            sb.replace(0, sb.length(), r(sb, n));
        } else {
            sb.replace(0, sb.length(), q(sb));
        }
    }

    public static String q(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            int iDigit = Character.digit(charSequence.charAt(i2), 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            }
        }
        return sb.toString();
    }

    public static String r(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i2))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if (r1.subList(1, r1.size()).contains(java.lang.Integer.valueOf(r6)) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.i18n.phonenumbers.a.b t(java.lang.StringBuilder r6, defpackage.z9b r7, com.google.i18n.phonenumbers.a.EnumC0158a r8) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.a.t(java.lang.StringBuilder, z9b, com.google.i18n.phonenumbers.a$a):com.google.i18n.phonenumbers.a$b");
    }

    public final int c(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i2 = 1; i2 <= 3 && i2 <= length; i2++) {
                int i3 = Integer.parseInt(sb.substring(0, i2));
                if (this.b.containsKey(Integer.valueOf(i3))) {
                    sb2.append(sb.substring(i2));
                    return i3;
                }
            }
        }
        return 0;
    }

    public final int d(String str) {
        if (str != null && this.f.contains(str)) {
            z9b z9bVarG = g(str);
            if (z9bVarG != null) {
                return z9bVarG.a();
            }
            l5.q(l5.l("Invalid region code: ", str));
            return 0;
        }
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        h.log(level, sb.toString());
        return 0;
    }

    public final z9b f(int i2) {
        if (!this.g.contains(Integer.valueOf(i2))) {
            return null;
        }
        ln2 ln2Var = this.a;
        ln2Var.getClass();
        List list = (List) w74.k().get(Integer.valueOf(i2));
        if (list != null && !list.contains("001")) {
            v40.j(i2, " calling code belongs to a geo entity");
            return null;
        }
        fb9<Integer> fb9Var = ((yl2) ((rlf) ln2Var.b).a(((k1a) ln2Var.a).a(Integer.valueOf(i2)))).a;
        z9b z9bVar = (z9b) fb9Var.a.get(Integer.valueOf(i2));
        String strC = p6.c(i2, "Missing metadata for country code ");
        if (z9bVar != null) {
            return z9bVar;
        }
        throw new MissingMetadataException(strC);
    }

    public final z9b g(String str) {
        if (str != null && this.f.contains(str)) {
            ln2 ln2Var = this.a;
            ln2Var.getClass();
            if (!str.equals("001")) {
                z9b z9bVar = (z9b) ((yl2) ((rlf) ln2Var.b).a(((k1a) ln2Var.a).a(str))).b.a.get(str);
                String strConcat = "Missing metadata for region code ".concat(str);
                if (z9bVar != null) {
                    return z9bVar;
                }
                throw new MissingMetadataException(strConcat);
            }
            l5.q(str.concat(" region code is a non-geo entity"));
        }
        return null;
    }

    public final EnumC0158a j(String str, z9b z9bVar) {
        if (m(str, z9bVar.c())) {
            if (m(str, z9bVar.o())) {
                return EnumC0158a.e;
            }
            if (m(str, z9bVar.r())) {
                return EnumC0158a.d;
            }
            if (m(str, z9bVar.q())) {
                return EnumC0158a.f;
            }
            if (m(str, z9bVar.u())) {
                return EnumC0158a.V;
            }
            if (m(str, z9bVar.n())) {
                return EnumC0158a.W;
            }
            if (m(str, z9bVar.m())) {
                return EnumC0158a.X;
            }
            if (m(str, z9bVar.s())) {
                return EnumC0158a.Y;
            }
            if (m(str, z9bVar.t())) {
                return EnumC0158a.Z;
            }
            if (m(str, z9bVar.b())) {
                return (z9bVar.p() || m(str, z9bVar.i())) ? EnumC0158a.c : EnumC0158a.a;
            }
            if (!z9bVar.p() && m(str, z9bVar.i())) {
                return EnumC0158a.b;
            }
        }
        return EnumC0158a.a0;
    }

    public final String k(int i2) {
        List list = (List) this.b.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final String l(com.google.i18n.phonenumbers.b bVar) {
        int iA = bVar.a();
        List<String> list = (List) this.b.get(Integer.valueOf(iA));
        if (list == null) {
            h.log(Level.INFO, "Missing/invalid country_code (" + iA + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        String strH = h(bVar);
        for (String str : list) {
            z9b z9bVarG = g(str);
            if (z9bVarG.v()) {
                if (this.e.a(z9bVarG.h()).matcher(strH).lookingAt()) {
                    return str;
                }
            } else if (j(strH, z9bVarG) != EnumC0158a.a0) {
                return str;
            }
        }
        return null;
    }

    public final boolean m(String str, bab babVar) {
        int length = str.length();
        List<Integer> listD = babVar.d();
        if (listD.size() <= 0 || listD.contains(Integer.valueOf(length))) {
            return this.c.b(str, babVar);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(java.lang.CharSequence r6, defpackage.z9b r7, java.lang.StringBuilder r8, com.google.i18n.phonenumbers.b r9) throws com.google.i18n.phonenumbers.NumberParseException {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.a.n(java.lang.CharSequence, z9b, java.lang.StringBuilder, com.google.i18n.phonenumbers.b):int");
    }

    public final void o(StringBuilder sb, z9b z9bVar, StringBuilder sb2) {
        int length = sb.length();
        String strJ = z9bVar.j();
        if (length == 0 || strJ.length() == 0) {
            return;
        }
        Matcher matcher = this.e.a(strJ).matcher(sb);
        if (matcher.lookingAt()) {
            bab babVarC = z9bVar.c();
            sz5 sz5Var = this.c;
            boolean zB = sz5Var.b(sb, babVarC);
            int iGroupCount = matcher.groupCount();
            String strK = z9bVar.k();
            if (strK == null || strK.length() == 0 || matcher.group(iGroupCount) == null) {
                if (!zB || sz5Var.b(sb.substring(matcher.end()), babVarC)) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(strK));
            if (!zB || sz5Var.b(sb3.toString(), babVarC)) {
                if (sb2 != null && iGroupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final com.google.i18n.phonenumbers.b s(String str, String str2) {
        CharSequence charSequenceSubSequence;
        int iN;
        com.google.i18n.phonenumbers.b bVar = new com.google.i18n.phonenumbers.b();
        NumberParseException.a aVar = NumberParseException.a.b;
        if (str == null) {
            throw new NumberParseException(aVar, "The phone number supplied was null.");
        }
        int length = str.length();
        NumberParseException.a aVar2 = NumberParseException.a.e;
        if (length > 250) {
            throw new NumberParseException(aVar2, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String string = str.toString();
        int iIndexOf = string.indexOf(";phone-context=");
        String strGroup = "";
        if (iIndexOf >= 0) {
            int i2 = iIndexOf + 15;
            if (i2 < string.length() - 1 && string.charAt(i2) == '+') {
                int iIndexOf2 = string.indexOf(59, i2);
                if (iIndexOf2 > 0) {
                    sb.append(string.substring(i2, iIndexOf2));
                } else {
                    sb.append(string.substring(i2));
                }
            }
            int iIndexOf3 = string.indexOf("tel:");
            sb.append(string.substring(iIndexOf3 >= 0 ? iIndexOf3 + 4 : 0, iIndexOf));
        } else {
            Matcher matcher = r.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = t.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = s.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb.append(charSequenceSubSequence);
        }
        int iIndexOf4 = sb.indexOf(";isub=");
        if (iIndexOf4 > 0) {
            sb.delete(iIndexOf4, sb.length());
        }
        int length2 = sb.length();
        Pattern pattern = w;
        if (!(length2 < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(aVar, "The string supplied did not seem to be a phone number.");
        }
        boolean z = str2 != null && this.f.contains(str2);
        Pattern pattern2 = p;
        NumberParseException.a aVar3 = NumberParseException.a.a;
        if (!z && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(aVar3, "Missing or invalid default region.");
        }
        Matcher matcher4 = v.matcher(sb);
        if (matcher4.find()) {
            String strSubstring = sb.substring(0, matcher4.start());
            if (strSubstring.length() < 2 ? false : pattern.matcher(strSubstring).matches()) {
                int iGroupCount = matcher4.groupCount();
                int i3 = 1;
                while (true) {
                    if (i3 > iGroupCount) {
                        break;
                    }
                    if (matcher4.group(i3) != null) {
                        strGroup = matcher4.group(i3);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                    i3++;
                }
            }
        }
        if (strGroup.length() > 0) {
            bVar.f(strGroup);
        }
        z9b z9bVarG = g(str2);
        StringBuilder sb2 = new StringBuilder();
        try {
            iN = n(sb, z9bVarG, sb2, bVar);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            if (e.a() != aVar3 || !matcher5.lookingAt()) {
                throw new NumberParseException(e.a(), e.getMessage());
            }
            iN = n(sb.substring(matcher5.end()), z9bVarG, sb2, bVar);
            if (iN == 0) {
                throw new NumberParseException(aVar3, "Could not interpret numbers after plus-sign.");
            }
        }
        if (iN != 0) {
            String strK = k(iN);
            if (!strK.equals(str2)) {
                z9bVarG = "001".equals(strK) ? f(iN) : g(strK);
            }
        } else {
            p(sb);
            sb2.append((CharSequence) sb);
            if (str2 != null) {
                bVar.e(z9bVarG.a());
            }
        }
        int length3 = sb2.length();
        NumberParseException.a aVar4 = NumberParseException.a.d;
        if (length3 < 2) {
            throw new NumberParseException(aVar4, "The string supplied is too short to be a phone number.");
        }
        if (z9bVarG != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            o(sb4, z9bVarG, sb3);
            b bVarT = t(sb4, z9bVarG, EnumC0158a.a0);
            if (bVarT != b.c && bVarT != b.b && bVarT != b.d) {
                sb2 = sb4;
            }
        }
        int length4 = sb2.length();
        if (length4 < 2) {
            throw new NumberParseException(aVar4, "The string supplied is too short to be a phone number.");
        }
        if (length4 > 17) {
            throw new NumberParseException(aVar2, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            bVar.g();
            int i4 = 1;
            while (i4 < sb2.length() - 1 && sb2.charAt(i4) == '0') {
                i4++;
            }
            if (i4 != 1) {
                bVar.i(i4);
            }
        }
        bVar.h(Long.parseLong(sb2.toString()));
        return bVar;
    }
}
