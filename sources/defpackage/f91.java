package defpackage;

import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf91;", "Liw8;", "<init>", "()V", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f91 extends iw8 {
    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        g activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            activity = null;
        }
        if (activity != null) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            if (decorView != null) {
                Object systemService = decorView.getContext().getSystemService("input_method");
                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                if (inputMethodManager == null) {
                    return;
                }
                IBinder windowToken = decorView.getWindowToken();
                inputMethodManager.hideSoftInputFromWindow(windowToken, 1);
                inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
            }
        }
    }
}
