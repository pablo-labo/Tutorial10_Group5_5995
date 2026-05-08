package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class ja3 extends e.c implements eb4 {
    public final ei7 d0;
    public final g4a e0;

    @uh3(c = "com.indeed.android.jobsearch.util.CustomClickableIndicationNode$onAttach$1", f = "CustomClickableIndication.kt", l = {48}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: ja3$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.util.CustomClickableIndicationNode$onAttach$1$1", f = "CustomClickableIndication.kt", l = {}, m = "invokeSuspend")
        public static final class C0277a extends c1f implements Function2<ci7, lu2<? super j6g>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ja3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0277a(ja3 ja3Var, lu2<? super C0277a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ja3Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0277a c0277a = new C0277a(this.this$0, lu2Var);
                c0277a.L$0 = obj;
                return c0277a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ci7 ci7Var, lu2<? super j6g> lu2Var) {
                return ((C0277a) create(ci7Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                ci7 ci7Var = (ci7) this.L$0;
                if (this.label != 0) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                ((gme) this.this$0.e0).setValue(Boolean.valueOf(ci7Var instanceof hmb.b));
                return j6g.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ja3.this.new a(lu2Var);
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
                nde ndeVarB = ja3.this.d0.b();
                C0277a c0277a = new C0277a(ja3.this, null);
                this.label = 1;
                Object objQ = wg2.q(ndeVarB, c0277a, this);
                g13 g13Var = g13.a;
                if (objQ == g13Var) {
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

    public ja3(ei7 ei7Var) {
        ei7Var.getClass();
        this.d0 = ei7Var;
        this.e0 = r.f(Boolean.FALSE);
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        u63.Y(Q1(), null, null, new a(null), 3);
    }

    @Override // defpackage.eb4
    public final void i1() {
    }

    @Override // defpackage.eb4
    public final void y(sm8 sm8Var) {
        ax1 ax1Var = sm8Var.a;
        sm8Var.N1();
        if (((Boolean) ((gme) this.e0).getValue()).booleanValue()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-sm8Var.t1(8.0f))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            bwe bweVar = new bwe(sm8Var.t1(1.0f), 0.0f, 0, 0, null, 30);
            long j = eu6.c;
            float fT1 = sm8Var.t1(8.0f);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(sm8Var.t1(8.0f))) & 4294967295L) | (Float.floatToRawIntBits(fT1) << 32);
            float fT12 = sm8Var.t1(8.0f) + Float.intBitsToFloat((int) (ax1Var.c() >> 32));
            sm8Var.p0(j, (224 & 2) != 0 ? 0L : jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ax1Var.c() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fT12) << 32), jFloatToRawIntBits2, bweVar);
        }
    }
}
