package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m7f {
    public final String a;
    public final Map<String, a> b;
    public final Set<c> c;
    public final Set<d> d;

    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        public a(int i, int i2, String str, String str2, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            this.g = zve.L(upperCase, "INT", false) ? 3 : (zve.L(upperCase, "CHAR", false) || zve.L(upperCase, "CLOB", false) || zve.L(upperCase, "TEXT", false)) ? 2 : zve.L(upperCase, "BLOB", false) ? 5 : (zve.L(upperCase, "REAL", false) || zve.L(upperCase, "FLOA", false) || zve.L(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    boolean z = this.d > 0;
                    a aVar = (a) obj;
                    int i = aVar.f;
                    if (z == (aVar.d > 0) && wl7.b(this.a, aVar.a) && this.c == aVar.c) {
                        String str = aVar.e;
                        int i2 = this.f;
                        String str2 = this.e;
                        if ((i2 != 1 || i != 2 || str2 == null || p7f.a(str2, str)) && ((i2 != 2 || i != 1 || str == null || p7f.a(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : p7f.a(str2, str))) && this.g == aVar.g))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.a);
            sb.append("',\n            |   type = '");
            sb.append(this.b);
            sb.append("',\n            |   affinity = '");
            sb.append(this.g);
            sb.append("',\n            |   notNull = '");
            sb.append(this.c);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.d);
            sb.append("',\n            |   defaultValue = '");
            String str = this.e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return sve.v(sve.x(sb.toString()));
        }
    }

    public static final class b {
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
        
            r0 = r8.b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
        
            defpackage.pi3.d(r2, null);
            r10 = r0;
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.m7f a(defpackage.zhd r29, java.lang.String r30) {
            /*
                Method dump skipped, instruction units count: 515
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m7f.b.a(zhd, java.lang.String):m7f");
        }
    }

    public static final class c {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public c(List list, List list2, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
            this.e = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (wl7.b(this.a, cVar.a) && wl7.b(this.b, cVar.b) && wl7.b(this.c, cVar.c) && wl7.b(this.d, cVar.d)) {
                return wl7.b(this.e, cVar.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + ia.g(this.d, akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.a);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.b);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.c);
            sb.append("',\n            |   columnNames = {");
            sve.v(z92.W0(z92.o1(this.d), ",", null, null, null, 62));
            sve.v("},");
            j6g j6gVar = j6g.a;
            sb.append(j6gVar);
            sb.append("\n            |   referenceColumnNames = {");
            sve.v(z92.W0(z92.o1(this.e), ",", null, null, null, 62));
            sve.v(" }");
            sb.append(j6gVar);
            sb.append("\n            |}\n        ");
            return sve.v(sve.x(sb.toString()));
        }
    }

    public static final class d {
        public final String a;
        public final boolean b;
        public final List<String> c;
        public final List<String> d;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        public d(String str, boolean z, List<String> list, List<String> list2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = list2;
            List<String> arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add("ASC");
                }
            }
            this.d = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                String str = dVar.a;
                if (this.b == dVar.b && wl7.b(this.c, dVar.c) && wl7.b(this.d, dVar.d)) {
                    String str2 = this.a;
                    return wve.K(str2, "index_", false) ? wve.K(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            return this.d.hashCode() + ia.g(this.c, (((wve.K(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.a);
            sb.append("',\n            |   unique = '");
            sb.append(this.b);
            sb.append("',\n            |   columns = {");
            sve.v(z92.W0(this.c, ",", null, null, null, 62));
            sve.v("},");
            j6g j6gVar = j6g.a;
            sb.append(j6gVar);
            sb.append("\n            |   orders = {");
            sve.v(z92.W0(this.d, ",", null, null, null, 62));
            sve.v(" }");
            sb.append(j6gVar);
            sb.append("\n            |}\n        ");
            return sve.v(sve.x(sb.toString()));
        }
    }

    public m7f(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    @sy3
    public static final m7f a(at5 at5Var, String str) {
        return b.a(new qze(at5Var), str);
    }

    public final boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7f)) {
            return false;
        }
        m7f m7fVar = (m7f) obj;
        if (!this.a.equals(m7fVar.a) || !this.b.equals(m7fVar.b) || !wl7.b(this.c, m7fVar.c)) {
            return false;
        }
        Set<d> set2 = this.d;
        if (set2 == null || (set = m7fVar.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + k20.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(p7f.b(z92.p1(this.b.values(), new n7f())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(p7f.b(this.c));
        sb.append("\n            |    indices = {");
        Set<d> set = this.d;
        sb.append(p7f.b(set != null ? z92.p1(set, new o7f()) : zr4.a));
        sb.append("\n            |}\n        ");
        return sve.x(sb.toString());
    }
}
