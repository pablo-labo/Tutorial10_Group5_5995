package androidx.compose.ui.layout;

import androidx.compose.ui.layout.j;
import defpackage.gme;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.oad;

/* JADX INFO: loaded from: classes.dex */
public final class n extends mj8 implements gu5<j6g> {
    final /* synthetic */ j.b $this_deactivateOutOfFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j.b bVar) {
        super(0);
        this.$this_deactivateOutOfFrame = bVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        oad oadVar;
        if (!((Boolean) ((gme) this.$this_deactivateOutOfFrame.g).getValue()).booleanValue() && (oadVar = this.$this_deactivateOutOfFrame.c) != null) {
            oadVar.deactivate();
        }
        return j6g.a;
    }
}
