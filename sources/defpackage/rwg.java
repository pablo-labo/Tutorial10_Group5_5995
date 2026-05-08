package defpackage;

import android.os.Bundle;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.ModalPresentationMode;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lrwg;", "Lec1;", "<init>", "()V", "a", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rwg extends ec1 {
    public static final /* synthetic */ int u0 = 0;
    public sm1 t0;

    public static final class a {
        public static rwg a(ShowModalWithWebviewData showModalWithWebviewData, BridgeDispatcher.c cVar) {
            rwg rwgVar = new rwg();
            Bundle bundle = new Bundle();
            bundle.putString("MODAL_SHEET_URL", showModalWithWebviewData.a);
            bundle.putString("MODAL_SHEET_TITLE", showModalWithWebviewData.b);
            bundle.putBoolean("MODAL_SHEET_FULLSCREEN", ModalPresentationMode.c == showModalWithWebviewData.c);
            rwgVar.setArguments(bundle);
            rwgVar.t0 = cVar;
            return rwgVar;
        }
    }

    @Override // defpackage.ec1
    public final String P() {
        return "webview-bottom-sheet-modal";
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        String str = this.r0;
        sm1 sm1Var = this.t0;
        if (str != null) {
            if (sm1Var != null) {
                sm1Var.b(str);
            }
        } else if (sm1Var != null) {
            sm1Var.c();
        }
    }
}
