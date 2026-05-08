package app.rive.runtime.kotlin.core;

import android.content.Context;
import android.graphics.RectF;
import app.rive.runtime.kotlin.fonts.FontHelper;
import app.rive.runtime.kotlin.fonts.Fonts;
import app.rive.runtime.kotlin.fonts.NativeFontHelper;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.jjc;
import defpackage.sy3;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J@\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0003J7\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\u001e\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lapp/rive/runtime/kotlin/core/Rive;", "", "<init>", "()V", "Lj6g;", "cppInitialize", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "Landroid/graphics/RectF;", "availableBounds", "artboardBounds", "requiredBounds", "", "scaleFactor", "cppCalculateRequiredBounds", "(Lapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lapp/rive/runtime/kotlin/core/RendererType;", "defaultRenderer", "init", "(Landroid/content/Context;Lapp/rive/runtime/kotlin/core/RendererType;)V", "initializeCppEnvironment", "calculateRequiredBounds", "(Lapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;F)Landroid/graphics/RectF;", "", "byteArray", "", "setFallbackFont", "([B)Z", "Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;", "opts", "(Lapp/rive/runtime/kotlin/fonts/Fonts$FontOpts;)Z", "", "RIVE_ANDROID", "Ljava/lang/String;", "<set-?>", "defaultRendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "getDefaultRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class Rive {
    private static final String RIVE_ANDROID = "rive-android";
    public static final Rive INSTANCE = new Rive();
    private static RendererType defaultRendererType = RendererType.Rive;
    public static final int $stable = 8;

    private Rive() {
    }

    public static /* synthetic */ RectF calculateRequiredBounds$default(Rive rive, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f, int i, Object obj) {
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return rive.calculateRequiredBounds(fit, alignment, rectF, rectF2, f);
    }

    private final native void cppCalculateRequiredBounds(Fit fit, Alignment alignment, RectF availableBounds, RectF artboardBounds, RectF requiredBounds, float scaleFactor);

    private final native void cppInitialize();

    public static /* synthetic */ void init$default(Rive rive, Context context, RendererType rendererType, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            rendererType = RendererType.Rive;
        }
        rive.init(context, rendererType);
    }

    public static /* synthetic */ boolean setFallbackFont$default(Rive rive, Fonts.FontOpts fontOpts, int i, Object obj) {
        if ((i & 1) != 0) {
            fontOpts = null;
        }
        return rive.setFallbackFont(fontOpts);
    }

    public final RectF calculateRequiredBounds(Fit fit, Alignment alignment, RectF availableBounds, RectF artboardBounds, float scaleFactor) {
        fit.getClass();
        alignment.getClass();
        availableBounds.getClass();
        artboardBounds.getClass();
        RectF rectF = new RectF();
        cppCalculateRequiredBounds(fit, alignment, availableBounds, artboardBounds, rectF, scaleFactor);
        return rectF;
    }

    public final RendererType getDefaultRendererType() {
        return defaultRendererType;
    }

    public final void init(Context context, RendererType defaultRenderer) throws Throwable {
        context.getClass();
        defaultRenderer.getClass();
        jjc jjcVar = new jjc();
        jjcVar.d = true;
        jjcVar.b(context, RIVE_ANDROID);
        defaultRendererType = defaultRenderer;
        initializeCppEnvironment();
    }

    public final void initializeCppEnvironment() {
        cppInitialize();
    }

    @sy3
    public final boolean setFallbackFont(Fonts.FontOpts opts) {
        byte[] fallbackFontBytes = FontHelper.INSTANCE.getFallbackFontBytes(opts);
        if (fallbackFontBytes != null) {
            return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(fallbackFontBytes);
        }
        return false;
    }

    @sy3
    public final boolean setFallbackFont(byte[] byteArray) {
        byteArray.getClass();
        return NativeFontHelper.INSTANCE.cppRegisterFallbackFont(byteArray);
    }
}
