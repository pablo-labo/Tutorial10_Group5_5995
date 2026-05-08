package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.stream.MalformedJsonException;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class nb8 implements Closeable {
    public long X;
    public int Y;
    public String Z;
    public final Reader a;
    public int[] a0;
    public String[] c0;
    public int[] d0;
    public boolean b = false;
    public final char[] c = new char[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int V = 0;
    public int W = 0;
    public int b0 = 1;

    public class a extends v1 {
    }

    static {
        v1.a = new a();
    }

    public nb8(Reader reader) {
        int[] iArr = new int[32];
        this.a0 = iArr;
        iArr[0] = 6;
        this.c0 = new String[32];
        this.d0 = new int[32];
        this.a = reader;
    }

    public final void B0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str.concat(b0()));
    }

    public void G() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(j0());
            q6.o(sb, b0());
            return;
        }
        int i = this.b0;
        int i2 = i - 1;
        this.b0 = i2;
        this.c0[i2] = null;
        int[] iArr = this.d0;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.W = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void I() throws IOException {
        int i = 0;
        do {
            int iS = this.W;
            if (iS == 0) {
                iS = s();
            }
            switch (iS) {
                case 1:
                    k0(3);
                    i++;
                    this.W = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.c0[this.b0 - 1] = null;
                    }
                    this.b0--;
                    i--;
                    this.W = 0;
                    break;
                case 3:
                    k0(1);
                    i++;
                    this.W = 0;
                    break;
                case 4:
                    this.b0--;
                    i--;
                    this.W = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.W = 0;
                    break;
                case 8:
                    o0('\'');
                    this.W = 0;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    o0('\"');
                    this.W = 0;
                    break;
                case 10:
                    s0();
                    this.W = 0;
                    break;
                case 12:
                    o0('\'');
                    if (i == 0) {
                        this.c0[this.b0 - 1] = "<skipped>";
                    }
                    this.W = 0;
                    break;
                case 13:
                    o0('\"');
                    if (i == 0) {
                        this.c0[this.b0 - 1] = "<skipped>";
                    }
                    this.W = 0;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    s0();
                    if (i == 0) {
                        this.c0[this.b0 - 1] = "<skipped>";
                    }
                    this.W = 0;
                    break;
                case 16:
                    this.d += this.Y;
                    this.W = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.d0;
        int i2 = this.b0 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public String I0() throws IOException {
        String str;
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            str = h0();
        } else if (iS == 8) {
            str = f0('\'');
        } else if (iS == 9) {
            str = f0('\"');
        } else if (iS == 11) {
            str = this.Z;
            this.Z = null;
        } else if (iS == 15) {
            str = Long.toString(this.X);
        } else {
            if (iS != 16) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(j0());
                q6.o(sb, b0());
                return null;
            }
            str = new String(this.c, this.d, this.Y);
            this.d += this.Y;
        }
        this.W = 0;
        int[] iArr = this.d0;
        int i = this.b0 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public final boolean N(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.V;
        int i5 = this.d;
        this.V = i4 - i5;
        int i6 = this.e;
        char[] cArr = this.c;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            int i8 = this.e;
            int i9 = this.a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.e + i9;
            this.e = i2;
            if (this.f == 0 && (i3 = this.V) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.V = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String P(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.b0;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.a0[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.d0[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = this.c0[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public String Q() {
        return P(true);
    }

    public final boolean W(char c) throws MalformedJsonException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        p();
        return false;
    }

    public String X() throws IOException {
        String strF0;
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strF0 = h0();
        } else if (iS == 12) {
            strF0 = f0('\'');
        } else {
            if (iS != 13) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(j0());
                q6.o(sb, b0());
                return null;
            }
            strF0 = f0('\"');
        }
        this.W = 0;
        this.c0[this.b0 - 1] = strF0;
        return strF0;
    }

    public void a() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 3) {
            k0(1);
            this.d0[this.b0 - 1] = 0;
            this.W = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(j0());
            q6.o(sb, b0());
        }
    }

    final String b0() {
        StringBuilder sbF = uz.f(" at line ", this.f + 1, " column ", (this.d - this.V) + 1, " path ");
        sbF.append(c());
        return sbF.toString();
    }

    public String c() {
        return P(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.W = 0;
        this.a0[0] = 8;
        this.b0 = 1;
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d0(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb8.d0(boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r10.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f0(char r11) throws com.google.gson.stream.MalformedJsonException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.d
            int r3 = r10.e
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r10.c
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r7[r2]
            if (r2 != r11) goto L29
            r10.d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r10 = new java.lang.String
            r10.<init>(r7, r3, r8)
            return r10
        L21:
            r1.append(r7, r3, r8)
            java.lang.String r10 = r1.toString()
            return r10
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L3f:
            r1.append(r7, r3, r2)
            char r2 = r10.m0()
            r1.append(r2)
            int r2 = r10.d
            int r3 = r10.e
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f
            int r2 = r2 + r6
            r10.f = r2
            r10.V = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r10.d = r2
            boolean r2 = r10.N(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.B0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb8.f0(char):java.lang.String");
    }

    public void h() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 1) {
            k0(3);
            this.W = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(j0());
            q6.o(sb, b0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        p();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.d
            int r3 = r3 + r2
            int r4 = r6.e
            char[] r5 = r6.c
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.p()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.N(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.d
            r0.append(r5, r3, r2)
            int r3 = r6.d
            int r3 = r3 + r2
            r6.d = r3
            r2 = 1
            boolean r2 = r6.N(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.d
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.d
            int r2 = r2 + r1
            r6.d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb8.h0():java.lang.String");
    }

    public boolean hasNext() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 17) ? false : true;
    }

    public sb8 j0() {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return sb8.c;
            case 2:
                return sb8.d;
            case 3:
                return sb8.a;
            case 4:
                return sb8.b;
            case 5:
            case 6:
                return sb8.W;
            case 7:
                return sb8.X;
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                return sb8.f;
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return sb8.e;
            case 15:
            case 16:
                return sb8.V;
            case 17:
                return sb8.Y;
            default:
                b0.t();
                return null;
        }
    }

    public final void k0(int i) {
        int i2 = this.b0;
        int[] iArr = this.a0;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.a0 = Arrays.copyOf(iArr, i3);
            this.d0 = Arrays.copyOf(this.d0, i3);
            this.c0 = (String[]) Arrays.copyOf(this.c0, i3);
        }
        int[] iArr2 = this.a0;
        int i4 = this.b0;
        this.b0 = i4 + 1;
        iArr2[i4] = i;
    }

    public void l1() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(j0());
            q6.o(sb, b0());
        } else {
            this.W = 0;
            int[] iArr = this.d0;
            int i = this.b0 - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final char m0() throws MalformedJsonException {
        int i;
        if (this.d == this.e && !N(1)) {
            B0("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.c;
        char c = cArr[i2];
        if (c == '\n') {
            this.f++;
            this.V = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            B0("Invalid escape sequence");
            throw null;
        }
        if (i2 + 5 > this.e && !N(4)) {
            B0("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.d;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = cArr[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.d, 4)));
                }
                i = c3 - '7';
            }
            c2 = (char) (i + c4);
            i4++;
        }
        this.d += 4;
        return c2;
    }

    public boolean nextBoolean() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.W = 0;
            int[] iArr = this.d0;
            int i = this.b0 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iS != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(j0());
            q6.o(sb, b0());
            return false;
        }
        this.W = 0;
        int[] iArr2 = this.d0;
        int i2 = this.b0 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.W = 0;
            int[] iArr = this.d0;
            int i = this.b0 - 1;
            iArr[i] = iArr[i] + 1;
            return this.X;
        }
        if (iS == 16) {
            this.Z = new String(this.c, this.d, this.Y);
            this.d += this.Y;
        } else if (iS == 8 || iS == 9) {
            this.Z = f0(iS == 8 ? '\'' : '\"');
        } else if (iS == 10) {
            this.Z = h0();
        } else if (iS != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(j0());
            q6.o(sb, b0());
            return 0.0d;
        }
        this.W = 11;
        double d = Double.parseDouble(this.Z);
        if (!this.b && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + b0());
        }
        this.Z = null;
        this.W = 0;
        int[] iArr2 = this.d0;
        int i2 = this.b0 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int nextInt() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            long j = this.X;
            int i = (int) j;
            if (j == i) {
                this.W = 0;
                int[] iArr = this.d0;
                int i2 = this.b0 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.X + b0());
        }
        if (iS == 16) {
            this.Z = new String(this.c, this.d, this.Y);
            this.d += this.Y;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(j0());
                q6.o(sb, b0());
                return 0;
            }
            if (iS == 10) {
                this.Z = h0();
            } else {
                this.Z = f0(iS == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.Z);
                this.W = 0;
                int[] iArr2 = this.d0;
                int i4 = this.b0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.W = 11;
        double d = Double.parseDouble(this.Z);
        int i5 = (int) d;
        if (i5 == d) {
            this.Z = null;
            this.W = 0;
            int[] iArr3 = this.d0;
            int i6 = this.b0 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.Z + b0());
    }

    public long nextLong() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.W = 0;
            int[] iArr = this.d0;
            int i = this.b0 - 1;
            iArr[i] = iArr[i] + 1;
            return this.X;
        }
        if (iS == 16) {
            this.Z = new String(this.c, this.d, this.Y);
            this.d += this.Y;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                StringBuilder sb = new StringBuilder("Expected a long but was ");
                sb.append(j0());
                q6.o(sb, b0());
                return 0L;
            }
            if (iS == 10) {
                this.Z = h0();
            } else {
                this.Z = f0(iS == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.Z);
                this.W = 0;
                int[] iArr2 = this.d0;
                int i2 = this.b0 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.W = 11;
        double d = Double.parseDouble(this.Z);
        long j2 = (long) d;
        if (j2 == d) {
            this.Z = null;
            this.W = 0;
            int[] iArr3 = this.d0;
            int i3 = this.b0 - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.Z + b0());
    }

    public final void o0(char c) throws MalformedJsonException {
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.c[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.d = i3;
                    m0();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.V = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (N(1));
        B0("Unterminated string");
        throw null;
    }

    public final void p() throws MalformedJsonException {
        if (this.b) {
            return;
        }
        B0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final void r0() {
        char c;
        do {
            if (this.d >= this.e && !N(1)) {
                return;
            }
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = this.c[i];
            if (c == '\n') {
                this.f++;
                this.V = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01c4, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0219, code lost:
    
        if (W(r14) != false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int s() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb8.s():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        p();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.d
            int r1 = r1 + r0
            int r2 = r3.e
            if (r1 >= r2) goto L4f
            char[] r2 = r3.c
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.p()
        L49:
            int r1 = r3.d
            int r1 = r1 + r0
            r3.d = r1
            return
        L4f:
            r3.d = r1
            r0 = 1
            boolean r0 = r3.N(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb8.s0():void");
    }

    public String toString() {
        return getClass().getSimpleName().concat(b0());
    }

    public void v() throws IOException {
        int iS = this.W;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(j0());
            q6.o(sb, b0());
        } else {
            int i = this.b0;
            this.b0 = i - 1;
            int[] iArr = this.d0;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.W = 0;
        }
    }
}
