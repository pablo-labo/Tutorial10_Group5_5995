package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.g;
import defpackage.bo5;
import defpackage.hh2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    public static class C0032a {
        public Signature[] a(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static class b extends C0032a {
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.a.C0032a
        public final Signature[] a(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static g a(Context context) {
        ProviderInfo providerInfo;
        bo5 bo5Var;
        ApplicationInfo applicationInfo;
        C0032a cVar = Build.VERSION.SDK_INT >= 28 ? new c() : new b();
        PackageManager packageManager = context.getPackageManager();
        hh2.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            bo5Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrA = cVar.a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrA) {
                    arrayList.add(signature.toByteArray());
                }
                bo5Var = new bo5(str, Collections.singletonList(arrayList), str2, "emojicompat-emoji-font");
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                bo5Var = null;
            }
        }
        if (bo5Var == null) {
            return null;
        }
        return new g(new g.b(context, bo5Var));
    }
}
