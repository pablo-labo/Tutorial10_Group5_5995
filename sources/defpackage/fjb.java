package defpackage;

import android.annotation.SuppressLint;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class fjb {

    @uh3(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ejb $backCallBack;
        final /* synthetic */ boolean $enabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ejb ejbVar, boolean z, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$backCallBack = ejbVar;
            this.$enabled = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$backCallBack, this.$enabled, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            vpa vpaVar;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ejb ejbVar = this.$backCallBack;
            boolean z = this.$enabled;
            if (!z && !ejbVar.g && ejbVar.a && (vpaVar = ejbVar.f) != null) {
                vpaVar.a();
            }
            ejbVar.f(z);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ ejb $backCallBack;
        final /* synthetic */ dqa $backDispatcher;
        final /* synthetic */ zv8 $lifecycleOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dqa dqaVar, zv8 zv8Var, ejb ejbVar) {
            super(1);
            this.$backDispatcher = dqaVar;
            this.$lifecycleOwner = zv8Var;
            this.$backCallBack = ejbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            this.$backDispatcher.a(this.$lifecycleOwner, this.$backCallBack);
            return new gjb(this.$backCallBack);
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<vi5<f71>, lu2<j6g>, Object> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z, Function2<vi5<f71>, ? super lu2<j6g>, ? extends Object> function2, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onBack = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            fjb.a(this.$enabled, this.$onBack, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    @SuppressLint({"RememberReturnType"})
    public static final void a(boolean z, Function2<vi5<f71>, ? super lu2<j6g>, ? extends Object> function2, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(-642000585);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            if (i4 != 0) {
                z = true;
            }
            g4a g4aVarG = r.g(function2, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = new e(new k(cVarH.l()));
                cVarH.p(objV);
            }
            e13 e13Var = ((e) objV).a;
            Object objV2 = cVarH.v();
            Object obj = objV2;
            if (objV2 == c0020a) {
                Function2<? super vi5<f71>, ? super lu2<? super j6g>, ? extends Object> function22 = (Function2) g4aVarG.getValue();
                ejb ejbVar = new ejb(z);
                ejbVar.d = e13Var;
                ejbVar.e = function22;
                cVarH.p(ejbVar);
                obj = ejbVar;
            }
            ejb ejbVar2 = (ejb) obj;
            boolean zK = cVarH.K((Function2) g4aVarG.getValue()) | cVarH.K(e13Var);
            Object objV3 = cVarH.v();
            if (zK || objV3 == c0020a) {
                ejbVar2.e = (Function2) g4aVarG.getValue();
                ejbVar2.d = e13Var;
                cVarH.p(j6g.a);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zX = cVarH.x(ejbVar2) | ((i3 & 14) == 4);
            Object objV4 = cVarH.v();
            if (zX || objV4 == c0020a) {
                objV4 = new a(ejbVar2, z, null);
                cVarH.p(objV4);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV4);
            hqa hqaVarA = s09.a(cVarH);
            if (hqaVarA == null) {
                r6.g("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            dqa dqaVarR = hqaVarA.r();
            zv8 zv8Var = (zv8) cVarH.M(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zX2 = cVarH.x(dqaVarR) | cVarH.x(zv8Var) | cVarH.x(ejbVar2);
            Object objV5 = cVarH.v();
            if (zX2 || objV5 == c0020a) {
                objV5 = new b(dqaVarR, zv8Var, ejbVar2);
                cVarH.p(objV5);
            }
            to4.a(zv8Var, dqaVarR, (Function1) objV5, cVarH);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(z, function2, i, i2);
        }
    }
}
