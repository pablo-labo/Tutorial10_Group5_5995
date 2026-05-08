package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class le0 implements CharSequence {
    public final List<c<? extends a>> a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public interface a {
    }

    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ak2.i(Integer.valueOf(((c) t).b), Integer.valueOf(((c) t2).b));
        }
    }

    static {
        ko2 ko2Var = wld.a;
    }

    public le0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public le0(List<? extends c<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                c cVar = (c) list.get(i);
                T t = cVar.a;
                if (t instanceof foe) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (t instanceof l3b) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listP1 = arrayList2 != null ? z92.p1(arrayList2, new d()) : null;
        List list2 = listP1;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((c) z92.O0(listP1)).c;
        z2a z2aVar = hh7.a;
        z2a z2aVar2 = new z2a(1);
        z2aVar2.c(i2);
        int size2 = listP1.size();
        for (int i3 = 1; i3 < size2; i3++) {
            c cVar2 = (c) listP1.get(i3);
            while (true) {
                if (z2aVar2.b != 0) {
                    int iB = z2aVar2.b();
                    int i4 = cVar2.b;
                    int i5 = cVar2.c;
                    if (i4 >= iB) {
                        z2aVar2.e(z2aVar2.b - 1);
                    } else if (i5 > iB) {
                        be7.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iB);
                    }
                }
            }
            z2aVar2.c(cVar2.c);
        }
    }

    public final List a(int i) {
        List<c<? extends a>> list = this.a;
        if (list == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c<? extends a> cVar = list.get(i2);
            c<? extends a> cVar2 = cVar;
            if ((cVar2.a instanceof rx8) && me0.b(0, i, cVar2.b, cVar2.c)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<c<String>> b(int i, int i2) {
        List<c<? extends a>> list = this.a;
        if (list == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            c<? extends a> cVar = list.get(i3);
            T t = cVar.a;
            int i4 = cVar.c;
            int i5 = cVar.b;
            if ((t instanceof yue) && me0.b(i, i2, i5, i4)) {
                T t2 = cVar.a;
                t2.getClass();
                arrayList.add(new c(((yue) t2).a, i5, i4, cVar.d));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List c(int i, int i2, String str) {
        List<c<? extends a>> list = this.a;
        if (list == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            c<? extends a> cVar = list.get(i3);
            T t = cVar.a;
            int i4 = cVar.c;
            int i5 = cVar.b;
            String str2 = cVar.d;
            if ((t instanceof yue) && str.equals(str2) && me0.b(i, i2, i5, i4)) {
                T t2 = cVar.a;
                t2.getClass();
                arrayList.add(new c(((yue) t2).a, i5, i4, str2));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final List d(int i) {
        List<c<? extends a>> list = this.a;
        if (list == null) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c<? extends a> cVar = list.get(i2);
            c<? extends a> cVar2 = cVar;
            if ((cVar2.a instanceof bvf) && me0.b(0, i, cVar2.b, cVar2.c)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final le0 e(Function1<? super c<? extends a>, ? extends c<? extends a>> function1) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c<? extends a> cVarInvoke = function1.invoke(((b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new b.a(cVarInvoke.a, cVarInvoke.b, cVarInvoke.c, cVarInvoke.d));
        }
        return bVar.l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le0)) {
            return false;
        }
        le0 le0Var = (le0) obj;
        return wl7.b(this.b, le0Var.b) && wl7.b(this.a, le0Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.le0 subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 41
            java.lang.String r1 = "start ("
            if (r10 > r11) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r10)
            java.lang.String r3 = ") should be less or equal to end ("
            r2.append(r3)
            r2.append(r11)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            defpackage.be7.a(r2)
        L21:
            java.lang.String r2 = r9.b
            if (r10 != 0) goto L2c
            int r3 = r2.length()
            if (r11 != r3) goto L2c
            return r9
        L2c:
            java.lang.String r2 = r2.substring(r10, r11)
            le0 r3 = defpackage.me0.a
            if (r10 > r11) goto L35
            goto L4f
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r10)
            java.lang.String r1 = ") should be less than or equal to end ("
            r3.append(r1)
            r3.append(r11)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.be7.a(r0)
        L4f:
            java.util.List<le0$c<? extends le0$a>> r9 = r9.a
            if (r9 != 0) goto L54
            goto L98
        L54:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L65:
            if (r3 >= r1) goto L92
            java.lang.Object r4 = r9.get(r3)
            le0$c r4 = (le0.c) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.me0.b(r10, r11, r5, r6)
            if (r5 == 0) goto L8f
            le0$c r5 = new le0$c
            T r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r7, r8, r6, r4)
            r0.add(r5)
        L8f:
            int r3 = r3 + 1
            goto L65
        L92:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L99
        L98:
            r0 = 0
        L99:
            le0 r9 = new le0
            r9.<init>(r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le0.subSequence(int, int):le0");
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List<c<? extends a>> list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public static final class b implements Appendable {
        public final StringBuilder a;
        public final ArrayList b;
        public final ArrayList c;

        public b() {
            this.a = new StringBuilder(16);
            this.b = new ArrayList();
            this.c = new ArrayList();
            new ArrayList();
        }

        public final void a(String str, int i, int i2, String str2) {
            this.c.add(new a(new yue(str2), i, i2, str));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof le0) {
                e((le0) charSequence, i, i2);
                return this;
            }
            this.a.append(charSequence, i, i2);
            return this;
        }

        public final void b(foe foeVar, int i, int i2) {
            this.c.add(new a(i, i2, 8, foeVar, null));
        }

        public final void c(char c) {
            this.a.append(c);
        }

        public final void d(le0 le0Var) {
            StringBuilder sb = this.a;
            int length = sb.length();
            sb.append(le0Var.b);
            List<c<? extends a>> list = le0Var.a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    c<? extends a> cVar = list.get(i);
                    this.c.add(new a(cVar.a, cVar.b + length, cVar.c + length, cVar.d));
                }
            }
        }

        public final void e(le0 le0Var, int i, int i2) {
            StringBuilder sb = this.a;
            int length = sb.length();
            sb.append((CharSequence) le0Var.b, i, i2);
            List listA = me0.a(le0Var, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c cVar = (c) listA.get(i3);
                    this.c.add(new a(cVar.a, cVar.b + length, cVar.c + length, cVar.d));
                }
            }
        }

        public final void f(CharSequence charSequence) {
            if (charSequence instanceof le0) {
                d((le0) charSequence);
            } else {
                this.a.append(charSequence);
            }
        }

        public final void g(String str) {
            this.a.append(str);
        }

        public final void h() {
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                be7.c("Nothing to pop.");
            }
            ((a) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
        }

        public final void i(int i) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                be7.c(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                h();
            }
        }

        public final void j(String str, String str2) {
            a aVar = new a(this.a.length(), 0, 4, new yue(str2), str);
            ArrayList arrayList = this.b;
            arrayList.add(aVar);
            this.c.add(aVar);
            arrayList.size();
        }

        public final int k(foe foeVar) {
            a aVar = new a(this.a.length(), 0, 12, foeVar, null);
            this.b.add(aVar);
            this.c.add(aVar);
            return r7.size() - 1;
        }

        public final le0 l() {
            StringBuilder sb = this.a;
            String string = sb.toString();
            ArrayList arrayList = this.c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((a) arrayList.get(i)).a(sb.length()));
            }
            return new le0(string, arrayList2);
        }

        public static final class a<T> {
            public final T a;
            public final int b;
            public int c;
            public final String d;

            public /* synthetic */ a(int i, int i2, int i3, Object obj, String str) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public final c<T> a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    be7.c("Item.end should be set first");
                }
                return new c<>(this.a, this.b, i, this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return wl7.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && wl7.b(this.d, aVar.d);
            }

            public final int hashCode() {
                T t = this.a;
                return this.d.hashCode() + w40.c(this.c, w40.c(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return w40.f(sb, this.d, ')');
            }

            public a(T t, int i, int i2, String str) {
                this.a = t;
                this.b = i;
                this.c = i2;
                this.d = str;
            }
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            f(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.a.append(c);
            return this;
        }

        public b(le0 le0Var) {
            this();
            d(le0Var);
        }
    }

    public static final class c<T> {
        public final T a;
        public final int b;
        public final int c;
        public final String d;

        public c(T t, int i, int i2, String str) {
            this.a = t;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            be7.a("Reversed range is not supported");
        }

        public static c a(c cVar, a aVar, int i, int i2) {
            if ((i2 & 1) != 0) {
                aVar = cVar.a;
            }
            int i3 = cVar.b;
            if ((i2 & 4) != 0) {
                i = cVar.c;
            }
            String str = cVar.d;
            cVar.getClass();
            return new c(aVar, i3, i, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && wl7.b(this.d, cVar.d);
        }

        public final int hashCode() {
            T t = this.a;
            return this.d.hashCode() + w40.c(this.c, w40.c(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return w40.f(sb, this.d, ')');
        }

        public c(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public le0(int i, String str, ArrayList arrayList) {
        List list = (i & 2) != 0 ? zr4.a : arrayList;
        le0 le0Var = me0.a;
        this((List<? extends c<? extends a>>) (list.isEmpty() ? null : list), str);
    }

    public /* synthetic */ le0(String str) {
        this(str, zr4.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public le0(String str, List<? extends c<? extends a>> list) {
        List<? extends c<? extends a>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
