package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.indeed.android.jobsearch.R;
import defpackage.uzg;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bv9 extends hg2 {
    public final av9 V;
    public gu5<j6g> d;
    public fw9 e;
    public final View f;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public static final class b extends mj8 implements Function1<wpa, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(wpa wpaVar) {
            bv9 bv9Var = bv9.this;
            if (bv9Var.e.b) {
                bv9Var.d.invoke();
            }
            return j6g.a;
        }
    }

    public bv9(gu5<j6g> gu5Var, fw9 fw9Var, View view, vl8 vl8Var, iy3 iy3Var, UUID uuid, zb0<Float, ce0> zb0Var, e13 e13Var, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.d = gu5Var;
        this.e = fw9Var;
        this.f = view;
        Window window = getWindow();
        if (window == null) {
            r6.g("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        izg.a(window, false);
        av9 av9Var = new av9(getContext(), this.e.b, this.d, zb0Var, e13Var);
        av9Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        av9Var.setClipChildren(false);
        av9Var.setElevation(iy3Var.t1(8.0f));
        av9Var.setOutlineProvider(new a());
        this.V = av9Var;
        setContentView(av9Var);
        av9Var.setTag(R.id.view_tree_lifecycle_owner, zte.a(view));
        av9Var.setTag(R.id.view_tree_view_model_store_owner, n7g.b(view));
        av9Var.setTag(R.id.view_tree_saved_state_registry_owner, esg.b(view));
        d(this.d, this.e, vl8Var);
        ine ineVar = new ine(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        uzg.g fVar = i >= 35 ? new uzg.f(window, ineVar) : i >= 30 ? new uzg.d(window, ineVar) : new uzg.c(window, ineVar);
        boolean z2 = !z;
        fVar.d(z2);
        fVar.c(z2);
        mh2.e(this.c, this, new b(), 2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d(gu5<j6g> gu5Var, fw9 fw9Var, vl8 vl8Var) {
        this.d = gu5Var;
        this.e = fw9Var;
        yxd yxdVar = fw9Var.a;
        ViewGroup.LayoutParams layoutParams = this.f.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = yxdVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = vl8Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            l.g();
            return;
        }
        this.V.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.d.invoke();
        }
        return zOnTouchEvent;
    }
}
