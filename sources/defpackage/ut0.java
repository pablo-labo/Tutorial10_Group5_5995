package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class ut0 extends pyd {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterable<T>, ze8 {
        public final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return web.q(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> implements r6e<T> {
        public final /* synthetic */ Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        @Override // defpackage.r6e
        public final Iterator<T> iterator() {
            return new ct0(this.a);
        }
    }

    public static List<Double> A0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List<Float> B0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List<Integer> C0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List<Long> D0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static <T> List<T> E0(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        return length != 0 ? length != 1 ? H0(tArr) : u63.Z(tArr[0]) : zr4.a;
    }

    public static List<Short> F0(short[] sArr) {
        sArr.getClass();
        int length = sArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static List<Boolean> G0(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList H0(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new xs0(objArr, false));
    }

    public static <T> Set<T> I0(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        if (length == 0) {
            return is4.a;
        }
        if (length == 1) {
            return pi3.k(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(kc9.V(tArr.length));
        y0(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList J0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new Pair(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static <T> Iterable<T> d0(T[] tArr) {
        tArr.getClass();
        return tArr.length == 0 ? zr4.a : new a(tArr);
    }

    public static <T> r6e<T> e0(T[] tArr) {
        return tArr.length == 0 ? hs4.a : new b(tArr);
    }

    public static boolean f0(Object obj, Object[] objArr) {
        objArr.getClass();
        return p0(obj, objArr) >= 0;
    }

    public static boolean g0(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c == cArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    public static List h0(int i, Object[] objArr) {
        if (i < 0) {
            h5.k(bg.d(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            h5.k(bg.d(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return zr4.a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return E0(objArr);
        }
        if (length == 1) {
            return u63.Z(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = length2 - length; i2 < length2; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static ArrayList i0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T j0(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[0];
        }
        s6.j("Array is empty.");
        return null;
    }

    public static <T> T k0(T[] tArr) {
        tArr.getClass();
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static oh7 l0(int[] iArr) {
        return new oh7(0, iArr.length - 1, 1);
    }

    public static int m0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer n0(int i, int[] iArr) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object o0(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int p0(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void q0(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            awd.c(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static String r0(String str, int[] iArr, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        iArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            sb.append((CharSequence) String.valueOf(i3));
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String s0(byte[] bArr, String str, Function1 function1, int i) {
        if ((i & 32) != 0) {
            function1 = null;
        }
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (byte b2 : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (function1 != null) {
                sb.append((CharSequence) function1.invoke(Byte.valueOf(b2)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b2));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String t0(Object[] objArr, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        q0(objArr, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static <T> T u0(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[tArr.length - 1];
        }
        s6.j("Array is empty.");
        return null;
    }

    public static Character v0(char[] cArr) {
        cArr.getClass();
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static char w0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            s6.j("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        l5.q("Array has more than one element.");
        return (char) 0;
    }

    public static <T> T x0(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            s6.j("Array is empty.");
            return null;
        }
        if (length == 1) {
            return tArr[0];
        }
        l5.q("Array has more than one element.");
        return null;
    }

    public static final void y0(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List<Byte> z0(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        if (length == 0) {
            return zr4.a;
        }
        if (length == 1) {
            return u63.Z(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }
}
