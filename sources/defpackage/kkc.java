package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.facebook.react.uimanager.b;

/* JADX INFO: loaded from: classes2.dex */
public final class kkc extends b {
    public final /* synthetic */ ikc x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkc(ikc ikcVar, boolean z, int i) {
        super(ikcVar, i, z);
        this.x = ikcVar;
    }

    @Override // com.facebook.react.uimanager.b, defpackage.y5
    public final boolean g(View view, int i, Bundle bundle) {
        view.getClass();
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        ikc ikcVar = this.x;
        Editable text = ikcVar.getText();
        if (text == null) {
            r6.g("Required value was null.");
            return false;
        }
        int length = text.length();
        if (length > 0) {
            ikcVar.setSelection(length);
        }
        return ikcVar.i();
    }
}
