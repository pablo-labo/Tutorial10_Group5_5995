package defpackage;

import android.annotation.SuppressLint;
import androidx.compose.runtime.b;
import androidx.fragment.app.FragmentManager;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.google.android.material.bottomsheet.c;
import com.indeed.android.tare.broadcast.JSTBroadcast;
import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt81;", "Lcom/google/android/material/bottomsheet/c;", "<init>", "()V", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class t81 extends c {
    public final d2f g0 = new d2f(new as0(2));

    @Override // androidx.fragment.app.f
    public final void L(FragmentManager fragmentManager, String str) {
        fragmentManager.getClass();
        if (fragmentManager.I || fragmentManager.O()) {
            return;
        }
        super.L(fragmentManager, str);
    }

    @SuppressLint({"ComposableNaming"})
    public abstract void O(int i, b bVar);

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        JSTBroadcast jSTBroadcast = (JSTBroadcast) cr8.p(JSTBroadcast.class);
        String strR = fwc.a.b(getClass()).r();
        if (strR == null) {
            strR = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        jSTBroadcast.dispatch(new JSTBroadcastEvent.ViewWillDisappear(strR, (String) this.g0.getValue()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        JSTBroadcast jSTBroadcast = (JSTBroadcast) cr8.p(JSTBroadcast.class);
        String strR = fwc.a.b(getClass()).r();
        if (strR == null) {
            strR = ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        }
        jSTBroadcast.dispatch(new JSTBroadcastEvent.ViewWillAppear(strR, (String) this.g0.getValue()));
    }
}
