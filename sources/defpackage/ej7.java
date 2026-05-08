package defpackage;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ej7 extends ox4<ej7> {
    public final String a;
    public final WritableMap b;

    public ej7(int i, int i2, String str, WritableMap writableMap) {
        super(i, i2);
        this.a = str;
        this.b = writableMap;
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        return this.b;
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        return this.a;
    }
}
