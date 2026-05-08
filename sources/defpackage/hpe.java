package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class hpe extends ux0 {
    public final gpe c;

    public hpe(LaunchActivity launchActivity) {
        super(launchActivity, 3);
        this.c = new gpe(this, launchActivity);
    }

    @Override // defpackage.ux0
    public final void b() {
        int i;
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Resources.Theme theme = launchActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            launchActivity.setTheme(i);
        }
        ((ViewGroup) launchActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.c);
    }
}
