package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class s09 {
    public static final ne4 a = new ne4(a.a);

    public static final class a extends mj8 implements gu5<hqa> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ hqa invoke() {
            return null;
        }
    }

    public static hqa a(b bVar) {
        hqa hqaVar = (hqa) bVar.M(a);
        Object obj = null;
        if (hqaVar == null) {
            bVar.L(544166745);
            View view = (View) bVar.M(AndroidCompositionLocals_androidKt.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    hqaVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                hqa hqaVar2 = tag instanceof hqa ? (hqa) tag : null;
                if (hqaVar2 != null) {
                    hqaVar = hqaVar2;
                    break;
                }
                Object objL = u63.L(view);
                view = objL instanceof View ? (View) objL : null;
            }
            bVar.F();
        } else {
            bVar.L(544164296);
            bVar.F();
        }
        if (hqaVar != null) {
            bVar.L(544164377);
            bVar.F();
            return hqaVar;
        }
        bVar.L(544168748);
        Context baseContext = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof hqa) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        hqa hqaVar3 = (hqa) obj;
        bVar.F();
        return hqaVar3;
    }
}
