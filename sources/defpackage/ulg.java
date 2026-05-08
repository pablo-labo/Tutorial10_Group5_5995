package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ulg<K, V> implements Collection<V>, ze8 {
    public final knd<K, V> a;

    @uh3(c = "androidx.collection.Values$iterator$1", f = "ScatterMap.kt", l = {1446}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<t6e<? super V>, lu2<? super j6g>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ulg<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ulg<K, V> ulgVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ulgVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
            return ((a) create((t6e) obj, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0063). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:19:0x008b). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                int r1 = r0.label
                r2 = 0
                r3 = 8
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 != r4) goto L26
                int r1 = r0.I$3
                int r5 = r0.I$2
                long r6 = r0.J$0
                int r8 = r0.I$1
                int r9 = r0.I$0
                java.lang.Object r10 = r0.L$2
                long[] r10 = (long[]) r10
                java.lang.Object r11 = r0.L$1
                java.lang.Object[] r11 = (java.lang.Object[]) r11
                java.lang.Object r12 = r0.L$0
                t6e r12 = (defpackage.t6e) r12
                defpackage.r7d.b(r20)
                goto L8b
            L26:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r0)
                r0 = 0
                return r0
            L2d:
                defpackage.r7d.b(r20)
                java.lang.Object r1 = r0.L$0
                t6e r1 = (defpackage.t6e) r1
                ulg<K, V> r5 = r0.this$0
                knd<K, V> r5 = r5.a
                java.lang.Object[] r6 = r5.c
                long[] r5 = r5.a
                int r7 = r5.length
                int r7 = r7 + (-2)
                if (r7 < 0) goto L99
                r8 = r2
            L42:
                r9 = r5[r8]
                long r11 = ~r9
                r13 = 7
                long r11 = r11 << r13
                long r11 = r11 & r9
                r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r11 = r11 & r13
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 == 0) goto L94
                int r11 = r8 - r7
                int r11 = ~r11
                int r11 = r11 >>> 31
                int r11 = 8 - r11
                r12 = r1
                r1 = r2
                r17 = r9
                r10 = r5
                r9 = r7
                r5 = r11
                r11 = r6
                r6 = r17
            L63:
                if (r1 >= r5) goto L8e
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r6
                r15 = 128(0x80, double:6.32E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L8b
                int r2 = r8 << 3
                int r2 = r2 + r1
                r2 = r11[r2]
                r0.L$0 = r12
                r0.L$1 = r11
                r0.L$2 = r10
                r0.I$0 = r9
                r0.I$1 = r8
                r0.J$0 = r6
                r0.I$2 = r5
                r0.I$3 = r1
                r0.label = r4
                r12.a(r0, r2)
                g13 r0 = defpackage.g13.a
                return r0
            L8b:
                long r6 = r6 >> r3
                int r1 = r1 + r4
                goto L63
            L8e:
                if (r5 != r3) goto L99
                r7 = r9
                r5 = r10
                r6 = r11
                r1 = r12
            L94:
                if (r8 == r7) goto L99
                int r8 = r8 + 1
                goto L42
            L99:
                j6g r0 = defpackage.j6g.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ulg.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ulg(knd<K, V> kndVar) {
        kndVar.getClass();
        this.a = kndVar;
    }

    @Override // java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        collection.getClass();
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.a.c((V) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.e();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return q92.w(new a(this, null));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super V> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.e;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) q92.F(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return q92.E(this);
    }
}
