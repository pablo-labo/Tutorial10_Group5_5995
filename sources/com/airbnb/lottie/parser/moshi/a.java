package com.airbnb.lottie.parser.moshi;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.h5;
import defpackage.pva;
import io.jsonwebtoken.JwtParser;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Closeable {
    public static final String[] e = new String[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.a$a, reason: collision with other inner class name */
    public static final class C0108a {
        public final String[] a;
        public final pva b;

        public C0108a(String[] strArr, pva pvaVar) {
            this.a = strArr;
            this.b = pvaVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.airbnb.lottie.parser.moshi.a.C0108a a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L6b
                vr1[] r0 = new defpackage.vr1[r0]     // Catch: java.io.IOException -> L6b
                zn1 r1 = new zn1     // Catch: java.io.IOException -> L6b
                r1.<init>()     // Catch: java.io.IOException -> L6b
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L6b
                if (r3 >= r4) goto L5b
                r4 = r12[r3]     // Catch: java.io.IOException -> L6b
                java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.a.e     // Catch: java.io.IOException -> L6b
                r6 = 34
                r1.r0(r6)     // Catch: java.io.IOException -> L6b
                int r7 = r4.length()     // Catch: java.io.IOException -> L6b
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
                r11 = 128(0x80, float:1.794E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L6b
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.P0(r9, r8, r4)     // Catch: java.io.IOException -> L6b
            L3d:
                r1.Q0(r10)     // Catch: java.io.IOException -> L6b
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.P0(r9, r7, r4)     // Catch: java.io.IOException -> L6b
            L4a:
                r1.r0(r6)     // Catch: java.io.IOException -> L6b
                r1.readByte()     // Catch: java.io.IOException -> L6b
                long r4 = r1.b     // Catch: java.io.IOException -> L6b
                vr1 r4 = r1.J0(r4)     // Catch: java.io.IOException -> L6b
                r0[r3] = r4     // Catch: java.io.IOException -> L6b
                int r3 = r3 + 1
                goto La
            L5b:
                com.airbnb.lottie.parser.moshi.a$a r1 = new com.airbnb.lottie.parser.moshi.a$a     // Catch: java.io.IOException -> L6b
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
                pva r0 = pva.a.b(r0)     // Catch: java.io.IOException -> L6b
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
                return r1
            L6b:
                r12 = move-exception
                defpackage.g7.l(r12)
                r12 = 0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.a.C0108a.a(java.lang.String[]):com.airbnb.lottie.parser.moshi.a$a");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b V;
        public static final b W;
        public static final b X;
        public static final b Y;
        public static final /* synthetic */ b[] Z;
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;

        static {
            b bVar = new b("BEGIN_ARRAY", 0);
            a = bVar;
            b bVar2 = new b("END_ARRAY", 1);
            b = bVar2;
            b bVar3 = new b("BEGIN_OBJECT", 2);
            c = bVar3;
            b bVar4 = new b("END_OBJECT", 3);
            d = bVar4;
            b bVar5 = new b("NAME", 4);
            e = bVar5;
            b bVar6 = new b("STRING", 5);
            f = bVar6;
            b bVar7 = new b("NUMBER", 6);
            V = bVar7;
            b bVar8 = new b("BOOLEAN", 7);
            W = bVar8;
            b bVar9 = new b("NULL", 8);
            X = bVar9;
            b bVar10 = new b("END_DOCUMENT", 9);
            Y = bVar10;
            Z = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Z.clone();
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final void G(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(c()));
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void I();

    public abstract String I0();

    public abstract int N(C0108a c0108a);

    public abstract void P();

    public final void Q(String str) throws JsonEncodingException {
        StringBuilder sbG = h5.g(str, " at path ");
        sbG.append(c());
        throw new JsonEncodingException(sbG.toString());
    }

    public abstract void a();

    public final String c() {
        int i = this.a;
        int[] iArr = this.b;
        String[] strArr = this.c;
        int[] iArr2 = this.d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(JwtParser.SEPARATOR_CHAR);
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract void h();

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract void p();

    public abstract void s();

    public abstract b v();
}
