package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ldd extends ViewGroup {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;
    public final gg1 d;
    public int e;

    public ldd(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new gg1();
        setClipChildren(false);
        ndd nddVar = new ndd(context);
        addView(nddVar);
        arrayList.add(nddVar);
        arrayList2.add(nddVar);
        this.e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final ndd a(mdd mddVar) {
        gg1 gg1Var = this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) gg1Var.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) gg1Var.a;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) gg1Var.b;
        ndd nddVar = (ndd) linkedHashMap.get(mddVar);
        if (nddVar != null) {
            return nddVar;
        }
        ArrayList arrayList = this.c;
        arrayList.getClass();
        ndd nddVar2 = (ndd) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (nddVar2 == null) {
            int i = this.e;
            ArrayList arrayList2 = this.b;
            if (i > u63.J(arrayList2)) {
                nddVar2 = new ndd(getContext());
                addView(nddVar2);
                arrayList2.add(nddVar2);
            } else {
                nddVar2 = (ndd) arrayList2.get(this.e);
                mdd mddVar2 = (mdd) linkedHashMap3.get(nddVar2);
                if (mddVar2 != null) {
                    mddVar2.g1();
                    ndd nddVar3 = (ndd) linkedHashMap2.get(mddVar2);
                    if (nddVar3 != null) {
                    }
                    linkedHashMap2.remove(mddVar2);
                    nddVar2.c();
                }
            }
            int i2 = this.e;
            if (i2 < this.a - 1) {
                this.e = i2 + 1;
            } else {
                this.e = 0;
            }
        }
        linkedHashMap2.put(mddVar, nddVar2);
        linkedHashMap3.put(nddVar2, mddVar);
        return nddVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
