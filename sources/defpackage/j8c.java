package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j8c implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById;
        int i = l8c.r0;
        b bVar = dialogInterface instanceof b ? (b) dialogInterface : null;
        if (bVar == null || (viewFindViewById = bVar.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(0);
    }
}
