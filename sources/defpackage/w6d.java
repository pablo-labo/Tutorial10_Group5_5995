package defpackage;

import android.util.Log;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class w6d {

    @uh3(c = "com.indeed.android.messaging.ui.common.ResponsiveBadgeEarnedDialogKt$ResponsiveBadgeEarnedDialog$1$1", f = "ResponsiveBadgeEarnedDialog.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g4a<Boolean> $prevStatus$delegate;
        final /* synthetic */ i7d $responsivenessUiState;
        final /* synthetic */ g4a<Boolean> $showDialog$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i7d i7dVar, g4a<Boolean> g4aVar, g4a<Boolean> g4aVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$responsivenessUiState = i7dVar;
            this.$prevStatus$delegate = g4aVar;
            this.$showDialog$delegate = g4aVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$responsivenessUiState, this.$prevStatus$delegate, this.$showDialog$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ArrayList arrayList = lz2.a;
            Log.d("ResponsiveBadgeEarnedDialog", "responsivenessUiState.isEarned: " + this.$responsivenessUiState.b + ", prevStatus: " + this.$prevStatus$delegate.getValue().booleanValue(), null);
            i7d i7dVar = this.$responsivenessUiState;
            if (!i7dVar.e) {
                return j6g.a;
            }
            if (i7dVar.b && !this.$prevStatus$delegate.getValue().booleanValue()) {
                this.$showDialog$delegate.setValue(Boolean.TRUE);
            }
            this.$prevStatus$delegate.setValue(Boolean.valueOf(this.$responsivenessUiState.b));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final i7d i7dVar, b bVar, final int i) {
        int i2;
        i7dVar.getClass();
        boolean z = i7dVar.b;
        c cVarH = bVar.h(1960731608);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? cVarH.K(i7dVar) : cVarH.x(i7dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z2 = true;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.valueOf(z));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            Object objV2 = cVarH.v();
            if (objV2 == c0020a) {
                objV2 = r.f(Boolean.FALSE);
                cVarH.p(objV2);
            }
            g4a g4aVar2 = (g4a) objV2;
            Boolean boolValueOf = Boolean.valueOf(z);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !cVarH.x(i7dVar))) {
                z2 = false;
            }
            Object objV3 = cVarH.v();
            if (z2 || objV3 == c0020a) {
                objV3 = new a(i7dVar, g4aVar, g4aVar2, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, boolValueOf, (Function2) objV3);
            if (((Boolean) g4aVar2.getValue()).booleanValue()) {
                cVarH.L(600804993);
                Object objV4 = cVarH.v();
                if (objV4 == c0020a) {
                    objV4 = new ae(7, g4aVar2);
                    cVarH.p(objV4);
                }
                b((gu5) objV4, cVarH, 6);
            } else {
                cVarH.L(599181802);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: v6d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    w6d.a(i7dVar, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        c cVarH = bVar.h(1120685751);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            ku6.b(ak2.I(R.string.messaging_responsive_dialog_title, cVarH), ak2.I(R.string.messaging_responsive_dialog_content, cVarH), ak2.b, ak2.I(R.string.messaging_button_got_it, cVarH), null, gu5Var, gu5Var, null, "ResponsiveBadgeEarnedDialog", null, cVarH, 102433152, 656);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new mi3(i, gu5Var);
        }
    }
}
