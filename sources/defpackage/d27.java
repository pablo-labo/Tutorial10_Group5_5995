package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import expo.modules.kotlin.exception.Exceptions$ReactContextLost;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d27 implements j8b {
    public final /* synthetic */ p3c a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ d27(p3c p3cVar, WeakReference weakReference, e27 e27Var) {
        this.a = p3cVar;
        this.b = weakReference;
    }

    @Override // defpackage.j8b
    public final void a(HashMap map) {
        boolean z;
        boolean z2;
        boolean zIsEmpty = map.isEmpty();
        boolean z3 = false;
        o8b o8bVar = o8b.GRANTED;
        if (zIsEmpty) {
            z = true;
        } else {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((i8b) ((Map.Entry) it.next()).getValue()).a != o8bVar) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        boolean zIsEmpty2 = map.isEmpty();
        o8b o8bVar2 = o8b.DENIED;
        if (zIsEmpty2) {
            z2 = false;
            break;
        }
        if (!map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (((i8b) ((Map.Entry) it2.next()).getValue()).a != o8bVar2) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (map.isEmpty()) {
            z3 = true;
        } else {
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                if (!((i8b) ((Map.Entry) it3.next()).getValue()).b) {
                    break;
                }
            }
            z3 = true;
        }
        Bundle bundleE = l6.e("expires", "never");
        bundleE.putString("status", z ? o8bVar.a() : z2 ? o8bVar2.a() : o8b.UNDETERMINED.a());
        bundleE.putBoolean("canAskAgain", z3);
        bundleE.putBoolean("granted", z);
        p3c p3cVar = this.a;
        if (z) {
            bundleE.putString("accessPrivileges", "all");
            p3cVar.resolve(bundleE);
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            bundleE.putString("accessPrivileges", "none");
            p3cVar.resolve(bundleE);
            return;
        }
        Context context = (Context) this.b.get();
        if (context == null) {
            p3cVar.g(new Exceptions$ReactContextLost());
            return;
        }
        if (ot2.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            bundleE.putBoolean("granted", true);
            bundleE.putBoolean("canAskAgain", true);
            bundleE.putString("status", o8bVar.a());
            bundleE.putString("accessPrivileges", "limited");
        } else {
            bundleE.putString("accessPrivileges", "none");
        }
        p3cVar.resolve(bundleE);
    }
}
