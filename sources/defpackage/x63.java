package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x63 {
    public final Context a;

    public x63(Context context) {
        context.getClass();
        this.a = context;
    }

    public final w63 a() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listZ1 = z92.z1(arrayList);
        if (listZ1.isEmpty()) {
            return null;
        }
        Iterator it = listZ1.iterator();
        w63 w63Var = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                objNewInstance.getClass();
                w63 w63Var2 = (w63) objNewInstance;
                if (!w63Var2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (w63Var != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    w63Var = w63Var2;
                }
            } catch (Throwable unused) {
            }
        }
        return w63Var;
    }
}
