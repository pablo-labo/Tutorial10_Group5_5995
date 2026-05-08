package defpackage;

import android.content.Intent;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v53 implements goa {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v53(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.goa
    public final void d(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CreateOpenChatActivity createOpenChatActivity = (CreateOpenChatActivity) obj2;
                int i2 = CreateOpenChatActivity.u0;
                createOpenChatActivity.setResult(-1, new Intent().putExtra("arg_error_result", ((ww8) obj).c));
                createOpenChatActivity.finish();
                return;
            default:
                xta xtaVar = (xta) obj2;
                sta staVar = (sta) obj;
                if (staVar != null) {
                    int iC = staVar.c();
                    yta ytaVar = xtaVar.a;
                    if (ytaVar != null) {
                        ytaVar.F0.setText(xtaVar.getResources().getString(iC));
                        return;
                    } else {
                        wl7.g("binding");
                        throw null;
                    }
                }
                return;
        }
    }
}
