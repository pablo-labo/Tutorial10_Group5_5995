package defpackage;

import com.google.i18n.phonenumbers.a;
import defpackage.z9b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zt0 {
    public static final z9b.a t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public final StringBuilder c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public final a i;
    public final String j;
    public final z9b k;
    public z9b l;
    public int m;
    public final StringBuilder n;
    public boolean o;
    public String p;
    public final StringBuilder q;
    public final ArrayList r;
    public final sxc s;

    static {
        z9b.a aVar = new z9b.a();
        aVar.z();
        aVar.A();
        t = aVar;
        u = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        v = Pattern.compile("[- ]");
        w = Pattern.compile("\u2008");
    }

    public zt0(String str) {
        a aVarE = a.e();
        this.i = aVarE;
        this.m = 0;
        this.n = new StringBuilder();
        this.o = false;
        this.p = "";
        this.q = new StringBuilder();
        this.r = new ArrayList();
        this.s = new sxc(64);
        this.j = str;
        z9b z9bVarG = aVarE.g(aVarE.k(aVarE.d(str)));
        z9bVarG = z9bVarG == null ? t : z9bVarG;
        this.l = z9bVarG;
        this.k = z9bVarG;
    }

    public final String a(String str) {
        StringBuilder sb = this.n;
        int length = sb.length();
        if (!this.o || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String b() {
        StringBuilder sb = this.q;
        if (sb.length() < 3) {
            return a(sb.toString());
        }
        String string = sb.toString();
        for (y9b y9bVar : (this.g && this.p.length() == 0 && this.l.f() > 0) ? this.l.g() : this.l.l()) {
            if (this.p.length() > 0) {
                String strC = y9bVar.c();
                if ((strC.length() == 0 || a.x.matcher(strC).matches()) && !y9bVar.d() && !y9bVar.f()) {
                }
            }
            if (this.p.length() == 0 && !this.g) {
                String strC2 = y9bVar.c();
                if (strC2.length() == 0 || a.x.matcher(strC2).matches() || y9bVar.d()) {
                }
            }
            if (u.matcher(y9bVar.getFormat()).matches()) {
                this.r.add(y9bVar);
            }
        }
        j(string);
        String strE = e();
        return strE.length() > 0 ? strE : i() ? f() : this.c.toString();
    }

    public final boolean c() {
        StringBuilder sb;
        a aVar;
        int iC;
        StringBuilder sb2 = this.q;
        if (sb2.length() == 0 || (iC = (aVar = this.i).c(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String strK = aVar.k(iC);
        if ("001".equals(strK)) {
            this.l = aVar.f(iC);
        } else if (!strK.equals(this.j)) {
            z9b z9bVarG = aVar.g(aVar.k(aVar.d(strK)));
            if (z9bVarG == null) {
                z9bVarG = t;
            }
            this.l = z9bVarG;
        }
        String string = Integer.toString(iC);
        StringBuilder sb3 = this.n;
        sb3.append(string);
        sb3.append(' ');
        this.p = "";
        return true;
    }

    public final boolean d() {
        Pattern patternA = this.s.a("\\+|" + this.l.e());
        StringBuilder sb = this.d;
        Matcher matcher = patternA.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.g = true;
        int iEnd = matcher.end();
        StringBuilder sb2 = this.q;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        StringBuilder sb3 = this.n;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String e() {
        for (y9b y9bVar : this.r) {
            Matcher matcher = this.s.a(y9bVar.e()).matcher(this.q);
            if (matcher.matches()) {
                this.o = v.matcher(y9bVar.c()).find();
                String strA = a(matcher.replaceAll(y9bVar.getFormat()));
                if (a.r(strA, a.l).contentEquals(this.d)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final String f() {
        StringBuilder sb = this.q;
        int length = sb.length();
        if (length <= 0) {
            return this.n.toString();
        }
        String strH = "";
        for (int i = 0; i < length; i++) {
            strH = h(sb.charAt(i));
        }
        return this.e ? a(strH) : this.c.toString();
    }

    public final String g(char c) {
        StringBuilder sb = this.c;
        sb.append(c);
        sb.length();
        boolean zIsDigit = Character.isDigit(c);
        StringBuilder sb2 = this.d;
        StringBuilder sb3 = this.q;
        if (zIsDigit || (sb.length() == 1 && a.p.matcher(Character.toString(c)).matches())) {
            if (c == '+') {
                sb2.append(c);
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                sb2.append(c);
                sb3.append(c);
            }
            sb2.length();
        } else {
            this.e = false;
            this.f = true;
        }
        boolean z = this.e;
        ArrayList arrayList = this.r;
        StringBuilder sb4 = this.n;
        if (z) {
            int length = sb2.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb.toString();
            }
            if (length == 3) {
                if (!d()) {
                    this.p = k();
                    return b();
                }
                this.h = true;
            }
            if (this.h) {
                if (c()) {
                    this.h = false;
                }
                return ((Object) sb4) + sb3.toString();
            }
            if (arrayList.size() <= 0) {
                return b();
            }
            String strH = h(c);
            String strE = e();
            if (strE.length() > 0) {
                return strE;
            }
            j(sb3.toString());
            return i() ? f() : this.e ? a(strH) : sb.toString();
        }
        if (this.f) {
            return sb.toString();
        }
        boolean zD = d();
        StringBuilder sb5 = this.a;
        if (!zD) {
            if (this.p.length() > 0) {
                sb3.insert(0, this.p);
                sb4.setLength(sb4.lastIndexOf(this.p));
            }
            if (!this.p.equals(k())) {
                sb4.append(' ');
                this.e = true;
                this.h = false;
                arrayList.clear();
                this.m = 0;
                sb5.setLength(0);
                this.b = "";
                return b();
            }
        } else if (c()) {
            this.e = true;
            this.h = false;
            arrayList.clear();
            this.m = 0;
            sb5.setLength(0);
            this.b = "";
            return b();
        }
        return sb.toString();
    }

    public final String h(char c) {
        Pattern pattern = w;
        StringBuilder sb = this.a;
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.m)) {
            if (this.r.size() == 1) {
                this.e = false;
            }
            this.b = "";
            return this.c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.m = iStart;
        return sb.substring(0, iStart + 1);
    }

    public final boolean i() {
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            y9b y9bVar = (y9b) it.next();
            String strE = y9bVar.e();
            if (this.b.equals(strE)) {
                return false;
            }
            String strE2 = y9bVar.e();
            StringBuilder sb = this.a;
            sb.setLength(0);
            String format = y9bVar.getFormat();
            Matcher matcher = this.s.a(strE2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.q.length() ? "" : strGroup.replaceAll(strE2, format).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.b = strE;
                this.o = v.matcher(y9bVar.c()).find();
                this.m = 0;
                return true;
            }
            it.remove();
        }
        this.e = false;
        return false;
    }

    public final void j(String str) {
        int length = str.length() - 3;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            y9b y9bVar = (y9b) it.next();
            if (y9bVar.b() != 0) {
                if (!this.s.a(y9bVar.a(Math.min(length, y9bVar.b() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            z9b r0 = r7.l
            int r0 = r0.a()
            java.lang.StringBuilder r1 = r7.n
            r2 = 0
            java.lang.StringBuilder r3 = r7.q
            r4 = 1
            if (r0 != r4) goto L2f
            char r0 = r3.charAt(r2)
            r5 = 49
            if (r0 != r5) goto L2f
            char r0 = r3.charAt(r4)
            r6 = 48
            if (r0 == r6) goto L2f
            char r0 = r3.charAt(r4)
            if (r0 == r5) goto L2f
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r7.g = r4
            goto L62
        L2f:
            z9b r0 = r7.l
            boolean r0 = r0.w()
            if (r0 == 0) goto L61
            z9b r0 = r7.l
            java.lang.String r0 = r0.j()
            sxc r5 = r7.s
            java.util.regex.Pattern r0 = r5.a(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.lookingAt()
            if (r5 == 0) goto L61
            int r5 = r0.end()
            if (r5 <= 0) goto L61
            r7.g = r4
            int r4 = r0.end()
            java.lang.String r7 = r3.substring(r2, r4)
            r1.append(r7)
            goto L62
        L61:
            r4 = r2
        L62:
            java.lang.String r7 = r3.substring(r2, r4)
            r3.delete(r2, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.k():java.lang.String");
    }
}
