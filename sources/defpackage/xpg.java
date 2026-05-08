package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xpg extends mj8 implements gu5<Object> {
    final /* synthetic */ ypg<View> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpg(ypg<View> ypgVar) {
        super(0);
        this.this$0 = ypgVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.this$0.s0.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
