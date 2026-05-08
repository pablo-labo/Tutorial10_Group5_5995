package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import defpackage.h8b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class n8b implements ui7, h8b, tv8 {
    public final Context a;
    public i8 b;
    public boolean c;
    public l8b d;
    public String[] e;
    public final LinkedList f;
    public j8b g;
    public SharedPreferences h;

    public n8b(Context context) {
        context.getClass();
        this.a = context;
        this.f = new LinkedList();
    }

    @Override // defpackage.h8b
    public final void a(final h8b.b bVar, final String... strArr) {
        b(new j8b() { // from class: k8b
            @Override // defpackage.j8b
            public final void a(HashMap map) {
                String[] strArr2 = strArr;
                this.a.h(bVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
            }
        }, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.h8b
    public final void b(j8b j8bVar, String... strArr) {
        if (strArr.length == 0) {
            j8bVar.a(new LinkedHashMap());
            return;
        }
        if (!ut0.f0("android.permission.WRITE_SETTINGS", strArr)) {
            k(j8bVar, strArr);
            return;
        }
        ArrayList arrayListH0 = ut0.H0(strArr);
        arrayListH0.remove("android.permission.WRITE_SETTINGS");
        String[] strArr2 = (String[]) arrayListH0.toArray(new String[0]);
        l8b l8bVar = new l8b(this, j8bVar);
        Context context = this.a;
        if (Settings.System.canWrite(context.getApplicationContext())) {
            if (strArr2.length == 0) {
                l8bVar.a(new LinkedHashMap());
                return;
            } else {
                k(l8bVar, strArr2);
                return;
            }
        }
        if (this.d != null) {
            r6.g("Another permissions request is in progress. Await the old request and then try again.");
            return;
        }
        this.d = l8bVar;
        this.e = strArr2;
        j(new String[]{"android.permission.WRITE_SETTINGS"});
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        intent.addFlags(268435456);
        this.c = true;
        context.startActivity(intent);
    }

    @Override // defpackage.h8b
    public final boolean c(String... strArr) {
        for (String str : strArr) {
            if (!m(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.h8b
    public final void d(j8b j8bVar, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(m(str) ? 0 : -1));
        }
        j8bVar.a(n(strArr, z92.y1(arrayList)));
    }

    @Override // defpackage.ui7
    public final List<Class<? extends Object>> f() {
        return u63.Z(h8b.class);
    }

    @Override // defpackage.oyc
    public final void g(ey9 ey9Var) {
        HashMap map = ey9Var.a;
        i8 i8Var = (i8) map.get(i8.class);
        if (i8Var == null) {
            r6.g("Couldn't find implementation for ActivityProvider.");
            return;
        }
        this.b = i8Var;
        ((l0g) map.get(l0g.class)).a(this);
        this.h = this.a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
    }

    @Override // defpackage.h8b
    public final void h(final q3c q3cVar, String... strArr) {
        d(new j8b() { // from class: m8b
            @Override // defpackage.j8b
            public final void a(HashMap map) {
                boolean z;
                boolean z2;
                boolean zIsEmpty = map.isEmpty();
                o8b o8bVar = o8b.GRANTED;
                boolean z3 = false;
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
                q3cVar.a(bundleE);
            }
        }, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void j(String[] strArr) {
        SharedPreferences sharedPreferences = this.h;
        if (sharedPreferences == null) {
            wl7.g("mAskedPermissionsCache");
            throw null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str, true);
        }
        editorEdit.apply();
    }

    public final void k(j8b j8bVar, String[] strArr) {
        strArr.getClass();
        j8bVar.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        j(strArr2);
        i8 i8Var = this.b;
        ComponentCallbacks2 componentCallbacks2B = i8Var != null ? i8Var.b() : null;
        if (!(componentCallbacks2B instanceof f8b)) {
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = -1;
            }
            j8bVar.a(n(strArr2, iArr));
            return;
        }
        synchronized (this) {
            try {
                if (this.g != null) {
                    this.f.add(new Pair(strArr2, j8bVar));
                } else {
                    this.g = j8bVar;
                    ((f8b) componentCallbacks2B).x(strArr2, 13, new vh6(this, 8));
                    j6g j6gVar = j6g.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i8b l(int i, String str) {
        o8b o8bVar;
        Activity activityB;
        o8b o8bVar2 = o8b.DENIED;
        boolean z = false;
        if (i == 0) {
            o8bVar = o8b.GRANTED;
        } else {
            SharedPreferences sharedPreferences = this.h;
            if (sharedPreferences == null) {
                wl7.g("mAskedPermissionsCache");
                throw null;
            }
            o8bVar = sharedPreferences.getBoolean(str, false) ? o8bVar2 : o8b.UNDETERMINED;
        }
        boolean z2 = true;
        if (o8bVar == o8bVar2) {
            i8 i8Var = this.b;
            if (i8Var != null && (activityB = i8Var.b()) != null && w7.c(activityB, str)) {
                z = true;
            }
            z2 = z;
        }
        return new i8b(o8bVar, z2);
    }

    public final boolean m(String str) {
        int iA;
        Activity activityB;
        boolean zB = wl7.b(str, "android.permission.WRITE_SETTINGS");
        Context context = this.a;
        if (zB) {
            return Settings.System.canWrite(context.getApplicationContext());
        }
        i8 i8Var = this.b;
        if (i8Var == null || (activityB = i8Var.b()) == null || !(activityB instanceof f8b)) {
            str.getClass();
            iA = ot2.a(context, str);
        } else {
            iA = ot2.a(activityB, str);
        }
        return iA == 0;
    }

    public final HashMap n(String[] strArr, int[] iArr) {
        HashMap map = new HashMap();
        iArr.getClass();
        strArr.getClass();
        int iMin = Math.min(iArr.length, strArr.length);
        ArrayList<Pair> arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            int i2 = iArr[i];
            arrayList.add(new Pair(Integer.valueOf(i2), strArr[i]));
        }
        for (Pair pair : arrayList) {
            int iIntValue = ((Number) pair.a()).intValue();
            String str = (String) pair.b();
            map.put(str, l(iIntValue, str));
        }
        return map;
    }

    @Override // defpackage.tv8
    public final void onHostResume() {
        if (this.c) {
            this.c = false;
            l8b l8bVar = this.d;
            l8bVar.getClass();
            String[] strArr = this.e;
            strArr.getClass();
            this.d = null;
            this.e = null;
            if (strArr.length == 0) {
                l8bVar.a(new LinkedHashMap());
            } else {
                k(l8bVar, strArr);
            }
        }
    }
}
