package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lapp/rive/runtime/kotlin/core/ImageAsset;", "Lapp/rive/runtime/kotlin/core/FileAsset;", "", "address", "", "rendererTypeIdx", "<init>", "(JI)V", "cppAsset", "cppRenderImage", "Lj6g;", "cppSetRenderImage", "(JJ)V", "cppGetRenderImage", "(J)J", "cppPointer", "", "cppImageAssetWidth", "(J)F", "cppImageAssetHeight", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "value", "getImage", "()Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "setImage", "(Lapp/rive/runtime/kotlin/core/RiveRenderImage;)V", "image", "getWidth", "()F", "width", "getHeight", "height", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class ImageAsset extends FileAsset {
    public static final int $stable = 0;

    public ImageAsset(long j, int i) {
        super(j, i, null);
    }

    private final native long cppGetRenderImage(long cppAsset);

    private final native float cppImageAssetHeight(long cppPointer);

    private final native float cppImageAssetWidth(long cppPointer);

    private final native void cppSetRenderImage(long cppAsset, long cppRenderImage);

    public final float getHeight() {
        return cppImageAssetHeight(getCppPointer());
    }

    public final RiveRenderImage getImage() {
        return new RiveRenderImage(cppGetRenderImage(getCppPointer()));
    }

    public final float getWidth() {
        return cppImageAssetWidth(getCppPointer());
    }

    public final void setImage(RiveRenderImage riveRenderImage) {
        riveRenderImage.getClass();
        cppSetRenderImage(getCppPointer(), riveRenderImage.getCppPointer());
    }
}
