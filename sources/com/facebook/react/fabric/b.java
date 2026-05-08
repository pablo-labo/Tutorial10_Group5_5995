package com.facebook.react.fabric;

import com.facebook.react.fabric.FabricUIManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {
    public final /* synthetic */ FabricUIManager.g a;

    public b(FabricUIManager.g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FabricUIManager fabricUIManager = FabricUIManager.this;
        fabricUIManager.mMountNotificationScheduled = false;
        List list = fabricUIManager.mSurfaceIdsWithPendingMountNotification;
        fabricUIManager.mSurfaceIdsWithPendingMountNotification = new ArrayList();
        FabricUIManagerBinding fabricUIManagerBinding = fabricUIManager.mBinding;
        if (fabricUIManagerBinding == null || fabricUIManager.mDestroyed) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fabricUIManagerBinding.reportMount(((Integer) it.next()).intValue());
        }
    }
}
