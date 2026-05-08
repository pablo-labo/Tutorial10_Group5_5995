package com.microsoft.codepush.react;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import defpackage.b92;
import defpackage.c0h;
import defpackage.inc;
import defpackage.pbe;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements inc {
    public static final Object h = new Object();
    public static volatile b i = null;
    public static boolean j = false;
    public static boolean k = false;
    public static String l = null;
    public static String m = "https://mobile-app-backend.indeed.com/api/react-native-ota/";
    public static String n;
    public boolean a = false;
    public String b;
    public final e c;
    public final b92 d;
    public final pbe e;
    public final String f;
    public final Context g;

    public b(Context context) throws Throwable {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        e eVar = new e();
        eVar.a = absolutePath;
        this.c = eVar;
        b92 b92Var = new b92();
        b92Var.a = applicationContext.getSharedPreferences("CodePush", 0);
        this.d = b92Var;
        this.f = "xvIHL_pH9TC-LX5yY0iBv46xDmpQ9VREWSBdh";
        pbe pbeVar = new pbe();
        pbeVar.a = applicationContext.getSharedPreferences("CodePush", 0);
        this.e = pbeVar;
        if (l == null) {
            try {
                l = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                throw new CodePushUnknownException("Unable to get package info for " + this.g.getPackageName(), e);
            }
        }
        i = this;
        String strB = b("PublicKey");
        if (strB != null) {
            n = strB;
        }
        String strB2 = b("ServerUrl");
        if (strB2 != null) {
            m = strB2;
        }
        String str = l;
        eVar.b = applicationContext;
        eVar.c = str;
        d();
    }

    public static boolean e(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("binaryModifiedTime", null);
            Long lValueOf = strOptString != null ? Long.valueOf(Long.parseLong(strOptString)) : null;
            String strOptString2 = jSONObject.optString("appVersion", null);
            if (lValueOf != null && lValueOf.longValue() == 0) {
                if (l.equals(strOptString2)) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            a.a("Error in reading binary modified date from package metadata", e);
            return false;
        }
    }

    public final void a() {
        c0h.t(this.c.f());
        pbe pbeVar = this.e;
        pbeVar.a.edit().remove("CODE_PUSH_PENDING_UPDATE").commit();
        pbeVar.a.edit().remove("CODE_PUSH_FAILED_UPDATES").commit();
    }

    public final String b(String str) {
        Context context = this.g;
        int identifier = context.getResources().getIdentifier("CodePush".concat(str), "string", context.getPackageName());
        if (identifier == 0) {
            return null;
        }
        String string = context.getString(identifier);
        if (!string.isEmpty()) {
            return string;
        }
        g.h("Specified " + str + " is empty");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002e -> B:16:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(java.lang.String r7) {
        /*
            r6 = this;
            com.microsoft.codepush.react.e r0 = r6.c
            r6.b = r7
            java.lang.String r1 = "assets://"
            java.lang.String r7 = defpackage.l5.l(r1, r7)
            r1 = 0
            java.lang.String r2 = r6.b     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L2d
            java.lang.String r3 = r0.h()     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L2d
            if (r3 != 0) goto L14
            goto L1a
        L14:
            org.json.JSONObject r4 = r0.g()     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L2d
            if (r4 != 0) goto L1b
        L1a:
            goto L38
        L1b:
            java.lang.String r5 = "bundlePath"
            java.lang.String r4 = r4.optString(r5, r1)     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L2d
            if (r4 != 0) goto L28
            java.lang.String r2 = com.microsoft.codepush.react.g.a(r3, r2)     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L2d
            goto L39
        L28:
            java.lang.String r2 = com.microsoft.codepush.react.g.a(r3, r4)     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L2d
            goto L39
        L2d:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            com.microsoft.codepush.react.g.h(r2)
            r6.a()
        L38:
            r2 = r1
        L39:
            r3 = 1
            if (r2 != 0) goto L42
            com.microsoft.codepush.react.g.j(r7)
            com.microsoft.codepush.react.b.j = r3
            return r7
        L42:
            org.json.JSONObject r4 = r0.i()
            java.lang.String r5 = "currentPackage"
            java.lang.String r1 = r4.optString(r5, r1)
            java.lang.String r4 = "bootstrap"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L56
            com.microsoft.codepush.react.b.j = r3
        L56:
            org.json.JSONObject r0 = r0.g()
            boolean r0 = e(r0)
            r1 = 0
            if (r0 == 0) goto L67
            com.microsoft.codepush.react.g.j(r2)
            com.microsoft.codepush.react.b.j = r1
            return r2
        L67:
            r6.a = r1
            r6.a()
            com.microsoft.codepush.react.g.j(r7)
            com.microsoft.codepush.react.b.j = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.b.c(java.lang.String):java.lang.String");
    }

    @Override // defpackage.inc
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        CodePushNativeModule codePushNativeModule = new CodePushNativeModule(reactApplicationContext, this, this.c, this.d, this.e);
        CodePushDialog codePushDialog = new CodePushDialog(reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        arrayList.add(codePushNativeModule);
        arrayList.add(codePushDialog);
        return arrayList;
    }

    @Override // defpackage.inc
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (com.microsoft.codepush.react.b.l.equals(r3.optString("appVersion", null)) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() throws java.lang.Throwable {
        /*
            r6 = this;
            com.microsoft.codepush.react.e r0 = r6.c
            r1 = 0
            r6.a = r1
            pbe r1 = r6.e
            org.json.JSONObject r2 = r1.c()
            if (r2 == 0) goto L9f
            org.json.JSONObject r3 = r0.g()     // Catch: com.microsoft.codepush.react.CodePushMalformedDataException -> L98
            if (r3 == 0) goto L92
            boolean r4 = e(r3)
            r5 = 0
            if (r4 != 0) goto L29
            java.lang.String r4 = "appVersion"
            java.lang.String r3 = r3.optString(r4, r5)
            java.lang.String r4 = com.microsoft.codepush.react.b.l
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L29
            goto L92
        L29:
            java.lang.String r3 = "isLoading"
            boolean r3 = r2.getBoolean(r3)     // Catch: org.json.JSONException -> L8b
            r4 = 1
            if (r3 == 0) goto L7f
            java.lang.String r6 = "Update did not finish loading the last time, rolling back to a previous version."
            com.microsoft.codepush.react.g.h(r6)     // Catch: org.json.JSONException -> L8b
            com.microsoft.codepush.react.b.k = r4     // Catch: org.json.JSONException -> L8b
            org.json.JSONObject r6 = r0.g()     // Catch: org.json.JSONException -> L8b
            r1.f(r6)     // Catch: org.json.JSONException -> L8b
            org.json.JSONObject r6 = r0.i()     // Catch: org.json.JSONException -> L8b
            java.lang.String r2 = r0.h()     // Catch: org.json.JSONException -> L8b
            defpackage.c0h.t(r2)     // Catch: org.json.JSONException -> L8b
            java.lang.String r2 = "currentPackage"
            java.lang.String r3 = "previousPackage"
            java.lang.String r4 = r6.optString(r3, r5)     // Catch: org.json.JSONException -> L8b
            com.microsoft.codepush.react.g.k(r6, r2, r4)     // Catch: org.json.JSONException -> L8b
            com.microsoft.codepush.react.g.k(r6, r3, r5)     // Catch: org.json.JSONException -> L8b
            java.lang.String r0 = r0.f()     // Catch: java.io.IOException -> L76 org.json.JSONException -> L8b
            java.lang.String r2 = "codepush.json"
            java.lang.String r0 = com.microsoft.codepush.react.g.a(r0, r2)     // Catch: java.io.IOException -> L76 org.json.JSONException -> L8b
            com.microsoft.codepush.react.g.l(r6, r0)     // Catch: java.io.IOException -> L76 org.json.JSONException -> L8b
            android.content.SharedPreferences r6 = r1.a     // Catch: org.json.JSONException -> L8b
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: org.json.JSONException -> L8b
            java.lang.String r0 = "CODE_PUSH_PENDING_UPDATE"
            android.content.SharedPreferences$Editor r6 = r6.remove(r0)     // Catch: org.json.JSONException -> L8b
            r6.commit()     // Catch: org.json.JSONException -> L8b
            return
        L76:
            r6 = move-exception
            com.microsoft.codepush.react.CodePushUnknownException r0 = new com.microsoft.codepush.react.CodePushUnknownException     // Catch: org.json.JSONException -> L8b
            java.lang.String r1 = "Error updating current package info"
            r0.<init>(r1, r6)     // Catch: org.json.JSONException -> L8b
            throw r0     // Catch: org.json.JSONException -> L8b
        L7f:
            r6.a = r4     // Catch: org.json.JSONException -> L8b
            java.lang.String r6 = "hash"
            java.lang.String r6 = r2.getString(r6)     // Catch: org.json.JSONException -> L8b
            r1.g(r6, r4)     // Catch: org.json.JSONException -> L8b
            return
        L8b:
            r6 = move-exception
            java.lang.String r0 = "Unable to read pending update metadata stored in SharedPreferences"
            com.microsoft.codepush.react.a.a(r0, r6)
            return
        L92:
            java.lang.String r6 = "Skipping initializeUpdateAfterRestart(), binary version is newer"
            com.microsoft.codepush.react.g.h(r6)
            return
        L98:
            r0 = move-exception
            com.microsoft.codepush.react.g.i(r0)
            r6.a()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.codepush.react.b.d():void");
    }
}
