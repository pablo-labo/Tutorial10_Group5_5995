package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class j17 extends mj8 implements gu5<MemoryCache> {
    final /* synthetic */ n17 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j17(n17 n17Var) {
        super(0);
        this.this$0 = n17Var;
    }

    @Override // defpackage.gu5
    public final MemoryCache invoke() {
        int i;
        int largeMemoryClass;
        Context context = this.this$0.a;
        Bitmap.Config[] configArr = m.a;
        double d = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        wrc wrcVar = new wrc();
        if (d > 0.0d) {
            Bitmap.Config[] configArr2 = m.a;
            try {
                Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                systemService2.getClass();
                ActivityManager activityManager = (ActivityManager) systemService2;
                largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
            } catch (Exception unused2) {
                largeMemoryClass = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            i = (int) (d * ((double) largeMemoryClass) * 1024.0d * 1024.0d);
        } else {
            i = 0;
        }
        return new orc(i > 0 ? new src(i, wrcVar) : new ze4(wrcVar, 3), wrcVar);
    }
}
