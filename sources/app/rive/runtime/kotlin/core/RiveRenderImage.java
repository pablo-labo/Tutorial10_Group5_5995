package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "address", "<init>", "(J)V", "pointer", "Lj6g;", "cppDelete", "Companion", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class RiveRenderImage extends NativeObject {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public RiveRenderImage(long j) {
        super(j);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082 J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lapp/rive/runtime/kotlin/core/RiveRenderImage$Companion;", "", "()V", "cppMakeImage", "", "bytes", "", "rendererTypeIdx", "", "make", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long cppMakeImage(byte[] bytes, int rendererTypeIdx);

        public static /* synthetic */ RiveRenderImage make$default(Companion companion, byte[] bArr, RendererType rendererType, int i, Object obj) {
            if ((i & 2) != 0) {
                rendererType = Rive.INSTANCE.getDefaultRendererType();
            }
            return companion.make(bArr, rendererType);
        }

        public final RiveRenderImage make(byte[] bytes, RendererType rendererType) {
            bytes.getClass();
            rendererType.getClass();
            return new RiveRenderImage(cppMakeImage(bytes, rendererType.getValue()));
        }

        private Companion() {
        }
    }
}
