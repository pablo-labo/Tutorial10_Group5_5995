package defpackage;

import android.content.Intent;
import android.widget.TextView;
import com.indeed.android.jobsearch.R;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u53 implements goa {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u53(Object obj, int i) {
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
                createOpenChatActivity.setResult(-1, new Intent().putExtra("arg_open_chatroom_info", (OpenChatRoomInfo) obj));
                createOpenChatActivity.finish();
                return;
            default:
                xta xtaVar = (xta) obj2;
                String str = (String) obj;
                yta ytaVar = xtaVar.a;
                if (ytaVar == null) {
                    wl7.g("binding");
                    throw null;
                }
                TextView textView = ytaVar.K0;
                str.getClass();
                textView.setText(xtaVar.D(R.integer.max_chatroom_description_length, str));
                return;
        }
    }
}
