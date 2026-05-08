package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

/* JADX INFO: loaded from: classes2.dex */
public final class od4 implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView a;
    public final /* synthetic */ b b;

    public od4(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = bVar;
        this.a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            b bVar = this.b;
            long j = jCurrentTimeMillis - bVar.l;
            if (j < 0 || j > 300) {
                bVar.j = false;
            }
            b.d(bVar, this.a);
        }
        return false;
    }
}
