package defpackage;

import defpackage.mb8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tb9 implements mb8 {
    public Iterator<?>[] V;
    public int[] W;
    public int X;
    public final Object a;
    public final List<Object> b;
    public mb8.a c;
    public Object d;
    public Object[] e;
    public Map<String, Object>[] f;

    public tb9(Object obj, List<? extends Object> list) {
        list.getClass();
        this.a = obj;
        this.b = list;
        this.e = new Object[64];
        this.f = new Map[64];
        this.V = new Iterator[64];
        this.W = new int[64];
        this.c = h(obj);
        this.d = obj;
    }

    public static mb8.a h(Object obj) {
        if (obj == null) {
            return mb8.a.Y;
        }
        if (obj instanceof List) {
            return mb8.a.a;
        }
        if (obj instanceof Map) {
            return mb8.a.c;
        }
        boolean z = obj instanceof Integer;
        mb8.a aVar = mb8.a.V;
        return z ? aVar : obj instanceof Long ? mb8.a.W : ((obj instanceof Double) || (obj instanceof za8)) ? aVar : obj instanceof String ? mb8.a.f : obj instanceof Boolean ? mb8.a.X : mb8.a.a0;
    }

    @Override // defpackage.mb8
    public final za8 B1() {
        za8 za8Var;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            StringBuilder sb = new StringBuilder("Expected a Number but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return null;
        }
        Object obj = this.d;
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double)) {
            za8Var = new za8(obj.toString());
        } else if (obj instanceof String) {
            za8Var = new za8((String) obj);
        } else {
            if (!(obj instanceof za8)) {
                n6.c("Expected JsonNumber but got ", obj, " instead");
                return null;
            }
            za8Var = (za8) obj;
        }
        a();
        return za8Var;
    }

    @Override // defpackage.mb8
    public final int D1(List<String> list) {
        list.getClass();
        while (hasNext()) {
            String strX = X();
            int iIndexOf = this.W[this.X - 1];
            if (iIndexOf >= list.size() || !wl7.b(list.get(iIndexOf), strX)) {
                iIndexOf = list.indexOf(strX);
                if (iIndexOf != -1) {
                    this.W[this.X - 1] = iIndexOf + 1;
                }
            } else {
                int[] iArr = this.W;
                int i = this.X - 1;
                iArr[i] = iArr[i] + 1;
            }
            if (iIndexOf != -1) {
                return iIndexOf;
            }
            a();
        }
        return -1;
    }

    @Override // defpackage.mb8
    public final void I() {
        a();
    }

    @Override // defpackage.mb8
    public final String I0() {
        String strValueOf;
        Object obj = this.d;
        if (obj instanceof Integer) {
            strValueOf = String.valueOf(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            strValueOf = String.valueOf(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            strValueOf = String.valueOf(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            strValueOf = (String) obj;
        } else if (obj == null) {
            strValueOf = "null";
        } else {
            if (!(obj instanceof za8)) {
                n6.c("Expected a String but got ", obj, " instead");
                return null;
            }
            strValueOf = ((za8) obj).a;
        }
        a();
        return strValueOf;
    }

    @Override // defpackage.mb8
    public final String X() {
        if (this.c != mb8.a.e) {
            StringBuilder sb = new StringBuilder("Expected NAME but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return null;
        }
        Object obj = this.d;
        obj.getClass();
        Map.Entry entry = (Map.Entry) obj;
        this.e[this.X - 1] = entry.getKey();
        this.d = entry.getValue();
        this.c = h(entry.getValue());
        return (String) entry.getKey();
    }

    public final void a() {
        int i = this.X;
        if (i == 0) {
            this.c = mb8.a.Z;
            return;
        }
        Iterator<?> it = this.V[i - 1];
        it.getClass();
        Object[] objArr = this.e;
        int i2 = this.X - 1;
        Object obj = objArr[i2];
        if (obj instanceof Integer) {
            obj.getClass();
            objArr[i2] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.c = this.e[this.X + (-1)] instanceof Integer ? mb8.a.b : mb8.a.d;
            return;
        }
        Object next = it.next();
        this.d = next;
        this.c = next instanceof Map.Entry ? mb8.a.e : h(next);
    }

    @Override // defpackage.mb8
    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        int i = this.X;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.e[i2];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.mb8
    public final boolean hasNext() {
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 1 || iOrdinal == 3) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mb8
    public final mb8 j() {
        if (this.c != mb8.a.c) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return null;
        }
        s();
        Map<String, Object>[] mapArr = this.f;
        int i = this.X - 1;
        Object obj = this.d;
        obj.getClass();
        mapArr[i] = obj;
        k();
        return this;
    }

    @Override // defpackage.mb8
    public final void k() {
        Map<String, Object>[] mapArr = this.f;
        int i = this.X;
        Map<String, Object> map = mapArr[i - 1];
        this.e[i - 1] = null;
        map.getClass();
        this.V[i - 1] = map.entrySet().iterator();
        this.W[this.X - 1] = 0;
        a();
    }

    @Override // defpackage.mb8
    public final mb8 l() {
        if (this.c != mb8.a.b) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return null;
        }
        int i = this.X - 1;
        this.X = i;
        this.V[i] = null;
        this.e[i] = null;
        a();
        return this;
    }

    @Override // defpackage.mb8
    public final void l1() {
        if (this.c == mb8.a.Y) {
            a();
            return;
        }
        StringBuilder sb = new StringBuilder("Expected NULL but was ");
        sb.append(this.c);
        akb.r(sb, p());
    }

    @Override // defpackage.mb8
    public final mb8 m() {
        if (this.c != mb8.a.a) {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return null;
        }
        Object obj = this.d;
        obj.getClass();
        s();
        this.e[this.X - 1] = -1;
        this.V[this.X - 1] = ((List) obj).iterator();
        a();
        return this;
    }

    @Override // defpackage.mb8
    public final boolean nextBoolean() {
        if (this.c == mb8.a.X) {
            Object obj = this.d;
            obj.getClass();
            a();
            return ((Boolean) obj).booleanValue();
        }
        StringBuilder sb = new StringBuilder("Expected BOOLEAN but was ");
        sb.append(this.c);
        akb.r(sb, p());
        return false;
    }

    @Override // defpackage.mb8
    public final double nextDouble() {
        double dDoubleValue;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            StringBuilder sb = new StringBuilder("Expected a Double but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return 0.0d;
        }
        Object obj = this.d;
        if (obj instanceof Integer) {
            dDoubleValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            long jLongValue = ((Number) obj).longValue();
            double d = jLongValue;
            if (((long) d) != jLongValue) {
                throw new IllegalStateException((jLongValue + " cannot be converted to Double").toString());
            }
            dDoubleValue = d;
        } else if (obj instanceof Double) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            dDoubleValue = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof za8)) {
                n6.c("Expected a Double but got ", obj, " instead");
                return 0.0d;
            }
            dDoubleValue = Double.parseDouble(((za8) obj).a);
        }
        a();
        return dDoubleValue;
    }

    @Override // defpackage.mb8
    public final int nextInt() {
        int iIntValue;
        int i;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            StringBuilder sb = new StringBuilder("Expected an Int but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return 0;
        }
        Object obj = this.d;
        if (obj instanceof Integer) {
            iIntValue = ((Number) obj).intValue();
        } else {
            if (obj instanceof Long) {
                long jLongValue = ((Number) obj).longValue();
                i = (int) jLongValue;
                if (i != jLongValue) {
                    throw new IllegalStateException((jLongValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof Double) {
                double dDoubleValue = ((Number) obj).doubleValue();
                i = (int) dDoubleValue;
                if (i != dDoubleValue) {
                    throw new IllegalStateException((dDoubleValue + " cannot be converted to Int").toString());
                }
            } else if (obj instanceof String) {
                iIntValue = Integer.parseInt((String) obj);
            } else {
                if (!(obj instanceof za8)) {
                    n6.c("Expected an Int but got ", obj, " instead");
                    return 0;
                }
                iIntValue = Integer.parseInt(((za8) obj).a);
            }
            iIntValue = i;
        }
        a();
        return iIntValue;
    }

    @Override // defpackage.mb8
    public final long nextLong() {
        long jLongValue;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6 && iOrdinal != 7) {
            StringBuilder sb = new StringBuilder("Expected a Long but was ");
            sb.append(this.c);
            akb.r(sb, p());
            return 0L;
        }
        Object obj = this.d;
        if (obj instanceof Integer) {
            jLongValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long j = (long) dDoubleValue;
            if (j != dDoubleValue) {
                throw new IllegalStateException((dDoubleValue + " cannot be converted to Long").toString());
            }
            jLongValue = j;
        } else if (obj instanceof String) {
            jLongValue = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof za8)) {
                n6.c("Expected Int but got ", obj, " instead");
                return 0L;
            }
            jLongValue = Long.parseLong(((za8) obj).a);
        }
        a();
        return jLongValue;
    }

    public final String p() {
        return z92.W0(c(), ".", null, null, null, 62);
    }

    @Override // defpackage.mb8
    public final mb8.a peek() {
        return this.c;
    }

    public final void s() {
        int i = this.X;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            this.e = Arrays.copyOf(objArr, objArr.length * 2);
            Map<String, Object>[] mapArr = this.f;
            this.f = (Map[]) Arrays.copyOf(mapArr, mapArr.length * 2);
            int[] iArr = this.W;
            this.W = Arrays.copyOf(iArr, iArr.length * 2);
            Iterator<?>[] itArr = this.V;
            this.V = (Iterator[]) Arrays.copyOf(itArr, itArr.length * 2);
        }
        this.X++;
    }

    @Override // defpackage.mb8
    public final mb8 t() {
        int i = this.X - 1;
        this.X = i;
        this.V[i] = null;
        this.e[i] = null;
        this.f[i] = null;
        a();
        return this;
    }

    public /* synthetic */ tb9(Map map) {
        this(map, zr4.a);
    }
}
