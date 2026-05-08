package defpackage;

import com.apollographql.apollo.exception.JsonDataException;
import com.apollographql.apollo.exception.JsonEncodingException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.mb8;
import defpackage.vr1;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements mb8 {
    public static final vr1 b0;
    public static final vr1 c0;
    public static final vr1 d0;
    public int[] V;
    public int W;
    public String[] X;
    public int[] Y;
    public int[] Z;
    public final to1 a;
    public int a0;
    public final zn1 b;
    public int c;
    public long d;
    public int e;
    public String f;

    static {
        vr1 vr1Var = vr1.c;
        b0 = vr1.a.c("'\\");
        c0 = vr1.a.c("\"\\");
        d0 = vr1.a.c("{}[]:, \n\t\r/\\;#=");
    }

    public uo1(to1 to1Var) {
        to1Var.getClass();
        this.a = to1Var;
        this.b = to1Var.f();
        int[] iArr = new int[64];
        iArr[0] = 6;
        this.V = iArr;
        this.W = 1;
        this.X = new String[64];
        this.Y = new int[64];
        int[] iArr2 = new int[64];
        iArr2[0] = 0;
        this.Z = iArr2;
        this.a0 = 1;
    }

    @Override // defpackage.mb8
    public final za8 B1() throws EOFException {
        String strI0 = I0();
        strI0.getClass();
        return new za8(strI0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        I();
     */
    @Override // defpackage.mb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D1(java.util.List<java.lang.String> r7) throws java.io.EOFException {
        /*
            r6 = this;
            r7.getClass()
            boolean r0 = r7.isEmpty()
            r1 = -1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.String r0 = r6.X()
            int[] r2 = r6.Z
            int r3 = r6.a0
            int r3 = r3 + (-1)
            r2 = r2[r3]
            java.lang.Object r3 = r7.get(r2)
            boolean r3 = defpackage.wl7.b(r3, r0)
            r4 = 0
            if (r3 == 0) goto L45
            int[] r0 = r6.Z
            int r1 = r6.a0
            int r3 = r1 + (-1)
            int r5 = r2 + 1
            r0[r3] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L44
            int[] r7 = r6.Z
            int r6 = r6.a0
            int r6 = r6 + (-1)
            r7[r6] = r4
        L44:
            return r2
        L45:
            r3 = r2
        L46:
            int r3 = r3 + 1
            int r5 = r7.size()
            if (r3 != r5) goto L4f
            r3 = r4
        L4f:
            if (r3 != r2) goto L55
            r6.I()
            goto Lb
        L55:
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = defpackage.wl7.b(r5, r0)
            if (r5 == 0) goto L46
            int[] r0 = r6.Z
            int r1 = r6.a0
            int r2 = r1 + (-1)
            int r5 = r3 + 1
            r0[r2] = r5
            int r1 = r1 + (-1)
            r0 = r0[r1]
            int r7 = r7.size()
            if (r0 != r7) goto L7b
            int[] r7 = r6.Z
            int r6 = r6.a0
            int r6 = r6 + (-1)
            r7[r6] = r4
        L7b:
            return r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo1.D1(java.util.List):int");
    }

    public final String G() {
        long jZ = this.a.Z(d0);
        zn1 zn1Var = this.b;
        if (jZ == -1) {
            return zn1Var.z1();
        }
        zn1Var.getClass();
        return zn1Var.h0(jZ, a32.b);
    }

    @Override // defpackage.mb8
    public final void I() throws EOFException {
        int i = 0;
        do {
            int i2 = this.c;
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 == 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
            zn1 zn1Var = this.b;
            switch (iIntValue) {
                case 1:
                    N(3);
                    i++;
                    break;
                case 2:
                    this.W--;
                    i--;
                    break;
                case 3:
                    N(1);
                    i++;
                    break;
                case 4:
                    this.W--;
                    i--;
                    break;
                case 8:
                case 12:
                    Q(b0);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                case 13:
                    Q(c0);
                    break;
                case 10:
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    long jZ = this.a.Z(d0);
                    if (jZ == -1) {
                        jZ = zn1Var.b;
                    }
                    zn1Var.skip(jZ);
                    break;
                case 16:
                    zn1Var.skip(this.e);
                    break;
            }
            this.c = 0;
        } while (i != 0);
        int[] iArr = this.Y;
        int i3 = this.W - 1;
        iArr[i3] = iArr[i3] + 1;
        this.X[i3] = "null";
    }

    @Override // defpackage.mb8
    public final String I0() throws EOFException {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        String strValueOf = null;
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            strValueOf = String.valueOf(this.d);
        } else if (iIntValue != 16) {
            switch (iIntValue) {
                case 8:
                    strValueOf = v(b0);
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    strValueOf = v(c0);
                    break;
                case 10:
                    strValueOf = G();
                    break;
                case 11:
                    String str = this.f;
                    if (str != null) {
                        this.f = null;
                        strValueOf = str;
                    }
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Expected a string but was ");
                    sb.append(peek());
                    akb.r(sb, h());
                    return null;
            }
        } else {
            long j = this.e;
            zn1 zn1Var = this.b;
            zn1Var.getClass();
            strValueOf = zn1Var.h0(j, a32.b);
        }
        this.c = 0;
        int[] iArr = this.Y;
        int i2 = this.W - 1;
        iArr[i2] = iArr[i2] + 1;
        return strValueOf;
    }

    public final void N(int i) {
        int i2 = this.W;
        int[] iArr = this.V;
        if (i2 == iArr.length) {
            this.V = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.X;
            this.X = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.Y;
            this.Y = Arrays.copyOf(iArr2, iArr2.length * 2);
            int[] iArr3 = this.Z;
            this.Z = Arrays.copyOf(iArr3, iArr3.length * 2);
        }
        int[] iArr4 = this.V;
        int i3 = this.W;
        this.W = i3 + 1;
        iArr4[i3] = i;
    }

    public final char P() throws EOFException {
        int i;
        to1 to1Var = this.a;
        if (!to1Var.request(1L)) {
            W("Unterminated escape sequence");
            throw null;
        }
        zn1 zn1Var = this.b;
        char c = (char) zn1Var.readByte();
        if (c == '\n' || c == '\"' || c == '\'' || c == '/' || c == '\\') {
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
            W("Invalid escape sequence: \\" + c);
            throw null;
        }
        if (!to1Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + c());
        }
        char c2 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bP = zn1Var.P(i2);
            char c3 = (char) (c2 << 4);
            if (bP >= 48 && bP <= 57) {
                i = bP - 48;
            } else if (bP >= 97 && bP <= 102) {
                i = bP - 87;
            } else {
                if (bP < 65 || bP > 70) {
                    W("\\u".concat(zn1Var.h0(4L, a32.b)));
                    throw null;
                }
                i = bP - 55;
            }
            c2 = (char) (c3 + i);
        }
        zn1Var.skip(4L);
        return c2;
    }

    public final void Q(vr1 vr1Var) throws EOFException {
        while (true) {
            long jZ = this.a.Z(vr1Var);
            if (jZ == -1) {
                W("Unterminated string");
                throw null;
            }
            zn1 zn1Var = this.b;
            if (zn1Var.P(jZ) != 92) {
                zn1Var.skip(jZ + 1);
                return;
            } else {
                zn1Var.skip(jZ + 1);
                P();
            }
        }
    }

    public final void W(String str) {
        StringBuilder sbG = h5.g(str, " at path ");
        sbG.append(c());
        throw new JsonEncodingException(sbG.toString(), null);
    }

    @Override // defpackage.mb8
    public final String X() throws EOFException {
        String strV;
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 12:
                strV = v(b0);
                break;
            case 13:
                strV = v(c0);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                strV = G();
                break;
            default:
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(peek());
                akb.r(sb, h());
                return null;
        }
        this.c = 0;
        this.X[this.W - 1] = strV;
        return strV;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo1.a():int");
    }

    @Override // defpackage.mb8
    public final ArrayList c() {
        String str;
        int i = this.W;
        int[] iArr = this.V;
        String[] strArr = this.X;
        int[] iArr2 = this.Y;
        iArr.getClass();
        strArr.getClass();
        iArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                arrayList.add(Integer.valueOf(iArr2[i2]));
            } else if ((i3 == 3 || i3 == 4 || i3 == 5) && (str = strArr[i2]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = 0;
        this.V[0] = 8;
        this.W = 1;
        this.b.h();
        this.a.close();
    }

    public final String h() {
        return z92.W0(c(), ".", null, null, null, 62);
    }

    @Override // defpackage.mb8
    public final boolean hasNext() {
        Integer numValueOf = Integer.valueOf(this.c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        return (iIntValue == 2 || iIntValue == 4) ? false : true;
    }

    @Override // defpackage.mb8
    public final mb8 j() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 1) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(peek());
            akb.r(sb, h());
            return null;
        }
        N(3);
        this.c = 0;
        int i2 = this.a0;
        this.a0 = i2 + 1;
        this.Z[i2] = 0;
        return this;
    }

    @Override // defpackage.mb8
    public final void k() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override // defpackage.mb8
    public final mb8 l() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(peek());
            akb.r(sb, h());
            return null;
        }
        int i2 = this.W;
        this.W = i2 - 1;
        int[] iArr = this.Y;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.c = 0;
        return this;
    }

    @Override // defpackage.mb8
    public final void l1() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(peek());
            akb.r(sb, h());
        } else {
            this.c = 0;
            int[] iArr = this.Y;
            int i2 = this.W - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.mb8
    public final mb8 m() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) == 3) {
            N(1);
            this.Y[this.W - 1] = 0;
            this.c = 0;
            return this;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        akb.r(sb, h());
        return null;
    }

    @Override // defpackage.mb8
    public final boolean nextBoolean() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 5) {
            this.c = 0;
            int[] iArr = this.Y;
            int i2 = this.W - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iIntValue != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(peek());
            akb.r(sb, h());
            return false;
        }
        this.c = 0;
        int[] iArr2 = this.Y;
        int i3 = this.W - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // defpackage.mb8
    public final double nextDouble() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            this.c = 0;
            int[] iArr = this.Y;
            int i2 = this.W - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.d;
        }
        if (iIntValue == 16) {
            long j = this.e;
            zn1 zn1Var = this.b;
            zn1Var.getClass();
            this.f = zn1Var.h0(j, a32.b);
        } else if (iIntValue == 9) {
            this.f = v(c0);
        } else if (iIntValue == 8) {
            this.f = v(b0);
        } else if (iIntValue == 10) {
            this.f = G();
        } else if (iIntValue != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(peek());
            akb.r(sb, h());
            return 0.0d;
        }
        this.c = 11;
        try {
            String str = this.f;
            str.getClass();
            double d = Double.parseDouble(str);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + h(), null);
            }
            this.f = null;
            this.c = 0;
            int[] iArr2 = this.Y;
            int i3 = this.W - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d;
        } catch (NumberFormatException unused) {
            ja.l("Expected a double but was ", this.f, h());
            return 0.0d;
        }
    }

    @Override // defpackage.mb8
    public final int nextInt() throws EOFException {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            long j = this.d;
            int i2 = (int) j;
            if (j == i2) {
                this.c = 0;
                int[] iArr = this.Y;
                int i3 = this.W - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.d + " at path " + c(), null);
        }
        if (iIntValue == 16) {
            long j2 = this.e;
            zn1 zn1Var = this.b;
            zn1Var.getClass();
            this.f = zn1Var.h0(j2, a32.b);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strV = v(iIntValue == 9 ? c0 : b0);
            this.f = strV;
            try {
                int i4 = Integer.parseInt(strV);
                this.c = 0;
                int[] iArr2 = this.Y;
                int i5 = this.W - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(peek());
            akb.r(sb, h());
            return 0;
        }
        this.c = 11;
        try {
            String str = this.f;
            str.getClass();
            double d = Double.parseDouble(str);
            int i6 = (int) d;
            if (i6 != d) {
                ja.l("Expected an int but was ", this.f, h());
                return 0;
            }
            this.f = null;
            this.c = 0;
            int[] iArr3 = this.Y;
            int i7 = this.W - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            ja.l("Expected an int but was ", this.f, h());
            return 0;
        }
    }

    @Override // defpackage.mb8
    public final long nextLong() throws EOFException {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : a();
        if (iIntValue == 15) {
            this.c = 0;
            int[] iArr = this.Y;
            int i2 = this.W - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.d;
        }
        if (iIntValue == 16) {
            long j = this.e;
            zn1 zn1Var = this.b;
            zn1Var.getClass();
            this.f = zn1Var.h0(j, a32.b);
        } else if (iIntValue == 9 || iIntValue == 8) {
            String strV = v(iIntValue == 9 ? c0 : b0);
            this.f = strV;
            try {
                long j2 = Long.parseLong(strV);
                this.c = 0;
                int[] iArr2 = this.Y;
                int i3 = this.W - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        } else if (iIntValue != 11) {
            StringBuilder sb = new StringBuilder("Expected a long but was ");
            sb.append(peek());
            akb.r(sb, h());
            return 0L;
        }
        this.c = 11;
        try {
            String str = this.f;
            str.getClass();
            double d = Double.parseDouble(str);
            long j3 = (long) d;
            if (j3 != d) {
                ja.l("Expected a long but was ", this.f, h());
                return 0L;
            }
            this.f = null;
            this.c = 0;
            int[] iArr3 = this.Y;
            int i4 = this.W - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j3;
        } catch (NumberFormatException unused2) {
            ja.l("Expected a long but was ", this.f, h());
            return 0L;
        }
    }

    public final boolean p(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
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
        W("Unexpected character: " + c);
        throw null;
    }

    @Override // defpackage.mb8
    public final mb8.a peek() {
        Integer numValueOf = Integer.valueOf(this.c);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        switch (numValueOf != null ? numValueOf.intValue() : a()) {
            case 1:
                return mb8.a.c;
            case 2:
                return mb8.a.d;
            case 3:
                return mb8.a.a;
            case 4:
                return mb8.a.b;
            case 5:
            case 6:
                return mb8.a.X;
            case 7:
                return mb8.a.Y;
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
            case 11:
                return mb8.a.f;
            case 12:
            case 13:
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return mb8.a.e;
            case 15:
                return mb8.a.W;
            case 16:
                return mb8.a.V;
            case 17:
                return mb8.a.Z;
            default:
                b0.t();
                return null;
        }
    }

    public final int s(boolean z) throws EOFException {
        int i = 0;
        while (true) {
            long j = i;
            to1 to1Var = this.a;
            if (!to1Var.request(j + 1)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i++;
            zn1 zn1Var = this.b;
            byte bP = zn1Var.P(j);
            if (bP != 9 && bP != 10 && bP != 13 && bP != 32) {
                zn1Var.skip(((long) i) - 1);
                if (bP == 35) {
                    W("Malformed JSON");
                    throw null;
                }
                if (bP != 47 || !to1Var.request(2L)) {
                    return bP;
                }
                W("Malformed JSON");
                throw null;
            }
        }
    }

    @Override // defpackage.mb8
    public final mb8 t() {
        int i = this.c;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        if ((numValueOf != null ? numValueOf.intValue() : a()) != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(peek());
            akb.r(sb, h());
            return null;
        }
        int i2 = this.W;
        int i3 = i2 - 1;
        this.W = i3;
        this.X[i3] = null;
        int[] iArr = this.Y;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.c = 0;
        this.a0--;
        return this;
    }

    public final String v(vr1 vr1Var) throws EOFException {
        StringBuilder sb = null;
        while (true) {
            long jZ = this.a.Z(vr1Var);
            if (jZ == -1) {
                W("Unterminated string");
                throw null;
            }
            zn1 zn1Var = this.b;
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
            sb.append(P());
        }
    }
}
