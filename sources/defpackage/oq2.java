package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.datadog.android.core.internal.CoreFeature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.recaptchabase.InitRequest;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class oq2 implements hna, n6d, n0d, OnTokenCanceledListener {
    public final /* synthetic */ int a;
    public final Object b;

    public oq2(Context context) {
        this.a = 3;
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public static void a(ll6 ll6Var, rbe rbeVar) {
        String str = rbeVar.a;
        if (str != null) {
            ll6Var.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        ll6Var.c("X-CRASHLYTICS-API-CLIENT-TYPE", CoreFeature.DEFAULT_SOURCE_NAME);
        ll6Var.c("X-CRASHLYTICS-API-CLIENT-VERSION", "18.6.3");
        ll6Var.c("Accept", "application/json");
        ll6Var.c("X-CRASHLYTICS-DEVICE-MODEL", rbeVar.b);
        String str2 = rbeVar.c;
        if (str2 != null) {
            ll6Var.c("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = rbeVar.d;
        if (str3 != null) {
            ll6Var.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = rbeVar.e.b().a;
        if (str4 != null) {
            ll6Var.c("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static HashMap c(rbe rbeVar) {
        HashMap map = new HashMap();
        map.put("build_version", rbeVar.h);
        map.put("display_version", rbeVar.g);
        map.put("source", Integer.toString(rbeVar.i));
        String str = rbeVar.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n0d
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 4:
                kdh kdhVar = new kdh((TaskCompletionSource) obj2);
                adh adhVar = (adh) ((mdh) obj).i();
                Parcel parcelC = adhVar.c();
                int i2 = rdh.a;
                parcelC.writeStrongBinder(kdhVar);
                rdh.c(parcelC, (GetSignInIntentRequest) obj3);
                adhVar.e(parcelC, 3);
                break;
            default:
                vf0 vf0Var = wfi.k;
                fdi fdiVar = new fdi((TaskCompletionSource) obj2);
                exh exhVar = (exh) ((ehi) obj).i();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i3 = qoh.a;
                parcelObtain.writeStrongBinder(fdiVar);
                parcelObtain.writeInt(1);
                ((InitRequest) obj3).writeToParcel(parcelObtain, 0);
                exhVar.c(parcelObtain, 1);
                break;
        }
    }

    @Override // defpackage.hna
    public Object b() {
        Class cls = (Class) this.b;
        try {
            return d7g.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    public Boolean d() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.n6d
    public Object e(InputStream inputStream) throws IOException {
        try {
            return new JSONObject(((ee3) this.b).e(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public JSONObject f(wo5 wo5Var) {
        String str = (String) this.b;
        int i = wo5Var.a;
        cr8 cr8Var = cr8.c;
        cr8Var.J("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String strC = v40.c(i, "Settings request failed; (status: ", ") from ", str);
            if (cr8Var.i(6)) {
                Log.e("FirebaseCrashlytics", strC, null);
            }
            return null;
        }
        String str2 = (String) wo5Var.b;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            cr8Var.K(e, "Failed to parse settings JSON from ".concat(str));
            cr8Var.K(null, "Settings response " + str2);
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        try {
            ((dn6) this.b).cancel();
        } catch (RemoteException unused) {
        }
    }

    public /* synthetic */ oq2(ldh ldhVar, GetSignInIntentRequest getSignInIntentRequest) {
        this.a = 4;
        this.b = getSignInIntentRequest;
    }

    public oq2() {
        this.a = 2;
        this.b = new ee3(29);
    }

    public /* synthetic */ oq2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public oq2(String str, ygg yggVar) {
        this.a = 1;
        this.b = str;
    }
}
