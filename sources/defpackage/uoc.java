package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class uoc extends ox4<uoc> {
    public final boolean a;

    public uoc(int i, int i2, boolean z) {
        super(i, i2);
        this.a = z;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putBoolean("value", this.a);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topChange";
    }
}
