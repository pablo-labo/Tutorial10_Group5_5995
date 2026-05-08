package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1f {
    public final j a;
    public final x1f[] b;
    public static final o c = new o("null");
    public static final o d = new o("boolean");
    public static final o e = new o("int");
    public static final o f = new o("long");
    public static final o V = new o("float");
    public static final o W = new o("double");
    public static final o X = new o("string");
    public static final o Y = new o("bytes");
    public static final o Z = new o("fixed");
    public static final o a0 = new o("enum");
    public static final o b0 = new o("union");
    public static final o c0 = new o("array-start");
    public static final o d0 = new o("array-end");
    public static final o e0 = new o("map-start");
    public static final o f0 = new o("map-end");
    public static final q g0 = new q();
    public static final o h0 = new o("field-action");
    public static final h i0 = new h(true);

    public static class a extends x1f implements Iterable<x1f> {

        /* JADX INFO: renamed from: x1f$a$a, reason: collision with other inner class name */
        public class C0474a implements Iterator<x1f> {
            public int a;

            public C0474a() {
                this.a = a.this.b.length;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a > 0;
            }

            @Override // java.util.Iterator
            public final x1f next() {
                int i = this.a;
                if (i <= 0) {
                    k20.p();
                    return null;
                }
                x1f[] x1fVarArr = a.this.b;
                int i2 = i - 1;
                this.a = i2;
                return x1fVarArr[i2];
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public a(x1f[] x1fVarArr) {
            super(j.c, x1fVarArr);
        }

        @Override // defpackage.x1f
        public final x1f a(HashMap map, HashMap map2) {
            a aVar = (a) map.get(this);
            if (aVar == null) {
                x1f[] x1fVarArr = new x1f[x1f.c(this.b, 0)];
                aVar = new a(x1fVarArr);
                map.put(this, aVar);
                ArrayList<g> arrayList = new ArrayList();
                map2.put(aVar, arrayList);
                x1f.b(this.b, 0, x1fVarArr, 0, map, map2);
                for (g gVar : arrayList) {
                    x1f[] x1fVarArr2 = gVar.a;
                    int i = gVar.b;
                    x1f[] x1fVarArr3 = aVar.b;
                    System.arraycopy(x1fVarArr3, 0, x1fVarArr2, i, x1fVarArr3.length);
                }
                map2.remove(aVar);
            }
            return aVar;
        }

        @Override // java.lang.Iterable
        public final Iterator<x1f> iterator() {
            return new C0474a();
        }
    }

    public static class b extends x1f {
        public final x1f[] j0;
        public final String[] k0;

        public b(x1f[] x1fVarArr, String[] strArr) {
            super(j.e, null);
            this.j0 = x1fVarArr;
            this.k0 = strArr;
        }

        @Override // defpackage.x1f
        public final x1f a(HashMap map, HashMap map2) {
            x1f[] x1fVarArr = this.j0;
            int length = x1fVarArr.length;
            x1f[] x1fVarArr2 = new x1f[length];
            for (int i = 0; i < length; i++) {
                x1fVarArr2[i] = x1fVarArr[i].a(map, map2);
            }
            return new b(x1fVarArr2, this.k0);
        }
    }

    public static class c extends h {
        public final byte[] k0;

        @Deprecated
        public c(byte[] bArr) {
            this.k0 = bArr;
        }
    }

    public static class d extends i {
        public final boolean k0;
        public final Object[] l0;

        @Deprecated
        public d(int i, Object[] objArr) {
            super(i);
            this.l0 = objArr;
            boolean z = true;
            if (objArr != null) {
                int iMin = Math.min(i, objArr.length);
                boolean z2 = objArr.length <= i;
                int i2 = 0;
                while (z2 && i2 < iMin) {
                    Object obj = objArr[i2];
                    z2 &= (obj instanceof Integer) && i2 == ((Integer) obj).intValue();
                    i2++;
                }
                z = z2;
            }
            this.k0 = z;
        }
    }

    public static class e extends h {
        public final String k0;

        public e(String str) {
            this.k0 = str;
        }
    }

    public static final class f extends h {
        public final boolean k0;
        public final g.f[] l0;

        @Deprecated
        public f(g.f[] fVarArr) {
            this.l0 = fVarArr;
            boolean z = true;
            int i = 0;
            while (z && i < fVarArr.length) {
                z &= i == fVarArr[i].c;
                i++;
            }
            this.k0 = z;
        }
    }

    public static class g {
        public final x1f[] a;
        public final int b;

        public g(x1f[] x1fVarArr, int i) {
            this.a = x1fVarArr;
            this.b = i;
        }
    }

    public static class i extends x1f {
        public final int j0;

        @Deprecated
        public i(int i) {
            super(j.V, null);
            this.j0 = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        public static final j V;
        public static final /* synthetic */ j[] W;
        public static final j a;
        public static final j b;
        public static final j c;
        public static final j d;
        public static final j e;
        public static final j f;

        static {
            j jVar = new j("TERMINAL", 0);
            a = jVar;
            j jVar2 = new j("ROOT", 1);
            b = jVar2;
            j jVar3 = new j("SEQUENCE", 2);
            c = jVar3;
            j jVar4 = new j("REPEATER", 3);
            d = jVar4;
            j jVar5 = new j("ALTERNATIVE", 4);
            e = jVar5;
            j jVar6 = new j("IMPLICIT_ACTION", 5);
            f = jVar6;
            j jVar7 = new j("EXPLICIT_ACTION", 6);
            V = jVar7;
            W = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) W.clone();
        }
    }

    public static class k extends x1f {
        public final x1f j0;

        /* JADX WARN: Illegal instructions before constructor call */
        public k(x1f x1fVar, x1f... x1fVarArr) {
            x1f[] x1fVarArr2 = new x1f[x1fVarArr.length + 1];
            System.arraycopy(x1fVarArr, 0, x1fVarArr2, 1, x1fVarArr.length);
            super(j.d, x1fVarArr2);
            this.j0 = x1fVar;
            x1fVarArr2[0] = this;
        }

        @Override // defpackage.x1f
        public final x1f a(HashMap map, HashMap map2) {
            k kVar = new k(this.j0, new x1f[x1f.c(this.b, 1)]);
            x1f.b(this.b, 1, kVar.b, 1, map, map2);
            return kVar;
        }
    }

    public static class l extends h {
        public final x1f k0;
        public final x1f l0;

        public l(x1f x1fVar, x1f x1fVar2) {
            this.k0 = x1fVar;
            this.l0 = x1fVar2;
        }

        @Override // defpackage.x1f
        public final x1f a(HashMap map, HashMap map2) {
            return new l(this.k0.a(map, map2), this.l0.a(map, map2));
        }
    }

    public static class m extends x1f {
    }

    public static class n extends h {
        public final x1f k0;

        @Deprecated
        public n(x1f x1fVar) {
            super(true);
            this.k0 = x1fVar;
        }

        @Override // defpackage.x1f
        public final x1f a(HashMap map, HashMap map2) {
            return new n(this.k0.a(map, map2));
        }
    }

    public static class o extends x1f {
        public final String j0;

        public o(String str) {
            super(j.a, null);
            this.j0 = str;
        }

        public final String toString() {
            return this.j0;
        }
    }

    public static class p extends h {
        public final int k0;
        public final x1f l0;

        @Deprecated
        public p(int i, x1f x1fVar) {
            this.k0 = i;
            this.l0 = x1fVar;
        }

        @Override // defpackage.x1f
        public final x1f a(HashMap map, HashMap map2) {
            return new p(this.k0, this.l0.a(map, map2));
        }
    }

    public static class q extends h {
    }

    public x1f(j jVar, x1f[] x1fVarArr) {
        this.b = x1fVarArr;
        this.a = jVar;
    }

    public static void b(x1f[] x1fVarArr, int i2, x1f[] x1fVarArr2, int i3, HashMap map, HashMap map2) {
        while (i2 < x1fVarArr.length) {
            x1f x1fVarA = x1fVarArr[i2].a(map, map2);
            if (x1fVarA instanceof a) {
                x1f[] x1fVarArr3 = x1fVarA.b;
                List list = (List) map2.get(x1fVarA);
                if (list == null) {
                    System.arraycopy(x1fVarArr3, 0, x1fVarArr2, i3, x1fVarArr3.length);
                    for (List list2 : map2.values()) {
                        int size = list2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            g gVar = (g) list2.get(i4);
                            if (gVar.a == x1fVarArr3) {
                                list2.add(new g(x1fVarArr2, gVar.b + i3));
                            }
                        }
                    }
                } else {
                    list.add(new g(x1fVarArr2, i3));
                }
                i3 += x1fVarArr3.length;
            } else {
                x1fVarArr2[i3] = x1fVarA;
                i3++;
            }
            i2++;
        }
    }

    public static int c(x1f[] x1fVarArr, int i2) {
        int iC = 0;
        while (i2 < x1fVarArr.length) {
            x1f x1fVar = x1fVarArr[i2];
            iC = x1fVar instanceof a ? c(((a) x1fVar).b, 0) + iC : iC + 1;
            i2++;
        }
        return iC;
    }

    public x1f a(HashMap map, HashMap map2) {
        return this;
    }

    public static class h extends x1f {
        public final boolean j0;

        public h(boolean z) {
            super(j.f, null);
            this.j0 = z;
        }

        public h() {
            this(false);
        }
    }
}
