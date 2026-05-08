package defpackage;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;

/* JADX INFO: loaded from: classes2.dex */
public final class i42 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public i42(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        a aVar = this.a.e;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
