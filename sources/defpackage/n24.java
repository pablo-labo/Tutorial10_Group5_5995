package defpackage;

import android.os.AsyncTask;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class n24 extends AsyncTask<Void, Void, Void> {
    public final /* synthetic */ m24 a;

    public n24(m24 m24Var) {
        this.a = m24Var;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Void[] voidArr) {
        voidArr.getClass();
        m24 m24Var = this.a;
        CxxInspectorPackagerConnection cxxInspectorPackagerConnection = m24Var.i;
        if (cxxInspectorPackagerConnection != null) {
            cxxInspectorPackagerConnection.closeQuietly();
        }
        m24Var.i = null;
        return null;
    }
}
