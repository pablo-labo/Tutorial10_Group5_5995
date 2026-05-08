package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.a;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.a32;
import defpackage.b0;
import defpackage.uqc;
import defpackage.vr1;
import defpackage.zn1;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public static final vr1 a0;
    public static final vr1 b0;
    public static final vr1 c0;
    public final zn1 V;
    public int W;
    public long X;
    public int Y;
    public String Z;
    public final uqc f;

    static {
        vr1 vr1Var = vr1.c;
        a0 = vr1.a.c("'\\");
        b0 = vr1.a.c("\"\\");
        c0 = vr1.a.c("{}[]:, \n\t\r\f/\\;#=");
        vr1.a.c("\n\r");
        vr1.a.c("*/");
    }

    public c(uqc uqcVar) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.W = 0;
        this.f = uqcVar;
        this.V = uqcVar.b;
        G(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void I() {
        int i = 0;
        do {
            int iB0 = this.W;
            if (iB0 == 0) {
                iB0 = b0();
            }
            if (iB0 == 3) {
                G(1);
            } else if (iB0 == 1) {
                G(3);
            } else {
                if (iB0 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(v());
                        b.a(sb, c());
                        return;
                    }
                    this.a--;
                } else if (iB0 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(v());
                        b.a(sb2, c());
                        return;
                    }
                    this.a--;
                } else {
                    zn1 zn1Var = this.V;
                    if (iB0 == 14 || iB0 == 10) {
                        long jZ = this.f.Z(c0);
                        if (jZ == -1) {
                            jZ = zn1Var.b;
                        }
                        zn1Var.skip(jZ);
                    } else if (iB0 == 9 || iB0 == 13) {
                        o0(b0);
                    } else if (iB0 == 8 || iB0 == 12) {
                        o0(a0);
                    } else if (iB0 == 17) {
                        zn1Var.skip(this.Y);
                    } else if (iB0 == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(v());
                        b.a(sb3, c());
                        return;
                    }
                }
                this.W = 0;
            }
            i++;
            this.W = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final String I0() {
        String strH0;
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 10) {
            strH0 = k0();
        } else if (iB0 == 9) {
            strH0 = j0(b0);
        } else if (iB0 == 8) {
            strH0 = j0(a0);
        } else if (iB0 == 11) {
            strH0 = this.Z;
            this.Z = null;
        } else if (iB0 == 16) {
            strH0 = Long.toString(this.X);
        } else {
            if (iB0 != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(v());
                b.a(sb, c());
                return null;
            }
            long j = this.Y;
            zn1 zn1Var = this.V;
            zn1Var.getClass();
            strH0 = zn1Var.h0(j, a32.b);
        }
        this.W = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strH0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int N(a.C0108a c0108a) {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 < 12 || iB0 > 15) {
            return -1;
        }
        if (iB0 == 15) {
            return d0(this.Z, c0108a);
        }
        int iE0 = this.f.E0(c0108a.b);
        if (iE0 != -1) {
            this.W = 0;
            this.c[this.a - 1] = c0108a.a[iE0];
            return iE0;
        }
        String str = this.c[this.a - 1];
        String strX = X();
        int iD0 = d0(strX, c0108a);
        if (iD0 == -1) {
            this.W = 15;
            this.Z = strX;
            this.c[this.a - 1] = str;
        }
        return iD0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void P() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 14) {
            long jZ = this.f.Z(c0);
            zn1 zn1Var = this.V;
            if (jZ == -1) {
                jZ = zn1Var.b;
            }
            zn1Var.skip(jZ);
        } else if (iB0 == 13) {
            o0(b0);
        } else if (iB0 == 12) {
            o0(a0);
        } else if (iB0 != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(v());
            b.a(sb, c());
            return;
        }
        this.W = 0;
        this.c[this.a - 1] = "null";
    }

    public final void W() throws JsonEncodingException {
        Q("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String X() throws JsonEncodingException, EOFException {
        String strJ0;
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 14) {
            strJ0 = k0();
        } else if (iB0 == 13) {
            strJ0 = j0(b0);
        } else if (iB0 == 12) {
            strJ0 = j0(a0);
        } else {
            if (iB0 != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(v());
                b.a(sb, c());
                return null;
            }
            strJ0 = this.Z;
        }
        this.W = 0;
        this.c[this.a - 1] = strJ0;
        return strJ0;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void a() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 3) {
            G(1);
            this.d[this.a - 1] = 0;
            this.W = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(v());
            b.a(sb, c());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01a2, code lost:
    
        if (f0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a4, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01a6, code lost:
    
        if (r4 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ac, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ae, code lost:
    
        if (r13 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01b2, code lost:
    
        if (r8 != r18) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b4, code lost:
    
        if (r13 != 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b6, code lost:
    
        if (r13 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b9, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ba, code lost:
    
        r23.X = r8;
        r7.skip(r2);
        r9 = 16;
        r23.W = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c5, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01c8, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cb, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01cd, code lost:
    
        r23.Y = r2;
        r9 = 17;
        r23.W = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b0() throws com.airbnb.lottie.parser.moshi.JsonEncodingException, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.c.b0():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.W = 0;
        this.b[0] = 8;
        this.a = 1;
        this.V.h();
        this.f.close();
    }

    public final int d0(String str, a.C0108a c0108a) {
        int length = c0108a.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c0108a.a[i])) {
                this.W = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean f0(int i) throws JsonEncodingException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        W();
        throw null;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void h() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 1) {
            G(3);
            this.W = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(v());
            b.a(sb, c());
        }
    }

    public final int h0(boolean z) throws JsonEncodingException, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            uqc uqcVar = this.f;
            if (!uqcVar.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            zn1 zn1Var = this.V;
            byte bP = zn1Var.P(j);
            if (bP != 10 && bP != 32 && bP != 13 && bP != 9) {
                zn1Var.skip(j);
                if (bP == 47) {
                    if (uqcVar.request(2L)) {
                        W();
                        throw null;
                    }
                } else if (bP == 35) {
                    W();
                    throw null;
                }
                return bP;
            }
            i = i2;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean hasNext() throws JsonEncodingException, EOFException {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        return (iB0 == 2 || iB0 == 4 || iB0 == 18) ? false : true;
    }

    public final String j0(vr1 vr1Var) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jZ = this.f.Z(vr1Var);
            if (jZ == -1) {
                Q("Unterminated string");
                throw null;
            }
            zn1 zn1Var = this.V;
            if (zn1Var.P(jZ) != 92) {
                if (sb == null) {
                    String strH0 = zn1Var.h0(jZ, a32.b);
                    zn1Var.readByte();
                    return strH0;
                }
                sb.append(zn1Var.h0(jZ, a32.b));
                zn1Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(zn1Var.h0(jZ, a32.b));
            zn1Var.readByte();
            sb.append(m0());
        }
    }

    public final String k0() {
        long jZ = this.f.Z(c0);
        zn1 zn1Var = this.V;
        if (jZ == -1) {
            return zn1Var.z1();
        }
        zn1Var.getClass();
        return zn1Var.h0(jZ, a32.b);
    }

    public final char m0() throws JsonEncodingException, EOFException {
        int i;
        uqc uqcVar = this.f;
        if (!uqcVar.request(1L)) {
            Q("Unterminated escape sequence");
            throw null;
        }
        zn1 zn1Var = this.V;
        byte b = zn1Var.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            Q("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!uqcVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(c()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bP = zn1Var.P(i2);
            char c2 = (char) (c << 4);
            if (bP >= 48 && bP <= 57) {
                i = bP - 48;
            } else if (bP >= 97 && bP <= 102) {
                i = bP - 87;
            } else {
                if (bP < 65 || bP > 70) {
                    Q("\\u".concat(zn1Var.h0(4L, a32.b)));
                    throw null;
                }
                i = bP - 55;
            }
            c = (char) (i + c2);
        }
        zn1Var.skip(4L);
        return c;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final boolean nextBoolean() throws JsonEncodingException, EOFException {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 5) {
            this.W = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iB0 != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(v());
            b.a(sb, c());
            return false;
        }
        this.W = 0;
        int[] iArr2 = this.d;
        int i2 = this.a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final double nextDouble() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 16) {
            this.W = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.X;
        }
        if (iB0 == 17) {
            long j = this.Y;
            zn1 zn1Var = this.V;
            zn1Var.getClass();
            this.Z = zn1Var.h0(j, a32.b);
        } else if (iB0 == 9) {
            this.Z = j0(b0);
        } else if (iB0 == 8) {
            this.Z = j0(a0);
        } else if (iB0 == 10) {
            this.Z = k0();
        } else if (iB0 != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(v());
            b.a(sb, c());
            return 0.0d;
        }
        this.W = 11;
        try {
            double d = Double.parseDouble(this.Z);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + c());
            }
            this.Z = null;
            this.W = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.Z + " at path " + c());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final int nextInt() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 == 16) {
            long j = this.X;
            int i = (int) j;
            if (j == i) {
                this.W = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new JsonDataException("Expected an int but was " + this.X + " at path " + c());
        }
        if (iB0 == 17) {
            long j2 = this.Y;
            zn1 zn1Var = this.V;
            zn1Var.getClass();
            this.Z = zn1Var.h0(j2, a32.b);
        } else if (iB0 == 9 || iB0 == 8) {
            String strJ0 = iB0 == 9 ? j0(b0) : j0(a0);
            this.Z = strJ0;
            try {
                int i3 = Integer.parseInt(strJ0);
                this.W = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iB0 != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(v());
            b.a(sb, c());
            return 0;
        }
        this.W = 11;
        try {
            double d = Double.parseDouble(this.Z);
            int i5 = (int) d;
            if (i5 == d) {
                this.Z = null;
                this.W = 0;
                int[] iArr3 = this.d;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.Z + " at path " + c());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.Z + " at path " + c());
        }
    }

    public final void o0(vr1 vr1Var) throws JsonEncodingException, EOFException {
        while (true) {
            long jZ = this.f.Z(vr1Var);
            if (jZ == -1) {
                Q("Unterminated string");
                throw null;
            }
            zn1 zn1Var = this.V;
            if (zn1Var.P(jZ) != 92) {
                zn1Var.skip(jZ + 1);
                return;
            } else {
                zn1Var.skip(jZ + 1);
                m0();
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void p() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(v());
            b.a(sb, c());
        } else {
            int i = this.a;
            this.a = i - 1;
            int[] iArr = this.d;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.W = 0;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final void s() {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        if (iB0 != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(v());
            b.a(sb, c());
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.W = 0;
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.a
    public final a.b v() throws JsonEncodingException, EOFException {
        int iB0 = this.W;
        if (iB0 == 0) {
            iB0 = b0();
        }
        switch (iB0) {
            case 1:
                return a.b.c;
            case 2:
                return a.b.d;
            case 3:
                return a.b.a;
            case 4:
                return a.b.b;
            case 5:
            case 6:
                return a.b.W;
            case 7:
                return a.b.X;
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                return a.b.f;
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
            case 15:
                return a.b.e;
            case 16:
            case 17:
                return a.b.V;
            case 18:
                return a.b.Y;
            default:
                b0.t();
                return null;
        }
    }
}
