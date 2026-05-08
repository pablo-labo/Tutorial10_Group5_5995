package com.indeed.android.jobsearch;

import android.util.SparseIntArray;
import android.view.View;
import defpackage.b0;
import defpackage.qpg;
import defpackage.ud3;
import defpackage.vd3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DataBinderMapperImpl extends ud3 {
    public static final SparseIntArray a = new SparseIntArray(0);

    @Override // defpackage.ud3
    public final List<ud3> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.linecorp.linesdk.DataBinderMapperImpl());
        arrayList.add(new com.wlappdebug.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.ud3
    public final qpg b(vd3 vd3Var, View view, int i) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        b0.o("view must have a tag");
        return null;
    }
}
