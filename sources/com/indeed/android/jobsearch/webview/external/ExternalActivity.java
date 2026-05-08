package com.indeed.android.jobsearch.webview.external;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.c;
import androidx.appcompat.app.e;
import androidx.appcompat.app.f;
import com.google.android.material.appbar.MaterialToolbar;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.webview.external.ExternalActivity;
import defpackage.a73;
import defpackage.a9c;
import defpackage.boa;
import defpackage.cr8;
import defpackage.d0h;
import defpackage.dqa;
import defpackage.e8;
import defpackage.e9;
import defpackage.esg;
import defpackage.exg;
import defpackage.fwc;
import defpackage.fy;
import defpackage.gu5;
import defpackage.i55;
import defpackage.ja;
import defpackage.lz2;
import defpackage.mj8;
import defpackage.nn0;
import defpackage.pnb;
import defpackage.qt8;
import defpackage.r6;
import defpackage.se;
import defpackage.sp7;
import defpackage.tp7;
import defpackage.twe;
import defpackage.w8;
import defpackage.wea;
import defpackage.wl7;
import defpackage.wpa;
import defpackage.x45;
import defpackage.xm0;
import defpackage.zve;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/webview/external/ExternalActivity;", "Lxm0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalActivity extends xm0 {
    public static final /* synthetic */ int H0 = 0;
    public String A0;
    public String B0;
    public boolean D0;
    public boolean F0;
    public e8 v0;
    public ExternalWebView w0;
    public i55 x0;
    public com.indeed.android.jobsearch.webview.external.a y0;
    public twe z0;
    public final Lazy C0 = boa.E(qt8.a, new a(this));
    public boolean E0 = true;
    public final e9 G0 = (e9) t(new w8(), new a73(this, 1));

    public static final class a extends mj8 implements gu5<d0h> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExternalActivity externalActivity) {
            super(0);
            this.$this_inject = externalActivity;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [d0h, java.lang.Object] */
        @Override // defpackage.gu5
        public final d0h invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(d0h.class), a9cVar);
        }
    }

    @Override // defpackage.xm0, defpackage.k19, androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_external, (ViewGroup) null, false);
        int i = R.id.activeToolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) esg.a(viewInflate, R.id.activeToolbar);
        if (materialToolbar != null) {
            i = R.id.debugStub;
            if (((ViewStub) esg.a(viewInflate, R.id.debugStub)) != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                int i2 = R.id.externalWebview;
                ExternalWebView externalWebView = (ExternalWebView) esg.a(viewInflate, R.id.externalWebview);
                if (externalWebView != null) {
                    i2 = R.id.externalWebviewContainer;
                    if (((LinearLayout) esg.a(viewInflate, R.id.externalWebviewContainer)) != null) {
                        this.v0 = new e8(frameLayout, materialToolbar, frameLayout, externalWebView);
                        setContentView(frameLayout);
                        e8 e8Var = this.v0;
                        if (e8Var == null) {
                            wl7.g("binding");
                            throw null;
                        }
                        MaterialToolbar materialToolbar2 = e8Var.b;
                        AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) w();
                        Object obj = appCompatDelegateImpl.Y;
                        if (obj instanceof Activity) {
                            appCompatDelegateImpl.H();
                            androidx.appcompat.app.a aVar = appCompatDelegateImpl.d0;
                            if (aVar instanceof f) {
                                r6.g("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                                return;
                            }
                            appCompatDelegateImpl.e0 = null;
                            if (aVar != null) {
                                aVar.h();
                            }
                            appCompatDelegateImpl.d0 = null;
                            e eVar = new e(materialToolbar2, ((Activity) obj).getTitle(), appCompatDelegateImpl.b0);
                            appCompatDelegateImpl.d0 = eVar;
                            appCompatDelegateImpl.b0.b = eVar.c;
                            materialToolbar2.setBackInvokedCallbackEnabled(true);
                            appCompatDelegateImpl.g();
                        }
                        Intent intent = getIntent();
                        String stringExtra = intent.getStringExtra("url");
                        String stringExtra2 = intent.getStringExtra("ua");
                        intent.getStringExtra("params");
                        this.A0 = intent.getStringExtra("shareUrl");
                        this.B0 = intent.getStringExtra("shareMessage");
                        intent.getStringExtra("shareTk");
                        e8 e8Var2 = this.v0;
                        if (e8Var2 == null) {
                            wl7.g("binding");
                            throw null;
                        }
                        ExternalWebView externalWebView2 = e8Var2.d;
                        externalWebView2.c();
                        this.w0 = externalWebView2;
                        dqa dqaVarR = r();
                        wpa x45Var = new x45(this);
                        dqaVarR.getClass();
                        dqaVarR.b(x45Var);
                        this.x0 = new i55(this);
                        this.y0 = new com.indeed.android.jobsearch.webview.external.a(this, new fy(this, 11));
                        ExternalWebView externalWebView3 = this.w0;
                        if (externalWebView3 == null) {
                            wl7.g("externalWebView");
                            throw null;
                        }
                        i55 i55Var = this.x0;
                        if (i55Var == null) {
                            wl7.g("externalWebViewClient");
                            throw null;
                        }
                        externalWebView3.setWebViewClient(i55Var);
                        ExternalWebView externalWebView4 = this.w0;
                        if (externalWebView4 == null) {
                            wl7.g("externalWebView");
                            throw null;
                        }
                        com.indeed.android.jobsearch.webview.external.a aVar2 = this.y0;
                        if (aVar2 == null) {
                            wl7.g("externalWebChromeClient");
                            throw null;
                        }
                        externalWebView4.setWebChromeClient(aVar2);
                        if (stringExtra2 != null && stringExtra2.length() != 0) {
                            ExternalWebView externalWebView5 = this.w0;
                            if (externalWebView5 == null) {
                                wl7.g("externalWebView");
                                throw null;
                            }
                            externalWebView5.setSpoofedUserAgentString(stringExtra2);
                        }
                        if (bundle != null) {
                            ExternalWebView externalWebView6 = this.w0;
                            if (externalWebView6 == null) {
                                wl7.g("externalWebView");
                                throw null;
                            }
                            exg.a.a(externalWebView6, "external-webview-state", bundle);
                        } else if (stringExtra == null || zve.U(stringExtra)) {
                            ArrayList arrayList = lz2.a;
                            lz2.c("ExternalActivity", "onCreate: url is null, skipping loadUrl", false, null, 12);
                        } else {
                            ExternalWebView externalWebView7 = this.w0;
                            if (externalWebView7 == null) {
                                wl7.g("externalWebView");
                                throw null;
                            }
                            externalWebView7.loadUrl(stringExtra);
                        }
                        if (Build.VERSION.SDK_INT >= 35) {
                            e8 e8Var3 = this.v0;
                            if (e8Var3 != null) {
                                e8Var3.a.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: w45
                                    @Override // android.view.View.OnApplyWindowInsetsListener
                                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                        int i3 = ExternalActivity.H0;
                                        view.getClass();
                                        windowInsets.getClass();
                                        ExternalActivity externalActivity = this.a;
                                        d0h d0hVar = (d0h) externalActivity.C0.getValue();
                                        e8 e8Var4 = externalActivity.v0;
                                        if (e8Var4 == null) {
                                            wl7.g("binding");
                                            throw null;
                                        }
                                        FrameLayout frameLayout2 = e8Var4.a;
                                        frameLayout2.getClass();
                                        d0hVar.getClass();
                                        return d0h.b(view, frameLayout2, windowInsets);
                                    }
                                });
                                return;
                            } else {
                                wl7.g("binding");
                                throw null;
                            }
                        }
                        return;
                    }
                }
                i = i2;
            }
        }
        ja.k("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_external, menu);
        androidx.appcompat.app.a aVarY = y();
        if (aVarY == null) {
            return false;
        }
        aVarY.n(true);
        aVarY.r(true);
        aVarY.o();
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.wi0, androidx.fragment.app.g, android.app.Activity
    public final void onDestroy() {
        twe tweVar = this.z0;
        if (tweVar != null) {
            tweVar.a();
        }
        com.indeed.android.jobsearch.webview.external.a aVar = this.y0;
        if (aVar == null) {
            wl7.g("externalWebChromeClient");
            throw null;
        }
        aVar.a();
        setResult(-1);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId == R.id.action_forward) {
            ExternalWebView externalWebView = this.w0;
            if (externalWebView == null) {
                wl7.g("externalWebView");
                throw null;
            }
            if (externalWebView.canGoForward()) {
                ExternalWebView externalWebView2 = this.w0;
                if (externalWebView2 != null) {
                    externalWebView2.goForward();
                    return true;
                }
                wl7.g("externalWebView");
                throw null;
            }
        } else {
            if (itemId == R.id.action_refresh) {
                ExternalWebView externalWebView3 = this.w0;
                if (externalWebView3 == null) {
                    wl7.g("externalWebView");
                    throw null;
                }
                externalWebView3.reload();
                this.E0 = true;
                invalidateOptionsMenu();
                this.D0 = false;
                invalidateOptionsMenu();
                return true;
            }
            if (itemId == R.id.action_stop) {
                ExternalWebView externalWebView4 = this.w0;
                if (externalWebView4 == null) {
                    wl7.g("externalWebView");
                    throw null;
                }
                externalWebView4.stopLoading();
                this.E0 = false;
                invalidateOptionsMenu();
                this.D0 = true;
                invalidateOptionsMenu();
                return true;
            }
            if (itemId == R.id.open_in_browser) {
                i55 i55Var = this.x0;
                if (i55Var == null) {
                    wl7.g("externalWebViewClient");
                    throw null;
                }
                String str = i55Var.W;
                if (str != null) {
                    Uri uri = Uri.parse(str);
                    try {
                        ArrayList arrayList = lz2.a;
                        uri.getClass();
                        lz2.d("ExternalActivity", "opening external URL in browser: ".concat(wea.i(false, uri)), false, null);
                        startActivity(new Intent("android.intent.action.VIEW", uri));
                        ((tp7) cr8.p(tp7.class)).b(new sp7.g("externalWebView", "openInBrowser", null, new se(uri, 7), 4));
                        return true;
                    } catch (ActivityNotFoundException e) {
                        ArrayList arrayList2 = lz2.a;
                        uri.getClass();
                        lz2.c("ExternalActivity", "failed to open external URL in browser: ".concat(wea.i(false, uri)), false, e, 4);
                        c.a aVar = new c.a(this);
                        aVar.a.f = getString(R.string.activity_not_found) + "\n\n" + uri;
                        aVar.setPositiveButton(android.R.string.ok, null).b();
                        return true;
                    }
                }
            } else {
                if (itemId == R.id.action_share) {
                    nn0 nn0Var = nn0.a;
                    nn0.f(this, this.A0, this.B0);
                    return true;
                }
                if (itemId != R.id.closeSubwindow) {
                    return super.onOptionsItemSelected(menuItem);
                }
                twe tweVar = this.z0;
                if (tweVar != null) {
                    tweVar.a();
                }
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.g, android.app.Activity
    public final void onPause() {
        super.onPause();
        ExternalWebView externalWebView = this.w0;
        if (externalWebView != null) {
            externalWebView.onPause();
        } else {
            wl7.g("externalWebView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        menu.findItem(R.id.action_share).setVisible(this.A0 != null);
        menu.findItem(R.id.action_stop).setVisible(this.E0);
        menu.findItem(R.id.action_refresh).setVisible(this.D0);
        menu.findItem(R.id.action_forward).setVisible(this.F0);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.k19, androidx.fragment.app.g, android.app.Activity
    public final void onResume() {
        super.onResume();
        ExternalWebView externalWebView = this.w0;
        if (externalWebView != null) {
            externalWebView.onResume();
        } else {
            wl7.g("externalWebView");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        ExternalWebView externalWebView = this.w0;
        if (externalWebView != null) {
            exg.a.b(externalWebView, "external-webview-state", bundle);
        } else {
            wl7.g("externalWebView");
            throw null;
        }
    }
}
