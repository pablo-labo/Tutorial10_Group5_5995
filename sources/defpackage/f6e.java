package defpackage;

import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.mounting.mountitems.MountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class f6e implements MountItem {
    public final int a;
    public final int b;
    public final int c;

    public f6e(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final void execute(a0a a0aVar) {
        a0aVar.getClass();
        try {
            int i = this.a;
            int i2 = this.b;
            int i3 = this.c;
            UiThreadUtil.assertOnUiThread();
            if (i == -1) {
                a0aVar.d(i2).h(i2, i3);
            } else {
                a0aVar.b(i, "sendAccessibilityEvent").h(i2, i3);
            }
        } catch (RetryableMountingLayerException e) {
            ReactSoftExceptionLogger.logSoftException("Fabric.SendAccessibilityEvent", new ReactNoCrashSoftException(e));
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final int getSurfaceId() {
        return this.a;
    }

    public final String toString() {
        return k20.l("SendAccessibilityEventMountItem [", this.b, this.c, "] ");
    }
}
