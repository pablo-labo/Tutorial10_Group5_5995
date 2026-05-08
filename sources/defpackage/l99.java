package defpackage;

import androidx.activity.ComponentActivity;
import com.indeed.android.jobsearch.LaunchActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class l99 extends mj8 implements gu5<p63> {
    final /* synthetic */ gu5 $extrasProducer = null;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l99(LaunchActivity launchActivity) {
        super(0);
        this.$this_viewModels = launchActivity;
    }

    @Override // defpackage.gu5
    public final p63 invoke() {
        p63 p63Var;
        gu5 gu5Var = this.$extrasProducer;
        return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : p63Var;
    }
}
