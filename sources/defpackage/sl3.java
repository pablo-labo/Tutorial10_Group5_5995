package defpackage;

import android.app.ActivityManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public final class sl3 implements gze<tn9> {
    public final ActivityManager a;

    public sl3(ActivityManager activityManager) {
        this.a = activityManager;
    }

    @Override // defpackage.gze
    public final tn9 get() {
        int iMin = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new tn9(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
