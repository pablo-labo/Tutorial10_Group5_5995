package defpackage;

import defpackage.rv5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sv5 {
    public static final sv5 c = new sv5(u63.a0(rv5.a.c, rv5.d.c, rv5.b.c, rv5.c.c));
    public final List<rv5> a;
    public final LinkedHashMap b;

    public static final class a {
        public final rv5 a;
        public final int b;

        public a(rv5 rv5Var, int i) {
            this.a = rv5Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("KindWithArity(kind=");
            sb.append(this.a);
            sb.append(", arity=");
            return k6.h(sb, this.b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sv5(List<? extends rv5> list) {
        this.a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            mq5 mq5Var = ((rv5) obj).a;
            Object arrayList = linkedHashMap.get(mq5Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(mq5Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sv5.a a(defpackage.mq5 r8, java.lang.String r9) {
        /*
            r7 = this;
            r8.getClass()
            r9.getClass()
            java.util.LinkedHashMap r7 = r7.b
            java.lang.Object r7 = r7.get(r8)
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            if (r7 != 0) goto L12
            goto L65
        L12:
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r7.next()
            rv5 r0 = (defpackage.rv5) r0
            java.lang.String r1 = r0.b
            r2 = 0
            boolean r1 = defpackage.wve.K(r9, r1, r2)
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.b
            int r1 = r1.length()
            java.lang.String r1 = r9.substring(r1)
            int r3 = r1.length()
            if (r3 != 0) goto L3d
        L3b:
            r1 = r8
            goto L5a
        L3d:
            int r3 = r1.length()
            r4 = r2
        L42:
            if (r2 >= r3) goto L56
            char r5 = r1.charAt(r2)
            int r5 = r5 + (-48)
            if (r5 < 0) goto L3b
            r6 = 10
            if (r5 >= r6) goto L3b
            int r4 = r4 * 10
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L42
        L56:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L5a:
            if (r1 == 0) goto L16
            int r7 = r1.intValue()
            sv5$a r8 = new sv5$a
            r8.<init>(r0, r7)
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv5.a(mq5, java.lang.String):sv5$a");
    }
}
