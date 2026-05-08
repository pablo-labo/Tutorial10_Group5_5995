package app.rive.runtime.kotlin.renderers;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Surface;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.NativeObject;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.aj6;
import defpackage.b0;
import defpackage.p4;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b*\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096 ¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH'¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u000fJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010\u000fJ7\u0010(\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J=\u00100\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011¢\u0006\u0004\b6\u00103J\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\tH\u0017¢\u0006\u0004\b8\u0010\rJ\u000f\u00109\u001a\u00020\u000bH\u0017¢\u0006\u0004\b9\u0010\u000fJ\u000f\u0010:\u001a\u00020\u000bH\u0014¢\u0006\u0004\b:\u0010\u000fJ\u0018\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\b<\u0010\rJ\u0018\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\b=\u0010\rJ\u0018\u0010>\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\b>\u0010\rJ\u0018\u0010?\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\b?\u0010\rJ\u0018\u0010A\u001a\u00020@2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\bC\u0010BJ\u0018\u0010D\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\bF\u0010\rJ \u0010G\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\tH\u0082 ¢\u0006\u0004\bI\u0010\rJ@\u0010L\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\t2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010K\u001a\u00020$2\u0006\u0010'\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\bL\u0010MJH\u0010N\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011H\u0082 ¢\u0006\u0004\bN\u0010OJ \u0010P\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020@H\u0082 ¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020@H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u000bH\u0002¢\u0006\u0004\bU\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010[\u001a\u0004\b\\\u0010]R$\u0010_\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b_\u0010]R\"\u0010`\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010[\u001a\u0004\b`\u0010]\"\u0004\ba\u0010bR\u0011\u0010e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0011\u0010i\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bh\u0010d¨\u0006j"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/Renderer;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "Landroid/view/Choreographer$FrameCallback;", "Lapp/rive/runtime/kotlin/core/RendererType;", "type", "", "trace", "<init>", "(Lapp/rive/runtime/kotlin/core/RendererType;Z)V", "", "pointer", "Lj6g;", "cppDelete", "(J)V", "make", "()V", "draw", "", "elapsed", "advance", "(F)V", "start", "Landroid/view/Surface;", "surface", "setSurface", "(Landroid/view/Surface;)V", "stopThread$kotlin_release", "stopThread", "stop", "scheduleFrame", "save", "restore", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "Landroid/graphics/RectF;", "targetBounds", "sourceBounds", "scaleFactor", "align", "(Lapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "x", "sy", "sx", "y", "tx", "ty", "transform", "(FFFFFF)V", "scale", "(FF)V", "dx", "dy", "translate", "frameTimeNanos", "doFrame", "delete", "disposeDependencies", "rendererPointer", "cppStart", "cppStop", "cppSave", "cppRestore", "", "cppWidth", "(J)I", "cppHeight", "cppAvgFps", "(J)F", "cppDoFrame", "cppSetSurface", "(Landroid/view/Surface;J)V", "cppDestroySurface", "cppPointer", "srcBounds", "cppAlign", "(JLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Landroid/graphics/RectF;Landroid/graphics/RectF;F)V", "cppTransform", "(JFFFFFF)V", "constructor", "(ZI)J", "newType", "setRendererType", "(I)V", "destroySurface", "Lapp/rive/runtime/kotlin/core/RendererType;", "getType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "Z", "getTrace", "()Z", "<set-?>", "isPlaying", "isAttached", "setAttached", "(Z)V", "getWidth", "()F", "width", "getHeight", "height", "getAverageFps", "averageFps", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public abstract class Renderer extends NativeObject implements Choreographer.FrameCallback {
    public static final int $stable = 8;
    private boolean isAttached;
    private boolean isPlaying;
    private final boolean trace;
    private RendererType type;

    public /* synthetic */ Renderer(RendererType rendererType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ void align$default(Renderer renderer, Fit fit, Alignment alignment, RectF rectF, RectF rectF2, float f, int i, Object obj) {
        if (obj != null) {
            b0.u("Super calls with default arguments not supported in this target, function: align");
            return;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        renderer.align(fit, alignment, rectF, rectF2, f);
    }

    private final native long constructor(boolean trace, int type);

    private final native void cppAlign(long cppPointer, Fit fit, Alignment alignment, RectF targetBounds, RectF srcBounds, float scaleFactor);

    private final native float cppAvgFps(long rendererPointer);

    private final native void cppDestroySurface(long rendererPointer);

    private final native void cppDoFrame(long rendererPointer);

    private final native int cppHeight(long rendererPointer);

    private final native void cppRestore(long rendererPointer);

    private final native void cppSave(long rendererPointer);

    private final native void cppSetSurface(Surface surface, long rendererPointer);

    private final native void cppStart(long rendererPointer);

    private final native void cppStop(long rendererPointer);

    private final native void cppTransform(long cppPointer, float x, float sy, float sx, float y, float tx, float ty);

    private final native int cppWidth(long rendererPointer);

    private final void destroySurface() {
        this.isAttached = false;
        stop();
        cppDestroySurface(getCppPointer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleFrame$lambda$1(Renderer renderer) {
        renderer.getClass();
        Choreographer.getInstance().postFrameCallback(renderer);
    }

    private final void setRendererType(int newType) {
        if (newType != this.type.getValue()) {
            this.type = RendererType.INSTANCE.fromIndex(newType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(Renderer renderer) {
        renderer.getClass();
        Choreographer.getInstance().removeFrameCallback(renderer);
    }

    public abstract void advance(float elapsed);

    public final void align(Fit fit, Alignment alignment, RectF targetBounds, RectF sourceBounds, float scaleFactor) {
        fit.getClass();
        alignment.getClass();
        targetBounds.getClass();
        sourceBounds.getClass();
        cppAlign(getCppPointer(), fit, alignment, targetBounds, sourceBounds, scaleFactor);
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public void delete() {
        destroySurface();
        cppDelete(getCppPointer());
        setCppPointer(0L);
    }

    public void disposeDependencies() {
        Iterator<T> it = getDependencies().iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        getDependencies().clear();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        if (this.isPlaying) {
            cppDoFrame(getCppPointer());
            scheduleFrame();
        }
    }

    public abstract void draw();

    public final float getAverageFps() {
        return cppAvgFps(getCppPointer());
    }

    public final float getHeight() {
        return cppHeight(getCppPointer());
    }

    public final boolean getTrace() {
        return this.trace;
    }

    public final RendererType getType() {
        return this.type;
    }

    public final float getWidth() {
        return cppWidth(getCppPointer());
    }

    /* JADX INFO: renamed from: isAttached, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public void make() {
        if (getHasCppObject()) {
            return;
        }
        setCppPointer(constructor(this.trace, this.type.getValue()));
        getRefs().incrementAndGet();
    }

    public final void restore() {
        cppRestore(getCppPointer());
    }

    public final void save() {
        cppSave(getCppPointer());
    }

    public final void scale(float sx, float sy) {
        transform(sx, 0.0f, 0.0f, sy, 0.0f, 0.0f);
    }

    public void scheduleFrame() {
        new Handler(Looper.getMainLooper()).post(new aj6(this, 5));
    }

    public final void setAttached(boolean z) {
        this.isAttached = z;
    }

    public final void setSurface(Surface surface) {
        surface.getClass();
        cppSetSurface(surface, getCppPointer());
        this.isAttached = true;
        start();
    }

    public final void setType(RendererType rendererType) {
        rendererType.getClass();
        this.type = rendererType;
    }

    public final void start() {
        if (!this.isPlaying && this.isAttached && getHasCppObject()) {
            this.isPlaying = true;
            cppStart(getCppPointer());
            scheduleFrame();
        }
    }

    public final void stop() {
        stopThread$kotlin_release();
        new Handler(Looper.getMainLooper()).post(new p4(this, 3));
    }

    public final void stopThread$kotlin_release() {
        if (this.isPlaying && getHasCppObject()) {
            this.isPlaying = false;
            cppStop(getCppPointer());
        }
    }

    public final void transform(float x, float sy, float sx, float y, float tx, float ty) {
        cppTransform(getCppPointer(), x, sy, sx, y, tx, ty);
    }

    public final void translate(float dx, float dy) {
        transform(1.0f, 0.0f, 0.0f, 1.0f, dx, dy);
    }

    public Renderer() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Renderer(RendererType rendererType, boolean z) {
        super(0L);
        rendererType.getClass();
        this.type = rendererType;
        this.trace = z;
    }
}
