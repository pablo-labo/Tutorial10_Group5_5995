package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface vse {
    void destroyState();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap writableMap);
}
