package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.r;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zi7 {
    public static final h a = new h(true);
    public static final a b = new a(true);
    public static final d c = new d(false);
    public static final c d = new c(true);
    public static final g e = new g(true);
    public static final i f = new i(true);
    public static final k g = new k(false);
    public static final l h = new l(true);
    public static final b i = new b(true);

    public static final class a extends r<Boolean> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof Boolean) {
                return (Boolean) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "boolean_nullable";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Boolean h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return (Boolean) r.l.h(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Boolean bool) {
            Boolean bool2 = bool;
            str.getClass();
            if (bool2 == null) {
                bundle.putSerializable(str, null);
            } else {
                r.l.e(bundle, str, bool2);
            }
        }
    }

    public static final class b extends o92<double[]> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            return (double[]) m6.e(str, str, bundle);
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "double[]";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            double[] dArr = (double[]) obj;
            if (dArr == null) {
                return new double[]{Double.parseDouble(str)};
            }
            double[] dArr2 = {Double.parseDouble(str)};
            int length = dArr.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, 1);
            return dArrCopyOf;
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return new double[]{Double.parseDouble(str)};
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putDoubleArray(str, (double[]) obj);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            Double[] dArr;
            double[] dArr2 = (double[]) obj;
            double[] dArr3 = (double[]) obj2;
            Double[] dArr4 = null;
            if (dArr2 != null) {
                dArr = new Double[dArr2.length];
                int length = dArr2.length;
                for (int i = 0; i < length; i++) {
                    dArr[i] = Double.valueOf(dArr2[i]);
                }
            } else {
                dArr = null;
            }
            if (dArr3 != null) {
                dArr4 = new Double[dArr3.length];
                int length2 = dArr3.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr4[i2] = Double.valueOf(dArr3[i2]);
                }
            }
            return pyd.f(dArr, dArr4);
        }

        @Override // defpackage.o92
        public final double[] h() {
            return new double[0];
        }

        @Override // defpackage.o92
        public final List i(double[] dArr) {
            double[] dArr2 = dArr;
            if (dArr2 == null) {
                return zr4.a;
            }
            List<Double> listA0 = ut0.A0(dArr2);
            ArrayList arrayList = new ArrayList(t92.r0(listA0, 10));
            Iterator<T> it = listA0.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }
    }

    public static final class c extends r<Double> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof Double) {
                return (Double) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "double_nullable";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Double h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Double d) {
            Double d2 = d;
            str.getClass();
            if (d2 == null) {
                bundle.putSerializable(str, null);
            } else {
                bundle.putDouble(str, d2.doubleValue());
            }
        }
    }

    public static final class d extends r<Double> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            Object obj = bundle.get(str);
            obj.getClass();
            return (Double) obj;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "double";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Double h(String str) {
            str.getClass();
            return Double.valueOf(Double.parseDouble(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Double d) {
            double dDoubleValue = d.doubleValue();
            str.getClass();
            bundle.putDouble(str, dDoubleValue);
        }
    }

    public static final class e<D extends Enum<?>> extends o92<List<? extends D>> {
        public final r.C0073r<D> r;

        public e(Class<D> cls) {
            super(true);
            this.r = new r.C0073r<>(cls);
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof List) {
                return (List) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return o6.e(this.r.s, new StringBuilder("List<"), "}>");
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            r.C0073r<D> c0073r = this.r;
            return list != null ? z92.h1(list, u63.Z(c0073r.d(str))) : u63.Z(c0073r.d(str));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(this.r.d(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            List list = (List) obj;
            str.getClass();
            bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return wl7.b(this.r, ((e) obj).r);
        }

        @Override // androidx.navigation.r
        public final boolean g(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            return wl7.b(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }

        @Override // defpackage.o92
        public final /* bridge */ /* synthetic */ Object h() {
            return zr4.a;
        }

        public final int hashCode() {
            return this.r.r.hashCode();
        }

        @Override // defpackage.o92
        public final List i(Object obj) {
            List list = (List) obj;
            if (list == null) {
                return zr4.a;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(t92.r0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }
    }

    public static final class f<D extends Enum<?>> extends j<D> {
        public final Class<D> s;

        public f(Class<D> cls) {
            super(cls);
            if (cls.isEnum()) {
                this.s = cls;
            } else {
                p6.g(cls, " is not an Enum type.");
                throw null;
            }
        }

        @Override // androidx.navigation.r
        public final String b() {
            return this.s.getName();
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            Enum r1 = null;
            if (!str.equals("null")) {
                Class<D> cls = this.s;
                D[] enumConstants = cls.getEnumConstants();
                enumConstants.getClass();
                int length = enumConstants.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    D d = enumConstants[i];
                    D d2 = d;
                    d2.getClass();
                    if (wve.E(d2.name(), str, true)) {
                        r1 = d;
                        break;
                    }
                    i++;
                }
                r1 = r1;
                if (r1 == null) {
                    StringBuilder sbM = akb.m("Enum value ", str, " not found for type ");
                    sbM.append(cls.getName());
                    sbM.append(JwtParser.SEPARATOR_CHAR);
                    throw new IllegalArgumentException(sbM.toString());
                }
            }
            return r1;
        }
    }

    public static final class g extends r<Float> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof Float) {
                return (Float) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "float_nullable";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Float h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Float f) {
            Float f2 = f;
            str.getClass();
            if (f2 == null) {
                bundle.putSerializable(str, null);
            } else {
                r.i.e(bundle, str, f2);
            }
        }
    }

    public static final class h extends r<Integer> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof Integer) {
                return (Integer) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "integer_nullable";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return (Integer) r.b.h(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Integer num) {
            Integer num2 = num;
            str.getClass();
            if (num2 == null) {
                bundle.putSerializable(str, null);
            } else {
                r.b.e(bundle, str, num2);
            }
        }
    }

    public static final class i extends r<Long> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof Long) {
                return (Long) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "long_nullable";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Long h(String str) {
            str.getClass();
            if (str.equals("null")) {
                return null;
            }
            return (Long) r.f.h(str);
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Long l) {
            Long l2 = l;
            str.getClass();
            if (l2 == null) {
                bundle.putSerializable(str, null);
            } else {
                r.f.e(bundle, str, l2);
            }
        }
    }

    public static class j<D extends Serializable> extends r<D> {
        public final Class<D> r;

        public j(Class<D> cls) {
            super(true);
            this.r = cls;
            if (Serializable.class.isAssignableFrom(cls)) {
                return;
            }
            p6.g(cls, " does not implement Serializable.");
            throw null;
        }

        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            Object objE = m6.e(str, str, bundle);
            if (objE instanceof Serializable) {
                return (Serializable) objE;
            }
            return null;
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, Object obj) {
            str.getClass();
            bundle.putSerializable(str, this.r.cast((Serializable) obj));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            return this.r.equals(((j) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class k extends r<String> {
        @Override // androidx.navigation.r
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            String string = bundle.getString(str);
            return string == null ? "null" : string;
        }

        @Override // androidx.navigation.r
        public final String b() {
            return "string_non_nullable";
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final String h(String str) {
            str.getClass();
            return str;
        }

        @Override // androidx.navigation.r
        public final void e(Bundle bundle, String str, String str2) {
            String str3 = str2;
            str.getClass();
            str3.getClass();
            bundle.putString(str, str3);
        }

        @Override // androidx.navigation.r
        public final String f(String str) {
            String str2 = str;
            str2.getClass();
            String strEncode = Uri.encode(str2);
            strEncode.getClass();
            return strEncode;
        }
    }

    public static final class l extends o92<List<? extends String>> {
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
            return "List<String?>";
        }

        @Override // androidx.navigation.r
        public final Object c(Object obj, String str) {
            List list = (List) obj;
            r.p pVar = r.o;
            return list != null ? z92.h1(list, u63.Z(pVar.h(str))) : u63.Z(pVar.h(str));
        }

        @Override // androidx.navigation.r
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            return u63.Z(r.o.h(str));
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
}
