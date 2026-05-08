package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class sxg {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map<String, Integer> c;
    public static final Map<String, Integer> d;

    public static class a {
        public static final rxg c = new rxg();
        public final b a;
        public final int b;

        public a(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }
    }

    public static final class b {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        public b(String str, int i, String str2, Set<String> set) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = set;
        }
    }

    public static final class c implements Comparable<c> {
        public final int a;
        public final pxg b;

        public c(int i, pxg pxgVar) {
            this.a = i;
            this.b = pxgVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.a, cVar.a);
        }
    }

    public static final class d {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final n83.a a() {
            /*
                r14 = this;
                float r0 = r14.h
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 0
                r4 = 1056964608(0x3f000000, float:0.5)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 5
                r7 = 4
                if (r2 == 0) goto L11
                goto L1c
            L11:
                int r0 = r14.d
                if (r0 == r7) goto L1b
                if (r0 == r6) goto L19
                r0 = r4
                goto L1c
            L19:
                r0 = r5
                goto L1c
            L1b:
                r0 = r3
            L1c:
                int r2 = r14.i
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 3
                r10 = 2
                r11 = 1
                if (r2 == r8) goto L26
                goto L35
            L26:
                int r2 = r14.d
                if (r2 == r11) goto L34
                if (r2 == r9) goto L32
                if (r2 == r7) goto L34
                if (r2 == r6) goto L32
                r2 = r11
                goto L35
            L32:
                r2 = r10
                goto L35
            L34:
                r2 = 0
            L35:
                n83$a r8 = new n83$a
                r8.<init>()
                int r12 = r14.d
                r13 = 0
                if (r12 == r11) goto L56
                if (r12 == r10) goto L53
                if (r12 == r9) goto L50
                if (r12 == r7) goto L56
                if (r12 == r6) goto L50
                java.lang.String r6 = "WebvttCueParser"
                java.lang.String r7 = "Unknown textAlignment: "
                defpackage.g7.j(r12, r7, r6)
                r6 = r13
                goto L58
            L50:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L58
            L53:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L58
            L56:
                android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            L58:
                r8.c = r6
                float r6 = r14.e
                int r7 = r14.f
                int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r9 == 0) goto L6e
                if (r7 != 0) goto L6e
                int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r3 < 0) goto L6c
                int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                if (r3 <= 0) goto L6e
            L6c:
                r1 = r5
                goto L75
            L6e:
                if (r9 == 0) goto L72
                r1 = r6
                goto L75
            L72:
                if (r7 != 0) goto L75
                goto L6c
            L75:
                r8.e = r1
                r8.f = r7
                int r1 = r14.g
                r8.g = r1
                r8.h = r0
                r8.i = r2
                float r1 = r14.j
                if (r2 == 0) goto L9e
                if (r2 == r11) goto L92
                if (r2 != r10) goto L8a
                goto La0
            L8a:
                java.lang.String r14 = java.lang.String.valueOf(r2)
                defpackage.r6.g(r14)
                return r13
            L92:
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                r3 = 1073741824(0x40000000, float:2.0)
                if (r2 > 0) goto L9a
                float r0 = r0 * r3
                goto La0
            L9a:
                float r5 = r5 - r0
                float r0 = r5 * r3
                goto La0
            L9e:
                float r0 = r5 - r0
            La0:
                float r0 = java.lang.Math.min(r1, r0)
                r8.l = r0
                int r0 = r14.k
                r8.p = r0
                java.lang.CharSequence r14 = r14.c
                if (r14 == 0) goto Lb1
                r8.b(r14)
            Lb1:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sxg.d.a():n83$a");
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, b bVar, List<a> list, SpannableStringBuilder spannableStringBuilder, List<pxg> list2) {
        int i;
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        i = bVar.b;
        length = spannableStringBuilder.length();
        String str2 = bVar.a;
        str2.getClass();
        i2 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : bVar.d) {
                    Map<String, Integer> map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i, length, 33);
                    } else {
                        Map<String, Integer> map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new htg(bVar.c), i, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.c);
                int i6 = bVar.b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i7)).a.a)) {
                        a aVar = (a) arrayList.get(i7);
                        int iC2 = c(list2, str, aVar.a);
                        if (iC2 == i2) {
                            iC2 = iC != i2 ? iC : 1;
                        }
                        int i8 = aVar.a.b - length2;
                        int i9 = aVar.b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new jhd(charSequenceSubSequence.toString(), iC2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, bVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            pxg pxgVar = ((c) arrayListB.get(i10)).b;
            int i11 = pxgVar.l;
            if (i11 == -1 && pxgVar.m == -1) {
                i3 = -1;
            } else {
                i3 = (pxgVar.m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i3 != -1) {
                int i12 = pxgVar.l;
                if (i12 == -1 && pxgVar.m == -1) {
                    i5 = -1;
                    i4 = 1;
                } else {
                    i4 = 1;
                    i5 = (i12 == 1 ? 1 : 0) | (pxgVar.m == 1 ? 2 : 0);
                }
                awd.b(spannableStringBuilder, new StyleSpan(i5), i, length);
            } else {
                i4 = 1;
            }
            if (pxgVar.j == i4) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (pxgVar.k == i4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (pxgVar.g) {
                if (!pxgVar.g) {
                    r6.g("Font color not defined");
                    return;
                }
                awd.b(spannableStringBuilder, new ForegroundColorSpan(pxgVar.f), i, length);
            }
            if (pxgVar.i) {
                if (!pxgVar.i) {
                    r6.g("Background color not defined.");
                    return;
                }
                awd.b(spannableStringBuilder, new BackgroundColorSpan(pxgVar.h), i, length);
            }
            if (pxgVar.e != null) {
                awd.b(spannableStringBuilder, new TypefaceSpan(pxgVar.e), i, length);
            }
            int i13 = pxgVar.n;
            if (i13 == 1) {
                awd.b(spannableStringBuilder, new AbsoluteSizeSpan((int) pxgVar.o, true), i, length);
            } else if (i13 == 2) {
                awd.b(spannableStringBuilder, new RelativeSizeSpan(pxgVar.o), i, length);
            } else if (i13 == 3) {
                awd.b(spannableStringBuilder, new RelativeSizeSpan(pxgVar.o / 100.0f), i, length);
            }
            if (pxgVar.q) {
                spannableStringBuilder.setSpan(new ak6(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, b bVar) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            pxg pxgVar = (pxg) list.get(i);
            String str2 = bVar.a;
            Set<String> set = bVar.d;
            String str3 = bVar.c;
            if (pxgVar.a.isEmpty() && pxgVar.b.isEmpty() && pxgVar.c.isEmpty() && pxgVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = pxg.a(pxgVar.d, pxg.a(pxgVar.b, pxg.a(pxgVar.a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (iA == -1 || !set.containsAll(pxgVar.c)) ? 0 : iA + (pxgVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new c(size, pxgVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<pxg> list, String str, b bVar) {
        ArrayList arrayListB = b(list, str, bVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((c) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static qxg d(String str, Matcher matcher, g4b g4bVar, ArrayList arrayList) {
        d dVar = new d();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            dVar.a = vxg.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            dVar.b = vxg.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, dVar);
            StringBuilder sb = new StringBuilder();
            g4bVar.getClass();
            String strK = g4bVar.k(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strK)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strK.trim());
                strK = g4bVar.k(StandardCharsets.UTF_8);
            }
            dVar.c = f(str, sb.toString(), arrayList);
            return new qxg(dVar.a().a(), dVar.a, dVar.b);
        } catch (IllegalArgumentException unused) {
            zkd.T("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, d dVar) {
        int i;
        String strSubstring;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, dVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                zkd.T("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        dVar.d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i2 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i2 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i2 = 2;
                                    break;
                                default:
                                    zkd.T("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i2 = Integer.MIN_VALUE;
                                    break;
                            }
                            dVar.i = i2;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        dVar.h = vxg.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        dVar.j = vxg.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i3 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i3 = 1;
                        } else {
                            zkd.T("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i3 = Integer.MIN_VALUE;
                        }
                        dVar.k = i3;
                    } else {
                        zkd.T("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                zkd.T("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List<pxg> list) {
        String str3;
        char c2;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String strTrim = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new b("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            zkd.T("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length = i + 1;
                if (length < str2.length()) {
                    boolean z = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i2 = length - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i3, i2);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        ka2.l(!strTrim2.isEmpty());
                        String str4 = vjg.a;
                        str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z) {
                                    if (!z2) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        ka2.l(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c2 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c2 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str5 = strArrSplit[c2];
                                        HashSet hashSet = new HashSet();
                                        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
                                            hashSet.add(strArrSplit[i4]);
                                        }
                                        arrayDeque.push(new b(str5, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        b bVar = (b) arrayDeque.pop();
                                        a(str, bVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                        }
                                        if (bVar.a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length;
            }
        }
    }

    public static void g(String str, d dVar) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    zkd.T("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            dVar.e = vxg.b(str);
            dVar.f = 0;
        } else {
            dVar.e = Integer.parseInt(str);
            dVar.f = 1;
        }
    }
}
