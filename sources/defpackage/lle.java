package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend")
public final class lle extends c1f implements Function2<e13, lu2<? super vd0<Float, ce0>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, j6g> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ xrd $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ ole this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lle(ole oleVar, float f, Function1<? super Float, j6g> function1, xrd xrdVar, lu2<? super lle> lu2Var) {
        super(2, lu2Var);
        this.this$0 = oleVar;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = function1;
        this.$this_fling = xrdVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new lle(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super vd0<Float, ce0>> lu2Var) {
        return ((lle) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        float f;
        float fSignum;
        iuc iucVar;
        Object objC;
        int i = this.label;
        int i2 = 0;
        g13 g13Var = g13.a;
        if (i == 0) {
            r7d.b(obj);
            float f2 = ((ce0) this.this$0.b.b().b(new ce0(0.0f), new ce0(this.$initialVelocity))).a;
            z1b z1bVar = this.this$0.a;
            float f3 = this.$initialVelocity;
            e2b e2bVar = (e2b) z1bVar.a;
            int iP = e2bVar.p();
            gme gmeVar = (gme) e2bVar.p;
            int i3 = ((t1b) gmeVar.getValue()).c + iP;
            if (i3 == 0) {
                fSignum = 0.0f;
                f = 0.0f;
            } else {
                int i4 = e2bVar.e;
                if (f3 < 0.0f) {
                    i4++;
                }
                int iC = nic.C(((int) (f2 / i3)) + i4, 0, e2bVar.o());
                e2bVar.p();
                int i5 = ((t1b) gmeVar.getValue()).c;
                long j = i4;
                long j2 = j - 1;
                f = 0.0f;
                int i6 = (int) (j2 < 0 ? 0L : j2);
                long j3 = j + 1;
                if (j3 > 2147483647L) {
                    j3 = 2147483647L;
                }
                int iAbs = Math.abs((nic.C(nic.C(iC, i6, (int) j3), 0, e2bVar.o()) - i4) * i3) - i3;
                if (iAbs < 0) {
                    iAbs = 0;
                }
                fSignum = iAbs == 0 ? iAbs : iAbs * Math.signum(f3);
            }
            if (Float.isNaN(fSignum)) {
                de7.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            iucVar = new iuc();
            float fSignum2 = Math.signum(this.$initialVelocity) * Math.abs(fSignum);
            iucVar.element = fSignum2;
            this.$onRemainingScrollOffsetUpdate.invoke(new Float(fSignum2));
            ole oleVar = this.this$0;
            xrd xrdVar = this.$this_fling;
            float f4 = iucVar.element;
            float f5 = this.$initialVelocity;
            zi ziVar = new zi(9, iucVar, this.$onRemainingScrollOffsetUpdate);
            this.L$0 = iucVar;
            this.label = 1;
            objC = ole.c(oleVar, xrdVar, f4, f5, ziVar, this);
            if (objC != g13Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                r7d.b(obj);
                return obj;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iuc iucVar2 = (iuc) this.L$0;
        r7d.b(obj);
        f = 0.0f;
        iucVar = iucVar2;
        objC = obj;
        ae0 ae0Var = (ae0) objC;
        z1b z1bVar2 = this.this$0.a;
        float fFloatValue = ((Number) ae0Var.i()).floatValue();
        e2b e2bVar2 = (e2b) z1bVar2.a;
        tle tleVarI = e2bVar2.n().i();
        List<k0b> listG = e2bVar2.n().g();
        int size = listG.size();
        float f6 = Float.POSITIVE_INFINITY;
        float f7 = Float.NEGATIVE_INFINITY;
        while (i2 < size) {
            k0b k0bVar = listG.get(i2);
            o1b o1bVarN = e2bVar2.n();
            float f8 = f;
            o1bVarN.a();
            dwa dwaVar = dwa.a;
            o1bVarN.b();
            e2bVar2.n().d();
            e2bVar2.n().c();
            e2bVar2.n().f();
            int offset = k0bVar.getOffset();
            e2bVar2.o();
            tleVarI.getClass();
            float f9 = offset - f8;
            if (f9 <= f8 && f9 > f7) {
                f7 = f9;
            }
            if (f9 >= f8 && f9 < f6) {
                f6 = f9;
            }
            i2++;
            f = f8;
        }
        float f10 = f;
        if (f7 == Float.NEGATIVE_INFINITY) {
            f7 = f6;
        }
        if (f6 == Float.POSITIVE_INFINITY) {
            f6 = f7;
        }
        if (!e2bVar2.d()) {
            if (ee3.q(e2bVar2, fFloatValue)) {
                f7 = f10;
                f6 = f7;
            } else {
                f6 = f10;
            }
        }
        if (!e2bVar2.c()) {
            f7 = f10;
            if (!ee3.q(e2bVar2, fFloatValue)) {
                f6 = f7;
            }
        }
        Pair pair = new Pair(Float.valueOf(f7), Float.valueOf(f6));
        float fFloatValue2 = ((Number) pair.a()).floatValue();
        float fFloatValue3 = ((Number) pair.b()).floatValue();
        float fFloatValue4 = ((Number) ((ie4) z1bVar2.b).q(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3))).floatValue();
        if (fFloatValue4 != fFloatValue2 && fFloatValue4 != fFloatValue3 && fFloatValue4 != f10) {
            de7.c("Final Snapping Offset Should Be one of " + fFloatValue2 + ", " + fFloatValue3 + " or 0.0");
        }
        if (fFloatValue4 == Float.POSITIVE_INFINITY || fFloatValue4 == Float.NEGATIVE_INFINITY) {
            fFloatValue4 = f10;
        }
        if (Float.isNaN(fFloatValue4)) {
            de7.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        iucVar.element = fFloatValue4;
        xrd xrdVar2 = this.$this_fling;
        ae0 ae0VarM = boa.m(ae0Var, f10, f10, 30);
        vpe vpeVar = this.this$0.c;
        df dfVar = new df(7, iucVar, this.$onRemainingScrollOffsetUpdate);
        this.L$0 = null;
        this.label = 2;
        Object objH = ewa.h(xrdVar2, fFloatValue4, fFloatValue4, ae0VarM, vpeVar, dfVar, this);
        return objH == g13Var ? g13Var : objH;
    }
}
