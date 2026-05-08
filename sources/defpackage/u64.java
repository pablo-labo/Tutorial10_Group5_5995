package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewManager;
import defpackage.p0f;

/* JADX INFO: loaded from: classes2.dex */
public final class u64 extends r64 {
    public final int b;
    public final int c;
    public final String d;
    public final ReadableArray e;

    public u64(int i, int i2, String str, ReadableArray readableArray) {
        str.getClass();
        readableArray.getClass();
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final void execute(a0a a0aVar) {
        a0aVar.getClass();
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        ReadableArray readableArray = this.e;
        readableArray.getClass();
        UiThreadUtil.assertOnUiThread();
        p0f p0fVarB = a0aVar.b(i, "receiveCommand:string");
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        if (p0fVarB.a) {
            return;
        }
        p0f.b bVarD = p0fVarB.d(i2);
        if (bVarD == null) {
            throw new RetryableMountingLayerException(v40.c(i2, "Unable to find viewState for tag: ", " for commandId: ", str));
        }
        ViewManager viewManager = bVarD.d;
        if (viewManager == null) {
            throw new RetryableMountingLayerException(p6.c(i2, "Unable to find viewState manager for tag "));
        }
        View view = bVarD.a;
        if (view == null) {
            throw new RetryableMountingLayerException(p6.c(i2, "Unable to find viewState view for tag "));
        }
        viewManager.receiveCommand(view, str, readableArray);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public final int getSurfaceId() {
        return this.b;
    }

    public final String toString() {
        return v40.c(this.c, "DispatchStringCommandMountItem [", "] ", this.d);
    }
}
