package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.indeed.android.jobsearch.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0h {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final fse a(Context context) {
        fse fseVar;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objZ = linkedHashMap.get(context);
                if (objZ == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    go1 go1VarA = h22.a(-1, 6, null);
                    objZ = wg2.Z(new kjd(new m0h(contentResolver, uriFor, new n0h(go1VarA, nf6.a(Looper.getMainLooper())), go1VarA, context, null)), f13.b(), new xre(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objZ);
                }
                fseVar = (fse) objZ;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fseVar;
    }

    public static final dm2 b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof dm2) {
            return (dm2) tag;
        }
        return null;
    }
}
