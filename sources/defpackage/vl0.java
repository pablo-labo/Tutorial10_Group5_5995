package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public final class vl0 extends Service {
    public static final /* synthetic */ int a = 0;

    public static class a {
        public static int a() {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
