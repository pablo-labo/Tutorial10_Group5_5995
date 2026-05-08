package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: loaded from: classes.dex */
public final class h93 {
    public static final void a(CursorAnchorInfo.Builder builder, qtc qtcVar) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(wab.z(qtcVar)).setHandwritingBounds(wab.z(qtcVar)).build());
    }
}
