package defpackage;

import defpackage.eb8;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class que extends v1 implements ha8 {
    public a V;
    public final aa8 W;
    public final ma8 X;
    public final s98 b;
    public final d5h c;
    public final eve d;
    public final v1 e;
    public int f;

    public static final class a {
        public String a;
    }

    public que(s98 s98Var, d5h d5hVar, eve eveVar, SerialDescriptor serialDescriptor, a aVar) {
        serialDescriptor.getClass();
        this.b = s98Var;
        this.c = d5hVar;
        this.d = eveVar;
        this.e = s98Var.b;
        this.f = -1;
        this.V = aVar;
        aa8 aa8Var = s98Var.a;
        this.W = aa8Var;
        this.X = aa8Var.c ? null : new ma8(serialDescriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T B(defpackage.i04<? extends T> r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.B(i04):java.lang.Object");
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final String C() {
        boolean z = this.W.b;
        eve eveVar = this.d;
        return z ? eveVar.k() : eveVar.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F() {
        /*
            r9 = this;
            r0 = 0
            ma8 r1 = r9.X
            if (r1 == 0) goto L8
            boolean r1 = r1.b
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 != 0) goto L5b
            eve r9 = r9.d
            int r1 = r9.t()
            int r1 = r9.s(r1)
            java.lang.String r2 = r9.o()
            int r2 = r2.length()
            int r2 = r2 - r1
            r3 = 1
            r4 = 4
            if (r2 < r4) goto L57
            r5 = -1
            if (r1 != r5) goto L26
            goto L57
        L26:
            r5 = r0
        L27:
            if (r5 >= r4) goto L3f
            java.lang.String r6 = "null"
            char r6 = r6.charAt(r5)
            java.lang.String r7 = r9.o()
            int r8 = r1 + r5
            char r7 = r7.charAt(r8)
            if (r6 == r7) goto L3c
            goto L57
        L3c:
            int r5 = r5 + 1
            goto L27
        L3f:
            if (r2 <= r4) goto L52
            java.lang.String r2 = r9.o()
            int r5 = r1 + 4
            char r2 = r2.charAt(r5)
            byte r2 = defpackage.ee3.j(r2)
            if (r2 != 0) goto L52
            goto L57
        L52:
            int r1 = r1 + r4
            r9.a = r1
            r9 = r3
            goto L58
        L57:
            r9 = r0
        L58:
            if (r9 != 0) goto L5b
            return r3
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.F():boolean");
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final byte H() {
        eve eveVar = this.d;
        long jH = eveVar.h();
        byte b = (byte) jH;
        if (jH == b) {
            return b;
        }
        eve.m(eveVar, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ul2
    public final v1 a() {
        return this.e;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final ul2 b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        s98 s98Var = this.b;
        d5h d5hVarB = e5h.b(s98Var, serialDescriptor);
        eve eveVar = this.d;
        eb8 eb8Var = eveVar.b;
        int i = eb8Var.c + 1;
        eb8Var.c = i;
        Object[] objArr = eb8Var.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            eb8Var.a = Arrays.copyOf(objArr, i2);
            eb8Var.b = Arrays.copyOf(eb8Var.b, i2);
        }
        eb8Var.a[i] = serialDescriptor;
        eveVar.g(d5hVarB.begin);
        if (eveVar.q() != 4) {
            int iOrdinal = d5hVarB.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new que(s98Var, d5hVarB, eveVar, serialDescriptor, this.V) : (this.c == d5hVarB && s98Var.a.c) ? this : new que(s98Var, d5hVarB, eveVar, serialDescriptor, this.V);
        }
        eve.m(eveVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.v1, defpackage.ul2
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor.getC() == 0 && wa8.c(this.b, serialDescriptor)) {
            while (p(serialDescriptor) != -1) {
            }
        }
        eve eveVar = this.d;
        if (eveVar.u()) {
            boa.z(eveVar, "");
            throw null;
        }
        eveVar.g(this.c.end);
        eb8 eb8Var = eveVar.b;
        int i = eb8Var.c;
        int[] iArr = eb8Var.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            eb8Var.c = i - 1;
        }
        int i2 = eb8Var.c;
        if (i2 != -1) {
            eb8Var.c = i2 - 1;
        }
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final int e(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return wa8.b(serialDescriptor, this.b, C(), " at path ".concat(this.d.b.a()));
    }

    @Override // defpackage.ha8
    public final JsonElement i() {
        return new bc8(this.b.a, this.d).b();
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final int k() {
        eve eveVar = this.d;
        long jH = eveVar.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        eve.m(eveVar, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final long n() {
        return this.d.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ee, code lost:
    
        r0 = r3.c;
        r1 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
    
        if (r1[r0] != (-2)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f7, code lost:
    
        r1[r0] = -1;
        r3.c = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fc, code lost:
    
        r0 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fe, code lost:
    
        if (r0 == (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0100, code lost:
    
        r3.c = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0103, code lost:
    
        r0 = defpackage.zve.W(r2.o().subSequence(0, r2.a).toString(), 0, 6, r6);
        r2 = defpackage.w40.h(r0, "Encountered an unknown key '", r6, "' at offset ", " at path: ");
        r2.append(r3.a());
        r2.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r2.append((java.lang.Object) defpackage.boa.G(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
    
        throw new kotlinx.serialization.json.internal.JsonDecodingException(r2.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ul2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(kotlinx.serialization.descriptors.SerialDescriptor r21) throws expo.modules.imagepicker.FailedToReadFileException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.p(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final Decoder s(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return sue.a(serialDescriptor) ? new ia8(this.d, this.b) : this;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final short t() {
        eve eveVar = this.d;
        long jH = eveVar.h();
        short s = (short) jH;
        if (jH == s) {
            return s;
        }
        eve.m(eveVar, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final float u() {
        eve eveVar = this.d;
        String strJ = eveVar.j();
        try {
            float f = Float.parseFloat(strJ);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            boa.P(eveVar, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            eve.m(eveVar, ja.f('\'', "Failed to parse type 'float' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final double w() {
        eve eveVar = this.d;
        String strJ = eveVar.j();
        try {
            double d = Double.parseDouble(strJ);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            boa.P(eveVar, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            eve.m(eveVar, ja.f('\'', "Failed to parse type 'double' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final boolean x() {
        boolean z;
        boolean z2;
        eve eveVar = this.d;
        int iT = eveVar.t();
        String str = eveVar.e;
        if (iT == str.length()) {
            eve.m(eveVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z = true;
        } else {
            z = false;
        }
        int iS = eveVar.s(iT);
        if (iS >= str.length() || iS == -1) {
            eve.m(eveVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iS + 1;
        int iCharAt = str.charAt(iS) | ' ';
        if (iCharAt == 102) {
            eveVar.c(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                eve.m(eveVar, "Expected valid boolean literal prefix, but had '" + eveVar.j() + '\'', 0, null, 6);
                throw null;
            }
            eveVar.c(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (eveVar.a == str.length()) {
            eve.m(eveVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(eveVar.a) == '\"') {
            eveVar.a++;
            return z2;
        }
        eve.m(eveVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final char y() {
        eve eveVar = this.d;
        String strJ = eveVar.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        eve.m(eveVar, ja.f('\'', "Expected single char, but got '", strJ), 0, null, 6);
        throw null;
    }

    @Override // defpackage.v1, defpackage.ul2
    public final <T> T z(SerialDescriptor serialDescriptor, int i, i04<? extends T> i04Var, T t) {
        eb8 eb8Var = this.d.b;
        serialDescriptor.getClass();
        i04Var.getClass();
        boolean z = this.c == d5h.c && (i & 1) == 0;
        if (z) {
            int[] iArr = eb8Var.b;
            int i2 = eb8Var.c;
            if (iArr[i2] == -2) {
                eb8Var.a[i2] = eb8.a.a;
            }
        }
        T t2 = (T) B(i04Var);
        if (z) {
            int[] iArr2 = eb8Var.b;
            int i3 = eb8Var.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                eb8Var.c = i4;
                Object[] objArr = eb8Var.a;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    eb8Var.a = Arrays.copyOf(objArr, i5);
                    eb8Var.b = Arrays.copyOf(eb8Var.b, i5);
                }
            }
            Object[] objArr2 = eb8Var.a;
            int i6 = eb8Var.c;
            objArr2[i6] = t2;
            eb8Var.b[i6] = -2;
        }
        return t2;
    }
}
