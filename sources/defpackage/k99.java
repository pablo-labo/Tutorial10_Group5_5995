package defpackage;

import androidx.activity.ComponentActivity;
import com.indeed.android.jobsearch.LaunchActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class k99 extends mj8 implements gu5<irg> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k99(LaunchActivity launchActivity) {
        super(0);
        this.$this_viewModels = launchActivity;
    }

    @Override // defpackage.gu5
    public final irg invoke() {
        return this.$this_viewModels.getViewModelStore();
    }
}
