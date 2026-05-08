package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class kcb {
    public static final jte a = new jte(new sz0(8));
    public static final jcb b = new jcb();

    public static final void a(wcf wcfVar, Context context, boolean z, CharSequence charSequence, kjf kjfVar, dcb dcbVar, Function1<? super wcf, j6g> function1) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && kjfVar != null && dcbVar != null && (dcbVar instanceof icb)) {
            ((icb) dcbVar).d(wcfVar, charSequence, kjfVar.a, function1);
            gob.a(wcfVar, context, z, charSequence, kjfVar.a);
            return;
        }
        function1.invoke(wcfVar);
        if (charSequence == null || kjfVar == null) {
            return;
        }
        gob.a(wcfVar, context, z, charSequence, kjfVar.a);
    }

    public static final dcb b(o2e o2eVar, b19 b19Var, b bVar, int i) {
        bVar.L(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            bVar.F();
            return null;
        }
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        v03 v03Var = (v03) bVar.M(a);
        boolean zK = ((((i & 112) ^ 48) > 32 && bVar.K(b19Var)) || (i & 48) == 32) | bVar.K(v03Var) | bVar.K(context);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            b.getClass();
            objV = new icb(v03Var, context, o2eVar, b19Var);
            bVar.p(objV);
        }
        dcb dcbVar = (dcb) objV;
        bVar.F();
        return dcbVar;
    }
}
