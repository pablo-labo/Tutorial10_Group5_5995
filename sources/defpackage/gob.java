package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gob {
    public static final void a(wcf wcfVar, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (kjf.c(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) r03.Z.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        wcfVar.a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            wcfVar.a.g(new edf(new eob(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: fob
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    r03.a0.t(context, resolveInfo, Boolean.valueOf(z), charSequence, new kjf(j));
                    ((kdf) obj).close();
                    return j6g.a;
                }
            }));
        }
        wcfVar.a();
    }
}
