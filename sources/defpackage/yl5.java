package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yl5 extends e.c implements om5, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View d0;
    public ViewTreeObserver e0;
    public final a f0 = new a();
    public final b g0 = new b();

    public static final class a extends mj8 implements Function1<pl5, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(pl5 pl5Var) {
            pl5 pl5Var2 = pl5Var;
            View viewC = xl5.c(yl5.this);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!cr8.B(viewC, cr8.F(pl5Var2.b()), xl5.b(us3.g(yl5.this).getFocusOwner(), vs3.a(yl5.this), viewC))) {
                    pl5Var2.a();
                }
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<pl5, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(pl5 pl5Var) {
            pl5 pl5Var2 = pl5Var;
            View viewC = xl5.c(yl5.this);
            if (viewC.hasFocus()) {
                im5 focusOwner = us3.g(yl5.this).getFocusOwner();
                View viewA = vs3.a(yl5.this);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = xl5.b(focusOwner, viewA, viewC);
                    Integer numF = cr8.F(pl5Var2.b());
                    int iIntValue = numF != null ? numF.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = yl5.this.d0;
                    View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewA, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && xl5.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        pl5Var2.a();
                    } else if (!viewA.requestFocus()) {
                        r6.g("host view did not take focus");
                        return null;
                    }
                } else if (!viewA.requestFocus()) {
                    r6.g("host view did not take focus");
                    return null;
                }
            }
            return j6g.a;
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void U1() {
        ViewTreeObserver viewTreeObserver = vs3.a(this).getViewTreeObserver();
        this.e0 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.om5
    public final void V(lm5 lm5Var) {
        lm5Var.b(false);
        lm5Var.a(this.f0);
        lm5Var.c(this.g0);
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        ViewTreeObserver viewTreeObserver = this.e0;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.e0 = null;
        vs3.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.d0 = null;
    }

    public final FocusTargetNode c2() {
        if (!this.a.c0) {
            ae7.b("visitLocalDescendants called on an unattached node");
        }
        e.c cVar = this.a;
        if ((cVar.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            boolean z = false;
            for (e.c cVar2 = cVar.f; cVar2 != null; cVar2 = cVar2.f) {
                if ((cVar2.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                    e.c cVarB = cVar2;
                    j4a j4aVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarB;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((cVarB.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 && (cVarB instanceof zs3)) {
                            int i = 0;
                            for (e.c cVar3 = ((zs3) cVarB).e0; cVar3 != null; cVar3 = cVar3.f) {
                                if ((cVar3.c & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarB = cVar3;
                                    } else {
                                        if (j4aVar == null) {
                                            j4aVar = new j4a(new e.c[16]);
                                        }
                                        if (cVarB != null) {
                                            j4aVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        j4aVar.b(cVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarB = us3.b(j4aVar);
                    }
                }
            }
        }
        r6.g("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (us3.f(this).b0 == null) {
            return;
        }
        View viewC = xl5.c(this);
        im5 focusOwner = us3.g(this).getFocusOwner();
        rxa rxaVarG = us3.g(this);
        boolean z = (view == null || view.equals(rxaVarG) || !xl5.a(viewC, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(rxaVarG) || !xl5.a(viewC, view2)) ? false : true;
        if (z && z2) {
            this.d0 = view2;
            return;
        }
        if (z2) {
            this.d0 = view2;
            FocusTargetNode focusTargetNodeC2 = c2();
            if (focusTargetNodeC2.P().c()) {
                return;
            }
            ie7.u(focusTargetNodeC2);
            return;
        }
        if (!z) {
            this.d0 = null;
            return;
        }
        this.d0 = null;
        if (c2().P().a()) {
            focusOwner.p(8, false, false);
        }
    }
}
