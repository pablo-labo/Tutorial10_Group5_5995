package defpackage;

import android.os.Process;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class amc implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
    }
}
