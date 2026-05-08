package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class io9 extends ox4<io9> {
    public final String a;
    public final int b;

    public io9(String str, int i, int i2, int i3) {
        super(i, i2);
        this.a = str;
        this.b = i3;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        String str = this.a;
        if (str != null) {
            writableMapCreateMap.putString("event", str);
        }
        writableMapCreateMap.putString("target", String.valueOf(this.b));
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "onPressAction";
    }
}
