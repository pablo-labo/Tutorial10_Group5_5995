package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class m7b extends ox4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7b(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.a = i3;
        this.b = i4;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("position", this.a);
        writableMapCreateMap.putInt("total", this.b);
        return writableMapCreateMap;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return "onPageChange";
    }
}
