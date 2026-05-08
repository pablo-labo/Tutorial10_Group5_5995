package defpackage;

import com.facebook.react.bridge.WritableArray;

/* JADX INFO: loaded from: classes2.dex */
public interface cw7 {
    void callIdleCallbacks(double d);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
