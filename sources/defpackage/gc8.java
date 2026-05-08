package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class gc8 implements Closeable, Flushable {
    public static final Pattern X = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] Y = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
    public static final String[] Z;
    public String V;
    public boolean W;
    public final Writer a;
    public int[] b;
    public int c;
    public final String d;
    public boolean e;
    public boolean f;

    static {
        for (int i = 0; i <= 31; i++) {
            Y[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = Y;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        Z = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public gc8(Writer writer) {
        int[] iArr = new int[32];
        this.b = iArr;
        this.c = 0;
        if (iArr.length == 0) {
            this.b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.b;
        int i = this.c;
        this.c = i + 1;
        iArr2[i] = 6;
        this.d = ":";
        this.W = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
    }

    public void G() throws IOException {
        s('}', 3, 5);
    }

    public void N(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.V != null) {
            bg.h();
        } else if (this.c != 0) {
            this.V = str;
        } else {
            r6.g("JsonWriter is closed.");
        }
    }

    public final void P() {
    }

    public gc8 Q() throws IOException {
        if (this.V != null) {
            if (!this.W) {
                this.V = null;
                return this;
            }
            m0();
        }
        a();
        this.a.write("null");
        return this;
    }

    public final int W() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        r6.g("JsonWriter is closed.");
        return 0;
    }

    public final void a() throws IOException {
        int iW = W();
        if (iW == 1) {
            this.b[this.c - 1] = 2;
            P();
            return;
        }
        Writer writer = this.a;
        if (iW == 2) {
            writer.append(',');
            P();
            return;
        }
        if (iW == 4) {
            writer.append((CharSequence) this.d);
            this.b[this.c - 1] = 5;
            return;
        }
        if (iW != 6) {
            if (iW != 7) {
                r6.g("Nesting problem.");
                return;
            } else if (!this.e) {
                r6.g("JSON must have only one top-level value.");
                return;
            }
        }
        this.b[this.c - 1] = 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.gc8.Z
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.gc8.Y
        L9:
            java.io.Writer r7 = r7.a
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc8.b0(java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            r40.h("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    public void d0(double d) throws IOException {
        m0();
        if (!this.e && (Double.isNaN(d) || Double.isInfinite(d))) {
            j6.g("Numeric values must be finite, but was ", d);
        } else {
            a();
            this.a.append((CharSequence) Double.toString(d));
        }
    }

    public void f0(long j) throws IOException {
        m0();
        a();
        this.a.write(Long.toString(j));
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c != 0) {
            this.a.flush();
        } else {
            r6.g("JsonWriter is closed.");
        }
    }

    public void h() throws IOException {
        m0();
        a();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 1;
        this.a.write(91);
    }

    public void h0(Number number) throws IOException {
        if (number == null) {
            Q();
            return;
        }
        m0();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !X.matcher(string).matches()) {
                h5.m("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        } else if (!this.e) {
            l5.q("Numeric values must be finite, but was ".concat(string));
            return;
        }
        a();
        this.a.append((CharSequence) string);
    }

    public void j0(String str) throws IOException {
        if (str == null) {
            Q();
            return;
        }
        m0();
        a();
        b0(str);
    }

    public void k0(boolean z) throws IOException {
        m0();
        a();
        this.a.write(z ? "true" : "false");
    }

    public final void m0() throws IOException {
        if (this.V != null) {
            int iW = W();
            if (iW == 5) {
                this.a.write(44);
            } else if (iW != 3) {
                r6.g("Nesting problem.");
                return;
            }
            P();
            this.b[this.c - 1] = 4;
            b0(this.V);
            this.V = null;
        }
    }

    public void p() throws IOException {
        m0();
        a();
        int i = this.c;
        int[] iArr = this.b;
        if (i == iArr.length) {
            this.b = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        iArr2[i2] = 3;
        this.a.write(123);
    }

    public final void s(char c, int i, int i2) throws IOException {
        int iW = W();
        if (iW != i2 && iW != i) {
            r6.g("Nesting problem.");
            return;
        }
        if (this.V != null) {
            o6.k(this.V, "Dangling name: ");
            return;
        }
        this.c--;
        if (iW == i2) {
            P();
        }
        this.a.write(c);
    }

    public void v() throws IOException {
        s(']', 1, 2);
    }
}
