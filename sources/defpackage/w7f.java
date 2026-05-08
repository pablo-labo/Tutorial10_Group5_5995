package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes3.dex */
public final class w7f extends ox4 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public w7f(int i, WritableMap writableMap) {
        super(i);
        this.b = writableMap;
    }

    @Override // defpackage.ox4
    public boolean canCoalesce() {
        switch (this.a) {
            case 1:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // defpackage.ox4
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        switch (this.a) {
            case 1:
                rCTEventEmitter.getClass();
                rCTEventEmitter.receiveEvent(getViewTag(), internal_getEventNameCompat(), (WritableMap) this.b);
                break;
            default:
                super.dispatch(rCTEventEmitter);
                break;
        }
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        switch (this.a) {
        }
        return (short) 0;
    }

    @Override // defpackage.ox4
    public WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("tabKey", (String) this.b);
                return writableMapCreateMap;
            default:
                return super.getEventData();
        }
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topNativeFocusChange";
            default:
                return "topHttpError";
        }
    }

    public w7f(int i, int i2, String str) {
        super(i, i2);
        this.b = str;
    }
}
