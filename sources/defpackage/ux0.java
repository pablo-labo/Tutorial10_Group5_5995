package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import com.indeed.android.jobsearch.LaunchActivity;
import com.indeed.android.jobsearch.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ux0 {
    public final /* synthetic */ int a;
    public final Object b;

    public ux0() {
        this.a = 2;
        this.b = new HashMap();
        new HashMap();
    }

    public void a() {
        ((dm2) this.b).getClass();
    }

    public void b() {
        int i;
        TypedValue typedValue = new TypedValue();
        LaunchActivity launchActivity = (LaunchActivity) this.b;
        Resources.Theme theme = launchActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        launchActivity.setTheme(i);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return w40.f(new StringBuilder("<"), (String) this.b, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ux0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
