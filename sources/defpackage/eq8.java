package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class eq8 {
    public final e13 a;
    public final wc6 b;
    public final qq c;
    public jf5<Float> d;
    public jf5<lh7> e;
    public jf5<Float> f;
    public boolean g;
    public final g4a h;
    public final g4a i;
    public final g4a j;
    public final g4a k;
    public long l;
    public long m;
    public xc6 n;
    public final zb0<lh7, de0> o;
    public final zb0<Float, ce0> p;
    public final g4a q;
    public long r;

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return eq8.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zb0<Float, ce0> zb0Var = eq8.this.p;
                Float f = new Float(1.0f);
                this.label = 1;
                Object objE = zb0Var.e(this, f);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ xc6 $layer;
        final /* synthetic */ boolean $shouldResetValue;
        final /* synthetic */ jf5<Float> $spec;
        int label;
        final /* synthetic */ eq8 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, eq8 eq8Var, jf5<Float> jf5Var, xc6 xc6Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$shouldResetValue = z;
            this.this$0 = eq8Var;
            this.$spec = jf5Var;
            this.$layer = xc6Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:38|(3:(1:(1:(5:6|7|27|28|29)(2:10|11))(1:12))(4:14|41|15|(3:17|(0)|26))|39|24)|20|43|21|22|23) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        
            if (r12 == r4) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
        
            r9 = r11;
            r12 = r0;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L21
                if (r0 == r3) goto L1d
                if (r0 != r2) goto L16
                defpackage.r7d.b(r12)     // Catch: java.lang.Throwable -> L12
                r9 = r11
                goto L5d
            L12:
                r0 = move-exception
                r12 = r0
                r9 = r11
                goto L71
            L16:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r11)
                r11 = 0
                return r11
            L1d:
                defpackage.r7d.b(r12)     // Catch: java.lang.Throwable -> L12
                goto L3b
            L21:
                defpackage.r7d.b(r12)
                boolean r12 = r11.$shouldResetValue     // Catch: java.lang.Throwable -> L6a
                if (r12 == 0) goto L3b
                eq8 r12 = r11.this$0     // Catch: java.lang.Throwable -> L12
                zb0<java.lang.Float, ce0> r12 = r12.p     // Catch: java.lang.Throwable -> L12
                java.lang.Float r0 = new java.lang.Float     // Catch: java.lang.Throwable -> L12
                r5 = 0
                r0.<init>(r5)     // Catch: java.lang.Throwable -> L12
                r11.label = r3     // Catch: java.lang.Throwable -> L12
                java.lang.Object r12 = r12.e(r11, r0)     // Catch: java.lang.Throwable -> L12
                if (r12 != r4) goto L3b
                goto L5c
            L3b:
                eq8 r12 = r11.this$0     // Catch: java.lang.Throwable -> L6a
                zb0<java.lang.Float, ce0> r5 = r12.p     // Catch: java.lang.Throwable -> L6a
                java.lang.Float r6 = new java.lang.Float     // Catch: java.lang.Throwable -> L6d
                r12 = 1065353216(0x3f800000, float:1.0)
                r6.<init>(r12)     // Catch: java.lang.Throwable -> L6d
                jf5<java.lang.Float> r7 = r11.$spec     // Catch: java.lang.Throwable -> L6a
                xc6 r12 = r11.$layer     // Catch: java.lang.Throwable -> L6a
                eq8 r0 = r11.this$0     // Catch: java.lang.Throwable -> L6a
                mi r8 = new mi     // Catch: java.lang.Throwable -> L6a
                r3 = 3
                r8.<init>(r3, r12, r0)     // Catch: java.lang.Throwable -> L6a
                r11.label = r2     // Catch: java.lang.Throwable -> L6a
                r10 = 4
                r9 = r11
                java.lang.Object r12 = defpackage.zb0.c(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
                if (r12 != r4) goto L5d
            L5c:
                return r4
            L5d:
                wd0 r12 = (defpackage.wd0) r12     // Catch: java.lang.Throwable -> L67
                eq8 r11 = r9.this$0
                r11.d(r1)
                j6g r11 = defpackage.j6g.a
                return r11
            L67:
                r0 = move-exception
            L68:
                r12 = r0
                goto L71
            L6a:
                r0 = move-exception
                r9 = r11
                goto L68
            L6d:
                r0 = move-exception
                r9 = r11
                r11 = r0
                r12 = r11
            L71:
                eq8 r11 = r9.this$0
                r11.d(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: eq8.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {218}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return eq8.this.new c(lu2Var);
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
                zb0<lh7, de0> zb0Var = eq8.this.o;
                this.label = 1;
                Object objF = zb0Var.f(this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {222}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return eq8.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zb0<Float, ce0> zb0Var = eq8.this.p;
                this.label = 1;
                Object objF = zb0Var.f(this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend")
    public static final class e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public e(lu2<? super e> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return eq8.this.new e(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                zb0<Float, ce0> zb0Var = eq8.this.p;
                this.label = 1;
                Object objF = zb0Var.f(this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public eq8(e13 e13Var, wc6 wc6Var, qq qqVar) {
        this.a = e13Var;
        this.b = wc6Var;
        this.c = qqVar;
        Boolean bool = Boolean.FALSE;
        this.h = r.f(bool);
        this.i = r.f(bool);
        this.j = r.f(bool);
        this.k = r.f(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        Object obj = null;
        this.n = wc6Var != null ? wc6Var.b() : null;
        int i = 12;
        this.o = new zb0<>(new lh7(0L), q92.i0, obj, i);
        this.p = new zb0<>(Float.valueOf(1.0f), q92.c0, obj, i);
        this.q = r.f(new lh7(0L));
        this.r = 9223372034707292159L;
    }

    public final void a() {
        xc6 xc6Var = this.n;
        jf5<Float> jf5Var = this.d;
        boolean zBooleanValue = ((Boolean) ((gme) this.i).getValue()).booleanValue();
        e13 e13Var = this.a;
        if (zBooleanValue || jf5Var == null || xc6Var == null) {
            if (b()) {
                if (xc6Var != null) {
                    xc6Var.f(1.0f);
                }
                u63.Y(e13Var, null, null, new a(null), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z = !zB;
        if (!zB) {
            xc6Var.f(0.0f);
        }
        u63.Y(e13Var, null, null, new b(z, this, jf5Var, xc6Var, null), 3);
    }

    public final boolean b() {
        return ((Boolean) ((gme) this.j).getValue()).booleanValue();
    }

    public final void c() {
        wc6 wc6Var;
        boolean zBooleanValue = ((Boolean) ((gme) this.h).getValue()).booleanValue();
        e13 e13Var = this.a;
        if (zBooleanValue) {
            f(false);
            u63.Y(e13Var, null, null, new c(null), 3);
        }
        if (((Boolean) ((gme) this.i).getValue()).booleanValue()) {
            d(false);
            u63.Y(e13Var, null, null, new d(null), 3);
        }
        if (b()) {
            e(false);
            u63.Y(e13Var, null, null, new e(null), 3);
        }
        this.g = false;
        g(0L);
        this.l = 9223372034707292159L;
        xc6 xc6Var = this.n;
        if (xc6Var != null && (wc6Var = this.b) != null) {
            wc6Var.a(xc6Var);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(boolean z) {
        ((gme) this.i).setValue(Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        ((gme) this.j).setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        ((gme) this.h).setValue(Boolean.valueOf(z));
    }

    public final void g(long j) {
        ((gme) this.q).setValue(new lh7(j));
    }
}
