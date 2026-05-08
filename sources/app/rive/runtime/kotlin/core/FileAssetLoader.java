package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u0084 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "<init>", "()V", "", "pointer", "", "rendererType", "Lj6g;", "cppSetRendererType", "(JI)V", "constructor", "()J", "cppDelete", "(J)V", "Lapp/rive/runtime/kotlin/core/FileAsset;", "asset", "", "inBandBytes", "", "loadContents", "(Lapp/rive/runtime/kotlin/core/FileAsset;[B)Z", "Lapp/rive/runtime/kotlin/core/RendererType;", "setRendererType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public abstract class FileAssetLoader extends NativeObject {
    public static final int $stable = 0;

    public FileAssetLoader() throws RiveException {
        super(0L);
        setCppPointer(constructor());
        getRefs().incrementAndGet();
        getCppPointer();
    }

    private final native void cppSetRendererType(long pointer, int rendererType);

    public final native long constructor();

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public abstract boolean loadContents(FileAsset asset, byte[] inBandBytes);

    public final void setRendererType(RendererType rendererType) {
        rendererType.getClass();
        cppSetRendererType(getCppPointer(), rendererType.getValue());
    }
}
