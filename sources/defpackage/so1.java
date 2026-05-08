package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class so1 implements hc8 {
    public static final a V = new a();
    public static final String[] W;
    public final zn1 a;
    public int b;
    public int[] c = new int[64];
    public String[] d = new String[64];
    public int[] e = new int[64];
    public String f;

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(defpackage.zn1 r7, java.lang.String r8) {
            /*
                r7.getClass()
                r8.getClass()
                java.lang.String[] r0 = defpackage.so1.W
                r1 = 34
                r7.r0(r1)
                int r2 = r8.length()
                r3 = 0
                r4 = r3
            L13:
                if (r3 >= r2) goto L3c
                char r5 = r8.charAt(r3)
                r6 = 128(0x80, float:1.794E-43)
                if (r5 >= r6) goto L22
                r5 = r0[r5]
                if (r5 != 0) goto L2f
                goto L39
            L22:
                r6 = 8232(0x2028, float:1.1535E-41)
                if (r5 != r6) goto L29
                java.lang.String r5 = "\\u2028"
                goto L2f
            L29:
                r6 = 8233(0x2029, float:1.1537E-41)
                if (r5 != r6) goto L39
                java.lang.String r5 = "\\u2029"
            L2f:
                if (r4 >= r3) goto L34
                r7.P0(r4, r3, r8)
            L34:
                r7.Q0(r5)
                int r4 = r3 + 1
            L39:
                int r3 = r3 + 1
                goto L13
            L3c:
                if (r4 >= r2) goto L41
                r7.P0(r4, r2, r8)
            L41:
                r7.r0(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: so1.a.a(zn1, java.lang.String):void");
        }
    }

    static {
        String[] strArr = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        for (int i = 0; i < 32; i++) {
            byte b = (byte) i;
            V.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
            strArr[i] = "\\u00".concat(sb.toString());
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        W = strArr;
    }

    public so1(zn1 zn1Var) {
        this.a = zn1Var;
        v(6);
    }

    @Override // defpackage.hc8
    public final hc8 C(zgg zggVar) {
        zggVar.getClass();
        H1();
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 E(long j) {
        p(String.valueOf(j));
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 F(int i) {
        p(String.valueOf(i));
        return this;
    }

    public final void G() {
        if (this.f != null) {
            int iS = s();
            zn1 zn1Var = this.a;
            if (iS == 5) {
                zn1Var.r0(44);
            } else if (iS != 3) {
                r6.g("Nesting problem.");
                return;
            }
            this.c[this.b - 1] = 4;
            String str = this.f;
            str.getClass();
            a.a(zn1Var, str);
            this.f = null;
        }
    }

    @Override // defpackage.hc8
    public final hc8 H1() {
        p("null");
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 K(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            p(String.valueOf(d));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d).toString());
    }

    @Override // defpackage.hc8
    public final hc8 M0(za8 za8Var) {
        za8Var.getClass();
        p(za8Var.a);
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 T0(String str) {
        str.getClass();
        G();
        a();
        a.a(this.a, str);
        int[] iArr = this.e;
        int i = this.b - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 V(boolean z) {
        p(z ? "true" : "false");
        return this;
    }

    public final void a() {
        int iS = s();
        if (iS == 1) {
            this.c[this.b - 1] = 2;
            return;
        }
        zn1 zn1Var = this.a;
        if (iS == 2) {
            zn1Var.r0(44);
            return;
        }
        if (iS == 4) {
            zn1Var.Q0(":");
            this.c[this.b - 1] = 5;
        } else if (iS == 6) {
            this.c[this.b - 1] = 7;
        } else if (iS != 7) {
            r6.g("Nesting problem.");
        } else {
            r6.g("JSON must have only one top-level value.");
        }
    }

    @Override // defpackage.hc8
    public final String c() {
        String str;
        int i = this.b;
        int[] iArr = this.c;
        String[] strArr = this.d;
        int[] iArr2 = this.e;
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
        return z92.W0(arrayList, ".", null, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.getClass();
        int i = this.b;
        if (i > 1 || (i == 1 && this.c[i - 1] != 7)) {
            r40.h("Incomplete document");
        } else {
            this.b = 0;
        }
    }

    public final void h(int i, int i2, String str) {
        int iS = s();
        if (iS != i2 && iS != i) {
            r6.g("Nesting problem.");
            return;
        }
        if (this.f != null) {
            r40.g(this.f, "Dangling name: ");
            return;
        }
        int i3 = this.b;
        int i4 = i3 - 1;
        this.b = i4;
        this.d[i4] = null;
        int[] iArr = this.e;
        int i5 = i3 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.a.Q0(str);
    }

    @Override // defpackage.hc8
    public final hc8 j() {
        G();
        a();
        v(3);
        this.e[this.b - 1] = 0;
        this.a.Q0("{");
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 l() {
        h(1, 2, "]");
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 m() {
        G();
        a();
        v(1);
        this.e[this.b - 1] = 0;
        this.a.Q0("[");
        return this;
    }

    public final void p(String str) {
        str.getClass();
        G();
        a();
        this.a.Q0(str);
        int[] iArr = this.e;
        int i = this.b - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final int s() {
        int i = this.b;
        if (i != 0) {
            return this.c[i - 1];
        }
        r6.g("JsonWriter is closed.");
        return 0;
    }

    @Override // defpackage.hc8
    public final hc8 t() {
        h(3, 5, "}");
        return this;
    }

    @Override // defpackage.hc8
    public final hc8 u0(String str) {
        str.getClass();
        int i = this.b;
        if (i == 0) {
            r6.g("JsonWriter is closed.");
            return null;
        }
        if (this.f != null) {
            r6.g("Nesting problem.");
            return null;
        }
        this.f = str;
        this.d[i - 1] = str;
        return this;
    }

    public final void v(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            this.c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.d;
            this.d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.e;
            this.e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }
}
