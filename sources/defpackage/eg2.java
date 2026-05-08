package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.PreviewActivity;

/* JADX INFO: loaded from: classes.dex */
public final class eg2 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(PreviewActivity previewActivity, ah2 ah2Var) {
        View childAt = ((ViewGroup) previewActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(ah2Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(previewActivity, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(ah2Var);
        View decorView = previewActivity.getWindow().getDecorView();
        if (zte.a(decorView) == null) {
            decorView.setTag(com.indeed.android.jobsearch.R.id.view_tree_lifecycle_owner, previewActivity);
        }
        if (n7g.b(decorView) == null) {
            decorView.setTag(com.indeed.android.jobsearch.R.id.view_tree_view_model_store_owner, previewActivity);
        }
        if (esg.b(decorView) == null) {
            decorView.setTag(com.indeed.android.jobsearch.R.id.view_tree_saved_state_registry_owner, previewActivity);
        }
        previewActivity.setContentView(composeView2, a);
    }
}
