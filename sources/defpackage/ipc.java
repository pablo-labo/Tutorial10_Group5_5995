package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class ipc implements TextWatcher {
    public final ikc a;
    public final EventDispatcher b;
    public final int c;
    public String d;

    public ipc(mkf mkfVar, ikc ikcVar) {
        mkfVar.getClass();
        this.a = ikcVar;
        this.b = dmc.e(mkfVar, ikcVar.getId());
        this.c = dmc.g(mkfVar);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        this.d = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        ikc ikcVar = this.a;
        if (ikcVar.getDisableTextDiffing$ReactAndroid_release()) {
            return;
        }
        if (i3 == 0 && i2 == 0) {
            return;
        }
        String strSubstring = charSequence.toString().substring(i, i + i3);
        String str = this.d;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        String strSubstring2 = str.substring(i, i + i2);
        if (i3 == i2 && strSubstring.equals(strSubstring2)) {
            return;
        }
        vse stateWrapper = ikcVar.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            int i4 = ikcVar.d0 + 1;
            ikcVar.d0 = i4;
            writableNativeMap.putInt("mostRecentEventCount", i4);
            writableNativeMap.putInt("opaqueCacheId", ikcVar.getId());
            stateWrapper.updateState(writableNativeMap);
        }
        EventDispatcher eventDispatcher = this.b;
        if (eventDispatcher != null) {
            int id = ikcVar.getId();
            String string = charSequence.toString();
            int i5 = ikcVar.d0 + 1;
            ikcVar.d0 = i5;
            eventDispatcher.a(new yoc(string, this.c, id, i5));
        }
    }
}
