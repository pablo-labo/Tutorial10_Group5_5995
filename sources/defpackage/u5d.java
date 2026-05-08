package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class u5d implements ec9<Integer, lhg> {
    @Override // defpackage.ec9
    public final lhg a(Object obj, nva nvaVar) {
        int iIntValue = ((Number) obj).intValue();
        Context context = nvaVar.a;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return pg8.V("android.resource://" + context.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
