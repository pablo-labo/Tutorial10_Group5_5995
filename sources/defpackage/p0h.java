package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.facebook.react.views.view.WindowUtilKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p0h implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return WindowUtilKt.setStatusBarTranslucency$lambda$0(view, windowInsets);
    }
}
