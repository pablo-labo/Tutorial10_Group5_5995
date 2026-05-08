package com.linecorp.linesdk;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.indeed.android.jobsearch.R;
import defpackage.b0;
import defpackage.l5;
import defpackage.prb;
import defpackage.qpg;
import defpackage.t40;
import defpackage.ud3;
import defpackage.vd3;
import defpackage.zta;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends ud3 {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        a = sparseIntArray;
        sparseIntArray.put(R.layout.open_chat_info_fragment, 1);
        sparseIntArray.put(R.layout.profile_info_fragment, 2);
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
                b0.o("view must have a tag");
                return null;
            }
            if (i2 == 1) {
                if (!"layout/open_chat_info_fragment_0".equals(tag)) {
                    l5.q(t40.i(tag, "The tag for open_chat_info_fragment is invalid. Received: "));
                    return null;
                }
                Object[] objArr = new Object[16];
                qpg.X(view, objArr, zta.V0, true);
                zta ztaVar = new zta(vd3Var, view, (View) objArr[12], (TextView) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[7], (View) objArr[8], (EditText) objArr[2], (TextView) objArr[6], (View) objArr[5], (EditText) objArr[1], (TextView) objArr[4], (TextView) objArr[15], (CheckBox) objArr[3], (ConstraintLayout) objArr[13], (TextView) objArr[14]);
                ztaVar.U0 = -1L;
                ztaVar.J0.setTag(null);
                ((ScrollView) objArr[0]).setTag(null);
                ztaVar.M0.setTag(null);
                ztaVar.P0.setTag(null);
                view.setTag(R.id.dataBinding, ztaVar);
                synchronized (ztaVar) {
                    ztaVar.U0 = 16L;
                }
                ztaVar.a0();
                return ztaVar;
            }
            if (i2 == 2) {
                if (!"layout/profile_info_fragment_0".equals(tag)) {
                    l5.q(t40.i(tag, "The tag for profile_info_fragment is invalid. Received: "));
                    return null;
                }
                Object[] objArr2 = new Object[3];
                qpg.X(view, objArr2, prb.I0, true);
                prb prbVar = new prb(vd3Var, view, (EditText) objArr2[1], (TextView) objArr2[2]);
                prbVar.H0 = -1L;
                prbVar.D0.setTag(null);
                ((ConstraintLayout) objArr2[0]).setTag(null);
                view.setTag(R.id.dataBinding, prbVar);
                synchronized (prbVar) {
                    prbVar.H0 = 4L;
                }
                prbVar.a0();
                return prbVar;
            }
        }
        return null;
    }
}
