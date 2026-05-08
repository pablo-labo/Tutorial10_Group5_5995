package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.c;
import com.indeed.android.jobsearch.R;
import defpackage.e47;
import defpackage.emf;
import defpackage.fpe;
import defpackage.gdb;
import defpackage.gga;
import defpackage.ja;
import defpackage.jy1;
import defpackage.ka2;
import defpackage.l5;
import defpackage.nm9;
import defpackage.ong;
import defpackage.pw4;
import defpackage.q83;
import defpackage.rdb;
import defpackage.sac;
import defpackage.tog;
import defpackage.udb;
import defpackage.vjg;
import defpackage.wqf;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int z0 = 0;
    public final ImageView V;
    public final ImageView W;
    public final b a;
    public final SubtitleView a0;
    public final AspectRatioFrameLayout b;
    public final View b0;
    public final View c;
    public final TextView c0;
    public final View d;
    public final androidx.media3.ui.c d0;
    public final boolean e;
    public final FrameLayout e0;
    public final e f;
    public final FrameLayout f0;
    public final Handler g0;
    public final Class<?> h0;
    public final Method i0;
    public final Object j0;
    public gdb k0;
    public boolean l0;
    public c.l m0;
    public d n0;
    public int o0;
    public int p0;
    public Drawable q0;
    public int r0;
    public boolean s0;
    public CharSequence t0;
    public int u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;

    public static class a {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    public final class b implements gdb.c, View.OnClickListener, c.l, c.InterfaceC0067c {
        public final emf.b a = new emf.b();
        public Object b;

        public b() {
        }

        @Override // gdb.c
        public final void B(int i, gdb.d dVar, gdb.d dVar2) {
            androidx.media3.ui.c cVar;
            int i2 = PlayerView.z0;
            PlayerView playerView = PlayerView.this;
            if (playerView.d() && playerView.w0 && (cVar = playerView.d0) != null) {
                cVar.g();
            }
        }

        @Override // gdb.c
        public final void H() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.c;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.b()) {
                    playerView.c();
                    return;
                }
                ImageView imageView = playerView.V;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // gdb.c
        public final void Q(int i, int i2) {
            PlayerView playerView = PlayerView.this;
            View view = playerView.d;
            if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.y0) {
                e eVar = playerView.f;
                eVar.getClass();
                int i3 = 1;
                playerView.g0.post(new nm9(i3, eVar, (SurfaceView) view, new jy1(playerView, 3)));
            }
        }

        @Override // gdb.c
        public final void V(int i, boolean z) {
            int i2 = PlayerView.z0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            if (!playerView.d() || !playerView.w0) {
                playerView.e(false);
                return;
            }
            androidx.media3.ui.c cVar = playerView.d0;
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // gdb.c
        public final void a(tog togVar) {
            PlayerView playerView;
            gdb gdbVar;
            if (togVar.equals(tog.d) || (gdbVar = (playerView = PlayerView.this).k0) == null || gdbVar.b() == 1) {
                return;
            }
            playerView.j();
        }

        @Override // gdb.c
        public final void b0(q83 q83Var) {
            SubtitleView subtitleView = PlayerView.this.a0;
            if (subtitleView != null) {
                subtitleView.setCues(q83Var.a);
            }
        }

        @Override // gdb.c
        public final void f0(wqf wqfVar) {
            PlayerView playerView = PlayerView.this;
            gdb gdbVar = playerView.k0;
            gdbVar.getClass();
            emf emfVarM = gdbVar.O0(17) ? gdbVar.M() : emf.a;
            if (emfVarM.p()) {
                this.b = null;
            } else {
                boolean zO0 = gdbVar.O0(30);
                emf.b bVar = this.a;
                if (!zO0 || gdbVar.D().a.isEmpty()) {
                    Object obj = this.b;
                    if (obj != null) {
                        int iB = emfVarM.b(obj);
                        if (iB != -1) {
                            if (gdbVar.v0() == emfVarM.f(iB, bVar, false).c) {
                                return;
                            }
                        }
                        this.b = null;
                    }
                } else {
                    this.b = emfVarM.f(gdbVar.b0(), bVar, true).b;
                }
            }
            playerView.n(false);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PlayerView.z0;
            PlayerView.this.i();
        }

        @Override // gdb.c
        public final void s(int i) {
            int i2 = PlayerView.z0;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            playerView.m();
            if (!playerView.d() || !playerView.w0) {
                playerView.e(false);
                return;
            }
            androidx.media3.ui.c cVar = playerView.d0;
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // androidx.media3.ui.c.l
        public final void x(int i) {
            int i2 = PlayerView.z0;
            PlayerView.this.l();
        }
    }

    public interface c {
        void a();
    }

    public interface d {
        void e(boolean z);
    }

    public static final class e {
        public SurfaceSyncGroup a;

        public static /* synthetic */ void a(e eVar, SurfaceView surfaceView, jy1 jy1Var) {
            eVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            eVar.a = surfaceSyncGroup;
            ka2.q(surfaceSyncGroup.add(rootSurfaceControl, new udb()));
            jy1Var.run();
            rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
        }

        public final void b() {
            SurfaceSyncGroup surfaceSyncGroup = this.a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.a = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.View, android.view.ViewGroup, androidx.media3.ui.PlayerView] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    public PlayerView(Context context, AttributeSet attributeSet) throws Throwable {
        Throwable th;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        b bVar = new b();
        this.a = bVar;
        this.g0 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.V = null;
            this.W = null;
            this.a0 = null;
            this.b0 = null;
            this.c0 = null;
            this.d0 = null;
            this.e0 = null;
            this.f0 = null;
            this.h0 = null;
            this.i0 = null;
            this.j0 = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            String str = vjg.a;
            imageView.setImageDrawable(resources.getDrawable(2131231086, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sac.d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                th = null;
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z5 = z9;
                i = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.s0 = typedArrayObtainStyledAttributes.getBoolean(16, this.s0);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
                z2 = z11;
                i5 = i12;
                z6 = zHasValue;
                i3 = integer;
                i8 = color;
                i7 = i13;
                i6 = i14;
                i4 = resourceId2;
                z3 = z12;
                z = z10;
                i9 = i11;
                z4 = z8;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            th = null;
            i = 5000;
            i2 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z4 = true;
            z5 = true;
            i9 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i2, (ViewGroup) this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.d = th;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 == 2) {
                this.d = new TextureView(context);
            } else if (i7 == 3) {
                try {
                    int i15 = fpe.d0;
                    this.d = (View) fpe.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(bVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                } catch (Exception e2) {
                    ja.m("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                    throw th;
                }
            } else if (i7 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    a.a(surfaceView);
                }
                this.d = surfaceView;
            } else {
                try {
                    int i16 = ong.b;
                    this.d = (View) ong.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e3) {
                    ja.m("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                    throw th;
                }
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(bVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new e() : null;
        this.e0 = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f0 = (FrameLayout) findViewById(R.id.exo_overlay);
        this.V = (ImageView) findViewById(R.id.exo_image);
        this.p0 = i5;
        try {
            cls = ExoPlayer.class;
            Class<?>[] clsArr = new Class[1];
            i10 = 0;
            try {
                clsArr[0] = ImageOutput.class;
                method = cls.getMethod("setImageOutput", clsArr);
                objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: tdb
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        int i17 = PlayerView.z0;
                        if (!method2.getName().equals("onImageAvailable")) {
                            return null;
                        }
                        Bitmap bitmap = (Bitmap) objArr[1];
                        PlayerView playerView = this.a;
                        playerView.g0.post(new zm3(4, playerView, bitmap));
                        return null;
                    }
                });
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                cls = null;
                objNewProxyInstance = null;
                method = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            i10 = 0;
        }
        this.h0 = cls;
        this.i0 = method;
        this.j0 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.W = imageView2;
        this.o0 = (!z4 || i9 == 0 || imageView2 == null) ? i10 : i9;
        if (i4 != 0) {
            this.q0 = getContext().getDrawable(i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.a0 = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.b0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.r0 = i3;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.c0 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.c cVar = (androidx.media3.ui.c) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (cVar != null) {
            this.d0 = cVar;
        } else if (viewFindViewById3 != null) {
            androidx.media3.ui.c cVar2 = new androidx.media3.ui.c(context, attributeSet);
            this.d0 = cVar2;
            cVar2.setId(R.id.exo_controller);
            cVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(cVar2, iIndexOfChild);
        } else {
            this.d0 = null;
        }
        androidx.media3.ui.c cVar3 = this.d0;
        this.u0 = cVar3 != null ? i : i10;
        this.x0 = z;
        this.v0 = z2;
        this.w0 = z3;
        this.l0 = (!z5 || cVar3 == null) ? i10 : 1;
        if (cVar3 != null) {
            rdb rdbVar = cVar3.a;
            int i17 = rdbVar.z;
            if (i17 != 3 && i17 != 2) {
                rdbVar.f();
                rdbVar.i(2);
            }
            androidx.media3.ui.c cVar4 = this.d0;
            b bVar2 = this.a;
            cVar4.getClass();
            bVar2.getClass();
            cVar4.b0.add(bVar2);
        }
        if (z5) {
            setClickable(true);
        }
        l();
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        gdb gdbVar = playerView.k0;
        if (gdbVar != null && gdbVar.O0(30) && gdbVar.D().a(2)) {
            return;
        }
        ImageView imageView = playerView.V;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.V;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(gdb gdbVar) {
        Class<?> cls = this.h0;
        if (cls == null || !cls.isAssignableFrom(gdbVar.getClass())) {
            return;
        }
        try {
            Method method = this.i0;
            method.getClass();
            Object obj = this.j0;
            obj.getClass();
            method.invoke(gdbVar, obj);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            l5.r(e2);
        }
    }

    public final boolean b() {
        gdb gdbVar = this.k0;
        return gdbVar != null && this.j0 != null && gdbVar.O0(30) && gdbVar.D().a(4);
    }

    public final void c() {
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        gdb gdbVar = this.k0;
        return gdbVar != null && gdbVar.O0(16) && this.k0.k() && this.k0.W();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e eVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (eVar = this.f) != null && this.y0) {
            eVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        gdb gdbVar = this.k0;
        if (gdbVar != null && gdbVar.O0(16) && this.k0.k()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        androidx.media3.ui.c cVar = this.d0;
        if (z && p() && !cVar.j()) {
            e(true);
            return true;
        }
        if ((p() && cVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(d() && this.w0) && p()) {
            androidx.media3.ui.c cVar = this.d0;
            boolean z2 = cVar.j() && cVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.W;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.o0 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        gdb gdbVar = this.k0;
        if (gdbVar == null) {
            return true;
        }
        int iB = gdbVar.b();
        if (!this.v0) {
            return false;
        }
        if (this.k0.O0(17) && this.k0.M().p()) {
            return false;
        }
        if (iB != 1 && iB != 4) {
            gdb gdbVar2 = this.k0;
            gdbVar2.getClass();
            if (gdbVar2.W()) {
                return false;
            }
        }
        return true;
    }

    public List<gga> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f0;
        if (frameLayout != null) {
            arrayList.add(new gga(frameLayout));
        }
        androidx.media3.ui.c cVar = this.d0;
        if (cVar != null) {
            arrayList.add(new gga(cVar));
        }
        return e47.j(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.e0;
        ka2.s(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.o0;
    }

    public boolean getControllerAutoShow() {
        return this.v0;
    }

    public boolean getControllerHideOnTouch() {
        return this.x0;
    }

    public int getControllerShowTimeoutMs() {
        return this.u0;
    }

    public Drawable getDefaultArtwork() {
        return this.q0;
    }

    public int getImageDisplayMode() {
        return this.p0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f0;
    }

    public gdb getPlayer() {
        return this.k0;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        ka2.r(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.a0;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.o0 != 0;
    }

    public boolean getUseController() {
        return this.l0;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.u0;
            androidx.media3.ui.c cVar = this.d0;
            cVar.setShowTimeoutMs(i);
            rdb rdbVar = cVar.a;
            androidx.media3.ui.c cVar2 = rdbVar.a;
            if (!cVar2.l()) {
                cVar2.setVisibility(0);
                cVar2.m();
                ImageView imageView = cVar2.m0;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            rdbVar.k();
        }
    }

    public final void i() {
        if (!p() || this.k0 == null) {
            return;
        }
        androidx.media3.ui.c cVar = this.d0;
        if (!cVar.j()) {
            e(true);
        } else if (this.x0) {
            cVar.g();
        }
    }

    public final void j() {
        gdb gdbVar = this.k0;
        tog togVarD0 = gdbVar != null ? gdbVar.d0() : tog.d;
        int i = togVarD0.a;
        int i2 = togVarD0.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * togVarD0.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r5 = this;
            android.view.View r0 = r5.b0
            if (r0 == 0) goto L29
            gdb r1 = r5.k0
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.b()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.r0
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            gdb r5 = r5.k0
            boolean r5 = r5.W()
            if (r5 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.k():void");
    }

    public final void l() {
        androidx.media3.ui.c cVar = this.d0;
        if (cVar == null || !this.l0) {
            setContentDescription(null);
        } else if (cVar.j()) {
            setContentDescription(this.x0 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.c0;
        if (textView != null) {
            CharSequence charSequence = this.t0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                gdb gdbVar = this.k0;
                if (gdbVar != null) {
                    gdbVar.a();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        gdb gdbVar = this.k0;
        boolean zF = false;
        boolean z2 = (gdbVar == null || !gdbVar.O0(30) || gdbVar.D().a.isEmpty()) ? false : true;
        boolean z3 = this.s0;
        ImageView imageView = this.W;
        View view = this.c;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z2) {
            gdb gdbVar2 = this.k0;
            boolean z4 = gdbVar2 != null && gdbVar2.O0(30) && gdbVar2.D().a(2);
            boolean zB = b();
            if (!z4 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.V;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z4 && !zB && z5) {
                c();
            }
            if (!z4 && !zB && this.o0 != 0) {
                ka2.r(imageView);
                if (gdbVar != null && gdbVar.O0(18) && (bArr = gdbVar.I0().k) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.q0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.V;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.p0 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.k0 == null) {
            return false;
        }
        e(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean p() {
        if (!this.l0) {
            return false;
        }
        ka2.r(this.d0);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        ka2.q(i == 0 || this.W != null);
        if (this.o0 != i) {
            this.o0 = i;
            n(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        ka2.r(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.v0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.w0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        ka2.r(this.d0);
        this.x0 = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(c.InterfaceC0067c interfaceC0067c) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        this.n0 = null;
        cVar.setOnFullScreenModeChangedListener(interfaceC0067c);
    }

    public void setControllerShowTimeoutMs(int i) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        this.u0 = i;
        if (cVar.j()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(c.l lVar) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        CopyOnWriteArrayList<c.l> copyOnWriteArrayList = cVar.b0;
        c.l lVar2 = this.m0;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            copyOnWriteArrayList.remove(lVar2);
        }
        this.m0 = lVar;
        if (lVar != null) {
            copyOnWriteArrayList.add(lVar);
            setControllerVisibilityListener((c) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ka2.q(this.c0 != null);
        this.t0 = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.q0 != drawable) {
            this.q0 = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.y0 = z;
    }

    public void setErrorMessageProvider(pw4<? super PlaybackException> pw4Var) {
        if (pw4Var != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(d dVar) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        this.n0 = dVar;
        cVar.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.o(z);
    }

    public void setImageDisplayMode(int i) {
        ka2.q(this.V != null);
        if (this.p0 != i) {
            this.p0 = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            n(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(defpackage.gdb r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.setPlayer(gdb):void");
    }

    public void setRepeatToggleModes(int i) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        ka2.r(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.r0 != i) {
            this.r0 = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        androidx.media3.ui.c cVar = this.d0;
        ka2.r(cVar);
        cVar.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        androidx.media3.ui.c cVar = this.d0;
        ka2.q((z && cVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.l0 == z) {
            return;
        }
        this.l0 = z;
        if (p()) {
            cVar.setPlayer(this.k0);
        } else if (cVar != null) {
            cVar.g();
            cVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(c cVar) {
        if (cVar != null) {
            setControllerVisibilityListener((c.l) null);
        }
    }
}
