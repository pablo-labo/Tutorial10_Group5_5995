package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.lm8;
import defpackage.mj8;
import defpackage.mq2;
import defpackage.pl7;
import defpackage.tia;
import defpackage.ur0;
import defpackage.vf9;
import defpackage.x59;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface a extends lm8 {

    /* JADX INFO: renamed from: androidx.compose.ui.layout.a$a, reason: collision with other inner class name */
    public static final class C0022a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0022a(w wVar) {
            super(1);
            this.$this_run = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            aVar.r(this.$this_run, 0, 0, 0.0f);
            return j6g.a;
        }
    }

    default int J0(ur0 ur0Var, pl7 pl7Var, int i) {
        tia tiaVar = k().W;
        tiaVar.getClass();
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        if (!x59VarD1.F0()) {
            return pl7Var.w(i);
        }
        mq2.b(i, 0, 13);
        ur0Var.getLayoutDirection();
        return a0().getHeight();
    }

    bg9 a0();

    default int b0(ur0 ur0Var, pl7 pl7Var, int i) {
        tia tiaVar = k().W;
        tiaVar.getClass();
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        if (!x59VarD1.F0()) {
            return pl7Var.O(i);
        }
        mq2.b(0, i, 7);
        ur0Var.getLayoutDirection();
        return a0().getWidth();
    }

    default int c1(ur0 ur0Var, pl7 pl7Var, int i) {
        tia tiaVar = k().W;
        tiaVar.getClass();
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        if (!x59VarD1.F0()) {
            return pl7Var.P(i);
        }
        mq2.b(0, i, 7);
        ur0Var.getLayoutDirection();
        return a0().getWidth();
    }

    @Override // defpackage.lm8
    default bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new C0022a(wVarR));
    }

    boolean e1();

    default int z0(ur0 ur0Var, pl7 pl7Var, int i) {
        tia tiaVar = k().W;
        tiaVar.getClass();
        x59 x59VarD1 = tiaVar.d1();
        x59VarD1.getClass();
        if (!x59VarD1.F0()) {
            return pl7Var.K(i);
        }
        mq2.b(i, 0, 13);
        ur0Var.getLayoutDirection();
        return a0().getHeight();
    }
}
