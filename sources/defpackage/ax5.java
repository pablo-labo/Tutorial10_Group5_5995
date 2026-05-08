package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.function.Function;
import org.apache.avro.AvroMissingFieldException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.UnresolvedUnionException;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class ax5 {
    public static final ax5 g = new ax5();
    public static final IdentityHashMap h;
    public static final org.apache.avro.g i;
    public final ClassLoader a;
    public final HashMap b = new HashMap();
    public final IdentityHashMap c = new IdentityHashMap();
    public final boolean d = "true".equalsIgnoreCase(System.getProperty("org.apache.avro.fastread"));
    public e75 e = null;
    public final qn2 f = new qn2();

    public static abstract class a<T> extends AbstractList<T> implements vw5<T>, Comparable<vw5<T>> {
        public final org.apache.avro.g a;
        public int b = 0;

        /* JADX INFO: renamed from: ax5$a$a, reason: collision with other inner class name */
        public class C0083a implements Iterator<T> {
            public int a = 0;

            public C0083a() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a < a.this.b;
            }

            @Override // java.util.Iterator
            public final T next() {
                int i = this.a;
                this.a = i + 1;
                return a.this.get(i);
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public a(org.apache.avro.g gVar) {
            if (gVar == null || !g.u.ARRAY.equals(gVar.K())) {
                r40.m("Not an array schema: ".concat(String.valueOf(gVar)));
                throw null;
            }
            this.a = gVar;
        }

        @Override // defpackage.xw5
        public final org.apache.avro.g a() {
            return this.a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return ax5.g.a(this, (vw5) obj, this.a, false);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            return (obj instanceof Collection) && ax5.g.a(this, obj, this.a, false) == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<T> iterator() {
            return new C0083a();
        }

        @Override // defpackage.vw5
        public final void reset() {
            this.b = 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.b;
        }
    }

    public static class b<T> extends a<T> {
        public static final Object[] d = new Object[0];
        public Object[] c;

        public b(int i, org.apache.avro.g gVar) {
            super(gVar);
            this.c = d;
            if (i != 0) {
                this.c = new Object[i];
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, T t) {
            int i2 = this.b;
            if (i > i2 || i < 0) {
                l5.s(bg.d(i, "Index ", " out of bounds."));
                return;
            }
            Object[] objArr = this.c;
            if (i2 == objArr.length) {
                this.c = Arrays.copyOf(objArr, i2 + (i2 >> 1) + 1);
            }
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i, objArr2, i + 1, this.b - i);
            this.c[i] = t;
            this.b++;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            Arrays.fill(this.c, 0, this.b, (Object) null);
            this.b = 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            if (i < this.b) {
                return (T) this.c[i];
            }
            l5.s(bg.d(i, "Index ", " out of bounds."));
            return null;
        }

        @Override // defpackage.vw5
        public final T peek() {
            int i = this.b;
            Object[] objArr = this.c;
            if (i < objArr.length) {
                return (T) objArr[i];
            }
            return null;
        }

        @Override // defpackage.vw5
        public final void r0() {
            int i = this.b;
            Object[] objArr = this.c;
            if (i < objArr.length) {
                Arrays.fill(objArr, i, objArr.length, (Object) null);
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            int i2 = this.b;
            if (i >= i2) {
                l5.s(bg.d(i, "Index ", " out of bounds."));
                return null;
            }
            Object[] objArr = this.c;
            T t = (T) objArr[i];
            int i3 = i2 - 1;
            this.b = i3;
            System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
            this.c[this.b] = null;
            return t;
        }

        @Override // java.util.AbstractList, java.util.List
        public final T set(int i, T t) {
            if (i >= this.b) {
                l5.s(bg.d(i, "Index ", " out of bounds."));
                return null;
            }
            Object[] objArr = this.c;
            T t2 = (T) objArr[i];
            objArr[i] = t;
            return t2;
        }
    }

    public static class c implements kx5<c> {
        public org.apache.avro.g a;
        public String b;

        @Override // defpackage.xw5
        public final org.apache.avro.g a() {
            return this.a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return ax5.g.a(this, (c) obj, this.a, false);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof kx5) && this.b.equals(obj.toString());
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return this.b;
        }
    }

    public static class d implements cz5, Comparable<d> {
        public org.apache.avro.g a;
        public byte[] b;

        @Override // defpackage.xw5
        public final org.apache.avro.g a() {
            return this.a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            byte[] bArr = this.b;
            int length = bArr.length;
            byte[] bArr2 = dVar.b;
            return of1.a(bArr, length, bArr2, bArr2.length);
        }

        @Override // defpackage.cz5
        public final byte[] e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof cz5) && Arrays.equals(this.b, ((cz5) obj).e());
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public final String toString() {
            return Arrays.toString(this.b);
        }
    }

    public class e {
        public int a = 10;
        public int b = 1;

        public e() {
        }

        public final int a(Object obj, org.apache.avro.g gVar) {
            if (obj == null) {
                return 0;
            }
            int iOrdinal = gVar.K().ordinal();
            if (iOrdinal == 0) {
                for (g.f fVar : gVar.C()) {
                    int i = this.a - 1;
                    this.a = i;
                    if (i <= 0) {
                        return this.b;
                    }
                    if (fVar.V != g.f.b.IGNORE) {
                        Object obj2 = ((la7) obj).get(fVar.c);
                        org.apache.avro.g gVar2 = fVar.d;
                        this.b = a(obj2, gVar2) + (this.b * 31);
                    }
                }
                return this.b;
            }
            if (iOrdinal == 1) {
                return gVar.z(obj.toString());
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 4) {
                    return a(obj, gVar.L().get(ax5.this.q(obj, gVar)));
                }
                if (iOrdinal != 6) {
                    if (iOrdinal != 13) {
                        return obj.hashCode();
                    }
                    return 0;
                }
                if (!(obj instanceof rjg)) {
                    obj = new rjg(obj.toString());
                }
                return obj.hashCode();
            }
            org.apache.avro.g gVarX = gVar.x();
            for (Object obj3 : (Collection) obj) {
                int i2 = this.a - 1;
                this.a = i2;
                int i3 = this.b;
                if (i2 <= 0) {
                    return i3;
                }
                this.b = a(obj3, gVarX) + (i3 * 31);
            }
            return this.b;
        }
    }

    public interface f {
        Object g(Object obj, org.apache.avro.g gVar);
    }

    public static class g implements la7, Comparable<g> {
        public final org.apache.avro.g a;
        public final Object[] b;

        public g(org.apache.avro.g gVar) {
            if (gVar == null || !g.u.RECORD.equals(gVar.K())) {
                r40.m("Not a record schema: ".concat(String.valueOf(gVar)));
                throw null;
            }
            this.a = gVar;
            this.b = new Object[gVar.C().size()];
        }

        @Override // defpackage.xw5
        public final org.apache.avro.g a() {
            return this.a;
        }

        @Override // defpackage.la7
        public final void c(int i, Object obj) {
            this.b[i] = obj;
        }

        @Override // java.lang.Comparable
        public final int compareTo(g gVar) {
            return ax5.g.a(this, gVar, this.a, false);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            org.apache.avro.g gVar2 = gVar.a;
            org.apache.avro.g gVar3 = this.a;
            return gVar3.equals(gVar2) && ax5.g.a(this, gVar, gVar3, true) == 0;
        }

        @Override // defpackage.la7
        public final Object get(int i) {
            return this.b[i];
        }

        public final int hashCode() {
            ax5 ax5Var = ax5.g;
            ax5Var.getClass();
            return ax5Var.new e().a(this, this.a);
        }

        public final String toString() {
            ax5 ax5Var = ax5.g;
            ax5Var.getClass();
            StringBuilder sb = new StringBuilder();
            ax5Var.r(this, sb, new IdentityHashMap<>(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
            return sb.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class h {
        public static final /* synthetic */ h[] a = {new h("CharSequence", 0), new h("String", 1), new h("Utf8", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        h EF5;

        public h() {
            throw null;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) a.clone();
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        h = identityHashMap;
        identityHashMap.put(Integer.class, g.u.INT.c());
        identityHashMap.put(Long.class, g.u.LONG.c());
        identityHashMap.put(Float.class, g.u.FLOAT.c());
        identityHashMap.put(Double.class, g.u.DOUBLE.c());
        identityHashMap.put(Boolean.class, g.u.BOOLEAN.c());
        g.u uVar = g.u.STRING;
        identityHashMap.put(String.class, uVar.c());
        identityHashMap.put(rjg.class, uVar.c());
        i = org.apache.avro.g.s(uVar);
    }

    public ax5() {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = classLoader;
        for (xy2 xy2Var : ServiceLoader.load(xy2.class, classLoader)) {
            this.b.put(xy2Var.b(), xy2Var);
            ((Map) this.c.computeIfAbsent(xy2Var.a(), new yw5())).put(xy2Var.b(), xy2Var);
        }
    }

    public static Collection o(Object obj, int i2, org.apache.avro.g gVar) {
        if (obj instanceof vw5) {
            ((vw5) obj).reset();
            return (Collection) obj;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            collection.clear();
            return collection;
        }
        g.u uVarK = gVar.x().K();
        g.u uVar = g.u.INT;
        if (uVarK == uVar) {
            fnb fnbVar = new fnb(gVar);
            fnbVar.c = fnb.d;
            if (!uVar.equals(gVar.x().K())) {
                r40.m("Not a int array schema: ".concat(String.valueOf(gVar)));
                return null;
            }
            if (i2 != 0) {
                fnbVar.c = new int[i2];
            }
            return fnbVar;
        }
        g.u uVarK2 = gVar.x().K();
        g.u uVar2 = g.u.BOOLEAN;
        if (uVarK2 == uVar2) {
            cnb cnbVar = new cnb(gVar);
            cnbVar.c = cnb.d;
            if (!uVar2.equals(gVar.x().K())) {
                r40.m("Not a boolean array schema: ".concat(String.valueOf(gVar)));
                return null;
            }
            if (i2 != 0) {
                cnbVar.c = new byte[(i2 / 8) + 1];
            }
            return cnbVar;
        }
        g.u uVarK3 = gVar.x().K();
        g.u uVar3 = g.u.LONG;
        if (uVarK3 == uVar3) {
            gnb gnbVar = new gnb(gVar);
            gnbVar.c = gnb.d;
            if (!uVar3.equals(gVar.x().K())) {
                r40.m("Not a long array schema: ".concat(String.valueOf(gVar)));
                return null;
            }
            if (i2 != 0) {
                gnbVar.c = new long[i2];
            }
            return gnbVar;
        }
        g.u uVarK4 = gVar.x().K();
        g.u uVar4 = g.u.FLOAT;
        if (uVarK4 == uVar4) {
            enb enbVar = new enb(gVar);
            enbVar.c = enb.d;
            if (!uVar4.equals(gVar.x().K())) {
                r40.m("Not a float array schema: ".concat(String.valueOf(gVar)));
                return null;
            }
            if (i2 != 0) {
                enbVar.c = new float[i2];
            }
            return enbVar;
        }
        g.u uVarK5 = gVar.x().K();
        g.u uVar5 = g.u.DOUBLE;
        if (uVarK5 != uVar5) {
            return new b(i2, gVar);
        }
        dnb dnbVar = new dnb(gVar);
        dnbVar.c = dnb.d;
        if (!uVar5.equals(gVar.x().K())) {
            r40.m("Not a double array schema: ".concat(String.valueOf(gVar)));
            return null;
        }
        if (i2 != 0) {
            dnbVar.c = new double[i2];
        }
        return dnbVar;
    }

    public static void s(CharSequence charSequence, StringBuilder sb) {
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\f') {
                sb.append("\\f");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                            sb.append(cCharAt);
                        } else {
                            String hexString = Integer.toHexString(cCharAt);
                            sb.append("\\u");
                            for (int i3 = 0; i3 < 4 - hexString.length(); i3++) {
                                sb.append('0');
                            }
                            sb.append(hexString.toUpperCase());
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
    }

    public int a(Object obj, Object obj2, org.apache.avro.g gVar, boolean z) {
        boolean z2;
        boolean z3;
        if (obj != obj2) {
            int iOrdinal = gVar.K().ordinal();
            if (iOrdinal == 0) {
                for (g.f fVar : gVar.C()) {
                    if (fVar.V != g.f.b.IGNORE) {
                        int i2 = fVar.c;
                        int iA = a(((la7) obj).get(i2), ((la7) obj2).get(i2), fVar.d, z);
                        if (iA != 0) {
                            return fVar.V == g.f.b.DESCENDING ? -iA : iA;
                        }
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    return gVar.z(obj.toString()) - gVar.z(obj2.toString());
                }
                if (iOrdinal == 2) {
                    Iterator it = ((Collection) obj).iterator();
                    Iterator it2 = ((Collection) obj2).iterator();
                    org.apache.avro.g gVarX = gVar.x();
                    while (it.hasNext() && it2.hasNext()) {
                        int iA2 = a(it.next(), it2.next(), gVarX, z);
                        if (iA2 != 0) {
                            return iA2;
                        }
                    }
                    if (!it.hasNext()) {
                        if (it2.hasNext()) {
                            return -1;
                        }
                    }
                    return 1;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        int iQ = q(obj, gVar);
                        int iQ2 = q(obj2, gVar);
                        return iQ == iQ2 ? a(obj, obj2, gVar.L().get(iQ), z) : Integer.compare(iQ, iQ2);
                    }
                    if (iOrdinal == 6) {
                        return (obj instanceof rjg ? (rjg) obj : new rjg(obj.toString())).compareTo(obj2 instanceof rjg ? (rjg) obj2 : new rjg(obj2.toString()));
                    }
                    if (iOrdinal != 13) {
                        return ((Comparable) obj).compareTo(obj2);
                    }
                } else {
                    if (!z) {
                        r40.m("Can't compare maps!");
                        return 0;
                    }
                    Map map = (Map) obj;
                    Map map2 = (Map) obj2;
                    if (map != map2 && (!map.isEmpty() || !map2.isEmpty())) {
                        if (map.size() == map2.size()) {
                            Object next = map.keySet().iterator().next();
                            Object next2 = map2.keySet().iterator().next();
                            if ((next instanceof rjg) && (next2 instanceof String)) {
                                z3 = false;
                                z2 = true;
                            } else if ((next instanceof String) && (next2 instanceof rjg)) {
                                z2 = false;
                                z3 = true;
                            } else {
                                z2 = false;
                                z3 = false;
                            }
                            try {
                                for (Map.Entry entry : map.entrySet()) {
                                    Object key = entry.getKey();
                                    if (z2) {
                                        key = key.toString();
                                    } else if (z3) {
                                        key = new rjg((String) key);
                                    }
                                    Object value = entry.getValue();
                                    if (value != null) {
                                        Object obj3 = map2.get(key);
                                        if ((value instanceof rjg) && (obj3 instanceof String)) {
                                            if (!value.toString().equals(obj3)) {
                                            }
                                        } else if ((value instanceof String) && (obj3 instanceof rjg)) {
                                            if (!new rjg((String) value).equals(obj3)) {
                                            }
                                        } else if (!value.equals(obj3)) {
                                        }
                                    } else if (map2.get(key) == null && map2.containsKey(key)) {
                                    }
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public wg3 b(org.apache.avro.g gVar) {
        return c(gVar, gVar);
    }

    public wg3 c(org.apache.avro.g gVar, org.apache.avro.g gVar2) {
        return new cx5(gVar, gVar2, this);
    }

    public Object d(String str, org.apache.avro.g gVar) {
        c cVar = new c();
        cVar.a = gVar;
        cVar.b = str;
        return cVar;
    }

    public Object e(Object obj, org.apache.avro.g gVar) {
        if ((obj instanceof cz5) && ((cz5) obj).e().length == gVar.D()) {
            return obj;
        }
        d dVar = new d();
        dVar.a = gVar;
        dVar.b = new byte[gVar.D()];
        return dVar;
    }

    public Object f(Object obj) {
        return obj instanceof String ? obj : obj instanceof rjg ? new rjg((rjg) obj) : new rjg(obj.toString());
    }

    public final Object g(Object obj, org.apache.avro.g gVar) {
        if (obj == null) {
            return null;
        }
        p49 p49VarG = gVar.G();
        if (p49VarG == null) {
            return h(obj, gVar);
        }
        Map map = (Map) this.c.get(obj.getClass());
        xy2 xy2Var = map != null ? (xy2) map.get(p49VarG.a) : null;
        if (xy2Var == null) {
            return h(obj, gVar);
        }
        org.apache.avro.a.b(obj, gVar, p49VarG, xy2Var);
        return org.apache.avro.a.a(h(obj, gVar), gVar, p49VarG, xy2Var);
    }

    public final Object h(Object obj, org.apache.avro.g gVar) {
        if (obj != null) {
            switch (gVar.K().ordinal()) {
                case 0:
                    Object objP = p(null, gVar);
                    for (g.f fVar : gVar.C()) {
                        int i2 = fVar.c;
                        ((la7) objP).c(i2, g(((la7) obj).get(i2), fVar.d));
                    }
                    return objP;
                case 1:
                    return d(obj.toString(), gVar);
                case 2:
                    List list = (List) obj;
                    b bVar = new b(list.size(), gVar);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        bVar.add(g(it.next(), gVar.x()));
                    }
                    return bVar;
                case 3:
                    Map map = (Map) obj;
                    HashMap map2 = new HashMap(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        map2.put(g(entry.getKey(), i), g(entry.getValue(), gVar.M()));
                    }
                    return map2;
                case 4:
                    return g(obj, gVar.L().get(q(obj, gVar)));
                case 5:
                    byte[] bArrE = ((cz5) obj).e();
                    cz5 cz5Var = (cz5) e(null, gVar);
                    System.arraycopy(bArrE, 0, cz5Var.e(), 0, gVar.D());
                    return cz5Var;
                case 6:
                    return f(obj);
                case 7:
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    int iPosition = byteBuffer.position();
                    int iLimit = byteBuffer.limit() - iPosition;
                    byte[] bArr = new byte[iLimit];
                    byteBuffer.get(bArr, 0, iLimit);
                    byteBuffer.position(iPosition);
                    return ByteBuffer.wrap(bArr, 0, iLimit);
                case 8:
                case DatadogLogGenerator.CRASH /* 9 */:
                case 10:
                case 11:
                case 12:
                    return obj;
                default:
                    r40.m(akb.k("Deep copy failed for schema \"", String.valueOf(gVar), "\" and value \"", String.valueOf(obj), "\""));
                case 13:
                    return null;
            }
        }
        return null;
    }

    public final <T> xy2<T> i(p49 p49Var) {
        if (p49Var == null) {
            return null;
        }
        return (xy2) this.b.get(p49Var.a);
    }

    public final Object j(g.f fVar) {
        w6.b.getClass();
        final JsonNode jsonNode = fVar.f;
        org.apache.avro.g gVar = fVar.d;
        if (jsonNode == null) {
            throw new AvroMissingFieldException(l5.m("Field ", String.valueOf(fVar), " not set and has no default value"), fVar);
        }
        if (jsonNode.isNull()) {
            g.u uVarK = gVar.K();
            g.u uVar = g.u.NULL;
            if (uVarK == uVar) {
                return null;
            }
            if (gVar.K() == g.u.UNION && gVar.L().get(0).K() == uVar) {
                return null;
            }
        }
        return this.f.computeIfAbsent(fVar, new Function() { // from class: zw5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ax5 ax5Var = this.a;
                JsonNode jsonNode2 = jsonNode;
                g.f fVar2 = (g.f) obj;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    fo1 fo1VarA = bt4.b.a(byteArrayOutputStream);
                    g gVar2 = fVar2.d;
                    if (w6.c == null) {
                        try {
                            Class.forName(e5d.class.getName());
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    w6.c.getClass();
                    e5d.a(fo1VarA, gVar2, jsonNode2);
                    fo1VarA.flush();
                    return ax5Var.b(fVar2.d).j(null, bk3.a(byteArrayOutputStream.toByteArray()));
                } catch (IOException e2) {
                    throw new AvroRuntimeException(e2);
                }
            }
        });
    }

    public org.apache.avro.g k(Object obj) {
        return ((xw5) obj).a();
    }

    public f l(org.apache.avro.g gVar) {
        return new i73(this, 4);
    }

    public String m(Object obj) {
        if (obj == null || obj == org.apache.avro.b.a) {
            return g.u.NULL.c();
        }
        String str = (String) h.get(obj.getClass());
        if (str != null) {
            return str;
        }
        if (obj instanceof la7) {
            return ((xw5) obj).a().E();
        }
        if (n(obj)) {
            return k(obj).E();
        }
        if (obj instanceof Collection) {
            return g.u.ARRAY.c();
        }
        if (obj instanceof Map) {
            return g.u.MAP.c();
        }
        if (obj instanceof cz5) {
            return ((xw5) obj).a().E();
        }
        if (obj instanceof CharSequence) {
            return g.u.STRING.c();
        }
        if (obj instanceof ByteBuffer) {
            return g.u.BYTES.c();
        }
        if (obj instanceof Integer) {
            return g.u.INT.c();
        }
        if (obj instanceof Long) {
            return g.u.LONG.c();
        }
        if (obj instanceof Float) {
            return g.u.FLOAT.c();
        }
        if (obj instanceof Double) {
            return g.u.DOUBLE.c();
        }
        if (obj instanceof Boolean) {
            return g.u.BOOLEAN.c();
        }
        throw new AvroRuntimeException(String.format("Unknown datum type %s: %s", obj.getClass().getName(), obj));
    }

    public boolean n(Object obj) {
        return obj instanceof kx5;
    }

    public Object p(Object obj, org.apache.avro.g gVar) {
        if (obj instanceof la7) {
            la7 la7Var = (la7) obj;
            if (la7Var.a() == gVar) {
                return la7Var;
            }
        }
        return new g(gVar);
    }

    public final int q(Object obj, org.apache.avro.g gVar) {
        Map map;
        if (obj != null && (map = (Map) this.c.get(obj.getClass())) != null) {
            List<org.apache.avro.g> listL = gVar.L();
            for (int i2 = 0; i2 < listL.size(); i2++) {
                p49 p49VarG = listL.get(i2).G();
                if (p49VarG != null && ((xy2) map.get(p49VarG.a)) != null) {
                    return i2;
                }
            }
        }
        Integer numF = gVar.F(m(obj));
        if (numF != null) {
            return numF.intValue();
        }
        throw new UnresolvedUnionException(obj, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(java.lang.Object r9, java.lang.StringBuilder r10, java.util.IdentityHashMap<java.lang.Object, java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax5.r(java.lang.Object, java.lang.StringBuilder, java.util.IdentityHashMap):void");
    }
}
