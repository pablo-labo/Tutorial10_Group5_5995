package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.emoji2.text.h;
import androidx.media3.exoplayer.a;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.session.l;
import androidx.media3.session.l.a;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.v;
import androidx.media3.ui.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.views.view.WindowUtilKt;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.indeed.android.jobsearch.R;
import defpackage.njc;
import defpackage.q8b;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qx0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        g.b bVar = (g.b) this.b;
        synchronized (bVar.d) {
            try {
                if (bVar.h == null) {
                    return;
                }
                try {
                    xo5 xo5VarC = bVar.c();
                    int i = xo5VarC.e;
                    if (i == 2) {
                        synchronized (bVar.d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        int i2 = lpf.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        g.a aVar = bVar.c;
                        Context context = bVar.a;
                        aVar.getClass();
                        xo5[] xo5VarArr = {xo5VarC};
                        bzf bzfVar = vyf.a;
                        Trace.beginSection(jpf.g("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceB = vyf.a.b(context, xo5VarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferC = czf.c(xo5VarC.a, bVar.a);
                            if (mappedByteBufferC == null || typefaceB == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                h hVar = new h(typefaceB, u63.f0(mappedByteBufferC));
                                Trace.endSection();
                                synchronized (bVar.d) {
                                    try {
                                        d.i iVar = bVar.h;
                                        if (iVar != null) {
                                            iVar.b(hVar);
                                        }
                                    } finally {
                                    }
                                }
                                bVar.b();
                            } finally {
                                int i3 = lpf.a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (bVar.d) {
                        try {
                            d.i iVar2 = bVar.h;
                            if (iVar2 != null) {
                                iVar2.a(th2);
                            }
                            bVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln2 ln2VarD;
        k31 k31VarC;
        k31 k31VarF;
        Window window;
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                aVar.a.unregisterReceiver(aVar.b);
                return;
            case 1:
                ((View) this.b).requestFocus();
                return;
            case 2:
                ((DashMediaSource) this.b).C();
                return;
            case 3:
                ms3.c((ms3) this.b);
                return;
            case 4:
                ((i34) this.b).F();
                return;
            case 5:
                com.google.firebase.installations.a aVar2 = (com.google.firebase.installations.a) this.b;
                Object obj = com.google.firebase.installations.a.m;
                synchronized (obj) {
                    try {
                        pf5 pf5Var = aVar2.a;
                        pf5Var.a();
                        ln2VarD = ln2.d(pf5Var.a);
                        try {
                            k31VarC = aVar2.c.c();
                            if (ln2VarD != null) {
                                ln2VarD.e();
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                try {
                    if (k31VarC.f() == q8b.a.e) {
                        k31VarF = aVar2.f(k31VarC);
                    } else if (k31VarC.f() == q8b.a.c) {
                        k31VarF = aVar2.f(k31VarC);
                    } else if (!aVar2.d.a(k31VarC)) {
                        return;
                    } else {
                        k31VarF = aVar2.c(k31VarC);
                    }
                    synchronized (obj) {
                        try {
                            pf5 pf5Var2 = aVar2.a;
                            pf5Var2.a();
                            ln2VarD = ln2.d(pf5Var2.a);
                            try {
                                aVar2.c.b(k31VarF);
                                if (ln2VarD != null) {
                                    ln2VarD.e();
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                    synchronized (aVar2) {
                        if (aVar2.k.size() != 0 && !TextUtils.equals(k31VarC.b, k31VarF.b)) {
                            Iterator it = aVar2.k.iterator();
                            while (it.hasNext()) {
                                ((r85) it.next()).a();
                            }
                        }
                        break;
                    }
                    if (k31VarF.f() == q8b.a.d) {
                        String str = k31VarF.b;
                        synchronized (aVar2) {
                            aVar2.j = str;
                        }
                    }
                    if (k31VarF.f() == q8b.a.e) {
                        aVar2.g(new FirebaseInstallationsException());
                        return;
                    }
                    q8b.a aVar3 = k31VarF.c;
                    if (aVar3 == q8b.a.b || aVar3 == q8b.a.a) {
                        aVar2.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        aVar2.h(k31VarF);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    aVar2.g(e);
                    return;
                }
            case 6:
                a();
                return;
            case 7:
                ((FrameLayout) this.b).setVisibility(8);
                return;
            case 8:
                l lVar = (l) this.b;
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(lVar.a, lVar.c.a.f(), lVar.new a(), lVar.b.c.O0());
                lVar.j = mediaBrowserCompat;
                Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                mediaBrowserCompat.a.b.connect();
                return;
            case DatadogLogGenerator.CRASH /* 9 */:
                synchronized (((v) this.b).a) {
                    break;
                }
                return;
            case 10:
                rdb rdbVar = (rdb) this.b;
                View view = rdbVar.j;
                ViewGroup viewGroup = rdbVar.e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(rdbVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = rdbVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (rdbVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof b) {
                        b bVar = (b) view;
                        Rect rect = bVar.a;
                        ValueAnimator valueAnimator = bVar.w0;
                        if (rdbVar.A) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            bVar.y0 = true;
                            bVar.x0 = 0.0f;
                            bVar.invalidate(rect);
                        } else {
                            int i = rdbVar.z;
                            if (i == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                bVar.y0 = false;
                                bVar.x0 = 0.0f;
                                bVar.invalidate(rect);
                            } else if (i != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                bVar.y0 = false;
                                bVar.x0 = 1.0f;
                                bVar.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : rdbVar.y) {
                    view2.setVisibility((rdbVar.A && rdb.j(view2)) ? 4 : 0);
                }
                return;
            default:
                njc njcVar = (njc) this.b;
                String mainComponentName = njcVar.getMainComponentName();
                Bundle bundleComposeLaunchOptions = njcVar.composeLaunchOptions();
                Activity activity = njcVar.a;
                if (activity != null && (window = activity.getWindow()) != null) {
                    if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
                        WindowUtilKt.enableEdgeToEdge(window);
                    }
                    if (njcVar.isWideColorGamutEnabled()) {
                        window.setColorMode(1);
                    }
                }
                if (ie7.g0.enableBridgelessArchitecture()) {
                    njcVar.e = new ekc(njcVar.getPlainActivity(), njcVar.getReactHost(), mainComponentName, bundleComposeLaunchOptions);
                } else {
                    njcVar.e = new njc.a(njcVar, njcVar.getPlainActivity(), njcVar.getReactNativeHost(), mainComponentName, bundleComposeLaunchOptions, njcVar.isFabricEnabled());
                }
                if (mainComponentName != null) {
                    njcVar.loadApp(mainComponentName);
                    return;
                }
                return;
        }
    }
}
