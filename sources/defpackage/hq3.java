package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hq3 implements nsd {
    public final Function1<Float, Float> a;
    public final b b = new b();
    public final y4a c = new y4a();
    public final g4a<Boolean> d;
    public final g4a<Boolean> e;
    public final g4a<Boolean> f;

    @uh3(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {198}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Function2<xrd, lu2<? super j6g>, Object> $block;
        final /* synthetic */ n4a $scrollPriority;
        int label;

        /* JADX INFO: renamed from: hq3$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {201}, m = "invokeSuspend")
        public static final class C0258a extends c1f implements Function2<xrd, lu2<? super j6g>, Object> {
            final /* synthetic */ Function2<xrd, lu2<? super j6g>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ hq3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0258a(hq3 hq3Var, Function2<? super xrd, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super C0258a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = hq3Var;
                this.$block = function2;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0258a c0258a = new C0258a(this.this$0, this.$block, lu2Var);
                c0258a.L$0 = obj;
                return c0258a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xrd xrdVar, lu2<? super j6g> lu2Var) {
                return ((C0258a) create(xrdVar, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v8, types: [j6g, java.lang.Object] */
            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                try {
                    if (i == 0) {
                        r7d.b(obj);
                        xrd xrdVar = (xrd) this.L$0;
                        ((gme) this.this$0.d).setValue(Boolean.TRUE);
                        Function2<xrd, lu2<? super j6g>, Object> function2 = this.$block;
                        this.label = 1;
                        Object objInvoke = function2.invoke(xrdVar, this);
                        g13 g13Var = g13.a;
                        if (objInvoke == g13Var) {
                            return g13Var;
                        }
                    } else {
                        if (i != 1) {
                            r6.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r7d.b(obj);
                    }
                    ((gme) this.this$0.d).setValue(Boolean.FALSE);
                    this = j6g.a;
                    return this;
                } catch (Throwable th) {
                    ((gme) this.this$0.d).setValue(Boolean.FALSE);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(n4a n4aVar, Function2<? super xrd, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$scrollPriority = n4aVar;
            this.$block = function2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return hq3.this.new a(this.$scrollPriority, this.$block, lu2Var);
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
                hq3 hq3Var = hq3.this;
                y4a y4aVar = hq3Var.c;
                b bVar = hq3Var.b;
                n4a n4aVar = this.$scrollPriority;
                C0258a c0258a = new C0258a(hq3Var, this.$block, null);
                this.label = 1;
                y4aVar.getClass();
                Object objD = f13.d(new x4a(n4aVar, y4aVar, c0258a, bVar, null), this);
                g13 g13Var = g13.a;
                if (objD == g13Var) {
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

    public static final class b implements xrd {
        public b() {
        }

        @Override // defpackage.xrd
        public final float e(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            hq3 hq3Var = hq3.this;
            float fFloatValue = hq3Var.a.invoke(Float.valueOf(f)).floatValue();
            ((gme) hq3Var.e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
            ((gme) hq3Var.f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hq3(Function1<? super Float, Float> function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = r.f(bool);
        this.e = r.f(bool);
        this.f = r.f(bool);
    }

    @Override // defpackage.nsd
    public final Object a(n4a n4aVar, Function2<? super xrd, ? super lu2<? super j6g>, ? extends Object> function2, lu2<? super j6g> lu2Var) {
        Object objD = f13.d(new a(n4aVar, function2, null), lu2Var);
        return objD == g13.a ? objD : j6g.a;
    }

    @Override // defpackage.nsd
    public final boolean b() {
        return ((Boolean) ((gme) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.nsd
    public final float e(float f) {
        return this.a.invoke(Float.valueOf(f)).floatValue();
    }
}
