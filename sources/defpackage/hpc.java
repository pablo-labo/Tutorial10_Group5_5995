package defpackage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hpc extends ox4 {
    public final /* synthetic */ int a;
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpc(String str, int i, int i2, int i3) {
        super(i, i2);
        this.a = i3;
        this.b = str;
    }

    @Override // defpackage.ox4
    public boolean canCoalesce() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.canCoalesce();
        }
    }

    @Override // defpackage.ox4
    public short getCoalescingKey() {
        switch (this.a) {
            case 1:
                return (short) 0;
            default:
                return super.getCoalescingKey();
        }
    }

    @Override // defpackage.ox4
    public final WritableMap getEventData() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.getClass();
                writableMapCreateMap.putInt("target", getViewTag());
                writableMapCreateMap.putString("text", str);
                return writableMapCreateMap;
            default:
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putString("text", str);
                return writableMapCreateMap2;
        }
    }

    @Override // defpackage.ox4
    public final String getEventName() {
        switch (this.a) {
            case 0:
                return "topSubmitEditing";
            default:
                return "topSearchButtonPress";
        }
    }
}
