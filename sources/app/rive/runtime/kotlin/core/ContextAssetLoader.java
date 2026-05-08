package app.rive.runtime.kotlin.core;

import android.content.Context;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/ContextAssetLoader;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public abstract class ContextAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final Context context;

    public ContextAssetLoader(Context context) {
        context.getClass();
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }
}
