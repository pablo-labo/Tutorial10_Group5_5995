package com.datadog.android.core.internal.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/datadog/android/core/internal/receiver/ThreadSafeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/content/IntentFilter;", "filter", "Landroid/content/Intent;", "registerReceiver", "(Landroid/content/Context;Landroid/content/IntentFilter;)Landroid/content/Intent;", "Lj6g;", "unregisterReceiver", "(Landroid/content/Context;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class ThreadSafeReceiver extends BroadcastReceiver {
    public static final int RECEIVER_NOT_EXPORTED_COMPAT = 4;
    private final AtomicBoolean isRegistered = new AtomicBoolean(false);

    /* JADX INFO: renamed from: isRegistered, reason: from getter */
    public final AtomicBoolean getIsRegistered() {
        return this.isRegistered;
    }

    @SuppressLint({"WrongConstant", "UnspecifiedRegisterReceiverFlag"})
    public final Intent registerReceiver(Context context, IntentFilter filter) {
        context.getClass();
        filter.getClass();
        Intent intentRegisterReceiver = Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(this, filter, 4) : context.registerReceiver(this, filter, 4);
        this.isRegistered.set(true);
        return intentRegisterReceiver;
    }

    public final void unregisterReceiver(Context context) {
        context.getClass();
        if (this.isRegistered.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }
}
