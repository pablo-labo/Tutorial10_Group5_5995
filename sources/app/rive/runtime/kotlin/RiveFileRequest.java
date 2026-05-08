package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.RendererType;
import com.android.volley.ParseError;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.l6d;
import defpackage.m3d;
import defpackage.ol6;
import defpackage.wga;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lapp/rive/runtime/kotlin/RiveFileRequest;", "Lm3d;", "Lapp/rive/runtime/kotlin/core/File;", "", "url", "Lapp/rive/runtime/kotlin/core/RendererType;", "rendererType", "Ll6d$b;", "listener", "Ll6d$a;", "errorListener", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "assetLoader", "<init>", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/RendererType;Ll6d$b;Ll6d$a;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "response", "Lj6g;", "deliverResponse", "(Lapp/rive/runtime/kotlin/core/File;)V", "Lwga;", "Ll6d;", "parseNetworkResponse", "(Lwga;)Ll6d;", "Lapp/rive/runtime/kotlin/core/RendererType;", "Ll6d$b;", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class RiveFileRequest extends m3d<File> {
    public static final int $stable = 8;
    private final FileAssetLoader assetLoader;
    private final l6d.b<File> listener;
    private final RendererType rendererType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileRequest(String str, RendererType rendererType, l6d.b<File> bVar, l6d.a aVar, FileAssetLoader fileAssetLoader) {
        super(0, str, aVar);
        str.getClass();
        rendererType.getClass();
        bVar.getClass();
        aVar.getClass();
        this.rendererType = rendererType;
        this.listener = bVar;
        this.assetLoader = fileAssetLoader;
    }

    @Override // defpackage.m3d
    public void deliverResponse(File response) {
        response.getClass();
        this.listener.e(response);
    }

    @Override // defpackage.m3d
    public l6d<File> parseNetworkResponse(wga response) {
        byte[] bArr;
        if (response != null) {
            try {
                bArr = response.b;
            } catch (UnsupportedEncodingException e) {
                return new l6d<>(new ParseError(e));
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new l6d<>(new File(bArr, this.rendererType, this.assetLoader), ol6.a(response));
    }

    public /* synthetic */ RiveFileRequest(String str, RendererType rendererType, l6d.b bVar, l6d.a aVar, FileAssetLoader fileAssetLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rendererType, bVar, aVar, (i & 16) != 0 ? null : fileAssetLoader);
    }
}
