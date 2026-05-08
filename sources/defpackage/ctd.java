package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ctd extends ox4<ctd> {
    public final String a;

    public ctd(int i, int i2, String str) {
        super(i, i2);
        this.a = str;
    }

    @Override // defpackage.ox4
    public final short getCoalescingKey() {
        return (short) 0;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.a);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topChangeText";
    }
}
