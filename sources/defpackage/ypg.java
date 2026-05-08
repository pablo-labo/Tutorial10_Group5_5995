package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.viewinterop.a;
import defpackage.ikd;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ypg<T extends View> extends pb0 {
    public final T s0;
    public final tea t0;
    public final ikd u0;
    public ikd.a v0;
    public Function1<? super T, j6g> w0;
    public Function1<? super T, j6g> x0;
    public Function1<? super T, j6g> y0;

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ ypg<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ypg<T> ypgVar) {
            super(0);
            this.this$0 = ypgVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            ypg<T> ypgVar = this.this$0;
            ypgVar.getReleaseBlock().invoke(ypgVar.s0);
            ypg.l(this.this$0);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<j6g> {
        final /* synthetic */ ypg<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ypg<T> ypgVar) {
            super(0);
            this.this$0 = ypgVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            ypg<T> ypgVar = this.this$0;
            ypgVar.getResetBlock().invoke(ypgVar.s0);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        final /* synthetic */ ypg<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ypg<T> ypgVar) {
            super(0);
            this.this$0 = ypgVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            ypg<T> ypgVar = this.this$0;
            ypgVar.getUpdateBlock().invoke(ypgVar.s0);
            return j6g.a;
        }
    }

    public ypg(Context context, Function1<? super Context, ? extends T> function1, dm2 dm2Var, ikd ikdVar, int i, rxa rxaVar) {
        T tInvoke = function1.invoke(context);
        tea teaVar = new tea();
        super(context, dm2Var, i, teaVar, tInvoke, rxaVar);
        this.s0 = tInvoke;
        this.t0 = teaVar;
        this.u0 = ikdVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objF = ikdVar != null ? ikdVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (ikdVar != null) {
            setSavableRegistryEntry(ikdVar.b(strValueOf, new xpg(this)));
        }
        a.h hVar = androidx.compose.ui.viewinterop.a.a;
        this.w0 = hVar;
        this.x0 = hVar;
        this.y0 = hVar;
    }

    public static final void l(ypg ypgVar) {
        ypgVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(ikd.a aVar) {
        ikd.a aVar2 = this.v0;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.v0 = aVar;
    }

    public final tea getDispatcher() {
        return this.t0;
    }

    public final Function1<T, j6g> getReleaseBlock() {
        return this.y0;
    }

    public final Function1<T, j6g> getResetBlock() {
        return this.x0;
    }

    public /* bridge */ /* synthetic */ n1 getSubCompositionView() {
        return null;
    }

    public final Function1<T, j6g> getUpdateBlock() {
        return this.w0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1<? super T, j6g> function1) {
        this.y0 = function1;
        setRelease(new a(this));
    }

    public final void setResetBlock(Function1<? super T, j6g> function1) {
        this.x0 = function1;
        setReset(new b(this));
    }

    public final void setUpdateBlock(Function1<? super T, j6g> function1) {
        this.w0 = function1;
        setUpdate(new c(this));
    }
}
