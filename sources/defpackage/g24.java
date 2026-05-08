package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g24 {

    public static final class a implements l74 {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ f24 b;

        public a(Activity activity, f24 f24Var) {
            this.a = activity;
            this.b = f24Var;
        }

        @Override // defpackage.l74
        public final void dispose() {
            try {
                this.a.unregisterScreenCaptureCallback(this.b);
            } catch (Exception unused) {
                ArrayList arrayList = lz2.a;
                lz2.c("MyJobs_ScreenCapture", "Error unregistering screenshot callback", false, null, 12);
            }
        }
    }

    public static a a(Activity activity, gu5 gu5Var, m74 m74Var) {
        m74Var.getClass();
        f24 f24Var = new f24(gu5Var, 0);
        try {
            activity.registerScreenCaptureCallback(activity.getMainExecutor(), f24Var);
        } catch (Exception unused) {
            ArrayList arrayList = lz2.a;
            lz2.c("MyJobs_ScreenCapture", "Error registering screenshot callback", false, null, 12);
        }
        return new a(activity, f24Var);
    }

    public static final void b(gu5<j6g> gu5Var, b bVar, int i) {
        gu5Var.getClass();
        c cVarH = bVar.h(-1725252500);
        if (cVarH.o(i & 1, (i & 3) != 2)) {
            if (Build.VERSION.SDK_INT >= 34) {
                cVarH.L(876620455);
                Context context = (Context) cVarH.M(AndroidCompositionLocals_androidKt.b);
                if (context instanceof Activity) {
                    cVarH.L(876695227);
                    j6g j6gVar = j6g.a;
                    boolean zX = cVarH.x(context);
                    Object objV = cVarH.v();
                    if (zX || objV == b.a.a) {
                        objV = new qs0(4, (Activity) context, gu5Var);
                        cVarH.p(objV);
                    }
                    to4.b(j6gVar, (Function1) objV, cVarH);
                } else {
                    cVarH.L(876073398);
                }
                cVarH.U(false);
            } else {
                cVarH.L(876073398);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new e24(i, 0, gu5Var);
        }
    }
}
