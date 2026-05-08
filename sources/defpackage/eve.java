package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class eve {
    public int a;
    public final eb8 b;
    public String c;
    public final StringBuilder d;
    public final String e;

    public eve(String str) {
        str.getClass();
        eb8 eb8Var = new eb8();
        eb8Var.a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        eb8Var.b = iArr;
        eb8Var.c = -1;
        this.b = eb8Var;
        this.d = new StringBuilder();
        this.e = str;
    }

    public static /* synthetic */ void m(eve eveVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = eveVar.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        eveVar.l(i, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (n(charSequence, i + 3) + (n(charSequence, i) << 12) + (n(charSequence, i + 1) << 8) + (n(charSequence, i + 2) << 4)));
            return i2;
        }
        this.a = i;
        if (i2 < charSequence.length()) {
            return a(charSequence, this.a);
        }
        m(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        if (o().length() - i < str.length()) {
            m(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (o().charAt(i + i2) | ' ')) {
                m(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    public final String d() {
        String string;
        g('\"');
        int i = this.a;
        String str = this.e;
        int iR = zve.R(str, '\"', i, false, 4);
        if (iR == -1) {
            j();
            int i2 = this.a;
            m(this, l5.m("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iR) {
            if (str.charAt(i3) == '\\') {
                int iS = this.a;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (true) {
                    StringBuilder sb = this.d;
                    if (cCharAt == '\"') {
                        if (z) {
                            sb.append((CharSequence) o(), iS, i3);
                            string = sb.toString();
                            sb.setLength(0);
                        } else {
                            string = o().subSequence(iS, i3).toString();
                        }
                        this.a = i3 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) o(), iS, i3);
                        int iS2 = s(i3 + 1);
                        if (iS2 == -1) {
                            m(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iS2 + 1;
                        char cCharAt2 = str.charAt(iS2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? s22.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iS = s(iA);
                        if (iS == -1) {
                            m(this, "Unexpected EOF", iS, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) o(), iS, i3);
                            iS = s(i3);
                            if (iS == -1) {
                                m(this, "Unexpected EOF", iS, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i3);
                        }
                    }
                    i3 = iS;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
            } else {
                i3++;
            }
        }
        this.a = iR + 1;
        return str.substring(i, iR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.a = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte e() {
        /*
            r4 = this;
            int r0 = r4.a
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.e
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.a = r1
            byte r4 = defpackage.ee3.j(r0)
            return r4
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.a = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.e():byte");
    }

    public final byte f(byte b) {
        byte bE = e();
        if (bE == b) {
            return bE;
        }
        String strZ = ee3.z(b);
        int i = this.a;
        int i2 = i - 1;
        m(this, akb.k("Expected ", strZ, ", but had '", (i == o().length() || i2 < 0) ? "EOF" : String.valueOf(o().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void g(char c) {
        int i = this.a;
        if (i == -1) {
            v(c);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = -1;
                v(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i2;
                if (cCharAt == c) {
                    return;
                }
                v(c);
                throw null;
            }
            i = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0193, code lost:
    
        m(r23, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ad, code lost:
    
        m(r23, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b4, code lost:
    
        defpackage.l.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b8, code lost:
    
        if (r13 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c3, code lost:
    
        m(r23, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c9, code lost:
    
        m(r23, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ce, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0110, code lost:
    
        m(r23, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        if (r1 == r11) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        if (r13 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
    
        if (r1 == (r11 - 1)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
    
        if (r19 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
    
        if (r2 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        if (o().charAt(r11) != '\"') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0150, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0153, code lost:
    
        m(r23, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        m(r23, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0163, code lost:
    
        r23.a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0165, code lost:
    
        if (r20 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016a, code lost:
    
        if (r8 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016c, code lost:
    
        r6 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
    
        if (r8 != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0176, code lost:
    
        r6 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017b, code lost:
    
        r1 = r1 * r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0180, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0186, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018e, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0190, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h() {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eve.h():long");
    }

    public final String i() {
        String str = this.c;
        if (str == null) {
            return d();
        }
        str.getClass();
        this.c = null;
        return str;
    }

    public final String j() {
        String string;
        String str = this.c;
        if (str != null) {
            str.getClass();
            this.c = null;
            return str;
        }
        int iT = t();
        if (iT >= o().length() || iT == -1) {
            m(this, "EOF", iT, null, 4);
            throw null;
        }
        byte bJ = ee3.j(o().charAt(iT));
        if (bJ == 1) {
            return i();
        }
        if (bJ != 0) {
            m(this, "Expected beginning of the string, but got " + o().charAt(iT), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bJ2 = ee3.j(o().charAt(iT));
            StringBuilder sb = this.d;
            if (bJ2 != 0) {
                int i = this.a;
                if (z) {
                    sb.append((CharSequence) o(), i, iT);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = o().subSequence(i, iT).toString();
                }
                this.a = iT;
                return string;
            }
            iT++;
            if (iT >= o().length()) {
                sb.append((CharSequence) o(), this.a, iT);
                int iS = s(iT);
                if (iS == -1) {
                    this.a = iT;
                    sb.append((CharSequence) o(), 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iT = iS;
                z = true;
            }
        }
    }

    public final String k() {
        String strJ = j();
        if (!wl7.b(strJ, "null") || o().charAt(this.a - 1) == '\"') {
            return strJ;
        }
        m(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final void l(int i, String str, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbG = h5.g(str, " at path: ");
        sbG.append(this.b.a());
        sbG.append(strConcat);
        throw boa.f(i, sbG.toString(), o());
    }

    public final int n(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String o() {
        return this.e;
    }

    public final String p(String str, boolean z) {
        str.getClass();
        int i = this.a;
        try {
            if (e() == 6 && wl7.b(r(z), str)) {
                this.c = null;
                if (e() == 5) {
                    return r(z);
                }
            }
            return null;
        } finally {
            this.a = i;
            this.c = null;
        }
    }

    public byte q() {
        String strO = o();
        int i = this.a;
        while (true) {
            int iS = s(i);
            if (iS == -1) {
                this.a = iS;
                return (byte) 10;
            }
            char cCharAt = strO.charAt(iS);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.a = iS;
                return ee3.j(cCharAt);
            }
            i = iS + 1;
        }
    }

    public final String r(boolean z) {
        String strI;
        byte bQ = q();
        if (z) {
            if (bQ != 1 && bQ != 0) {
                return null;
            }
            strI = j();
        } else {
            if (bQ != 1) {
                return null;
            }
            strI = i();
        }
        this.c = strI;
        return strI;
    }

    public final int s(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    public int t() {
        char cCharAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) o());
        sb.append("', currentPosition=");
        return k6.h(sb, this.a, ')');
    }

    public final boolean u() {
        int iT = t();
        String strO = o();
        if (iT >= strO.length() || iT == -1 || strO.charAt(iT) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    public final void v(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String strJ = j();
                this.a = i;
                if (wl7.b(strJ, "null")) {
                    l(this.a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        String strZ = ee3.z(ee3.j(c));
        int i2 = this.a;
        int i3 = i2 - 1;
        String str = this.e;
        m(this, akb.k("Expected ", strZ, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }
}
