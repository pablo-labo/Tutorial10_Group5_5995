package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes3.dex */
public final class gof extends ox4<gof> {
    public final WritableMap a;

    public gof(int i, WritableMap writableMap) {
        super(i);
        this.a = writableMap;
    }

    @Override // defpackage.ox4
    public final boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.ox4
    public final void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.getClass();
        rCTEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), this.a);
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topLoadingFinish";
    }
}
