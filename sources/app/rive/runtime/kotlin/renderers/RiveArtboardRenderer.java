package app.rive.runtime.kotlin.renderers;

import app.rive.runtime.kotlin.controllers.RiveFileController;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.RendererType;
import app.rive.runtime.kotlin.core.Rive;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.j6g;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RiveArtboardRenderer;", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "", "trace", "Lapp/rive/runtime/kotlin/core/RendererType;", "rendererType", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "controller", "<init>", "(ZLapp/rive/runtime/kotlin/core/RendererType;Lapp/rive/runtime/kotlin/controllers/RiveFileController;)V", "Lj6g;", "resizeArtboard", "()V", "draw", "", "elapsed", "advance", "(F)V", "reset", "disposeDependencies", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "getScaleFactor", "()F", "scaleFactor", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public class RiveArtboardRenderer extends Renderer {
    public static final int $stable = 8;
    private RiveFileController controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveArtboardRenderer(boolean z, RendererType rendererType, RiveFileController riveFileController) {
        super(rendererType, z);
        rendererType.getClass();
        riveFileController.getClass();
        this.controller = riveFileController;
        riveFileController.setOnStart(new RiveArtboardRenderer$1$1(this));
        riveFileController.acquire();
        getDependencies().add(riveFileController);
    }

    private final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    private final Fit getFit() {
        return this.controller.getFit();
    }

    private final float getScaleFactor() {
        return this.controller.getLayoutScaleFactorActive$kotlin_release();
    }

    private final void resizeArtboard() {
        if (getFit() != Fit.LAYOUT) {
            Artboard activeArtboard = this.controller.getActiveArtboard();
            if (activeArtboard != null) {
                activeArtboard.resetArtboardSize();
                return;
            }
            return;
        }
        float width = getWidth() / getScaleFactor();
        float height = getHeight() / getScaleFactor();
        Artboard activeArtboard2 = this.controller.getActiveArtboard();
        if (activeArtboard2 != null) {
            activeArtboard2.setWidth(width);
            activeArtboard2.setHeight(height);
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void advance(float elapsed) {
        if (getHasCppObject()) {
            if (this.controller.getIsActive()) {
                this.controller.advance(elapsed);
            }
            synchronized (this.controller.getStartStopLock()) {
                try {
                    if (!this.controller.isAdvancing()) {
                        stopThread$kotlin_release();
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void disposeDependencies() {
        Object lock;
        File file = this.controller.getFile();
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            super.disposeDependencies();
            j6g j6gVar = j6g.a;
        }
    }

    @Override // app.rive.runtime.kotlin.renderers.Renderer
    public void draw() {
        ReentrantLock lock;
        File file = this.controller.getFile();
        synchronized (((file == null || (lock = file.getLock()) == null) ? this : lock)) {
            try {
                if (getHasCppObject() && this.controller.getIsActive()) {
                    if (this.controller.getRequireArtboardResize().getAndSet(false)) {
                        resizeArtboard();
                    }
                    Artboard activeArtboard = this.controller.getActiveArtboard();
                    if (activeArtboard != null) {
                        activeArtboard.draw(getCppPointer(), getFit(), getAlignment(), getScaleFactor());
                        j6g j6gVar = j6g.a;
                    }
                }
            } finally {
            }
        }
    }

    public final void reset() {
        this.controller.stopAnimations();
        this.controller.reset$kotlin_release();
        stop();
        RiveFileController.selectArtboard$default(this.controller, null, 1, null);
        start();
    }

    public /* synthetic */ RiveArtboardRenderer(boolean z, RendererType rendererType, RiveFileController riveFileController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, riveFileController);
    }
}
