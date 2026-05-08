package defpackage;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mlc implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = ReactHostImpl.A;
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }
}
