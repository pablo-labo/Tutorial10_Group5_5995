package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.IllegalViewOperationException;
import defpackage.zz9;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class n0f extends GuardedRunnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ p0f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0f(p0f p0fVar, ReactContext reactContext, View view) {
        super(reactContext);
        this.b = p0fVar;
        this.a = view;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        if (this.b.a) {
            return;
        }
        if (this.a.getId() == this.b.n) {
            ReactSoftExceptionLogger.logSoftException("p0f", new IllegalViewOperationException(w20.k(new StringBuilder("Race condition in addRootView detected. Trying to set an id of ["), this.b.n, "] on the RootView, but that id has already been set. ")));
        } else if (this.a.getId() != -1) {
            s55.h("p0f", "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(this.a.getId()), Integer.valueOf(this.b.n));
            ReactSoftExceptionLogger.logSoftException("p0f", new IllegalViewOperationException("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
        }
        this.a.setId(this.b.n);
        KeyEvent.Callback callback = this.a;
        if (callback instanceof vnc) {
            ((vnc) callback).setRootViewTag(this.b.n);
        }
        p0f p0fVar = this.b;
        FabricUIManager.a aVar = p0fVar.i;
        ArrayDeque arrayDeque = p0fVar.e;
        zz9 zz9Var = FabricUIManager.this.mMountItemDispatcher;
        zz9Var.getClass();
        arrayDeque.getClass();
        while (!arrayDeque.isEmpty()) {
            Object objPoll = arrayDeque.poll();
            if (objPoll == null) {
                l5.q("MountItem should not be null");
                return;
            }
            MountItem mountItem = (MountItem) objPoll;
            try {
                mountItem.execute(zz9Var.a);
            } catch (RetryableMountingLayerException e) {
                if (mountItem instanceof r64) {
                    r64 r64Var = (r64) mountItem;
                    int i = r64Var.a;
                    if (i == 0) {
                        r64Var.a = i + 1;
                        zz9Var.c.add(r64Var);
                    }
                } else {
                    zz9.a.b(mountItem, "dispatchExternalMountItems: mounting failed with " + e.getMessage());
                }
            }
        }
        this.b.b = true;
    }
}
