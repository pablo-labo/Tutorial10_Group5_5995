package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class apc extends ox4<apc> {
    public final String a;

    public apc(int i, int i2, String str) {
        super(i, i2);
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
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("text", this.a);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "topEndEditing";
    }
}
