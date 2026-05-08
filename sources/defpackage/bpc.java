package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bpc extends ox4<bpc> {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpc(int i, int i2, String str) {
        super(i, i2);
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.ox4
    public final boolean canCoalesce() {
        return false;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        writableMapCreateMap.putString("key", this.a);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topKeyPress";
    }
}
