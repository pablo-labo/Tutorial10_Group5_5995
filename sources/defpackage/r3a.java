package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r3a<E> extends uva<E> implements jf8 {
    public final q3a<E> b;

    public static final class a implements Iterator<E>, ze8 {
        public int a = -1;
        public final s6e b;
        public final /* synthetic */ r3a<E> c;

        /* JADX INFO: renamed from: r3a$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
        public static final class C0407a extends n7d implements Function2<t6e<? super E>, lu2<? super j6g>, Object> {
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ r3a<E> this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0407a(r3a<E> r3aVar, a aVar, lu2<? super C0407a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = r3aVar;
                this.this$1 = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0407a c0407a = new C0407a(this.this$0, this.this$1, lu2Var);
                c0407a.L$0 = obj;
                return c0407a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                return ((C0407a) create((t6e) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                t6e t6eVar;
                r3a<E> r3aVar;
                a aVar;
                long[] jArr;
                int i;
                int i2 = this.label;
                if (i2 == 0) {
                    r7d.b(obj);
                    t6eVar = (t6e) this.L$0;
                    r3aVar = this.this$0;
                    q3a<E> q3aVar = r3aVar.b;
                    aVar = this.this$1;
                    jArr = q3aVar.c;
                    i = q3aVar.e;
                } else {
                    if (i2 != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$0;
                    jArr = (long[]) this.L$3;
                    r3aVar = (r3a) this.L$2;
                    aVar = (a) this.L$1;
                    t6eVar = (t6e) this.L$0;
                    r7d.b(obj);
                }
                if (i == Integer.MAX_VALUE) {
                    return j6g.a;
                }
                int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                aVar.a = i;
                Object obj2 = r3aVar.b.b[i];
                this.L$0 = t6eVar;
                this.L$1 = aVar;
                this.L$2 = r3aVar;
                this.L$3 = jArr;
                this.I$0 = i3;
                this.label = 1;
                t6eVar.a(this, obj2);
                return g13.a;
            }
        }

        public a(r3a<E> r3aVar) {
            this.c = r3aVar;
            this.b = q92.w(new C0407a(r3aVar, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            return (E) this.b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.a;
            if (i != -1) {
                this.c.b.h(i);
                this.a = -1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3a(q3a<E> q3aVar) {
        super(q3aVar);
        q3aVar.getClass();
        this.b = q3aVar;
    }

    @Override // defpackage.uva, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.b.b(e);
    }

    @Override // defpackage.uva, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        q3a<E> q3aVar = this.b;
        q3aVar.getClass();
        int i = q3aVar.g;
        for (Object obj : collection) {
            int iD = q3aVar.d((E) obj);
            q3aVar.b[iD] = obj;
            long[] jArr = q3aVar.c;
            int i2 = q3aVar.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            q3aVar.d = iD;
            if (q3aVar.e == Integer.MAX_VALUE) {
                q3aVar.e = iD;
            }
        }
        return i != q3aVar.g;
    }

    @Override // defpackage.uva, java.util.Set, java.util.Collection
    public final void clear() {
        this.b.c();
    }

    @Override // defpackage.uva, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.uva, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // defpackage.uva, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r19) {
        /*
            r18 = this;
            r19.getClass()
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            q3a<E> r1 = r1.b
            r1.getClass()
            int r2 = r1.g
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L27
            int r6 = r3.hashCode()
            goto L28
        L27:
            r6 = r5
        L28:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r1.f
            int r6 = r6 >>> 7
            r6 = r6 & r8
        L36:
            long[] r9 = r1.a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r4
            r14 = r9[r10]
            int r9 = 64 - r11
            long r9 = r14 << r9
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r7
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r9
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L61:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L84
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r6
            r15 = r15 & r8
            r18 = r4
            java.lang.Object[] r4 = r1.b
            r4 = r4[r15]
            boolean r4 = defpackage.wl7.b(r4, r3)
            if (r4 == 0) goto L7c
            goto L90
        L7c:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r4 = r18
            goto L61
        L84:
            r18 = r4
            long r11 = ~r9
            r4 = 6
            long r11 = r11 << r4
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 == 0) goto L97
            r15 = -1
        L90:
            if (r15 < 0) goto L14
            r1.h(r15)
            goto L14
        L97:
            int r5 = r5 + 8
            int r6 = r6 + r5
            r6 = r6 & r8
            r4 = r18
            goto L36
        L9e:
            r18 = r4
            int r0 = r1.g
            if (r2 == r0) goto La5
            return r18
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3a.removeAll(java.util.Collection):boolean");
    }

    @Override // defpackage.uva, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        collection.getClass();
        return this.b.i(collection);
    }
}
