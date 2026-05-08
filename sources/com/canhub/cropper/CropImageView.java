package com.canhub.cropper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.canhub.cropper.CropOverlayView;
import com.canhub.cropper.CropOverlayView.c;
import com.canhub.cropper.g;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.a74;
import defpackage.e73;
import defpackage.t40;
import defpackage.u63;
import defpackage.wl7;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0016\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101R(\u00104\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b7\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u0010\rR(\u0010>\u001a\u0004\u0018\u00010.2\b\u00109\u001a\u0004\u0018\u00010.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010B\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=\"\u0004\bA\u00101R$\u0010D\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010J\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010P\u001a\u0004\u0018\u00010O2\b\u0010P\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u00105\"\u0004\bW\u0010\rR$\u0010Y\u001a\u00020X2\u0006\u0010Y\u001a\u00020X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010a\u001a\u00020X2\u0006\u0010^\u001a\u00020X8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R$\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u00105\"\u0004\bd\u0010\rR$\u0010f\u001a\u00020\t2\u0006\u0010e\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u00105\"\u0004\bg\u0010\rR(\u0010i\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010h8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001d\u0010q\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020X0n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR$\u0010s\u001a\u00020\t2\u0006\u0010r\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u00105\"\u0004\bt\u0010\rR$\u0010v\u001a\u00020\t2\u0006\u0010u\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u00105\"\u0004\bw\u0010\rR$\u0010y\u001a\u00020\t2\u0006\u0010x\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u00105\"\u0004\bz\u0010\rR%\u0010|\u001a\u00020{2\u0006\u0010|\u001a\u00020{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R)\u0010\u0085\u0001\u001a\u00020\u00162\u0007\u0010\u0081\u0001\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010\u0019R(\u0010\u0086\u0001\u001a\u00020X2\u0007\u0010\u0086\u0001\u001a\u00020X8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010[\"\u0005\b\u0088\u0001\u0010]R(\u0010\u008c\u0001\u001a\u00020X2\u0007\u0010\u0089\u0001\u001a\u00020X8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010[\"\u0005\b\u008b\u0001\u0010]R\u0017\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R0\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u008f\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0015\u0010\u009d\u0001\u001a\u00030\u009a\u00018F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006©\u0001"}, d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$b;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "multiTouchEnabled", "Lj6g;", "setMultiTouchEnabled", "(Z)V", "centerMoveEnabled", "setCenterMoveEnabled", "fixAspectRatio", "setFixedAspectRatio", "Lcom/canhub/cropper/CropImageOptions;", "options", "setImageCropOptions", "(Lcom/canhub/cropper/CropImageOptions;)V", "", "snapRadius", "setSnapRadius", "(F)V", "Lcom/canhub/cropper/CropImageView$g;", "listener", "setOnSetCropOverlayReleasedListener", "(Lcom/canhub/cropper/CropImageView$g;)V", "Lcom/canhub/cropper/CropImageView$f;", "setOnSetCropOverlayMovedListener", "(Lcom/canhub/cropper/CropImageView$f;)V", "Lcom/canhub/cropper/CropImageView$h;", "setOnCropWindowChangedListener", "(Lcom/canhub/cropper/CropImageView$h;)V", "Lcom/canhub/cropper/CropImageView$i;", "setOnSetImageUriCompleteListener", "(Lcom/canhub/cropper/CropImageView$i;)V", "Lcom/canhub/cropper/CropImageView$e;", "setOnCropImageCompleteListener", "(Lcom/canhub/cropper/CropImageView$e;)V", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/net/Uri;", "uri", "setImageUriAsync", "(Landroid/net/Uri;)V", "j0", "Z", "isSaveBitmapToInstanceState", "()Z", "setSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "()V", "value", "u0", "Landroid/net/Uri;", "getImageUri", "()Landroid/net/Uri;", "imageUri", "E0", "getCustomOutputUri", "setCustomOutputUri", "customOutputUri", "Lcom/canhub/cropper/CropImageView$k;", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$k;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$k;)V", "Lcom/canhub/cropper/CropImageView$c;", "cropShape", "getCropShape", "()Lcom/canhub/cropper/CropImageView$c;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$c;)V", "Lcom/canhub/cropper/CropImageView$a;", "cornerShape", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$a;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$a;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "(I)V", "degrees", "getRotatedDegrees", "setRotatedDegrees", "rotatedDegrees", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "flipVertically", "isFlippedVertically", "setFlippedVertically", "Lcom/canhub/cropper/CropImageView$d;", "guidelines", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$d;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$d;)V", "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", "aspectRatio", "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "cropLabelTextSize", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "getImageResource", "setImageResource", "imageResource", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "wholeImageRect", "rect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "Landroid/graphics/RectF;", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropWindowRect", "", "getCropPoints", "()[F", "cropPoints", "c", "a", "k", "d", "j", "g", "f", "h", "i", "e", "b", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropImageView extends FrameLayout implements CropOverlayView.b {
    public int A0;
    public boolean B0;
    public WeakReference<com.canhub.cropper.d> C0;
    public WeakReference<com.canhub.cropper.a> D0;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public Uri customOutputUri;
    public final float[] V;
    public e73 W;
    public final ImageView a;
    public Bitmap a0;
    public final CropOverlayView b;
    public int b0;
    public final Matrix c;
    public int c0;
    public final Matrix d;
    public boolean d0;
    public final ProgressBar e;
    public boolean e0;
    public final float[] f;
    public int f0;
    public int g0;
    public int h0;
    public k i0;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public boolean isSaveBitmapToInstanceState;
    public boolean k0;
    public boolean l0;
    public String m0;
    public float n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public int r0;
    public i s0;
    public e t0;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public Uri imageUri;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public RectF z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("RECTANGLE", 0);
            a = aVar;
            a aVar2 = new a("OVAL", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static class b {
        public final int V;
        public final int W;
        public final Uri a;
        public final Uri b;
        public final Exception c;
        public final float[] d;
        public final Rect e;
        public final Rect f;

        public b(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i, int i2) {
            fArr.getClass();
            this.a = uri;
            this.b = uri2;
            this.c = exc;
            this.d = fArr;
            this.e = rect;
            this.f = rect2;
            this.V = i;
            this.W = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final /* synthetic */ c[] c;

        static {
            c cVar = new c("RECTANGLE", 0);
            a = cVar;
            c cVar2 = new c("OVAL", 1);
            b = cVar2;
            c = new c[]{cVar, cVar2, new c("RECTANGLE_VERTICAL_ONLY", 2), new c("RECTANGLE_HORIZONTAL_ONLY", 3)};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final /* synthetic */ d[] c;

        /* JADX INFO: Fake field, exist only in values array */
        d EF0;

        static {
            d dVar = new d("OFF", 0);
            d dVar2 = new d("ON_TOUCH", 1);
            a = dVar2;
            d dVar3 = new d("ON", 2);
            b = dVar3;
            c = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) c.clone();
        }
    }

    public interface e {
        void h(CropImageView cropImageView, b bVar);
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
    }

    public interface i {
        void l(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        public static final j a;
        public static final j b;
        public static final j c;
        public static final j d;
        public static final j e;
        public static final /* synthetic */ j[] f;

        static {
            j jVar = new j("NONE", 0);
            a = jVar;
            j jVar2 = new j("SAMPLING", 1);
            b = jVar2;
            j jVar3 = new j("RESIZE_INSIDE", 2);
            c = jVar3;
            j jVar4 = new j("RESIZE_FIT", 3);
            d = jVar4;
            j jVar5 = new j("RESIZE_EXACT", 4);
            e = jVar5;
            f = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class k {
        public static final k a;
        public static final k b;
        public static final k c;
        public static final /* synthetic */ k[] d;

        static {
            k kVar = new k("FIT_CENTER", 0);
            a = kVar;
            k kVar2 = new k("CENTER", 1);
            k kVar3 = new k("CENTER_CROP", 2);
            b = kVar3;
            k kVar4 = new k("CENTER_INSIDE", 3);
            c = kVar4;
            d = new k[]{kVar, kVar2, kVar3, kVar4};
        }

        public k() {
            throw null;
        }

        public static k valueOf(String str) {
            return (k) Enum.valueOf(k.class, str);
        }

        public static k[] values() {
            return (k[]) d.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CropImageView(android.content.Context r53, android.util.AttributeSet r54) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // com.canhub.cropper.CropOverlayView.b
    public final void a(boolean z) {
        d(z, true);
    }

    public final void b(float f2, float f3, boolean z, boolean z2) {
        if (this.a0 != null) {
            if (f2 <= 0.0f || f3 <= 0.0f) {
                return;
            }
            Matrix matrix = this.c;
            Matrix matrix2 = this.d;
            matrix.invert(matrix2);
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            matrix2.mapRect(cropWindowRect);
            matrix.reset();
            matrix.postTranslate((f2 - r0.getWidth()) / 2.0f, (f3 - r0.getHeight()) / 2.0f);
            e();
            int i2 = this.c0;
            float[] fArr = this.f;
            if (i2 > 0) {
                Rect rect = com.canhub.cropper.g.a;
                fArr.getClass();
                matrix.postRotate(i2, (com.canhub.cropper.g.n(fArr) + com.canhub.cropper.g.o(fArr)) / 2.0f, (com.canhub.cropper.g.p(fArr) + com.canhub.cropper.g.l(fArr)) / 2.0f);
                e();
            }
            Rect rect2 = com.canhub.cropper.g.a;
            fArr.getClass();
            float fMin = Math.min(f2 / (com.canhub.cropper.g.o(fArr) - com.canhub.cropper.g.n(fArr)), f3 / (com.canhub.cropper.g.l(fArr) - com.canhub.cropper.g.p(fArr)));
            k kVar = this.i0;
            k kVar2 = k.a;
            k kVar3 = k.b;
            if (kVar == kVar2 || ((kVar == k.c && fMin < 1.0f) || (fMin > 1.0f && this.q0))) {
                matrix.postScale(fMin, fMin, (com.canhub.cropper.g.n(fArr) + com.canhub.cropper.g.o(fArr)) / 2.0f, (com.canhub.cropper.g.p(fArr) + com.canhub.cropper.g.l(fArr)) / 2.0f);
                e();
            } else if (kVar == kVar3) {
                this.w0 = Math.max(getWidth() / (com.canhub.cropper.g.o(fArr) - com.canhub.cropper.g.n(fArr)), getHeight() / (com.canhub.cropper.g.l(fArr) - com.canhub.cropper.g.p(fArr)));
            }
            boolean z3 = this.d0;
            float f4 = this.w0;
            float f5 = z3 ? -f4 : f4;
            if (this.e0) {
                f4 = -f4;
            }
            matrix.postScale(f5, f4, (com.canhub.cropper.g.n(fArr) + com.canhub.cropper.g.o(fArr)) / 2.0f, (com.canhub.cropper.g.p(fArr) + com.canhub.cropper.g.l(fArr)) / 2.0f);
            e();
            matrix.mapRect(cropWindowRect);
            if (this.i0 == kVar3 && z && !z2) {
                this.x0 = 0.0f;
                this.y0 = 0.0f;
            } else if (z) {
                this.x0 = f2 > com.canhub.cropper.g.o(fArr) - com.canhub.cropper.g.n(fArr) ? 0.0f : Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerX(), -com.canhub.cropper.g.n(fArr)), getWidth() - com.canhub.cropper.g.o(fArr)) / f5;
                this.y0 = f3 <= com.canhub.cropper.g.l(fArr) - com.canhub.cropper.g.p(fArr) ? Math.max(Math.min((f3 / 2.0f) - cropWindowRect.centerY(), -com.canhub.cropper.g.p(fArr)), getHeight() - com.canhub.cropper.g.l(fArr)) / f4 : 0.0f;
            } else {
                this.x0 = Math.min(Math.max(this.x0 * f5, -cropWindowRect.left), (-cropWindowRect.right) + f2) / f5;
                this.y0 = Math.min(Math.max(this.y0 * f4, -cropWindowRect.top), (-cropWindowRect.bottom) + f3) / f4;
            }
            matrix.postTranslate(this.x0 * f5, this.y0 * f4);
            cropWindowRect.offset(this.x0 * f5, this.y0 * f4);
            cropOverlayView.setCropWindowRect(cropWindowRect);
            e();
            cropOverlayView.invalidate();
            ImageView imageView = this.a;
            if (z2) {
                e73 e73Var = this.W;
                e73Var.getClass();
                System.arraycopy(fArr, 0, e73Var.d, 0, 8);
                e73Var.f.set(e73Var.b.getCropWindowRect());
                matrix.getValues(e73Var.W);
                imageView.startAnimation(this.W);
            } else {
                imageView.setImageMatrix(matrix);
            }
            j(false);
        }
    }

    public final void c() {
        Bitmap bitmap = this.a0;
        if (bitmap != null && (this.h0 > 0 || this.imageUri != null)) {
            bitmap.getClass();
            bitmap.recycle();
        }
        this.a0 = null;
        this.h0 = 0;
        this.imageUri = null;
        this.v0 = 1;
        this.c0 = 0;
        this.w0 = 1.0f;
        this.x0 = 0.0f;
        this.y0 = 0.0f;
        this.c.reset();
        this.z0 = null;
        this.A0 = 0;
        this.a.setImageBitmap(null);
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.d(boolean, boolean):void");
    }

    public final void e() {
        float[] fArr = this.f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        this.a0.getClass();
        fArr[2] = r4.getWidth();
        fArr[3] = 0.0f;
        this.a0.getClass();
        fArr[4] = r6.getWidth();
        this.a0.getClass();
        fArr[5] = r6.getHeight();
        fArr[6] = 0.0f;
        this.a0.getClass();
        fArr[7] = r9.getHeight();
        Matrix matrix = this.c;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.V;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void f(int i2) {
        if (this.a0 != null) {
            int i3 = i2 < 0 ? (i2 % 360) + 360 : i2 % 360;
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            boolean z = !cropOverlayView.r0 && ((46 <= i3 && i3 < 135) || (216 <= i3 && i3 < 305));
            RectF rectF = com.canhub.cropper.g.c;
            rectF.set(cropOverlayView.getCropWindowRect());
            float fHeight = (z ? rectF.height() : rectF.width()) / 2.0f;
            float fWidth = (z ? rectF.width() : rectF.height()) / 2.0f;
            if (z) {
                boolean z2 = this.d0;
                this.d0 = this.e0;
                this.e0 = z2;
            }
            Matrix matrix = this.c;
            Matrix matrix2 = this.d;
            matrix.invert(matrix2);
            float[] fArr = com.canhub.cropper.g.d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.c0 = (this.c0 + i3) % 360;
            b(getWidth(), getHeight(), true, false);
            float[] fArr2 = com.canhub.cropper.g.e;
            matrix.mapPoints(fArr2, fArr);
            float fSqrt = this.w0 / ((float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.w0 = fSqrt;
            this.w0 = Math.max(fSqrt, 1.0f);
            b(getWidth(), getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            float fSqrt2 = (float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f2 = fHeight * fSqrt2;
            float f3 = fWidth * fSqrt2;
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            rectF.set(f4 - f2, f5 - f3, f4 + f2, f5 + f3);
            cropOverlayView.g();
            cropOverlayView.setCropWindowRect(rectF);
            b(getWidth(), getHeight(), true, false);
            d(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.e(cropWindowRect);
            com.canhub.cropper.h hVar = cropOverlayView.V;
            hVar.getClass();
            hVar.a.set(cropWindowRect);
        }
    }

    public final void g(Bitmap bitmap, int i2, Uri uri, int i3, int i4) {
        Bitmap bitmap2 = this.a0;
        if (bitmap2 == null || !wl7.b(bitmap2, bitmap)) {
            c();
            this.a0 = bitmap;
            this.a.setImageBitmap(bitmap);
            this.imageUri = uri;
            this.h0 = i2;
            this.v0 = i3;
            this.c0 = i4;
            b(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.b;
            if (cropOverlayView != null) {
                cropOverlayView.g();
                h();
            }
        }
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return new Pair<>(Integer.valueOf(cropOverlayView.getS0()), Integer.valueOf(cropOverlayView.getT0()));
    }

    public final a getCornerShape() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return cropOverlayView.getCornerShape();
    }

    /* JADX INFO: renamed from: getCropLabelText, reason: from getter */
    public final String getM0() {
        return this.m0;
    }

    /* JADX INFO: renamed from: getCropLabelTextColor, reason: from getter */
    public final int getO0() {
        return this.o0;
    }

    /* JADX INFO: renamed from: getCropLabelTextSize, reason: from getter */
    public final float getN0() {
        return this.n0;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f2 = cropWindowRect.left;
        float f3 = cropWindowRect.top;
        float f4 = cropWindowRect.right;
        float f5 = cropWindowRect.bottom;
        float[] fArr = {f2, f3, f4, f3, f4, f5, f2, f5};
        Matrix matrix = this.c;
        Matrix matrix2 = this.d;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = fArr[i2] * this.v0;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i2 = this.v0;
        Bitmap bitmap = this.a0;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i2;
        int height = i2 * bitmap.getHeight();
        Rect rect = com.canhub.cropper.g.a;
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return com.canhub.cropper.g.m(cropPoints, width, height, cropOverlayView.r0, cropOverlayView.getS0(), cropOverlayView.getT0());
    }

    public final c getCropShape() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        g.a aVarE;
        Bitmap bitmap = this.a0;
        if (bitmap == null) {
            return null;
        }
        Uri uri = this.imageUri;
        CropOverlayView cropOverlayView = this.b;
        if (uri == null || this.v0 <= 1) {
            Rect rect = com.canhub.cropper.g.a;
            float[] cropPoints = getCropPoints();
            int i2 = this.c0;
            cropOverlayView.getClass();
            aVarE = com.canhub.cropper.g.e(bitmap, cropPoints, i2, cropOverlayView.r0, cropOverlayView.getS0(), cropOverlayView.getT0(), this.d0, this.e0);
        } else {
            Rect rect2 = com.canhub.cropper.g.a;
            Context context = getContext();
            context.getClass();
            Uri uri2 = this.imageUri;
            float[] cropPoints2 = getCropPoints();
            int i3 = this.c0;
            Bitmap bitmap2 = this.a0;
            bitmap2.getClass();
            int width = bitmap2.getWidth() * this.v0;
            Bitmap bitmap3 = this.a0;
            bitmap3.getClass();
            int height = bitmap3.getHeight() * this.v0;
            cropOverlayView.getClass();
            aVarE = com.canhub.cropper.g.c(context, uri2, cropPoints2, i3, width, height, cropOverlayView.r0, cropOverlayView.getS0(), cropOverlayView.getT0(), 0, 0, this.d0, this.e0);
        }
        return com.canhub.cropper.g.q(aVarE.a, 0, 0, j.c);
    }

    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    public final d getGuidelines() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return cropOverlayView.getGuidelines();
    }

    /* JADX INFO: renamed from: getImageResource, reason: from getter */
    public final int getH0() {
        return this.h0;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* JADX INFO: renamed from: getMaxZoom, reason: from getter */
    public final int getR0() {
        return this.r0;
    }

    /* JADX INFO: renamed from: getRotatedDegrees, reason: from getter */
    public final int getC0() {
        return this.c0;
    }

    /* JADX INFO: renamed from: getScaleType, reason: from getter */
    public final k getI0() {
        return this.i0;
    }

    public final Rect getWholeImageRect() {
        int i2 = this.v0;
        Bitmap bitmap = this.a0;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i2, bitmap.getHeight() * i2);
    }

    public final void h() {
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.k0 || this.a0 == null) ? 4 : 0);
        }
    }

    public final void i() {
        this.e.setVisibility(this.p0 && ((this.a0 == null && this.C0 != null) || this.D0 != null) ? 0 : 4);
    }

    public final void j(boolean z) {
        Bitmap bitmap = this.a0;
        CropOverlayView cropOverlayView = this.b;
        if (bitmap != null && !z) {
            Rect rect = com.canhub.cropper.g.a;
            float[] fArr = this.V;
            fArr.getClass();
            float fO = (this.v0 * 100.0f) / (com.canhub.cropper.g.o(fArr) - com.canhub.cropper.g.n(fArr));
            float fL = (this.v0 * 100.0f) / (com.canhub.cropper.g.l(fArr) - com.canhub.cropper.g.p(fArr));
            cropOverlayView.getClass();
            float width = getWidth();
            float height = getHeight();
            com.canhub.cropper.h hVar = cropOverlayView.V;
            hVar.e = width;
            hVar.f = height;
            hVar.k = fO;
            hVar.l = fL;
        }
        cropOverlayView.getClass();
        cropOverlayView.h(getWidth(), getHeight(), z ? null : this.f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f0 <= 0 || this.g0 <= 0) {
            j(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f0;
        layoutParams.height = this.g0;
        setLayoutParams(layoutParams);
        if (this.a0 == null) {
            j(true);
            return;
        }
        float f2 = i4 - i2;
        float f3 = i5 - i3;
        b(f2, f3, true, false);
        RectF rectF = this.z0;
        if (rectF == null) {
            if (this.B0) {
                this.B0 = false;
                d(false, false);
                return;
            }
            return;
        }
        int i6 = this.A0;
        if (i6 != this.b0) {
            this.c0 = i6;
            b(f2, f3, true, false);
            this.A0 = 0;
        }
        this.c.mapRect(this.z0);
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        d(false, false);
        if (cropOverlayView != null) {
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.e(cropWindowRect);
            com.canhub.cropper.h hVar = cropOverlayView.V;
            hVar.getClass();
            hVar.a.set(cropWindowRect);
        }
        this.z0 = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int width;
        int height;
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        Bitmap bitmap = this.a0;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? ((double) size) / ((double) bitmap.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? ((double) size2) / ((double) bitmap.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) bitmap.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) bitmap.getWidth()) * height2);
            height = size2;
        }
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        this.f0 = size;
        this.g0 = size2;
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRestoreInstanceState(android.os.Parcelable r10) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Uri uriR;
        if (this.imageUri == null && this.a0 == null && this.h0 < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.h0 < 1) {
            Rect rect = com.canhub.cropper.g.a;
            Context context = getContext();
            context.getClass();
            Bitmap bitmap = this.a0;
            Uri uri = this.customOutputUri;
            try {
                bitmap.getClass();
                uriR = com.canhub.cropper.g.r(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
            } catch (Exception e2) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e2);
                uriR = null;
            }
        } else {
            uriR = this.imageUri;
        }
        if (uriR != null && this.a0 != null) {
            String strH = t40.h();
            Rect rect2 = com.canhub.cropper.g.a;
            com.canhub.cropper.g.g = new Pair<>(strH, new WeakReference(this.a0));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", strH);
        }
        WeakReference<com.canhub.cropper.d> weakReference = this.C0;
        com.canhub.cropper.d dVar = weakReference != null ? weakReference.get() : null;
        if (dVar != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", dVar.b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriR);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.h0);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.v0);
        bundle.putInt("DEGREES_ROTATED", this.c0);
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getC0());
        RectF rectF = com.canhub.cropper.g.c;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.c;
        Matrix matrix2 = this.d;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        c cropShape = cropOverlayView.getCropShape();
        cropShape.getClass();
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.q0);
        bundle.putInt("CROP_MAX_ZOOM", this.r0);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.d0);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.e0);
        bundle.putBoolean("SHOW_CROP_LABEL", this.l0);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.B0 = i4 > 0 && i5 > 0;
    }

    public final void setAutoZoomEnabled(boolean z) {
        if (this.q0 != z) {
            this.q0 = z;
            d(false, false);
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        if (cropOverlayView.f != centerMoveEnabled) {
            cropOverlayView.f = centerMoveEnabled;
            d(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(a aVar) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        aVar.getClass();
        cropOverlayView.setCropCornerShape(aVar);
    }

    public final void setCropLabelText(String str) {
        str.getClass();
        this.m0 = str;
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(str);
        }
    }

    public final void setCropLabelTextColor(int i2) {
        this.o0 = i2;
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i2);
        }
    }

    public final void setCropLabelTextSize(float f2) {
        this.n0 = getN0();
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f2);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(c cVar) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cVar.getClass();
        cropOverlayView.setCropShape(cVar);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.customOutputUri = uri;
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    public final void setFlippedHorizontally(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            b(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(d dVar) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        dVar.getClass();
        cropOverlayView.setGuidelines(dVar);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.setInitialCropWindowRect(null);
        g(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        options.getClass();
        boolean z = options.c0;
        boolean z2 = options.a0;
        boolean z3 = options.Y;
        setScaleType(options.X);
        this.customOutputUri = options.E0;
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.d0);
        setCenterMoveEnabled(options.e0);
        setShowCropOverlay(z3);
        setShowProgressBar(z2);
        setAutoZoomEnabled(z);
        setMaxZoom(options.g0);
        setFlippedHorizontally(options.R0);
        setFlippedVertically(options.S0);
        this.q0 = z;
        this.k0 = z3;
        this.p0 = z2;
        this.e.setIndeterminateTintList(ColorStateList.valueOf(options.b0));
    }

    public final void setImageResource(int i2) {
        if (i2 != 0) {
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.setInitialCropWindowRect(null);
            g(BitmapFactory.decodeResource(getResources(), i2), i2, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        com.canhub.cropper.d dVar;
        if (uri != null) {
            WeakReference<com.canhub.cropper.d> weakReference = this.C0;
            if (weakReference != null && (dVar = weakReference.get()) != null) {
                dVar.f.h(null);
            }
            c();
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            context.getClass();
            WeakReference<com.canhub.cropper.d> weakReference2 = new WeakReference<>(new com.canhub.cropper.d(context, this, uri));
            this.C0 = weakReference2;
            com.canhub.cropper.d dVar2 = weakReference2.get();
            if (dVar2 != null) {
                dVar2.f = u63.Y(dVar2, a74.a, null, new com.canhub.cropper.f(dVar2, null), 2);
            }
            i();
        }
    }

    public final void setMaxZoom(int i2) {
        if (this.r0 == i2 || i2 <= 0) {
            return;
        }
        this.r0 = i2;
        d(false, false);
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        if (cropOverlayView.e != multiTouchEnabled) {
            cropOverlayView.e = multiTouchEnabled;
            if (multiTouchEnabled && cropOverlayView.d == null) {
                cropOverlayView.d = new ScaleGestureDetector(cropOverlayView.getContext(), cropOverlayView.new c());
            }
            d(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(e listener) {
        this.t0 = listener;
    }

    public final void setOnCropWindowChangedListener(h listener) {
    }

    public final void setOnSetCropOverlayMovedListener(f listener) {
    }

    public final void setOnSetCropOverlayReleasedListener(g listener) {
    }

    public final void setOnSetImageUriCompleteListener(i listener) {
        this.s0 = listener;
    }

    public final void setRotatedDegrees(int i2) {
        int i3 = this.c0;
        if (i3 != i2) {
            f(i2 - i3);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z) {
        this.isSaveBitmapToInstanceState = z;
    }

    public final void setScaleType(k kVar) {
        kVar.getClass();
        if (kVar != this.i0) {
            this.i0 = kVar;
            this.w0 = 1.0f;
            this.y0 = 0.0f;
            this.x0 = 0.0f;
            CropOverlayView cropOverlayView = this.b;
            if (cropOverlayView != null) {
                cropOverlayView.g();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            CropOverlayView cropOverlayView = this.b;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z);
            }
        }
    }

    public final void setShowCropOverlay(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            h();
        }
    }

    public final void setShowProgressBar(boolean z) {
        if (this.p0 != z) {
            this.p0 = z;
            i();
        }
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }
}
