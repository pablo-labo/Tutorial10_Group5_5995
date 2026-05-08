package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.g;
import androidx.navigation.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.o97;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ak7 {

    @uh3(c = "com.indeed.android.myjobs.presentation.components.interviewprep.InterviewPrepBannerKt$InterviewPrepBannerContent$1$1", f = "InterviewPrepBanner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$source = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$source, lu2Var);
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
            Function1<lx5, j6g> function1 = c05.a;
            c05.c(this.$source, new vg(7));
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, b bVar, int i) {
        i iVarW;
        Function2<? super b, ? super Integer, j6g> eyVar;
        c cVarH = bVar.h(1341495720);
        int i2 = 2;
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            Long lH = ((kq7) cr8.p(kq7.class)).h(0L, "interview_prep", "banner_dismissed");
            long jLongValue = lH != null ? lH.longValue() : 0L;
            boolean z = jLongValue > 0 && System.currentTimeMillis() - jLongValue < 1209600000;
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.valueOf(!z));
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            if (!((Boolean) g4aVar.getValue()).booleanValue()) {
                iVarW = cVarH.W();
                if (iVarW != null) {
                    eyVar = new pe(str, i, 4);
                    iVarW.d = eyVar;
                }
                return;
            }
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            g gVar = context instanceof g ? (g) context : null;
            iba ibaVarB = q92.B(new s[0], cVarH);
            Object objV2 = cVarH.v();
            int i3 = 6;
            if (objV2 == c0020a) {
                objV2 = new qe(i3, str, g4aVar);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX = cVarH.x(gVar) | cVarH.x(ibaVarB);
            Object objV3 = cVarH.v();
            if (zX || objV3 == c0020a) {
                objV3 = new nw0(i2, gVar, str, ibaVarB);
                cVarH.p(objV3);
            }
            b(str, gu5Var, (gu5) objV3, cVarH, 6);
        } else {
            cVarH.D();
        }
        iVarW = cVarH.W();
        if (iVarW != null) {
            eyVar = new ey(str, i, 3);
            iVarW.d = eyVar;
        }
    }

    public static final void b(String str, gu5<j6g> gu5Var, gu5<j6g> gu5Var2, b bVar, int i) {
        c cVar;
        c cVarH = bVar.h(-630557551);
        int i2 = (cVarH.x(gu5Var) ? 32 : 16) | i | (cVarH.x(gu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        int i3 = 1;
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            o97 o97Var = (o97) cVarH.M(p97.a);
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new a(str, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, str, (Function2) objV);
            e eVarF = androidx.compose.foundation.layout.g.f(e.a.b, 1.0f);
            o97.g gVar = o97Var.i;
            ay1.b(f.j(eVarF, 16.0f, 16.0f, 16.0f, 0.0f, 8), ggd.a(o97Var.h.b), wx1.a(o97Var.c.b.a, 0L, 0L, 0L, cVarH, 14), null, null, bh2.c(422905951, new qy4(o97Var, gu5Var2, gu5Var, i3), cVarH), cVarH, 196608, 24);
            cVar = cVarH;
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new zj7(i, gu5Var, gu5Var2, str);
        }
    }
}
