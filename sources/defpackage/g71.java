package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g71 {

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ d $backCallback;
        final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, boolean z) {
            super(0);
            this.$backCallback = dVar;
            this.$enabled = z;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$backCallback.f(this.$enabled);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ d $backCallback;
        final /* synthetic */ dqa $backDispatcher;
        final /* synthetic */ zv8 $lifecycleOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dqa dqaVar, zv8 zv8Var, d dVar) {
            super(1);
            this.$backDispatcher = dqaVar;
            this.$lifecycleOwner = zv8Var;
            this.$backCallback = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            this.$backDispatcher.a(this.$lifecycleOwner, this.$backCallback);
            return new h71(this.$backCallback);
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ gu5<j6g> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, gu5 gu5Var, boolean z) {
            super(2);
            this.$enabled = z;
            this.$onBack = gu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            g71.a(this.$enabled, this.$onBack, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class d extends wpa {
        public final /* synthetic */ g4a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g4a g4aVar, boolean z) {
            super(z);
            this.d = g4aVar;
        }

        @Override // defpackage.wpa
        public final void b() {
            ((gu5) this.d.getValue()).invoke();
        }
    }

    public static final void a(boolean z, gu5<j6g> gu5Var, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(-361453782);
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
            i3 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            if (i4 != 0) {
                z = true;
            }
            g4a g4aVarG = r.g(gu5Var, cVarH);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = new d(g4aVarG, z);
                cVarH.p(objV);
            }
            d dVar = (d) objV;
            boolean z2 = (i3 & 14) == 4;
            Object objV2 = cVarH.v();
            if (z2 || objV2 == c0020a) {
                objV2 = new a(dVar, z);
                cVarH.p(objV2);
            }
            m74 m74Var = to4.a;
            cVarH.E((gu5) objV2);
            hqa hqaVarA = s09.a(cVarH);
            if (hqaVarA == null) {
                r6.g("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            dqa dqaVarR = hqaVarA.r();
            zv8 zv8Var = (zv8) cVarH.M(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zX = cVarH.x(dqaVarR) | cVarH.x(zv8Var);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                objV3 = new b(dqaVarR, zv8Var, dVar);
                cVarH.p(objV3);
            }
            to4.a(zv8Var, dqaVarR, (Function1) objV3, cVarH);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(i, i2, gu5Var, z);
        }
    }
}
