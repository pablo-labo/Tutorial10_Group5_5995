package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.jobsearch.R;
import defpackage.kpg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv81;", "Lt81;", "<init>", "()V", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class v81 extends t81 {
    public static final /* synthetic */ qf8<Object>[] i0 = {fwc.a.e(new w3a(v81.class, "binding", "getBinding()Lcom/indeed/android/jsmappservices/databinding/BaseDialogFragmentBinding;", 0))};
    public final wm2 h0 = new wm2();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.base_dialog_fragment, viewGroup, false);
        if (viewInflate == null) {
            ja.k("rootView");
            return null;
        }
        ComposeView composeView = (ComposeView) viewInflate;
        c91 c91Var = new c91(composeView, composeView);
        qf8<Object>[] qf8VarArr = i0;
        qf8<Object> qf8Var = qf8VarArr[0];
        wm2 wm2Var = this.h0;
        wm2Var.d(qf8Var, this, c91Var);
        return ((c91) wm2Var.b(qf8VarArr[0], this)).a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        ComposeView composeView = ((c91) this.h0.b(i0[0], this)).b;
        composeView.setViewCompositionStrategy(kpg.a.a);
        composeView.setContent(new ah2(-751997888, new uw(this, 1), true));
    }
}
