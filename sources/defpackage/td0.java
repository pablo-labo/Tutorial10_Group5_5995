package defpackage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class td0 {
    public boolean a;
    public elg b;
    public Callback c;
    public int d;

    public void a(ReadableMap readableMap) {
        readableMap.getClass();
        throw new JSApplicationCausedNativeException(l5.m("Animation config for ", getClass().getSimpleName(), " cannot be reset"));
    }

    public abstract void b(long j);
}
