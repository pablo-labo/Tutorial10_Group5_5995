package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {308}, m = "invokeSuspend")
public final class yb0 extends c1f implements Function1<lu2<? super wd0<Object, ge0>>, Object> {
    final /* synthetic */ sd0<Object, ge0> $animation;
    final /* synthetic */ Function1<zb0<Object, ge0>, j6g> $block;
    final /* synthetic */ Object $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ zb0<Object, ge0> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yb0(zb0<Object, ge0> zb0Var, Object obj, sd0<Object, ge0> sd0Var, long j, Function1<? super zb0<Object, ge0>, j6g> function1, lu2<? super yb0> lu2Var) {
        super(1, lu2Var);
        this.this$0 = zb0Var;
        this.$initialVelocity = obj;
        this.$animation = sd0Var;
        this.$startTime = j;
        this.$block = function1;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(lu2<?> lu2Var) {
        return new yb0(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(lu2<? super wd0<Object, ge0>> lu2Var) {
        return ((yb0) create(lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        ae0 ae0Var;
        huc hucVar;
        int i = this.label;
        try {
            if (i == 0) {
                r7d.b(obj);
                zb0<Object, ge0> zb0Var = this.this$0;
                zb0Var.c.c = (V) zb0Var.a.a().invoke(this.$initialVelocity);
                ((gme) this.this$0.e).setValue(this.$animation.g());
                ((gme) this.this$0.d).setValue(Boolean.TRUE);
                ae0<Object, V> ae0Var2 = this.this$0.c;
                final ae0 ae0Var3 = new ae0(ae0Var2.a, ((gme) ae0Var2.b).getValue(), ewa.o(ae0Var2.c), ae0Var2.d, Long.MIN_VALUE, ae0Var2.f);
                final huc hucVar2 = new huc();
                sd0<Object, ge0> sd0Var = this.$animation;
                long j = this.$startTime;
                final zb0<Object, ge0> zb0Var2 = this.this$0;
                final Function1<zb0<Object, ge0>, j6g> function1 = this.$block;
                Function1 function12 = new Function1() { // from class: xb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        xd0 xd0Var = (xd0) obj2;
                        zb0 zb0Var3 = zb0Var2;
                        x0f.i(xd0Var, zb0Var3.c);
                        gme gmeVar = (gme) xd0Var.e;
                        Object objA = zb0.a(zb0Var3, gmeVar.getValue());
                        boolean zB = wl7.b(objA, gmeVar.getValue());
                        Function1 function13 = function1;
                        if (!zB) {
                            ((gme) zb0Var3.c.b).setValue(objA);
                            ((gme) ae0Var3.b).setValue(objA);
                            if (function13 != null) {
                                function13.invoke(zb0Var3);
                            }
                            xd0Var.a();
                            hucVar2.element = true;
                        } else if (function13 != null) {
                            function13.invoke(zb0Var3);
                        }
                        return j6g.a;
                    }
                };
                this.L$0 = ae0Var3;
                this.L$1 = hucVar2;
                this.label = 1;
                Object objB = x0f.b(ae0Var3, sd0Var, j, function12, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
                ae0Var = ae0Var3;
                hucVar = hucVar2;
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hucVar = (huc) this.L$1;
                ae0Var = (ae0) this.L$0;
                r7d.b(obj);
            }
            ud0 ud0Var = hucVar.element ? ud0.a : ud0.b;
            zb0.b(this.this$0);
            return new wd0(ae0Var, ud0Var);
        } catch (CancellationException e) {
            zb0.b(this.this$0);
            throw e;
        }
    }
}
