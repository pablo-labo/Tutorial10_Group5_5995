package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class gj7 extends elg {
    public static final Pattern p;
    public final double[] h;
    public final Object i;
    public final b j;
    public final String k;
    public final String l;
    public final String m;
    public elg n;
    public Object o;

    public static final class a {
        public static int a(double d, double[] dArr) {
            int i = 1;
            while (i < dArr.length - 1 && dArr[i] < d) {
                i++;
            }
            return i - 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r23.equals("extend") != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
        
            if (r24.equals("extend") != false) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static double b(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
            /*
                r0 = r23
                r1 = r24
                int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                r3 = 0
                java.lang.String r5 = "Invalid extrapolation type "
                java.lang.String r6 = "extend"
                java.lang.String r7 = "identity"
                java.lang.String r8 = "clamp"
                r9 = 94742715(0x5a5a8bb, float:1.5578507E-35)
                r10 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
                r11 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
                if (r2 >= 0) goto L47
                if (r0 == 0) goto L3d
                int r12 = r0.hashCode()
                if (r12 == r11) goto L36
                if (r12 == r10) goto L2f
                if (r12 != r9) goto L3d
                boolean r13 = r0.equals(r8)
                if (r13 == 0) goto L3d
                r13 = r15
                goto L47
            L2f:
                boolean r1 = r0.equals(r7)
                if (r1 == 0) goto L3d
                return r13
            L36:
                boolean r12 = r0.equals(r6)
                if (r12 == 0) goto L3d
                goto L47
            L3d:
                java.lang.String r13 = "for left extrapolation"
                java.lang.String r13 = defpackage.l5.m(r5, r0, r13)
                defpackage.m6.m(r13)
                return r3
            L47:
                int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
                if (r0 <= 0) goto L78
                if (r1 == 0) goto L6e
                int r0 = r1.hashCode()
                if (r0 == r11) goto L67
                if (r0 == r10) goto L60
                if (r0 != r9) goto L6e
                boolean r13 = r1.equals(r8)
                if (r13 == 0) goto L6e
                r13 = r17
                goto L78
            L60:
                boolean r0 = r1.equals(r7)
                if (r0 == 0) goto L6e
                return r13
            L67:
                boolean r0 = r1.equals(r6)
                if (r0 == 0) goto L6e
                goto L78
            L6e:
                java.lang.String r13 = "for right extrapolation"
                java.lang.String r13 = defpackage.l5.m(r5, r1, r13)
                defpackage.m6.m(r13)
                return r3
            L78:
                int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
                if (r0 != 0) goto L7d
                goto L83
            L7d:
                int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                if (r0 != 0) goto L85
                if (r2 > 0) goto L84
            L83:
                return r19
            L84:
                return r21
            L85:
                double r0 = r21 - r19
                double r13 = r13 - r15
                double r13 = r13 * r0
                double r0 = r17 - r15
                double r13 = r13 / r0
                double r13 = r13 + r19
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: gj7.a.b(double, double, double, double, double, java.lang.String, java.lang.String):double");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("Number", 0);
            a = bVar;
            b bVar2 = new b("Color", 1);
            b = bVar2;
            b bVar3 = new b("String", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        patternCompile.getClass();
        p = patternCompile;
    }

    public gj7(ReadableMap readableMap) {
        double[] dArr;
        double[] dArr2;
        int[] iArr;
        super(null);
        ReadableArray array = readableMap.getArray("inputRange");
        int i = 0;
        if (array != null) {
            int size = array.size();
            dArr = new double[size];
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = array.getDouble(i2);
            }
        } else {
            dArr = new double[0];
        }
        this.h = dArr;
        this.l = readableMap.getString("extrapolateLeft");
        this.m = readableMap.getString("extrapolateRight");
        ReadableArray array2 = readableMap.getArray("outputRange");
        if ("color".equals(readableMap.getString("outputType"))) {
            this.j = b.b;
            if (array2 != null) {
                int size2 = array2.size();
                iArr = new int[size2];
                while (i < size2) {
                    iArr[i] = array2.getInt(i);
                    i++;
                }
            } else {
                iArr = new int[0];
            }
            this.i = iArr;
            return;
        }
        if ((array2 != null ? array2.getType(0) : null) != ReadableType.String) {
            this.j = b.a;
            if (array2 != null) {
                int size3 = array2.size();
                dArr2 = new double[size3];
                while (i < size3) {
                    dArr2[i] = array2.getDouble(i);
                    i++;
                }
            } else {
                dArr2 = new double[0];
            }
            this.i = dArr2;
            return;
        }
        this.j = b.c;
        int size4 = array2.size();
        double[][] dArr3 = new double[size4][];
        String string = array2.getString(0);
        string = string == null ? "" : string;
        Pattern pattern = p;
        Matcher matcher = pattern.matcher(string);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String strGroup = matcher.group();
            strGroup.getClass();
            arrayList.add(Double.valueOf(Double.parseDouble(strGroup)));
        }
        int size5 = arrayList.size();
        double[] dArr4 = new double[size5];
        int size6 = arrayList.size();
        for (int i3 = 0; i3 < size6; i3++) {
            dArr4[i3] = ((Number) arrayList.get(i3)).doubleValue();
        }
        dArr3[0] = dArr4;
        for (int i4 = 1; i4 < size4; i4++) {
            double[] dArr5 = new double[size5];
            String string2 = array2.getString(i4);
            Matcher matcher2 = pattern.matcher(string2 == null ? "" : string2);
            for (int i5 = 0; matcher2.find() && i5 < size5; i5++) {
                String strGroup2 = matcher2.group();
                strGroup2.getClass();
                dArr5[i5] = Double.parseDouble(strGroup2);
            }
            dArr3[i4] = dArr5;
        }
        this.i = dArr3;
        this.k = array2.getString(0);
    }

    @Override // defpackage.hd0
    public final void b(hd0 hd0Var) {
        if (this.n != null) {
            r6.g("Parent already attached");
        } else if (hd0Var instanceof elg) {
            this.n = (elg) hd0Var;
        } else {
            l5.q("Parent is of an invalid type");
        }
    }

    @Override // defpackage.hd0
    public final void c(hd0 hd0Var) {
        if (hd0Var == this.n) {
            this.n = null;
        } else {
            l5.q("Invalid parent node provided");
        }
    }

    @Override // defpackage.elg, defpackage.hd0
    public final String d() {
        return v40.c(this.d, "InterpolationAnimatedNode[", "] super: ", super.d());
    }

    @Override // defpackage.hd0
    public final void e() {
        String str;
        elg elgVar = this.n;
        if (elgVar != null) {
            double dG = elgVar.g();
            b bVar = this.j;
            int i = bVar == null ? -1 : c.a[bVar.ordinal()];
            Object obj = this.i;
            double[] dArr = this.h;
            if (i == 1) {
                obj.getClass();
                double[] dArr2 = (double[]) obj;
                dArr.getClass();
                int iA = a.a(dG, dArr);
                int i2 = iA + 1;
                this.e = a.b(dG, dArr[iA], dArr[i2], dArr2[iA], dArr2[i2], this.l, this.m);
                return;
            }
            if (i == 2) {
                obj.getClass();
                int[] iArr = (int[]) obj;
                dArr.getClass();
                int iA2 = a.a(dG, dArr);
                int iB = iArr[iA2];
                int i3 = iA2 + 1;
                int i4 = iArr[i3];
                if (iB != i4) {
                    double d = dArr[iA2];
                    double d2 = dArr[i3];
                    if (d != d2) {
                        iB = eb2.b(iB, (float) ((dG - d) / (d2 - d)), i4);
                    } else if (dG > d) {
                        iB = i4;
                    }
                }
                this.o = Integer.valueOf(iB);
                return;
            }
            if (i == 3 && (str = this.k) != null) {
                obj.getClass();
                double[][] dArr3 = (double[][]) obj;
                dArr.getClass();
                int iA3 = a.a(dG, dArr);
                StringBuffer stringBuffer = new StringBuffer(str.length());
                Matcher matcher = p.matcher(str);
                int i5 = 0;
                while (matcher.find()) {
                    double[] dArr4 = dArr3[iA3];
                    if (i5 >= dArr4.length) {
                        break;
                    }
                    int i6 = iA3 + 1;
                    StringBuffer stringBuffer2 = stringBuffer;
                    int i7 = i5;
                    double[][] dArr5 = dArr3;
                    double dB = a.b(dG, dArr[iA3], dArr[i6], dArr4[i5], dArr3[i6][i5], this.l, this.m);
                    int i8 = (int) dB;
                    matcher.appendReplacement(stringBuffer2, ((double) i8) == dB ? String.valueOf(i8) : String.valueOf(dB));
                    i5 = i7 + 1;
                    stringBuffer = stringBuffer2;
                    dArr3 = dArr5;
                }
                StringBuffer stringBuffer3 = stringBuffer;
                matcher.appendTail(stringBuffer3);
                String string = stringBuffer3.toString();
                string.getClass();
                this.o = string;
            }
        }
    }

    @Override // defpackage.elg
    public final Object f() {
        return this.o;
    }
}
