package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gtd extends ox4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gtd(int i, int i2, int i3) {
        super(i, i2);
        this.a = i3;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        switch (this.a) {
        }
        return (short) 0;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        switch (this.a) {
        }
        return Arguments.createMap();
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topOpen";
            default:
                return "topDidDisappear";
        }
    }
}
