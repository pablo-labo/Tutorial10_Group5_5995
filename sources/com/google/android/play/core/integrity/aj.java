package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.d8h;
import defpackage.h7h;
import defpackage.i7h;
import defpackage.k8h;
import defpackage.l8h;
import defpackage.m8h;
import defpackage.pnb;
import defpackage.s8h;
import defpackage.y8h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class aj {
    final h7h a;
    private final s8h b;
    private final String c;
    private final Context d;
    private final at e;
    private final k f;

    public aj(Context context, s8h s8hVar, at atVar, k kVar) {
        s8h s8hVar2;
        this.c = context.getPackageName();
        this.b = s8hVar;
        this.e = atVar;
        this.f = kVar;
        this.d = context;
        s8h s8hVar3 = i7h.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (i7h.b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        this.a = new h7h(context, s8hVar, "IntegrityService", ak.a, new y8h() { // from class: com.google.android.play.core.integrity.ae
                            @Override // defpackage.y8h
                            public final Object a(IBinder iBinder) {
                                int i = l8h.k;
                                if (iBinder == null) {
                                    return null;
                                }
                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                return iInterfaceQueryLocalInterface instanceof m8h ? (m8h) iInterfaceQueryLocalInterface : new k8h(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                            }
                        });
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    s8hVar2 = s8hVar;
                    s8hVar3.c("Play Store package is not found.", new Object[0]);
                }
            } else {
                s8hVar3.c("Play Store package is disabled.", new Object[0]);
            }
            s8hVar2 = s8hVar;
        } catch (PackageManager.NameNotFoundException unused2) {
            s8hVar2 = s8hVar;
            s8hVar3.c("Play Store package is not found.", new Object[0]);
        }
        Object[] objArr = new Object[0];
        s8hVar2.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", s8h.d(s8hVar2.a, "Phonesky is not installed.", objArr));
        }
        this.a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d8h(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(pnb.k(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.b("requestAndShowDialog(%s, %s)", this.c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (i7h.a(this.d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            this.b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e) {
            return Tasks.forException(new IntegrityServiceException(-13, e));
        }
    }
}
