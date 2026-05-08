package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.facebook.react.devsupport.CxxInspectorPackagerConnection;
import com.facebook.react.devsupport.InspectorFlags;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class q24 extends AsyncTask<Void, Void, Void> {
    public final /* synthetic */ m24 a;

    public q24(m24 m24Var) {
        this.a = m24Var;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Void[] voidArr) {
        voidArr.getClass();
        m24 m24Var = this.a;
        Context context = m24Var.b;
        String str = m24Var.g;
        String str2 = x70.c(context).get("deviceName");
        if (str2 == null) {
            s55.n("ReactNative", "Could not get device name from Inspector Host Metadata.");
            return null;
        }
        CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", Arrays.copyOf(new Object[]{m24Var.c.a(), Uri.encode(x70.b()), Uri.encode(str), Uri.encode(m24Var.b()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 5)), str2, str);
        cxxInspectorPackagerConnection.connect();
        m24Var.i = cxxInspectorPackagerConnection;
        return null;
    }
}
