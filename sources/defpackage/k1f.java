package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k1f extends e.c implements g1f, efb, iy3 {
    public Object d0;
    public Object e0;
    public PointerInputEventHandler f0;
    public uqe g0;
    public neb h0 = f1f.a;
    public final j4a<a<?>> i0;
    public final j4a j0;
    public final j4a<a<?>> k0;
    public neb l0;
    public long m0;

    public final class a<R> implements l61, iy3, lu2<R> {
        public final /* synthetic */ k1f a;
        public final qw1 b;
        public qw1 c;
        public peb d = peb.b;
        public final vr4 e = vr4.a;

        public a(qw1 qw1Var) {
            this.a = k1f.this;
            this.b = qw1Var;
        }

        @Override // defpackage.l61
        public final Object B1(peb pebVar, x81 x81Var) {
            qw1 qw1Var = new qw1(1, ewa.v(x81Var));
            qw1Var.q();
            this.d = pebVar;
            this.c = qw1Var;
            return qw1Var.p();
        }

        @Override // defpackage.iy3
        public final float C0(long j) {
            return this.a.C0(j);
        }

        @Override // defpackage.iy3
        public final long H(float f) {
            return this.a.H(f);
        }

        @Override // defpackage.iy3
        public final long I(long j) {
            return this.a.I(j);
        }

        @Override // defpackage.iy3
        public final long I1(long j) {
            return this.a.I1(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.l61
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object P1(long r5, defpackage.l8f r7, defpackage.lu2 r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof defpackage.j1f
                if (r0 == 0) goto L13
                r0 = r8
                j1f r0 = (defpackage.j1f) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L1a
            L13:
                j1f r0 = new j1f
                x81 r8 = (defpackage.x81) r8
                r0.<init>(r4, r8)
            L1a:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2e
                if (r1 != r3) goto L28
                defpackage.r7d.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                return r8
            L28:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                return r2
            L2e:
                defpackage.r7d.b(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r4 = r4.v1(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                g13 r5 = defpackage.g13.a
                if (r4 != r5) goto L3c
                return r5
            L3c:
                return r4
            L3d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: k1f.a.P1(long, l8f, lu2):java.lang.Object");
        }

        @Override // defpackage.l61
        public final neb Q0() {
            return k1f.this.h0;
        }

        @Override // defpackage.iy3
        public final float S(long j) {
            return this.a.S(j);
        }

        @Override // defpackage.l61
        public final long a() {
            return k1f.this.m0;
        }

        @Override // defpackage.iy3
        public final long d0(float f) {
            return this.a.d0(f);
        }

        @Override // defpackage.lu2
        public final v03 getContext() {
            return this.e;
        }

        @Override // defpackage.iy3
        public final float getDensity() {
            return this.a.getDensity();
        }

        @Override // defpackage.l61
        public final opg getViewConfiguration() {
            return us3.f(k1f.this).o0;
        }

        @Override // defpackage.iy3
        public final float k1(int i) {
            return this.a.k1(i);
        }

        @Override // defpackage.iy3
        public final float l1(float f) {
            return f / this.a.getDensity();
        }

        @Override // defpackage.iy3
        public final float p1() {
            return this.a.p1();
        }

        @Override // defpackage.l61
        public final long r0() {
            k1f k1fVar = k1f.this;
            long jI1 = k1fVar.I1(us3.f(k1fVar).o0.d());
            long j = k1fVar.m0;
            return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jI1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jI1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
        }

        @Override // defpackage.lu2
        public final void resumeWith(Object obj) {
            k1f k1fVar = k1f.this;
            synchronized (k1fVar.j0) {
                k1fVar.i0.j(this);
                j6g j6gVar = j6g.a;
            }
            this.b.resumeWith(obj);
        }

        @Override // defpackage.iy3
        public final float t1(float f) {
            return this.a.getDensity() * f;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // defpackage.l61
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object v1(long r8, kotlin.jvm.functions.Function2 r10, defpackage.pu2 r11) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r11 instanceof defpackage.h1f
                if (r0 == 0) goto L13
                r0 = r11
                h1f r0 = (defpackage.h1f) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                h1f r0 = new h1f
                r0.<init>(r7, r11)
            L18:
                java.lang.Object r11 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 != r3) goto L2c
                java.lang.Object r7 = r0.L$0
                ex7 r7 = (defpackage.ex7) r7
                defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L2a
                goto L6a
            L2a:
                r8 = move-exception
                goto L74
            L2c:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r7)
                return r2
            L32:
                defpackage.r7d.b(r11)
                r4 = 0
                int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r11 > 0) goto L4c
                qw1 r11 = r7.c
                if (r11 == 0) goto L4c
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r1 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r1.<init>(r8)
                o7d$a r4 = new o7d$a
                r4.<init>(r1)
                r11.resumeWith(r4)
            L4c:
                k1f r11 = defpackage.k1f.this
                e13 r11 = r11.Q1()
                i1f r1 = new i1f
                r1.<init>(r8, r7, r2)
                r8 = 3
                uqe r8 = defpackage.u63.Y(r11, r2, r2, r1, r8)
                r0.L$0 = r8     // Catch: java.lang.Throwable -> L70
                r0.label = r3     // Catch: java.lang.Throwable -> L70
                java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L70
                g13 r7 = defpackage.g13.a
                if (r11 != r7) goto L69
                return r7
            L69:
                r7 = r8
            L6a:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.a
                r7.h(r8)
                return r11
            L70:
                r7 = move-exception
                r6 = r8
                r8 = r7
                r7 = r6
            L74:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.a
                r7.h(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: k1f.a.v1(long, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
        }

        @Override // defpackage.iy3
        public final int x0(float f) {
            return this.a.x0(f);
        }

        @Override // defpackage.iy3
        public final int x1(long j) {
            return this.a.x1(j);
        }
    }

    public static final class b extends mj8 implements Function1<Throwable, j6g> {
        final /* synthetic */ a<R> $handlerCoroutine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.$handlerCoroutine = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            Throwable th2 = th;
            a<R> aVar = this.$handlerCoroutine;
            qw1 qw1Var = aVar.c;
            if (qw1Var != null) {
                qw1Var.g(th2);
            }
            aVar.c = null;
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", l = {718, 720}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return k1f.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                k1f.this.getClass();
                k1f k1fVar = k1f.this;
                PointerInputEventHandler pointerInputEventHandler = k1fVar.f0;
                this.label = 2;
                Object objInvoke = pointerInputEventHandler.invoke(k1fVar, this);
                g13 g13Var = g13.a;
                if (objInvoke == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public k1f(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = pointerInputEventHandler;
        j4a<a<?>> j4aVar = new j4a<>(new a[16]);
        this.i0 = j4aVar;
        this.j0 = j4aVar;
        this.k0 = new j4a<>(new a[16]);
        this.m0 = 0L;
    }

    @Override // defpackage.dfb
    public final void J1() {
        K0();
    }

    @Override // defpackage.g1f
    public final void K0() {
        uqe uqeVar = this.g0;
        if (uqeVar != null) {
            uqeVar.t(new PointerInputResetException());
            this.g0 = null;
        }
    }

    @Override // defpackage.dfb
    public final void R(neb nebVar, peb pebVar, long j) {
        this.m0 = j;
        if (pebVar == peb.a) {
            this.h0 = nebVar;
        }
        if (this.g0 == null) {
            this.g0 = u63.Y(Q1(), null, i13.d, new c(null), 1);
        }
        c2(nebVar, pebVar);
        List<yeb> list = nebVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                nebVar = null;
                break;
            } else if (!mh2.i(list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.l0 = nebVar;
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        K0();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c2(defpackage.neb r7, defpackage.peb r8) {
        /*
            r6 = this;
            j4a r0 = r6.j0
            monitor-enter(r0)
            j4a<k1f$a<?>> r1 = r6.k0     // Catch: java.lang.Throwable -> L6c
            j4a<k1f$a<?>> r2 = r6.i0     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.c     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            j4a<k1f$a<?>> r0 = r6.k0     // Catch: java.lang.Throwable -> L21
            int r3 = r0.c     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            T[] r0 = r0.a     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            k1f$a r2 = (k1f.a) r2     // Catch: java.lang.Throwable -> L21
            peb r4 = r2.d     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            qw1 r4 = r2.c     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.c = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            j4a<k1f$a<?>> r0 = r6.k0     // Catch: java.lang.Throwable -> L21
            T[] r2 = r0.a     // Catch: java.lang.Throwable -> L21
            int r0 = r0.c     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            k1f$a r4 = (k1f.a) r4     // Catch: java.lang.Throwable -> L21
            peb r5 = r4.d     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            qw1 r5 = r4.c     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.c = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            j4a<k1f$a<?>> r6 = r6.k0
            r6.g()
            return
        L66:
            j4a<k1f$a<?>> r6 = r6.k0
            r6.g()
            throw r7
        L6c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1f.c2(neb, peb):void");
    }

    @Override // defpackage.dfb
    public final void f1() {
        neb nebVar = this.l0;
        if (nebVar == null) {
            return;
        }
        List<yeb> list = nebVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    yeb yebVar = list.get(i2);
                    long j = yebVar.a;
                    long j2 = yebVar.c;
                    long j3 = yebVar.b;
                    float f = yebVar.e;
                    boolean z = yebVar.d;
                    arrayList.add(new yeb(j, j3, j2, false, f, j3, j2, z, z, yebVar.i, 0L));
                }
                neb nebVar2 = new neb(arrayList, null);
                this.h0 = nebVar2;
                c2(nebVar2, peb.a);
                c2(nebVar2, peb.b);
                c2(nebVar2, peb.c);
                this.l0 = null;
                return;
            }
        }
    }

    @Override // defpackage.iy3
    public final float getDensity() {
        return us3.f(this).m0.getDensity();
    }

    @Override // defpackage.efb
    public final opg getViewConfiguration() {
        return us3.f(this).o0;
    }

    @Override // defpackage.iy3
    public final float p1() {
        return us3.f(this).m0.p1();
    }

    @Override // defpackage.ts3
    public final void w() {
        K0();
    }

    @Override // defpackage.efb
    public final <R> Object w0(Function2<? super l61, ? super lu2<? super R>, ? extends Object> function2, lu2<? super R> lu2Var) {
        qw1 qw1Var = new qw1(1, ewa.v(lu2Var));
        qw1Var.q();
        a aVar = new a(qw1Var);
        synchronized (this.j0) {
            this.i0.b(aVar);
            new jjd(ewa.v(ewa.s(aVar, aVar, function2)), g13.a).resumeWith(j6g.a);
        }
        qw1Var.t(new b(aVar));
        return qw1Var.p();
    }
}
