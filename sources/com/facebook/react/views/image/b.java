package com.facebook.react.views.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.a2;
import defpackage.a37;
import defpackage.b17;
import defpackage.bbb;
import defpackage.dmc;
import defpackage.dnd;
import defpackage.fnd;
import defpackage.g6d;
import defpackage.h11;
import defpackage.h37;
import defpackage.hx5;
import defpackage.im3;
import defpackage.ix5;
import defpackage.jx5;
import defpackage.lo7;
import defpackage.m5d;
import defpackage.mkf;
import defpackage.n82;
import defpackage.na1;
import defpackage.nn2;
import defpackage.o49;
import defpackage.ogd;
import defpackage.ou8;
import defpackage.pu8;
import defpackage.q07;
import defpackage.r6;
import defpackage.v71;
import defpackage.vu2;
import defpackage.wl7;
import defpackage.wlc;
import defpackage.x4d;
import defpackage.zi1;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends jx5 {
    public static final Matrix t0 = new Matrix();
    public final a2<?, ?, ?, ?> W;
    public final Object a0;
    public final ArrayList b0;
    public h37 c0;
    public h37 d0;
    public Drawable e0;
    public h11 f0;
    public int g0;
    public dnd h0;
    public Shader.TileMode i0;
    public boolean j0;
    public a k0;
    public lo7 l0;
    public c m0;
    public vu2<b17> n0;
    public int o0;
    public boolean p0;
    public ReadableMap q0;
    public float r0;
    public a37 s0;

    public final class a extends na1 {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.na1, defpackage.vhb
        public final n82<Bitmap> a(Bitmap bitmap, bbb bbbVar) {
            bitmap.getClass();
            bbbVar.getClass();
            b bVar = b.this;
            Rect rect = new Rect(0, 0, bVar.getWidth(), bVar.getHeight());
            dnd dndVar = bVar.h0;
            Matrix matrix = b.t0;
            dndVar.f(matrix, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = bVar.i0;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            im3 im3VarA = bbbVar.a(bVar.getWidth(), bVar.getHeight(), Bitmap.Config.ARGB_8888);
            try {
                new Canvas((Bitmap) im3VarA.P()).drawRect(rect, paint);
                return im3VarA.clone();
            } finally {
                im3VarA.close();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.image.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0140b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q07.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[a37.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class c extends wlc<b17> {
        public final /* synthetic */ EventDispatcher d;
        public final /* synthetic */ b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EventDispatcher eventDispatcher, b bVar) {
            super(new wlc.a());
            this.d = eventDispatcher;
            this.e = bVar;
        }

        @Override // defpackage.vu2
        public final void c(String str, Throwable th) {
            str.getClass();
            th.getClass();
            EventDispatcher eventDispatcher = this.d;
            if (eventDispatcher == null) {
                return;
            }
            b bVar = this.e;
            eventDispatcher.a(new com.facebook.react.views.image.a(dmc.h(bVar), bVar.getId(), 1, th.getMessage(), null, 0, 0, 0, 0));
        }

        @Override // defpackage.vu2
        public final void j(String str, Object obj, Animatable animatable) {
            EventDispatcher eventDispatcher;
            b17 b17Var = (b17) obj;
            str.getClass();
            if (b17Var != null) {
                b bVar = this.e;
                if (bVar.getImageSource$ReactAndroid_release() == null || (eventDispatcher = this.d) == null) {
                    return;
                }
                int iH = dmc.h(bVar);
                int id = bVar.getId();
                h37 imageSource$ReactAndroid_release = bVar.getImageSource$ReactAndroid_release();
                eventDispatcher.a(new com.facebook.react.views.image.a(iH, id, 2, null, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.a : null, b17Var.getWidth(), b17Var.getHeight(), 0, 0));
                eventDispatcher.a(new com.facebook.react.views.image.a(dmc.h(bVar), bVar.getId(), 3));
            }
        }

        @Override // defpackage.vu2
        public final void l(Object obj, String str) {
            str.getClass();
            EventDispatcher eventDispatcher = this.d;
            if (eventDispatcher == null) {
                return;
            }
            b bVar = this.e;
            eventDispatcher.a(new com.facebook.react.views.image.a(dmc.h(bVar), bVar.getId(), 4));
        }

        @Override // defpackage.wlc
        public final void v(int i) {
            EventDispatcher eventDispatcher = this.d;
            if (eventDispatcher != null) {
                b bVar = this.e;
                if (bVar.getImageSource$ReactAndroid_release() == null) {
                    return;
                }
                int iH = dmc.h(bVar);
                int id = bVar.getId();
                h37 imageSource$ReactAndroid_release = bVar.getImageSource$ReactAndroid_release();
                eventDispatcher.a(new com.facebook.react.views.image.a(iH, id, 5, null, imageSource$ReactAndroid_release != null ? imageSource$ReactAndroid_release.a : null, 0, 0, i, 10000));
            }
        }
    }

    public b(mkf mkfVar, a2 a2Var, Object obj) {
        mkfVar.getClass();
        ix5 ix5Var = new ix5(mkfVar.getResources());
        ogd ogdVar = new ogd();
        if (ogdVar.b == null) {
            ogdVar.b = new float[8];
        }
        Arrays.fill(ogdVar.b, 0.0f);
        ogdVar.d = true;
        ix5Var.g = ogdVar;
        hx5 hx5Var = new hx5(ix5Var);
        super(mkfVar);
        setHierarchy(hx5Var);
        this.W = a2Var;
        this.a0 = obj;
        this.b0 = new ArrayList();
        this.h0 = fnd.b;
        this.i0 = Shader.TileMode.CLAMP;
        this.o0 = -1;
        this.r0 = 1.0f;
        this.s0 = a37.a;
        setLegacyVisibilityHandlingEnabled(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static q07 c(String str) {
        q07 q07Var = q07.a;
        if (str == null) {
            return q07Var;
        }
        switch (str.hashCode()) {
            case -1564134880:
                if (str.equals("force-cache")) {
                    return q07.c;
                }
                return q07Var;
            case -934641255:
                if (str.equals("reload")) {
                    return q07.b;
                }
                return q07Var;
            case 706834161:
                if (str.equals("only-if-cached")) {
                    return q07.d;
                }
                return q07Var;
            case 1544803905:
                str.equals("default");
                return q07Var;
            default:
                return q07Var;
        }
    }

    private final x4d getResizeOptions() {
        int iRound = Math.round(getWidth() * this.r0);
        int iRound2 = Math.round(getHeight() * this.r0);
        if (iRound <= 0 || iRound2 <= 0) {
            return null;
        }
        return new x4d(iRound, iRound2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.b.d():void");
    }

    public final h37 getImageSource$ReactAndroid_release() {
        return this.c0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        v71.a(this, canvas);
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            if (this.m0 != null) {
                Context context = getContext();
                context.getClass();
                EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, getId());
                if (eventDispatcherE != null) {
                    eventDispatcherE.a(new com.facebook.react.views.image.a(dmc.h(this), getId(), 1, e.getMessage(), null, 0, 0, 0, 0));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        boolean z = true;
        if (!this.j0 && this.b0.size() <= 1 && this.i0 == Shader.TileMode.CLAMP) {
            z = false;
        }
        this.j0 = z;
        d();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        v71.j(this, Integer.valueOf(i));
    }

    public final void setBlurRadius(float f) {
        int iG = ((int) nn2.G(f)) / 2;
        this.l0 = iG == 0 ? null : new lo7(iG);
        this.j0 = true;
    }

    public final void setBorderColor(int i) {
        v71.l(this, o49.b, Integer.valueOf(i));
    }

    public final void setBorderRadius(float f) {
        v71.m(this, zi1.a, Float.isNaN(f) ? null : new ou8(nn2.C(f), pu8.a));
    }

    public final void setBorderWidth(float f) {
        v71.o(this, o49.b, Float.valueOf(f));
    }

    public final void setControllerListener(vu2<b17> vu2Var) {
        this.n0 = vu2Var;
        this.j0 = true;
        d();
    }

    public final void setDefaultSource(String str) {
        Context context = getContext();
        context.getClass();
        int iA = m5d.a(context, str);
        Drawable drawable = null;
        if (iA > 0) {
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = g6d.a;
            drawable = resources.getDrawable(iA, null);
        }
        if (wl7.b(this.e0, drawable)) {
            return;
        }
        this.e0 = drawable;
        this.j0 = true;
    }

    public final void setFadeDuration(int i) {
        this.o0 = i;
    }

    public final void setHeaders(ReadableMap readableMap) {
        this.q0 = readableMap;
    }

    public final void setImageSource$ReactAndroid_release(h37 h37Var) {
        this.c0 = h37Var;
    }

    public final void setLoadingIndicatorSource(String str) {
        Drawable drawable;
        Context context = getContext();
        context.getClass();
        int iA = m5d.a(context, str);
        h11 h11Var = null;
        if (iA > 0) {
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = g6d.a;
            drawable = resources.getDrawable(iA, null);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            h11Var = new h11(drawable);
            h11Var.f = 0.0f;
            h11Var.V = false;
            h11Var.d = 1000;
            h11Var.e = true;
        }
        if (wl7.b(this.f0, h11Var)) {
            return;
        }
        this.f0 = h11Var;
        this.j0 = true;
    }

    public final void setOverlayColor(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            this.j0 = true;
        }
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.p0 = z;
    }

    public final void setResizeMethod(a37 a37Var) {
        a37Var.getClass();
        if (this.s0 != a37Var) {
            this.s0 = a37Var;
            this.j0 = true;
        }
    }

    public final void setResizeMultiplier(float f) {
        if (Math.abs(this.r0 - f) > 9.999999747378752E-5d) {
            this.r0 = f;
            this.j0 = true;
        }
    }

    public final void setScaleType(dnd dndVar) {
        dndVar.getClass();
        if (this.h0 != dndVar) {
            this.h0 = dndVar;
            this.j0 = true;
        }
    }

    public final void setShouldNotifyLoadEvents(boolean z) {
        if (z == (this.m0 != null)) {
            return;
        }
        if (z) {
            Context context = getContext();
            context.getClass();
            this.m0 = new c(dmc.e((ReactContext) context, getId()), this);
        } else {
            this.m0 = null;
        }
        this.j0 = true;
    }

    public final void setSource(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        q07 q07Var = q07.a;
        if (readableArray == null || readableArray.size() == 0) {
            Context context = getContext();
            context.getClass();
            arrayList.add(new h37(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", q07Var, 12));
        } else {
            if (readableArray.size() == 1) {
                ReadableMap map = readableArray.getMap(0);
                if (map == null) {
                    r6.g("Required value was null.");
                    return;
                }
                q07 q07VarC = c(map.getString("cache"));
                Context context2 = getContext();
                context2.getClass();
                h37 h37Var = new h37(context2, map.getString("uri"), q07VarC, 12);
                if (wl7.b(Uri.EMPTY, h37Var.c)) {
                    map.getString("uri");
                    Context context3 = getContext();
                    context3.getClass();
                    h37Var = new h37(context3, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", q07Var, 12);
                }
                arrayList.add(h37Var);
            } else {
                int size = readableArray.size();
                for (int i = 0; i < size; i++) {
                    ReadableMap map2 = readableArray.getMap(i);
                    if (map2 != null) {
                        q07 q07VarC2 = c(map2.getString("cache"));
                        Context context4 = getContext();
                        context4.getClass();
                        h37 h37Var2 = new h37(context4, map2.getString("uri"), map2.getDouble("width"), map2.getDouble("height"), q07VarC2);
                        if (wl7.b(Uri.EMPTY, h37Var2.c)) {
                            map2.getString("uri");
                            Context context5 = getContext();
                            context5.getClass();
                            h37Var2 = new h37(context5, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", q07Var, 12);
                        }
                        arrayList.add(h37Var2);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.b0;
        if (wl7.b(arrayList2, arrayList)) {
            return;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.j0 = true;
    }

    public final void setTileMode(Shader.TileMode tileMode) {
        tileMode.getClass();
        if (this.i0 != tileMode) {
            this.i0 = tileMode;
            this.k0 = tileMode != Shader.TileMode.CLAMP ? new a() : null;
            this.j0 = true;
        }
    }
}
