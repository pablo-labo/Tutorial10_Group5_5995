package defpackage;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class ctg extends ImageButton {
    public int a;

    public final int getUserSetVisibility() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.a = i;
    }
}
