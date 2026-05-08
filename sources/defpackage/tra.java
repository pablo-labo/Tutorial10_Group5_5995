package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tra implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = ura.l0;
        dialogInterface.getClass();
        b bVar = (b) dialogInterface;
        View viewFindViewById = bVar.findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            bVar.h().H(3);
            viewFindViewById.getParent().getParent().requestLayout();
        }
    }
}
