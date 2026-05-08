package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class b4a<E> extends vae<E> implements jf8 {
    public final a4a<E> b;

    public static final class a implements Iterator<E>, ze8 {
        public int a = -1;
        public final s6e b;
        public final /* synthetic */ b4a<E> c;

        /* JADX INFO: renamed from: b4a$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1188}, m = "invokeSuspend")
        public static final class C0086a extends n7d implements Function2<t6e<? super E>, lu2<? super j6g>, Object> {
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            final /* synthetic */ b4a<E> this$0;
            final /* synthetic */ a this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0086a(b4a<E> b4aVar, a aVar, lu2<? super C0086a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = b4aVar;
                this.this$1 = aVar;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0086a c0086a = new C0086a(this.this$0, this.this$1, lu2Var);
                c0086a.L$0 = obj;
                return c0086a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, lu2<? super j6g> lu2Var) {
                return ((C0086a) create((t6e) obj, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:22:0x00a7). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:14:0x006b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:19:0x009b). Please report as a decompilation issue!!! */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) {
                /*
                    r20 = this;
                    r0 = r20
                    int r1 = r0.label
                    r2 = 0
                    r3 = 8
                    r4 = 1
                    if (r1 == 0) goto L32
                    if (r1 != r4) goto L2b
                    int r1 = r0.I$3
                    int r5 = r0.I$2
                    long r6 = r0.J$0
                    int r8 = r0.I$1
                    int r9 = r0.I$0
                    java.lang.Object r10 = r0.L$3
                    long[] r10 = (long[]) r10
                    java.lang.Object r11 = r0.L$2
                    b4a r11 = (defpackage.b4a) r11
                    java.lang.Object r12 = r0.L$1
                    b4a$a r12 = (b4a.a) r12
                    java.lang.Object r13 = r0.L$0
                    t6e r13 = (defpackage.t6e) r13
                    defpackage.r7d.b(r21)
                    goto L9b
                L2b:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r0)
                    r0 = 0
                    return r0
                L32:
                    defpackage.r7d.b(r21)
                    java.lang.Object r1 = r0.L$0
                    t6e r1 = (defpackage.t6e) r1
                    b4a<E> r5 = r0.this$0
                    a4a<E> r6 = r5.b
                    b4a$a r7 = r0.this$1
                    long[] r6 = r6.a
                    int r8 = r6.length
                    int r8 = r8 + (-2)
                    if (r8 < 0) goto Lac
                    r9 = r2
                L47:
                    r10 = r6[r9]
                    long r12 = ~r10
                    r14 = 7
                    long r12 = r12 << r14
                    long r12 = r12 & r10
                    r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r12 = r12 & r14
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 == 0) goto La7
                    int r12 = r9 - r8
                    int r12 = ~r12
                    int r12 = r12 >>> 31
                    int r12 = 8 - r12
                    r13 = r9
                    r9 = r8
                    r8 = r13
                    r13 = r1
                    r1 = r2
                    r18 = r10
                    r11 = r5
                    r10 = r6
                    r5 = r12
                    r12 = r7
                    r6 = r18
                L6b:
                    if (r1 >= r5) goto L9e
                    r14 = 255(0xff, double:1.26E-321)
                    long r14 = r14 & r6
                    r16 = 128(0x80, double:6.32E-322)
                    int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r14 >= 0) goto L9b
                    int r2 = r8 << 3
                    int r2 = r2 + r1
                    r12.a = r2
                    a4a<E> r3 = r11.b
                    java.lang.Object[] r3 = r3.b
                    r2 = r3[r2]
                    r0.L$0 = r13
                    r0.L$1 = r12
                    r0.L$2 = r11
                    r0.L$3 = r10
                    r0.I$0 = r9
                    r0.I$1 = r8
                    r0.J$0 = r6
                    r0.I$2 = r5
                    r0.I$3 = r1
                    r0.label = r4
                    r13.a(r0, r2)
                    g13 r0 = defpackage.g13.a
                    return r0
                L9b:
                    long r6 = r6 >> r3
                    int r1 = r1 + r4
                    goto L6b
                L9e:
                    if (r5 != r3) goto Lac
                    r1 = r9
                    r9 = r8
                    r8 = r1
                    r6 = r10
                    r5 = r11
                    r7 = r12
                    r1 = r13
                La7:
                    if (r9 == r8) goto Lac
                    int r9 = r9 + 1
                    goto L47
                Lac:
                    j6g r0 = defpackage.j6g.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: b4a.a.C0086a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(b4a<E> b4aVar) {
            this.c = b4aVar;
            this.b = q92.w(new C0086a(b4aVar, this, null));
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
                this.c.b.m(i);
                this.a = -1;
            }
        }
    }

    public b4a(a4a<E> a4aVar) {
        super(a4aVar);
        this.b = a4aVar;
    }

    @Override // defpackage.vae, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.b.d(e);
    }

    @Override // defpackage.vae, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        a4a<E> a4aVar = this.b;
        a4aVar.getClass();
        int i = a4aVar.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            a4aVar.k((E) it.next());
        }
        return i != a4aVar.d;
    }

    @Override // defpackage.vae, java.util.Set, java.util.Collection
    public final void clear() {
        this.b.e();
    }

    @Override // defpackage.vae, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new a(this);
    }

    @Override // defpackage.vae, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.b.l(obj);
    }

    @Override // defpackage.vae, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        collection.getClass();
        a4a<E> a4aVar = this.b;
        a4aVar.getClass();
        int i = a4aVar.d;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            a4aVar.i((E) it.next());
        }
        return i != a4aVar.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // defpackage.vae, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r17) {
        /*
            r16 = this;
            r17.getClass()
            r0 = r16
            a4a<E> r0 = r0.b
            r0.getClass()
            java.lang.Object[] r1 = r0.b
            int r2 = r0.d
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L59
            r6 = r5
        L17:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L54
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L31:
            if (r11 >= r9) goto L52
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L4e
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = defpackage.z92.I0(r13, r14)
            if (r13 != 0) goto L4e
            r0.m(r12)
        L4e:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L52:
            if (r9 != r10) goto L59
        L54:
            if (r6 == r4) goto L59
            int r6 = r6 + 1
            goto L17
        L59:
            int r0 = r0.d
            if (r2 == r0) goto L5f
            r0 = 1
            return r0
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b4a.retainAll(java.util.Collection):boolean");
    }
}
