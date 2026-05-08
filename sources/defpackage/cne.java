package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class cne extends dne {
    public static cne b(String str, Context context, ene[] eneVarArr) {
        StringBuilder sbM = akb.m("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < eneVarArr.length; i++) {
            sbM.append("\n\t\tSoSource ");
            sbM.append(i);
            sbM.append(": ");
            sbM.append(eneVarArr[i].toString());
        }
        if (context != null) {
            sbM.append("\n\tNative lib dir: ");
            sbM.append(context.getApplicationInfo().nativeLibraryDir);
            sbM.append("\n");
        }
        return new cne(str, sbM.toString());
    }
}
