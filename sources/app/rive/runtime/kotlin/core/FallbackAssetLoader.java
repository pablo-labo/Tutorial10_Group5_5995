package app.rive.runtime.kotlin.core;

import android.content.Context;
import app.rive.runtime.kotlin.RiveAnimationView;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lapp/rive/runtime/kotlin/core/FallbackAssetLoader;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "", "loadCDNAssets", "loader", "<init>", "(Landroid/content/Context;ZLapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "needsCDNLoader", "Lj6g;", "resetCDNLoader", "(ZLandroid/content/Context;)V", "appendLoader", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "prependLoader", "Lapp/rive/runtime/kotlin/core/FileAsset;", "asset", "", "inBandBytes", "loadContents", "(Lapp/rive/runtime/kotlin/core/FileAsset;[B)Z", "Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;", "builder", "resetWith$kotlin_release", "(Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;)V", "resetWith", "", "loaders", "Ljava/util/List;", "getLoaders", "()Ljava/util/List;", "getLoaders$annotations", "()V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class FallbackAssetLoader extends FileAssetLoader {
    public static final int $stable = 8;
    private final List<FileAssetLoader> loaders;

    public FallbackAssetLoader(Context context, boolean z, FileAssetLoader fileAssetLoader) {
        context.getClass();
        this.loaders = new ArrayList();
        if (fileAssetLoader != null) {
            appendLoader(fileAssetLoader);
        }
        if (z) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            appendLoader(new CDNAssetLoader(applicationContext));
        }
    }

    public static /* synthetic */ void getLoaders$annotations() {
    }

    private final void resetCDNLoader(boolean needsCDNLoader, Context context) {
        Iterator<FileAssetLoader> it = this.loaders.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof CDNAssetLoader) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1 && needsCDNLoader) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            appendLoader(new CDNAssetLoader(applicationContext));
        } else {
            if (i < 0 || needsCDNLoader) {
                return;
            }
            FileAssetLoader fileAssetLoaderRemove = this.loaders.remove(i);
            getDependencies().remove(fileAssetLoaderRemove);
            fileAssetLoaderRemove.release();
        }
    }

    public final void appendLoader(FileAssetLoader loader) {
        loader.getClass();
        this.loaders.add(loader);
        getDependencies().add(loader);
    }

    public final List<FileAssetLoader> getLoaders() {
        return this.loaders;
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(FileAsset asset, byte[] inBandBytes) {
        asset.getClass();
        inBandBytes.getClass();
        List<FileAssetLoader> list = this.loaders;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((FileAssetLoader) it.next()).loadContents(asset, inBandBytes)) {
                return true;
            }
        }
        return false;
    }

    public final void prependLoader(FileAssetLoader loader) {
        loader.getClass();
        this.loaders.add(0, loader);
        getDependencies().add(loader);
    }

    public final void resetWith$kotlin_release(RiveAnimationView.Builder builder) {
        builder.getClass();
        FileAssetLoader assetLoader = builder.getAssetLoader();
        if (assetLoader != null) {
            prependLoader(assetLoader);
        }
        boolean shouldLoadCDNAssets = builder.getShouldLoadCDNAssets();
        Context applicationContext = builder.getContext().getApplicationContext();
        applicationContext.getClass();
        resetCDNLoader(shouldLoadCDNAssets, applicationContext);
    }

    public /* synthetic */ FallbackAssetLoader(Context context, boolean z, FileAssetLoader fileAssetLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : fileAssetLoader);
    }
}
