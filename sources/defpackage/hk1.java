package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: loaded from: classes2.dex */
public final class hk1 implements View.OnClickListener {
    public final /* synthetic */ b a;

    public hk1(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.a;
        if (bVar.Z && bVar.isShowing()) {
            if (!bVar.b0) {
                TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                bVar.a0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                bVar.b0 = true;
            }
            if (bVar.a0) {
                bVar.cancel();
            }
        }
    }
}
