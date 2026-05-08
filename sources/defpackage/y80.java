package defpackage;

import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class y80 implements l74 {
    public final /* synthetic */ tgb a;

    public y80(tgb tgbVar) {
        this.a = tgbVar;
    }

    @Override // defpackage.l74
    public final void dispose() {
        tgb tgbVar = this.a;
        tgbVar.e();
        tgbVar.setTag(R.id.view_tree_lifecycle_owner, null);
        tgbVar.f0.removeViewImmediate(tgbVar);
    }
}
