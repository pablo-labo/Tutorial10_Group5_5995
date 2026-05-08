package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pc4 extends ox4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc4(int i, int i2, int i3) {
        super(i, i2);
        this.a = i3;
    }

    @Override // defpackage.ox4
    public short getCoalescingKey() {
        switch (this.a) {
            case 2:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        switch (this.a) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.getClass();
                break;
        }
        return Arguments.createMap();
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topDrawerOpen";
            case 1:
                return "onCloseMenu";
            default:
                return "topFinishTransitioning";
        }
    }
}
