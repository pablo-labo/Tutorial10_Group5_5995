package defpackage;

import androidx.compose.runtime.r;
import defpackage.ge0;

/* JADX INFO: loaded from: classes.dex */
public final class ae0<T, V extends ge0> implements ese<T> {
    public final lvf<T, V> a;
    public final g4a b;
    public V c;
    public long d;
    public long e;
    public boolean f;

    public ae0(lvf<T, V> lvfVar, T t, V v, long j, long j2, boolean z) {
        V vInvoke;
        this.a = lvfVar;
        this.b = r.f(t);
        if (v != null) {
            vInvoke = (V) ewa.o(v);
        } else {
            vInvoke = lvfVar.a().invoke(t);
            vInvoke.d();
        }
        this.c = vInvoke;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    @Override // defpackage.ese
    public final T getValue() {
        return (T) ((gme) this.b).getValue();
    }

    public final T i() {
        return this.a.b().invoke(this.c);
    }

    public final String toString() {
        return "AnimationState(value=" + ((gme) this.b).getValue() + ", velocity=" + i() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ')';
    }

    public /* synthetic */ ae0(lvf lvfVar, Object obj, ge0 ge0Var, int i) {
        this(lvfVar, obj, (i & 4) != 0 ? null : ge0Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
