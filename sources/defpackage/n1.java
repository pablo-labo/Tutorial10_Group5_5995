package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.k;
import com.indeed.android.jobsearch.R;
import defpackage.xsc;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0006R$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR0\u0010&\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b%\u0010\u001e\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u000eR\u0014\u0010(\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010*\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u0006+"}, d2 = {"Ln1;", "Landroid/view/ViewGroup;", "Ldm2;", "parent", "Lj6g;", "setParentCompositionContext", "(Ldm2;)V", "Lkpg;", "strategy", "setViewCompositionStrategy", "(Lkpg;)V", "", "isTransitionGroup", "setTransitionGroup", "(Z)V", "Landroid/os/IBinder;", "value", "b", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "d", "Ldm2;", "setParentContext", "parentContext", "Lkotlin/Function0;", "e", "Lgu5;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "f", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class n1 extends ViewGroup {
    public boolean V;
    public boolean W;
    public WeakReference<dm2> a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public IBinder previousAttachedWindowToken;
    public k c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public dm2 parentContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public gu5<j6g> disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean showLayoutBounds;

    public static final class a extends mj8 implements Function2<b, Integer, j6g> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                n1.this.a(0, bVar2);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hpg, java.lang.Object] */
    public n1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        jpg jpgVar = new jpg(this);
        addOnAttachStateChangeListener(jpgVar);
        ?? r2 = new lgb() { // from class: hpg
            @Override // defpackage.lgb
            public final void a() {
                this.a.e();
            }
        };
        pnb.C(this).a.add((lgb) r2);
        this.disposeViewCompositionStrategy = new ipg(this, jpgVar, r2);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(dm2 dm2Var) {
        if (this.parentContext != dm2Var) {
            this.parentContext = dm2Var;
            if (dm2Var != null) {
                this.a = null;
            }
            k kVar = this.c;
            if (kVar != null) {
                kVar.dispose();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, b bVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void c() {
        if (this.V) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.parentContext != null || isAttachedToWindow()) {
            f();
        } else {
            r6.g("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        k kVar = this.c;
        if (kVar != null) {
            kVar.dispose();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.V = true;
                this.c = z4h.a(this, i(), new ah2(-656146368, new a(), true));
            } finally {
                this.V = false;
            }
        }
    }

    public void g(int i, int i2, int i3, boolean z, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final dm2 i() {
        xsc xscVarA;
        dm2 dm2VarB = this.parentContext;
        if (dm2VarB == null) {
            dm2VarB = o0h.b(this);
            if (dm2VarB == null) {
                Object parent = getParent();
                while (dm2VarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    dm2VarB = o0h.b(view);
                    parent = view.getParent();
                }
            }
            xsc.d dVar = xsc.d.b;
            if (dm2VarB != null) {
                dm2 dm2Var = (!(dm2VarB instanceof xsc) || ((xsc.d) ((xsc) dm2VarB).t.getValue()).compareTo(dVar) > 0) ? dm2VarB : null;
                if (dm2Var != null) {
                    this.a = new WeakReference<>(dm2Var);
                }
            } else {
                dm2VarB = null;
            }
            if (dm2VarB == null) {
                WeakReference<dm2> weakReference = this.a;
                if (weakReference == null || (dm2VarB = weakReference.get()) == null || ((dm2VarB instanceof xsc) && ((xsc.d) ((xsc) dm2VarB).t.getValue()).compareTo(dVar) <= 0)) {
                    dm2VarB = null;
                }
                if (dm2VarB == null) {
                    if (!isAttachedToWindow()) {
                        ae7.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    dm2 dm2VarB2 = o0h.b(view2);
                    if (dm2VarB2 == null) {
                        xscVarA = j0h.a.get().a(view2);
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, xscVarA);
                        Handler handler = view2.getHandler();
                        int i = rf6.a;
                        view2.addOnAttachStateChangeListener(new h0h(u63.Y(ba6.a, new pf6(handler, "windowRecomposer cleanup", false).f, null, new i0h(xscVarA, view2, null), 2)));
                    } else {
                        if (!(dm2VarB2 instanceof xsc)) {
                            r6.g("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        xscVarA = (xsc) dm2VarB2;
                    }
                    xsc xscVar = ((xsc.d) xscVarA.t.getValue()).compareTo(dVar) > 0 ? xscVarA : null;
                    if (xscVar != null) {
                        this.a = new WeakReference<>(xscVar);
                    }
                    return xscVarA;
                }
            }
        }
        return dm2VarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.W || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(i, i2, i3, z, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(dm2 parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((rxa) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.W = true;
    }

    public final void setViewCompositionStrategy(kpg strategy) {
        gu5<j6g> gu5Var = this.disposeViewCompositionStrategy;
        if (gu5Var != null) {
            gu5Var.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ n1(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public n1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }
}
