package com.wlappdebug;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.indeed.android.jobsearch.R;
import defpackage.b8;
import defpackage.d8;
import defpackage.l5;
import defpackage.qpg;
import defpackage.t40;
import defpackage.ud3;
import defpackage.vd3;
import defpackage.z7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends ud3 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_debug, 1);
        sparseIntArray.put(R.layout.activity_debug_flags, 2);
        sparseIntArray.put(R.layout.activity_debug_proctor, 3);
    }

    @Override // defpackage.ud3
    public final List<ud3> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.ud3
    public final qpg b(vd3 vd3Var, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                defpackage.b0.o("view must have a tag");
            } else {
                if (i2 == 1) {
                    if (!"layout/activity_debug_0".equals(tag)) {
                        l5.q(t40.i(tag, "The tag for activity_debug is invalid. Received: "));
                        return null;
                    }
                    Object[] objArr = new Object[1];
                    qpg.X(view, objArr, null, true);
                    z7 z7Var = new z7(vd3Var, view, (RecyclerView) objArr[0]);
                    z7Var.G0 = -1L;
                    z7Var.D0.setTag(null);
                    view.setTag(R.id.dataBinding, z7Var);
                    synchronized (z7Var) {
                        z7Var.G0 = 2L;
                    }
                    z7Var.a0();
                    return z7Var;
                }
                if (i2 == 2) {
                    if ("layout/activity_debug_flags_0".equals(tag)) {
                        return new b8(vd3Var, view);
                    }
                    l5.q(t40.i(tag, "The tag for activity_debug_flags is invalid. Received: "));
                    return null;
                }
                if (i2 == 3) {
                    if ("layout/activity_debug_proctor_0".equals(tag)) {
                        return new d8(vd3Var, view);
                    }
                    l5.q(t40.i(tag, "The tag for activity_debug_proctor is invalid. Received: "));
                    return null;
                }
            }
        }
        return null;
    }
}
