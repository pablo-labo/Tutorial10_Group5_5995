package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.akb;
import defpackage.l5;
import defpackage.m6;
import defpackage.o92;
import defpackage.p6;
import defpackage.pyd;
import defpackage.t92;
import defpackage.u63;
import defpackage.ut0;
import defpackage.wl7;
import defpackage.wve;
import defpackage.ypd;
import defpackage.z92;
import defpackage.zr4;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r<T> {
    public static final i b = new i(false);
    public static final m c = new m(false);
    public static final g d = new g(true);
    public static final h e = new h(true);
    public static final l f = new l(false);
    public static final j g = new j(true);
    public static final k h = new k(true);
    public static final f i = new f(false);
    public static final d j = new d(true);
    public static final e k = new e(true);
    public static final c l = new c(false);
    public static final a m = new a(true);
    public static final b n = new b(true);
    public static final p o = new p(true);
    public static final n p = new n(true);
    public static final o q = new o(true);
    public final boolean a;

    public static final class a extends o92<boolean[]> {
        public static boolean[] j(String str) {
            str.getClass();
            return new boolean[]{((Boolean) r.l.h(str)).booleanValue()};
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (boolean[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "boolean[]";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArrJ = j(str);
            if (zArr == null) {
                return zArrJ;
            }
            int length = zArr.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
            System.arraycopy(zArrJ, 0, zArrCopyOf, length, 1);
            return zArrCopyOf;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final /* bridge */ /* synthetic */ Object h(String str) {
            return j(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putBooleanArray(str, (boolean[]) obj);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            Boolean[] boolArr;
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            Boolean[] boolArr2 = null;
            if (zArr != null) {
                boolArr = new Boolean[zArr.length];
                int length = zArr.length;
                for (int i = 0; i < length; i++) {
                    boolArr[i] = Boolean.valueOf(zArr[i]);
                }
            } else {
                boolArr = null;
            }
            if (zArr2 != null) {
                boolArr2 = new Boolean[zArr2.length];
                int length2 = zArr2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    boolArr2[i2] = Boolean.valueOf(zArr2[i2]);
                }
            }
            return pyd.f(boolArr, boolArr2);
        }

        @Override // defpackage.o92
        public final boolean[] h() {
            return new boolean[0];
        }

        @Override // defpackage.o92
        public final List i(boolean[] zArr) {
            boolean[] zArr2 = zArr;
            if (zArr2 == null) {
                return zr4.a;
            }
            List<Boolean> listG0 = ut0.G0(zArr2);
            ArrayList arrayList = new ArrayList(t92.r0(listG0, 10));
            Iterator<T> it = listG0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }
    }

    public static final class b extends o92<List<? extends Boolean>> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            boolean[] zArr = (boolean[]) m6.e(str, str, bundle);
            if (zArr != null) {
                return ut0.G0(zArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "List<Boolean>";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            c cVar = r.l;
            return list != null ? z92.h1(list, u63.Z(cVar.h(str))) : u63.Z(cVar.h(str));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(r.l.h(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            bundle.putBooleanArray(str, list != null ? z92.s1(list) : null);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return pyd.f(list != null ? (Boolean[]) list.toArray(new Boolean[0]) : null, list2 != null ? (Boolean[]) list2.toArray(new Boolean[0]) : null);
        }

        @Override // defpackage.o92
        public final /* bridge */ /* synthetic */ List<? extends Boolean> h() {
            return zr4.a;
        }

        @Override // defpackage.o92
        public final List i(List<? extends Boolean> list) {
            List<? extends Boolean> list2 = list;
            if (list2 == null) {
                return zr4.a;
            }
            List<? extends Boolean> list3 = list2;
            ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }
    }

    public static final class c extends r<Boolean> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (Boolean) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "boolean";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Boolean h(String str) {
            boolean z;
            str.getClass();
            if (str.equals("true")) {
                z = true;
            } else {
                if (!str.equals("false")) {
                    l5.q("A boolean NavType only accepts \"true\" or \"false\" values.");
                    return null;
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            str.getClass();
            bundle.putBoolean(str, zBooleanValue);
        }
    }

    public static final class d extends o92<float[]> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (float[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "float[]";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            float[] fArr = (float[]) obj;
            if (fArr == null) {
                return new float[]{Float.parseFloat(str)};
            }
            float[] fArr2 = {Float.parseFloat(str)};
            int length = fArr.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, 1);
            return fArrCopyOf;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return new float[]{Float.parseFloat(str)};
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putFloatArray(str, (float[]) obj);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            Float[] fArr;
            float[] fArr2 = (float[]) obj;
            float[] fArr3 = (float[]) obj2;
            Float[] fArr4 = null;
            if (fArr2 != null) {
                fArr = new Float[fArr2.length];
                int length = fArr2.length;
                for (int i = 0; i < length; i++) {
                    fArr[i] = Float.valueOf(fArr2[i]);
                }
            } else {
                fArr = null;
            }
            if (fArr3 != null) {
                fArr4 = new Float[fArr3.length];
                int length2 = fArr3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr4[i2] = Float.valueOf(fArr3[i2]);
                }
            }
            return pyd.f(fArr, fArr4);
        }

        @Override // defpackage.o92
        public final float[] h() {
            return new float[0];
        }

        @Override // defpackage.o92
        public final List i(float[] fArr) {
            float[] fArr2 = fArr;
            if (fArr2 == null) {
                return zr4.a;
            }
            List<Float> listB0 = ut0.B0(fArr2);
            ArrayList arrayList = new ArrayList(t92.r0(listB0, 10));
            Iterator<T> it = listB0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }
    }

    public static final class e extends o92<List<? extends Float>> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            float[] fArr = (float[]) m6.e(str, str, bundle);
            if (fArr != null) {
                return ut0.B0(fArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "List<Float>";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            return list != null ? z92.h1(list, u63.Z(Float.valueOf(Float.parseFloat(str)))) : u63.Z(Float.valueOf(Float.parseFloat(str)));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(Float.valueOf(Float.parseFloat(str)));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            bundle.putFloatArray(str, list != null ? z92.w1(list) : null);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return pyd.f(list != null ? (Float[]) list.toArray(new Float[0]) : null, list2 != null ? (Float[]) list2.toArray(new Float[0]) : null);
        }

        @Override // defpackage.o92
        public final /* bridge */ /* synthetic */ List<? extends Float> h() {
            return zr4.a;
        }

        @Override // defpackage.o92
        public final List i(List<? extends Float> list) {
            List<? extends Float> list2 = list;
            if (list2 == null) {
                return zr4.a;
            }
            List<? extends Float> list3 = list2;
            ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }
    }

    public static final class f extends r<Float> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            Object obj = bundle.get(str);
            obj.getClass();
            return (Float) obj;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "float";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Float h(String str) {
            str.getClass();
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Float f) {
            float fFloatValue = f.floatValue();
            str.getClass();
            bundle.putFloat(str, fFloatValue);
        }
    }

    public static final class g extends o92<int[]> {
        public static int[] j(String str) {
            str.getClass();
            return new int[]{((Number) r.b.h(str)).intValue()};
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (int[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "integer[]";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            int[] iArr = (int[]) obj;
            int[] iArrJ = j(str);
            if (iArr == null) {
                return iArrJ;
            }
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            System.arraycopy(iArrJ, 0, iArrCopyOf, length, 1);
            return iArrCopyOf;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final /* bridge */ /* synthetic */ Object h(String str) {
            return j(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putIntArray(str, (int[]) obj);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            Integer[] numArr;
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            Integer[] numArr2 = null;
            if (iArr != null) {
                numArr = new Integer[iArr.length];
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    numArr[i] = Integer.valueOf(iArr[i]);
                }
            } else {
                numArr = null;
            }
            if (iArr2 != null) {
                numArr2 = new Integer[iArr2.length];
                int length2 = iArr2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    numArr2[i2] = Integer.valueOf(iArr2[i2]);
                }
            }
            return pyd.f(numArr, numArr2);
        }

        @Override // defpackage.o92
        public final int[] h() {
            return new int[0];
        }

        @Override // defpackage.o92
        public final List i(int[] iArr) {
            int[] iArr2 = iArr;
            if (iArr2 == null) {
                return zr4.a;
            }
            List<Integer> listC0 = ut0.C0(iArr2);
            ArrayList arrayList = new ArrayList(t92.r0(listC0, 10));
            Iterator<T> it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }
    }

    public static final class h extends o92<List<? extends Integer>> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            int[] iArr = (int[]) m6.e(str, str, bundle);
            if (iArr != null) {
                return ut0.C0(iArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "List<Int>";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            i iVar = r.b;
            return list != null ? z92.h1(list, u63.Z(iVar.h(str))) : u63.Z(iVar.h(str));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(r.b.h(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            bundle.putIntArray(str, list != null ? z92.y1(list) : null);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return pyd.f(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
        }

        @Override // defpackage.o92
        public final /* bridge */ /* synthetic */ List<? extends Integer> h() {
            return zr4.a;
        }

        @Override // defpackage.o92
        public final List i(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            if (list2 == null) {
                return zr4.a;
            }
            List<? extends Integer> list3 = list2;
            ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }
    }

    public static final class i extends r<Integer> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            Object obj = bundle.get(str);
            obj.getClass();
            return (Integer) obj;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "integer";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            int i;
            str.getClass();
            if (wve.K(str, "0x", false)) {
                String strSubstring = str.substring(2);
                ypd.s(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            str.getClass();
            bundle.putInt(str, iIntValue);
        }
    }

    public static final class j extends o92<long[]> {
        public static long[] j(String str) {
            str.getClass();
            return new long[]{((Number) r.f.h(str)).longValue()};
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (long[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "long[]";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            long[] jArr = (long[]) obj;
            long[] jArrJ = j(str);
            if (jArr == null) {
                return jArrJ;
            }
            int length = jArr.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
            System.arraycopy(jArrJ, 0, jArrCopyOf, length, 1);
            return jArrCopyOf;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final /* bridge */ /* synthetic */ Object h(String str) {
            return j(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putLongArray(str, (long[]) obj);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            Long[] lArr;
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            Long[] lArr2 = null;
            if (jArr != null) {
                lArr = new Long[jArr.length];
                int length = jArr.length;
                for (int i = 0; i < length; i++) {
                    lArr[i] = Long.valueOf(jArr[i]);
                }
            } else {
                lArr = null;
            }
            if (jArr2 != null) {
                lArr2 = new Long[jArr2.length];
                int length2 = jArr2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    lArr2[i2] = Long.valueOf(jArr2[i2]);
                }
            }
            return pyd.f(lArr, lArr2);
        }

        @Override // defpackage.o92
        public final long[] h() {
            return new long[0];
        }

        @Override // defpackage.o92
        public final List i(long[] jArr) {
            long[] jArr2 = jArr;
            if (jArr2 == null) {
                return zr4.a;
            }
            List<Long> listD0 = ut0.D0(jArr2);
            ArrayList arrayList = new ArrayList(t92.r0(listD0, 10));
            Iterator<T> it = listD0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }
    }

    public static final class k extends o92<List<? extends Long>> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            long[] jArr = (long[]) m6.e(str, str, bundle);
            if (jArr != null) {
                return ut0.D0(jArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "List<Long>";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            l lVar = r.f;
            return list != null ? z92.h1(list, u63.Z(lVar.h(str))) : u63.Z(lVar.h(str));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(r.f.h(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            bundle.putLongArray(str, list != null ? z92.A1(list) : null);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return pyd.f(list != null ? (Long[]) list.toArray(new Long[0]) : null, list2 != null ? (Long[]) list2.toArray(new Long[0]) : null);
        }

        @Override // defpackage.o92
        public final /* bridge */ /* synthetic */ List<? extends Long> h() {
            return zr4.a;
        }

        @Override // defpackage.o92
        public final List i(List<? extends Long> list) {
            List<? extends Long> list2 = list;
            if (list2 == null) {
                return zr4.a;
            }
            List<? extends Long> list3 = list2;
            ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }
    }

    public static final class l extends r<Long> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            Object obj = bundle.get(str);
            obj.getClass();
            return (Long) obj;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "long";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Long h(String str) {
            long j;
            str.getClass();
            String strJ = wve.D(str, "L", false) ? akb.j(1, 0, str) : str;
            if (wve.K(str, "0x", false)) {
                String strSubstring = strJ.substring(2);
                ypd.s(16);
                j = Long.parseLong(strSubstring, 16);
            } else {
                j = Long.parseLong(strJ);
            }
            return Long.valueOf(j);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Long l) {
            long jLongValue = l.longValue();
            str.getClass();
            bundle.putLong(str, jLongValue);
        }
    }

    public static final class m extends r<Integer> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            Object obj = bundle.get(str);
            obj.getClass();
            return (Integer) obj;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "reference";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            int i;
            str.getClass();
            if (wve.K(str, "0x", false)) {
                String strSubstring = str.substring(2);
                ypd.s(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            str.getClass();
            bundle.putInt(str, iIntValue);
        }
    }

    public static final class n extends o92<String[]> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (String[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "string[]";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            String[] strArr = (String[]) obj;
            return strArr != null ? (String[]) pyd.K(strArr, new String[]{str}) : new String[]{str};
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return new String[]{str};
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putStringArray(str, (String[]) obj);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            return pyd.f((String[]) obj, (String[]) obj2);
        }

        @Override // defpackage.o92
        public final String[] h() {
            return new String[0];
        }

        @Override // defpackage.o92
        public final List i(String[] strArr) {
            String[] strArr2 = strArr;
            if (strArr2 == null) {
                return zr4.a;
            }
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }
    }

    public static final class o extends o92<List<? extends String>> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            String[] strArr = (String[]) m6.e(str, str, bundle);
            if (strArr != null) {
                return ut0.E0(strArr);
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "List<String>";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            return list != null ? z92.h1(list, u63.Z(str)) : u63.Z(str);
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            bundle.putStringArray(str, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return pyd.f(list != null ? (String[]) list.toArray(new String[0]) : null, list2 != null ? (String[]) list2.toArray(new String[0]) : null);
        }

        @Override // defpackage.o92
        public final /* bridge */ /* synthetic */ List<? extends String> h() {
            return zr4.a;
        }

        @Override // defpackage.o92
        public final List i(List<? extends String> list) {
            List<? extends String> list2 = list;
            if (list2 == null) {
                return zr4.a;
            }
            List<? extends String> list3 = list2;
            ArrayList arrayList = new ArrayList(t92.r0(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }
    }

    public static final class p extends r<String> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (String) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "string";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final String h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return str;
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, String str2) {
            str.getClass();
            bundle.putString(str, str2);
        }

        @Override // androidx.navigation.r
        public final String f(String str) {
            String str2 = str;
            String strEncode = str2 != null ? Uri.encode(str2) : null;
            return strEncode == null ? "null" : strEncode;
        }
    }

    public static final class q {
        public static r a(String str, String str2) {
            if ("integer".equals(str)) {
                return r.b;
            }
            if ("integer[]".equals(str)) {
                return r.d;
            }
            if ("List<Int>".equals(str)) {
                return r.e;
            }
            if ("long".equals(str)) {
                return r.f;
            }
            if ("long[]".equals(str)) {
                return r.g;
            }
            if ("List<Long>".equals(str)) {
                return r.h;
            }
            if ("boolean".equals(str)) {
                return r.l;
            }
            if ("boolean[]".equals(str)) {
                return r.m;
            }
            if ("List<Boolean>".equals(str)) {
                return r.n;
            }
            if (!"string".equals(str)) {
                if ("string[]".equals(str)) {
                    return r.p;
                }
                if ("List<String>".equals(str)) {
                    return r.q;
                }
                if ("float".equals(str)) {
                    return r.i;
                }
                if ("float[]".equals(str)) {
                    return r.j;
                }
                if ("List<Float>".equals(str)) {
                    return r.k;
                }
                if ("reference".equals(str)) {
                    return r.c;
                }
                if (str.length() != 0) {
                    try {
                        String strConcat = (!wve.K(str, ".", false) || str2 == null) ? str : str2.concat(str);
                        boolean zD = wve.D(str, "[]", false);
                        if (zD) {
                            strConcat = strConcat.substring(0, strConcat.length() - 2);
                        }
                        r rVarB = b(Class.forName(strConcat), zD);
                        if (rVarB != null) {
                            return rVarB;
                        }
                        throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
                    } catch (ClassNotFoundException e) {
                        l5.r(e);
                        return null;
                    }
                }
            }
            return r.o;
        }

        public static r b(Class cls, boolean z) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z ? new s(cls) : new t(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z) {
                return new C0073r(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z ? new u(cls) : new v(cls);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.r$r, reason: collision with other inner class name */
    public static final class C0073r<D extends Enum<?>> extends v<D> {
        public final Class<D> s;

        public C0073r(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.s = cls;
            } else {
                p6.g(cls, " is not an Enum type.");
                throw null;
            }
        }

        @Override // androidx.navigation.r.v, androidx.navigation.r
        public final String b() {
            return this.s.getName();
        }

        @Override // androidx.navigation.r.v
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D h(String str) {
            D d;
            str.getClass();
            Class<D> cls = this.s;
            D[] enumConstants = cls.getEnumConstants();
            enumConstants.getClass();
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (wve.E(d.name(), str, true)) {
                    break;
                }
                i++;
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            StringBuilder sbM = akb.m("Enum value ", str, " not found for type ");
            sbM.append(cls.getName());
            sbM.append(JwtParser.SEPARATOR_CHAR);
            throw new IllegalArgumentException(sbM.toString());
        }
    }

    public static final class s<D extends Parcelable> extends r<D[]> {
        public final Class<D[]> r;

        public s(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                p6.g(cls, " does not implement Parcelable.");
                throw null;
            }
            try {
                this.r = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                l5.r(e);
                throw null;
            }
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (Parcelable[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            str.getClass();
            this.r.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !s.class.equals(obj.getClass())) {
                return false;
            }
            return wl7.b(this.r, ((s) obj).r);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            return pyd.f((Parcelable[]) obj, (Parcelable[]) obj2);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class t<D> extends r<D> {
        public final Class<D> r;

        public t(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.r = cls;
            } else {
                p6.g(cls, " does not implement Parcelable or Serializable.");
                throw null;
            }
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final D h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, D d) {
            str.getClass();
            this.r.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !t.class.equals(obj.getClass())) {
                return false;
            }
            return wl7.b(this.r, ((t) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class u<D extends Serializable> extends r<D[]> {
        public final Class<D[]> r;

        public u(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                p6.g(cls, " does not implement Serializable.");
                throw null;
            }
            try {
                this.r = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                l5.r(e);
                throw null;
            }
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (Serializable[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            ?? r3 = (Serializable[]) obj;
            str.getClass();
            this.r.cast(r3);
            bundle.putSerializable(str, r3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !u.class.equals(obj.getClass())) {
                return false;
            }
            return wl7.b(this.r, ((u) obj).r);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            return pyd.f((Serializable[]) obj, (Serializable[]) obj2);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public r(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return h(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract T h(String str);

    public abstract void e(Bundle bundle, String str, T t2);

    public String f(T t2) {
        return String.valueOf(t2);
    }

    public boolean g(T t2, T t3) {
        return wl7.b(t2, t3);
    }

    public final String toString() {
        return b();
    }

    public static class v<D extends Serializable> extends r<D> {
        public final Class<D> r;

        public v(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                p6.g(cls, " does not implement Serializable.");
                throw null;
            }
            if (cls.isEnum()) {
                p6.g(cls, " is an Enum. You should use EnumType instead.");
                throw null;
            }
            this.r = cls;
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (Serializable) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public String b() {
            return this.r.getName();
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            str.getClass();
            serializable.getClass();
            this.r.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            return wl7.b(this.r, ((v) obj).r);
        }

        @Override // androidx.navigation.r
        public D h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.r.hashCode();
        }

        public v(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.r = cls;
            } else {
                p6.g(cls, " does not implement Serializable.");
                throw null;
            }
        }
    }
}
