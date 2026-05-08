package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.indeed.android.jobsearch.R;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p44 extends hg2 {
    public final l44 V;
    public boolean W;
    public gu5<j6g> d;
    public o44 e;
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
            p44 p44Var = p44.this;
            if (p44Var.e.a) {
                p44Var.d.invoke();
            }
            return j6g.a;
        }
    }

    public p44(gu5<j6g> gu5Var, o44 o44Var, View view, vl8 vl8Var, iy3 iy3Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), o44Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.d = gu5Var;
        this.e = o44Var;
        this.f = view;
        Window window = getWindow();
        if (window == null) {
            r6.g("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        izg.a(window, this.e.e);
        window.setGravity(17);
        if (!this.e.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                zf0.a.a(attributes);
            }
            if (i >= 30) {
                bg0 bg0Var = bg0.a;
                bg0Var.a(attributes, 0);
                bg0Var.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        l44 l44Var = new l44(window, getContext());
        setTitle(this.e.f);
        l44Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        l44Var.setClipChildren(false);
        l44Var.setElevation(iy3Var.t1(8.0f));
        l44Var.setOutlineProvider(new a());
        this.V = l44Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(l44Var);
        l44Var.setTag(R.id.view_tree_lifecycle_owner, zte.a(view));
        l44Var.setTag(R.id.view_tree_view_model_store_owner, n7g.b(view));
        l44Var.setTag(R.id.view_tree_saved_state_registry_owner, esg.b(view));
        e(this.d, this.e, vl8Var);
        mh2.e(this.c, this, new b(), 2);
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof l44) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(gu5<j6g> gu5Var, o44 o44Var, vl8 vl8Var) {
        int i;
        this.d = gu5Var;
        this.e = o44Var;
        yxd yxdVar = o44Var.c;
        boolean zB = x80.b(this.f);
        int iOrdinal = yxdVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = vl8Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                l.g();
                return;
            }
            i = 1;
        }
        l44 l44Var = this.V;
        l44Var.setLayoutDirection(i);
        boolean z = o44Var.e;
        boolean z2 = o44Var.d;
        Window window2 = l44Var.a0;
        boolean z3 = (l44Var.e0 && z2 == l44Var.c0 && z == l44Var.d0) ? false : true;
        l44Var.c0 = z2;
        l44Var.d0 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !l44Var.e0) {
                window2.setLayout(i2, -2);
                l44Var.e0 = true;
            }
        }
        setCanceledOnTouchOutside(o44Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.e.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.d.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            o44 r1 = r9.e
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            l44 r1 = r9.V
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.gf9.b(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = defpackage.gf9.b(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.W = r3
            return r0
        L7c:
            boolean r10 = r9.W
            if (r10 == 0) goto L95
            gu5<j6g> r10 = r9.d
            r10.invoke()
            r9.W = r3
            return r4
        L88:
            r9.W = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.W = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p44.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
