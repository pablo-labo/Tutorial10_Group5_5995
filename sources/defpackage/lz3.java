package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lz3 {
    public static final a c = new a();
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final lz3 m;
    public static final lz3 n;
    public static final lz3 o;
    public static final lz3 p;
    public static final lz3 q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List<kz3> a;
    public final int b;

    public static final class a {

        /* JADX INFO: renamed from: lz3$a$a, reason: collision with other inner class name */
        public static final class C0310a {
            public final int a;
            public final String b;

            public C0310a(int i, String str) {
                this.a = i;
                this.b = str;
            }
        }
    }

    static {
        a.C0310a c0310a;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new lz3(i8);
        n = new lz3(i6 | i7);
        new lz3(i2);
        new lz3(i3);
        new lz3(i4);
        o = new lz3(i9);
        new lz3(i5);
        p = new lz3(i6);
        q = new lz3(i7);
        new lz3(i3 | i6 | i7);
        Field[] fields = lz3.class.getFields();
        fields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C0310a c0310a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            lz3 lz3Var = obj instanceof lz3 ? (lz3) obj : null;
            if (lz3Var != null) {
                int i10 = lz3Var.b;
                String name = field2.getName();
                name.getClass();
                c0310a2 = new a.C0310a(i10, name);
            }
            if (c0310a2 != null) {
                arrayList2.add(c0310a2);
            }
        }
        r = arrayList2;
        Field[] fields2 = lz3.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (wl7.b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                c0310a = new a.C0310a(iIntValue, name2);
            } else {
                c0310a = null;
            }
            if (c0310a != null) {
                arrayList5.add(c0310a);
            }
        }
        s = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lz3(int i2, List<? extends kz3> list) {
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((kz3) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lz3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lz3 lz3Var = (lz3) obj;
        return wl7.b(this.a, lz3Var.a) && this.b == lz3Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0310a) next).a == this.b) {
                break;
            }
        }
        a.C0310a c0310a = (a.C0310a) next;
        String strW0 = c0310a != null ? c0310a.b : null;
        if (strW0 == null) {
            ArrayList arrayList = new ArrayList();
            for (a.C0310a c0310a2 : s) {
                String str = a(c0310a2.a) ? c0310a2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strW0 = z92.W0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbM = akb.m("DescriptorKindFilter(", strW0, ", ");
        sbM.append(this.a);
        sbM.append(')');
        return sbM.toString();
    }

    public /* synthetic */ lz3(int i2) {
        this(i2, zr4.a);
    }
}
