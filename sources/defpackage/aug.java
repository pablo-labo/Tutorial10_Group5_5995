package defpackage;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class aug extends BroadcastReceiver {
    public static final SparseArray<PowerManager.WakeLock> a = new SparseArray<>();
    public static int b = 1;
}
