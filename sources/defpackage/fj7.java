package defpackage;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fj7 implements UIManagerListener {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didDispatchMountItems(UIManager uIManager) {
        uIManager.getClass();
        didMountItems(uIManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didMountItems(UIManager uIManager) {
        uIManager.getClass();
        if (uIManager instanceof j0g) {
            synchronized (this) {
                if (this.b.isEmpty()) {
                    return;
                }
                List listZ1 = z92.z1(this.b);
                this.b.clear();
                Iterator it = listZ1.iterator();
                while (it.hasNext()) {
                    ((i0g) it.next()).b();
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didScheduleMountItems(UIManager uIManager) {
        uIManager.getClass();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willDispatchViewUpdates(UIManager uIManager) {
        uIManager.getClass();
        willMountItems(uIManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willMountItems(UIManager uIManager) {
        uIManager.getClass();
        if (uIManager instanceof j0g) {
            synchronized (this) {
                if (this.a.isEmpty()) {
                    return;
                }
                List listZ1 = z92.z1(this.a);
                this.a.clear();
                Iterator it = listZ1.iterator();
                while (it.hasNext()) {
                    ((i0g) it.next()).b();
                }
            }
        }
    }
}
