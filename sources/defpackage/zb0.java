package defpackage;

import androidx.compose.runtime.r;
import defpackage.ge0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zb0<T, V extends ge0> {
    public final lvf<T, V> a;
    public final T b;
    public final ae0<T, V> c;
    public final g4a d;
    public final g4a e;
    public final u4a f;
    public final vpe<T> g;
    public final V h;
    public final V i;
    public final V j;
    public final V k;

    @uh3(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ Object $targetValue;
        int label;
        final /* synthetic */ zb0<Object, ge0> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zb0<Object, ge0> zb0Var, Object obj, lu2<? super a> lu2Var) {
            super(1, lu2Var);
            this.this$0 = zb0Var;
            this.$targetValue = obj;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return new a(this.this$0, this.$targetValue, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((a) create(lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            zb0.b(this.this$0);
            Object objA = zb0.a(this.this$0, this.$targetValue);
            ((gme) this.this$0.c.b).setValue(objA);
            ((gme) this.this$0.e).setValue(objA);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zb0(Object obj, lvf lvfVar, Object obj2) {
        this.a = lvfVar;
        this.b = obj2;
        ae0<T, V> ae0Var = new ae0<>(lvfVar, obj, null, 60);
        this.c = ae0Var;
        this.d = r.f(Boolean.FALSE);
        this.e = r.f(obj);
        this.f = new u4a();
        this.g = new vpe<>(obj2, 3);
        V v = ae0Var.c;
        V v2 = v instanceof ce0 ? gc0.e : v instanceof de0 ? gc0.f : v instanceof ee0 ? gc0.g : gc0.h;
        v2.getClass();
        this.h = v2;
        V v3 = ae0Var.c;
        V v4 = v3 instanceof ce0 ? gc0.a : v3 instanceof de0 ? gc0.b : v3 instanceof ee0 ? gc0.c : gc0.d;
        v4.getClass();
        this.i = v4;
        this.j = v2;
        this.k = v4;
    }

    public static final Object a(zb0 zb0Var, Object obj) {
        lvf<T, V> lvfVar = zb0Var.a;
        V v = zb0Var.k;
        V v2 = zb0Var.j;
        if (!wl7.b(v2, zb0Var.h) || !wl7.b(v, zb0Var.i)) {
            V vInvoke = lvfVar.a().invoke(obj);
            int iB = vInvoke.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (vInvoke.a(i) < v2.a(i) || vInvoke.a(i) > v.a(i)) {
                    vInvoke.e(nic.B(vInvoke.a(i), v2.a(i), v.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return lvfVar.b().invoke(vInvoke);
            }
        }
        return obj;
    }

    public static final void b(zb0 zb0Var) {
        ae0<T, V> ae0Var = zb0Var.c;
        ae0Var.c.d();
        ae0Var.d = Long.MIN_VALUE;
        ((gme) zb0Var.d).setValue(Boolean.FALSE);
    }

    public static Object c(zb0 zb0Var, Object obj, yd0 yd0Var, Function1 function1, lu2 lu2Var, int i) {
        if ((i & 2) != 0) {
            yd0Var = zb0Var.g;
        }
        yd0 yd0Var2 = yd0Var;
        T tInvoke = zb0Var.a.b().invoke(zb0Var.c.c);
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        Object objD = zb0Var.d();
        lvf<T, V> lvfVar = zb0Var.a;
        return u4a.a(zb0Var.f, new yb0(zb0Var, tInvoke, new aaf(yd0Var2, lvfVar, objD, obj, lvfVar.a().invoke(tInvoke)), zb0Var.c.d, function12, null), lu2Var);
    }

    public final T d() {
        return (T) ((gme) this.c.b).getValue();
    }

    public final Object e(lu2 lu2Var, Object obj) {
        Object objA = u4a.a(this.f, new a(this, obj, null), lu2Var);
        return objA == g13.a ? objA : j6g.a;
    }

    public final Object f(c1f c1fVar) {
        Object objA = u4a.a(this.f, new ac0(this, null), c1fVar);
        return objA == g13.a ? objA : j6g.a;
    }

    public /* synthetic */ zb0(Object obj, lvf lvfVar, Object obj2, int i) {
        this(obj, lvfVar, (i & 4) != 0 ? null : obj2);
    }
}
