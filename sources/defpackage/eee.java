package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class eee extends ox4<eee> {
    public final int a;
    public final boolean b;

    public eee(int i, int i2, int i3, boolean z) {
        super(i, i2);
        this.a = i3;
        this.b = z;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("index", this.a);
        writableMapCreateMap.putBoolean("isStable", this.b);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topSheetDetentChanged";
    }
}
