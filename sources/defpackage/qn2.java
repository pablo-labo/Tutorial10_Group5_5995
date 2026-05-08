package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.avro.reflect.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class qn2<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public final qn2<K, V>.l[] a;
    public final float b = 0.75f;
    public final j c;
    public final int d;

    @Nullable
    public volatile g e;

    public class a extends qn2<K, V>.n<V> {
        @Override // qn2.n
        @Nullable
        public final V a(@Nullable h<K, V> hVar, @Nullable e<K, V> eVar) {
            if (eVar == null) {
                return null;
            }
            if (hVar != null) {
                hVar.release();
            }
            return eVar.b;
        }
    }

    public class b extends qn2<K, V>.n<Boolean> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o[] oVarArr, Object obj) {
            super(oVarArr);
            this.b = obj;
        }

        @Override // qn2.n
        public final Boolean a(@Nullable h hVar, @Nullable e eVar) {
            if (eVar == null || !w74.z(eVar.b, this.b)) {
                return Boolean.FALSE;
            }
            if (hVar != null) {
                hVar.release();
            }
            return Boolean.TRUE;
        }
    }

    public class c extends qn2<K, V>.n<Boolean> {
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o[] oVarArr, Object obj, Object obj2) {
            super(oVarArr);
            this.b = obj;
            this.c = obj2;
        }

        @Override // qn2.n
        public final Boolean a(@Nullable h hVar, @Nullable e eVar) {
            if (eVar == null || !w74.z(eVar.b, this.b)) {
                return Boolean.FALSE;
            }
            eVar.b = (V) this.c;
            return Boolean.TRUE;
        }
    }

    public class d extends qn2<K, V>.n<V> {
        public final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o[] oVarArr, Object obj) {
            super(oVarArr);
            this.b = obj;
        }

        @Override // qn2.n
        @Nullable
        public final V a(@Nullable h<K, V> hVar, @Nullable e<K, V> eVar) {
            if (eVar == null) {
                return null;
            }
            V v = eVar.b;
            eVar.b = (V) this.b;
            return v;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        @Nullable
        public final K a;

        @Nullable
        public volatile V b;

        public e(@Nullable K k, @Nullable V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return w74.z(this.a, entry.getKey()) && w74.z(this.b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        @Nullable
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        @Nullable
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return w74.A(this.b) ^ w74.A(this.a);
        }

        @Override // java.util.Map.Entry
        @Nullable
        public final V setValue(@Nullable V v) {
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public final String toString() {
            return z3.m(String.valueOf(this.a), "=", String.valueOf(this.b));
        }
    }

    public class f implements Iterator<Map.Entry<K, V>> {
        public int a;
        public int b;

        @Nullable
        public h<K, V>[] c;

        @Nullable
        public h<K, V> d;

        @Nullable
        public e<K, V> e;

        @Nullable
        public e<K, V> f;

        public f() {
            b();
        }

        public final void a() {
            h<K, V> hVar;
            h<K, V>[] hVarArr;
            while (this.e == null) {
                h<K, V> hVar2 = this.d;
                if (hVar2 != null) {
                    this.d = hVar2.getNext();
                }
                while (true) {
                    hVar = this.d;
                    if (hVar != null || (hVarArr = this.c) == null) {
                        break;
                    }
                    int i = this.b;
                    if (i >= hVarArr.length) {
                        b();
                        this.b = 0;
                    } else {
                        this.d = hVarArr[i];
                        this.b = i + 1;
                    }
                }
                if (hVar == null) {
                    return;
                } else {
                    this.e = hVar.get();
                }
            }
        }

        public final void b() {
            this.d = null;
            this.c = null;
            int i = this.a;
            qn2<K, V>.l[] lVarArr = qn2.this.a;
            if (i < lVarArr.length) {
                this.c = ((l) lVarArr[i]).references;
                this.a++;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            a();
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            a();
            e<K, V> eVar = this.e;
            if (eVar == null) {
                k20.p();
                return null;
            }
            this.f = eVar;
            this.e = null;
            return eVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f;
            if (!(eVar != null)) {
                r6.g("No element to remove");
            } else {
                qn2.this.remove(eVar.a);
                this.f = null;
            }
        }
    }

    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            qn2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@Nullable Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            qn2 qn2Var = qn2.this;
            Object key = entry.getKey();
            k kVar = k.b;
            int iA = qn2.a(key);
            h<K, V> hVarF = qn2Var.a[(iA >>> (32 - qn2Var.d)) & (r3.length - 1)].f(key, iA, kVar);
            e<K, V> eVar = hVarF != null ? hVarF.get() : null;
            if (eVar != null) {
                return w74.z(entry.getValue(), eVar.b);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return qn2.this.remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return qn2.this.size();
        }
    }

    public interface h<K, V> {
        int a();

        @Nullable
        e<K, V> get();

        @Nullable
        h<K, V> getNext();

        void release();
    }

    public class i {
        public final ReferenceQueue<e<K, V>> a = new ReferenceQueue<>();

        public i() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        public static final j a;
        public static final /* synthetic */ j[] b;

        /* JADX INFO: Fake field, exist only in values array */
        j EF0;

        static {
            j jVar = new j("SOFT", 0);
            j jVar2 = new j("WEAK", 1);
            a = jVar2;
            b = new j[]{jVar, jVar2};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class k {
        public static final k a;
        public static final k b;
        public static final /* synthetic */ k[] c;

        static {
            k kVar = new k("WHEN_NECESSARY", 0);
            a = kVar;
            k kVar2 = new k("NEVER", 1);
            b = kVar2;
            c = new k[]{kVar, kVar2};
        }

        public k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) c.clone();
        }
    }

    public final class l extends ReentrantLock {
        private final AtomicInteger count = new AtomicInteger();
        private final int initialSize;
        private final qn2<K, V>.i referenceManager;
        private volatile h<K, V>[] references;
        private int resizeThreshold;

        public l(int i, int i2) {
            this.referenceManager = new i();
            this.initialSize = i;
            this.references = new h[i];
            this.resizeThreshold = i2;
        }

        public static void a(l lVar, Object obj, int i, h hVar, int i2, Object obj2) {
            lVar.getClass();
            e eVar = new e(obj, obj2);
            qn2<K, V>.i iVar = lVar.referenceManager;
            ReferenceQueue<e<K, V>> referenceQueue = iVar.a;
            lVar.references[i2] = qn2.this.c == j.a ? new p<>(eVar, i, hVar, referenceQueue) : new m<>(eVar, i, hVar, referenceQueue);
            lVar.count.incrementAndGet();
        }

        public final void c() {
            if (this.count.get() == 0) {
                return;
            }
            lock();
            try {
                this.references = new h[this.initialSize];
                this.resizeThreshold = (int) (this.references.length * qn2.this.b);
                this.count.set(0);
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
        @org.apache.avro.reflect.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> T d(int r11, @org.apache.avro.reflect.Nullable java.lang.Object r12, defpackage.qn2<K, V>.n<T> r13) throws java.lang.Throwable {
            /*
                r10 = this;
                qn2$o r1 = qn2.o.b
                qn2$o r0 = qn2.o.d
                java.util.EnumSet<qn2$o> r2 = r13.a
                boolean r2 = r2.contains(r0)
                qn2$o r0 = qn2.o.a
                java.util.EnumSet<qn2$o> r3 = r13.a
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L17
                r10.g(r2)
            L17:
                qn2$o r0 = qn2.o.c
                java.util.EnumSet<qn2$o> r3 = r13.a
                boolean r0 = r3.contains(r0)
                r3 = 0
                if (r0 == 0) goto L2f
                java.util.concurrent.atomic.AtomicInteger r0 = r10.count
                int r0 = r0.get()
                if (r0 != 0) goto L2f
                java.lang.Object r10 = r13.b(r3, r3, r3)
                return r10
            L2f:
                r10.lock()
                qn2$h<K, V>[] r0 = r10.references     // Catch: java.lang.Throwable -> L85
                int r0 = r0.length     // Catch: java.lang.Throwable -> L85
                int r0 = r0 + (-1)
                r9 = r11 & r0
                qn2$h<K, V>[] r0 = r10.references     // Catch: java.lang.Throwable -> L85
                r8 = r0[r9]     // Catch: java.lang.Throwable -> L85
                r0 = r8
            L3e:
                if (r0 == 0) goto L5c
                int r4 = r0.a()     // Catch: java.lang.Throwable -> L64
                if (r4 != r11) goto L55
                qn2$e r4 = r0.get()     // Catch: java.lang.Throwable -> L64
                if (r4 == 0) goto L55
                K r4 = r4.a     // Catch: java.lang.Throwable -> L64
                boolean r4 = defpackage.w74.z(r4, r12)     // Catch: java.lang.Throwable -> L64
                if (r4 == 0) goto L55
                goto L5d
            L55:
                qn2$h r0 = r0.getNext()     // Catch: java.lang.Throwable -> L64
                goto L3e
            L5a:
                r5 = r10
                goto L88
            L5c:
                r0 = r3
            L5d:
                if (r0 == 0) goto L67
                qn2$e r3 = r0.get()     // Catch: java.lang.Throwable -> L64
                goto L67
            L64:
                r0 = move-exception
                r11 = r0
                goto L5a
            L67:
                rn2 r4 = new rn2     // Catch: java.lang.Throwable -> L85
                r5 = r10
                r7 = r11
                r6 = r12
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L82
                java.lang.Object r10 = r13.b(r0, r3, r4)     // Catch: java.lang.Throwable -> L82
                r5.unlock()
                java.util.EnumSet<qn2$o> r11 = r13.a
                boolean r11 = r11.contains(r1)
                if (r11 == 0) goto L81
                r5.g(r2)
            L81:
                return r10
            L82:
                r0 = move-exception
            L83:
                r11 = r0
                goto L88
            L85:
                r0 = move-exception
                r5 = r10
                goto L83
            L88:
                r5.unlock()
                java.util.EnumSet<qn2$o> r10 = r13.a
                boolean r10 = r10.contains(r1)
                if (r10 == 0) goto L96
                r5.g(r2)
            L96:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: qn2.l.d(int, java.lang.Object, qn2$n):java.lang.Object");
        }

        public final int e() {
            return this.count.get();
        }

        @Nullable
        public final h<K, V> f(@Nullable Object obj, int i, k kVar) {
            e<K, V> eVar;
            if (kVar == k.a) {
                g(false);
            }
            if (this.count.get() == 0) {
                return null;
            }
            for (h<K, V> next = this.references[(r1.length - 1) & i]; next != null; next = next.getNext()) {
                if (next.a() == i && (eVar = next.get()) != null && w74.z(eVar.a, obj)) {
                    return next;
                }
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
        public final void g(boolean z) {
            boolean z2;
            e<K, V> eVar;
            int i = this.count.get();
            boolean z3 = z && i > 0 && i >= this.resizeThreshold;
            h hVar = (h) this.referenceManager.a.poll();
            if (hVar != null || z3) {
                lock();
                try {
                    int i2 = this.count.get();
                    ?? hashSet = Collections.EMPTY_SET;
                    if (hVar != null) {
                        hashSet = new HashSet();
                        while (hVar != null) {
                            hashSet.add(hVar);
                            hVar = (h) this.referenceManager.a.poll();
                        }
                    }
                    int size = i2 - hashSet.size();
                    boolean z4 = size > 0 && size >= this.resizeThreshold;
                    int length = this.references.length;
                    if (z && z4 && length < 1073741824) {
                        length <<= 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    h<K, V>[] hVarArr = z2 ? new h[length] : this.references;
                    for (int i3 = 0; i3 < this.references.length; i3++) {
                        if (!z2) {
                            hVarArr[i3] = null;
                        }
                        for (h<K, V> next = this.references[i3]; next != null; next = next.getNext()) {
                            if (!hashSet.contains(next) && (eVar = next.get()) != null) {
                                int iA = next.a() & (hVarArr.length - 1);
                                qn2<K, V>.i iVar = this.referenceManager;
                                int iA2 = next.a();
                                h<K, V> hVar2 = hVarArr[iA];
                                ReferenceQueue<e<K, V>> referenceQueue = iVar.a;
                                hVarArr[iA] = qn2.this.c == j.a ? new p<>(eVar, iA2, hVar2, referenceQueue) : new m<>(eVar, iA2, hVar2, referenceQueue);
                            }
                        }
                    }
                    if (z2) {
                        this.references = hVarArr;
                        this.resizeThreshold = (int) (this.references.length * qn2.this.b);
                    }
                    this.count.set(Math.max(size, 0));
                    unlock();
                } catch (Throwable th) {
                    unlock();
                    throw th;
                }
            }
        }
    }

    public static final class m<K, V> extends SoftReference<e<K, V>> implements h<K, V> {
        public final int a;

        @Nullable
        public final h<K, V> b;

        public m(e<K, V> eVar, int i, @Nullable h<K, V> hVar, ReferenceQueue<e<K, V>> referenceQueue) {
            super(eVar, referenceQueue);
            this.a = i;
            this.b = hVar;
        }

        @Override // qn2.h
        public final int a() {
            return this.a;
        }

        @Override // java.lang.ref.SoftReference, java.lang.ref.Reference, qn2.h
        public final /* bridge */ /* synthetic */ e get() {
            return get();
        }

        @Override // qn2.h
        @Nullable
        public final h<K, V> getNext() {
            return this.b;
        }

        @Override // qn2.h
        public final void release() {
            enqueue();
            clear();
        }
    }

    public abstract class n<T> {
        public final EnumSet<o> a;

        public n(o... oVarArr) {
            this.a = oVarArr.length == 0 ? EnumSet.noneOf(o.class) : EnumSet.of(oVarArr[0], oVarArr);
        }

        @Nullable
        public T a(@Nullable h<K, V> hVar, @Nullable e<K, V> eVar) {
            return null;
        }

        @Nullable
        public Object b(@Nullable h hVar, @Nullable e eVar, @Nullable rn2 rn2Var) {
            return a(hVar, eVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class o {
        public static final o a;
        public static final o b;
        public static final o c;
        public static final o d;
        public static final /* synthetic */ o[] e;

        static {
            o oVar = new o("RESTRUCTURE_BEFORE", 0);
            a = oVar;
            o oVar2 = new o("RESTRUCTURE_AFTER", 1);
            b = oVar2;
            o oVar3 = new o("SKIP_IF_EMPTY", 2);
            c = oVar3;
            o oVar4 = new o("RESIZE", 3);
            d = oVar4;
            e = new o[]{oVar, oVar2, oVar3, oVar4};
        }

        public o() {
            throw null;
        }

        public static o valueOf(String str) {
            return (o) Enum.valueOf(o.class, str);
        }

        public static o[] values() {
            return (o[]) e.clone();
        }
    }

    public static final class p<K, V> extends WeakReference<e<K, V>> implements h<K, V> {
        public final int a;

        @Nullable
        public final h<K, V> b;

        public p(e<K, V> eVar, int i, @Nullable h<K, V> hVar, ReferenceQueue<e<K, V>> referenceQueue) {
            super(eVar, referenceQueue);
            this.a = i;
            this.b = hVar;
        }

        @Override // qn2.h
        public final int a() {
            return this.a;
        }

        @Override // java.lang.ref.Reference, qn2.h
        public final /* bridge */ /* synthetic */ e get() {
            return get();
        }

        @Override // qn2.h
        @Nullable
        public final h<K, V> getNext() {
            return this.b;
        }

        @Override // qn2.h
        public final void release() {
            enqueue();
            clear();
        }
    }

    public qn2() {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16 && i3 < 65536) {
            i3 <<= 1;
            i2++;
        }
        this.d = i2;
        int i4 = 1 << i2;
        this.c = j.a;
        int i5 = (int) ((((long) (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT + i4)) - 1) / ((long) i4));
        int i6 = 0;
        int i7 = 1;
        while (i7 < i5 && i7 < 1073741824) {
            i7 <<= 1;
            i6++;
        }
        int i8 = 1 << i6;
        qn2<K, V>.l[] lVarArr = (l[]) Array.newInstance((Class<?>) l.class, i4);
        int i9 = (int) (i8 * 0.75f);
        for (int i10 = 0; i10 < lVarArr.length; i10++) {
            lVarArr[i10] = new l(i8, i9);
        }
        this.a = lVarArr;
    }

    public static int a(@Nullable Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = iHashCode + ((iHashCode << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (qn2<K, V>.l lVar : this.a) {
            lVar.c();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        int iA = a(obj);
        int i2 = iA >>> (32 - this.d);
        qn2<K, V>.l[] lVarArr = this.a;
        h<K, V> hVarF = lVarArr[i2 & (lVarArr.length - 1)].f(obj, iA, k.a);
        e<K, V> eVar = hVarF != null ? hVarF.get() : null;
        return eVar != null && w74.z(eVar.a, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g gVar = this.e;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g();
        this.e = gVar2;
        return gVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V get(@Nullable Object obj) {
        k kVar = k.a;
        int iA = a(obj);
        h<K, V> hVarF = this.a[(iA >>> (32 - this.d)) & (r2.length - 1)].f(obj, iA, kVar);
        e<K, V> eVar = hVarF != null ? hVarF.get() : null;
        if (eVar != null) {
            return eVar.b;
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @Nullable
    public final V getOrDefault(@Nullable Object obj, @Nullable V v) {
        k kVar = k.a;
        int iA = a(obj);
        h<K, V> hVarF = this.a[(iA >>> (32 - this.d)) & (r2.length - 1)].f(obj, iA, kVar);
        e<K, V> eVar = hVarF != null ? hVarF.get() : null;
        return eVar != null ? eVar.b : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        for (qn2<K, V>.l lVar : this.a) {
            if (lVar.e() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V put(@Nullable K k2, @Nullable V v) {
        pn2 pn2Var = new pn2(new o[]{o.a, o.d}, true, v);
        int iA = a(k2);
        int i2 = iA >>> (32 - this.d);
        qn2<K, V>.l[] lVarArr = this.a;
        return (V) lVarArr[i2 & (lVarArr.length - 1)].d(iA, k2, pn2Var);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @Nullable
    public final V putIfAbsent(@Nullable K k2, @Nullable V v) {
        pn2 pn2Var = new pn2(new o[]{o.a, o.d}, false, v);
        int iA = a(k2);
        int i2 = iA >>> (32 - this.d);
        return (V) this.a[i2 & (r3.length - 1)].d(iA, k2, pn2Var);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(@Nullable Object obj, @Nullable Object obj2) {
        b bVar = new b(new o[]{o.b, o.c}, obj2);
        int iA = a(obj);
        int i2 = iA >>> (32 - this.d);
        return Boolean.TRUE.equals((Boolean) this.a[i2 & (r3.length - 1)].d(iA, obj, bVar));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(@Nullable K k2, @Nullable V v, @Nullable V v2) {
        c cVar = new c(new o[]{o.a, o.c}, v, v2);
        int iA = a(k2);
        int i2 = iA >>> (32 - this.d);
        return Boolean.TRUE.equals((Boolean) this.a[i2 & (r3.length - 1)].d(iA, k2, cVar));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        int iE = 0;
        for (qn2<K, V>.l lVar : this.a) {
            iE += lVar.e();
        }
        return iE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public final V remove(@Nullable Object obj) {
        a aVar = new a(o.b, o.c);
        int iA = a(obj);
        int i2 = iA >>> (32 - this.d);
        return (V) this.a[i2 & (r4.length - 1)].d(iA, obj, aVar);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @Nullable
    public final V replace(@Nullable K k2, @Nullable V v) {
        d dVar = new d(new o[]{o.a, o.c}, v);
        int iA = a(k2);
        int i2 = iA >>> (32 - this.d);
        return (V) this.a[i2 & (r3.length - 1)].d(iA, k2, dVar);
    }
}
