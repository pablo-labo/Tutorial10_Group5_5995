package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import defpackage.se7;
import defpackage.ws2;

/* JADX INFO: loaded from: classes.dex */
public final class re7 extends InputConnectionWrapper {
    public final /* synthetic */ r20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re7(InputConnection inputConnection, r20 r20Var) {
        super(inputConnection, false);
        this.a = r20Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        ws2.b aVar;
        se7 se7Var = inputContentInfo == null ? null : new se7(new se7.a(inputContentInfo));
        qj0 qj0Var = (qj0) this.a.b;
        if ((i & 1) != 0) {
            try {
                se7Var.a.a.requestPermission();
                InputContentInfo inputContentInfo2 = se7Var.a.a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = se7Var.a.a;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new ws2.a(clipData, 2);
        } else {
            ws2.c cVar = new ws2.c();
            cVar.a = clipData;
            cVar.b = 2;
            aVar = cVar;
        }
        aVar.a(inputContentInfo3.getLinkUri());
        aVar.setExtras(bundle2);
        if (epg.j(qj0Var, aVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
