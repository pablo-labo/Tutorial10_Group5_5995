package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class v5 {

    @uh3(c = "com.indeed.android.messaging.ui.common.AccessibilityAnnouncementKt$AccessibilityAnnouncement$2$1", f = "AccessibilityAnnouncement.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$context = context;
            this.$text = str;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$context, this.$text, lu2Var);
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
            Object systemService = this.$context.getSystemService("accessibility");
            systemService.getClass();
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent accessibilityEventA = u5.a();
                Context context = this.$context;
                String str = this.$text;
                accessibilityEventA.setEventType(16384);
                accessibilityEventA.setClassName(accessibilityEventA.getClass().getName());
                accessibilityEventA.setPackageName(context.getPackageName());
                accessibilityEventA.getText().add(str);
                accessibilityManager.sendAccessibilityEvent(accessibilityEventA);
            }
            return j6g.a;
        }
    }

    public static final void a(w5 w5Var, b bVar, int i) {
        String strK;
        c cVarH = bVar.h(2102265909);
        int i2 = (cVarH.d(w5Var == null ? -1 : w5Var.ordinal()) ? 4 : 2) | i;
        if (!cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            cVarH.D();
        } else {
            if (w5Var == null) {
                i iVarW = cVarH.W();
                if (iVarW != null) {
                    iVarW.d = new s5(w5Var, i, 0);
                    return;
                }
                return;
            }
            Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
            int iOrdinal = w5Var.ordinal();
            if (iOrdinal == 0) {
                strK = z3.k(cVarH, 1642926413, R.string.messaging_conversation_restored, cVarH, false);
            } else if (iOrdinal == 1) {
                strK = z3.k(cVarH, 1642918413, R.string.messaging_conversation_archived, cVarH, false);
            } else {
                if (iOrdinal != 2) {
                    cVarH.L(1642916282);
                    cVarH.U(false);
                    l.g();
                    return;
                }
                strK = z3.k(cVarH, 1642922418, R.string.messaging_conversation_moved_to_spam, cVarH, false);
            }
            boolean zX = cVarH.x(context) | cVarH.K(strK);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new a(context, strK, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, strK, (Function2) objV);
        }
        i iVarW2 = cVarH.W();
        if (iVarW2 != null) {
            iVarW2.d = new t5(w5Var, i, 0);
        }
    }
}
