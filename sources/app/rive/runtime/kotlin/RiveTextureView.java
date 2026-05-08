package app.rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import app.rive.runtime.kotlin.renderers.Renderer;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.b0;
import defpackage.boa;
import defpackage.d2f;
import defpackage.qt8;
import defpackage.wl7;
import defpackage.yv8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH$¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u0001H\u0084\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0014H\u0015¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0017H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000eR$\u00102\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lapp/rive/runtime/kotlin/RiveTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "createRenderer", "()Lapp/rive/runtime/kotlin/renderers/Renderer;", "Lyv8;", "createObserver", "()Lyv8;", "T", "getContextAsType", "()Ljava/lang/Object;", "Landroid/graphics/SurfaceTexture;", "surface", "Lj6g;", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "", "width", "height", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onAttachedToWindow", "()V", "surfaceTexture", "onSurfaceTextureAvailable", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "Landroid/app/Activity;", "activity$delegate", "Lkotlin/Lazy;", "getActivity", "()Landroid/app/Activity;", "activity", "lifecycleObserver$delegate", "getLifecycleObserver", "lifecycleObserver", "renderer", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "getRenderer", "setRenderer", "(Lapp/rive/runtime/kotlin/renderers/Renderer;)V", "Landroid/view/Surface;", "viewSurface", "Landroid/view/Surface;", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public abstract class RiveTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: activity$delegate, reason: from kotlin metadata */
    private final Lazy activity;

    /* JADX INFO: renamed from: lifecycleObserver$delegate, reason: from kotlin metadata */
    private final Lazy lifecycleObserver;
    private Renderer renderer;
    private Surface viewSurface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.activity = boa.E(qt8.c, new RiveTextureView$activity$2(this));
        this.lifecycleObserver = new d2f(new RiveTextureView$lifecycleObserver$2(this));
    }

    public abstract yv8 createObserver();

    public abstract Renderer createRenderer();

    public final Activity getActivity() {
        return (Activity) this.activity.getValue();
    }

    public final <T> T getContextAsType() {
        if (!(getContext() instanceof ContextWrapper)) {
            return null;
        }
        b0.u("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        return null;
    }

    public final yv8 getLifecycleObserver() {
        return (yv8) this.lifecycleObserver.getValue();
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        setOpaque(false);
        Renderer rendererCreateRenderer = createRenderer();
        rendererCreateRenderer.make();
        this.renderer = rendererCreateRenderer;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Renderer renderer = this.renderer;
        renderer.getClass();
        renderer.delete();
        this.renderer = null;
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        surfaceTexture.getClass();
        Surface surface = this.viewSurface;
        if (surface != null) {
            if (surface == null) {
                wl7.g("viewSurface");
                throw null;
            }
            surface.release();
        }
        this.viewSurface = new Surface(surfaceTexture);
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.stop();
            Surface surface2 = this.viewSurface;
            if (surface2 != null) {
                renderer.setSurface(surface2);
            } else {
                wl7.g("viewSurface");
                throw null;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        surface.getClass();
        Surface surface2 = this.viewSurface;
        if (surface2 != null) {
            surface2.release();
            return false;
        }
        wl7.g("viewSurface");
        throw null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        surface.getClass();
        onSurfaceTextureAvailable(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        surface.getClass();
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        changedView.getClass();
        super.onVisibilityChanged(changedView, visibility);
        Renderer renderer = this.renderer;
        if (visibility == 0) {
            if (renderer != null) {
                renderer.start();
            }
        } else if (renderer != null) {
            renderer.stop();
        }
    }

    public final void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public /* synthetic */ RiveTextureView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
