package defpackage;

import com.facebook.react.fabric.mounting.mountitems.MountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class w14 implements MountItem {
    public final int a;
    public final int b;

    public w14(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final void execute(a0a a0aVar) {
        a0aVar.getClass();
        p0f p0fVarA = a0aVar.a(this.a);
        if (p0fVarA == null) {
            return;
        }
        p0fVarA.c(this.b);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final int getSurfaceId() {
        return this.a;
    }
}
