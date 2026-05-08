package defpackage;

import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import androidx.credentials.playservices.HiddenActivity;
import androidx.fragment.app.g;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.k;
import androidx.media3.session.l;
import com.google.android.gms.tasks.OnSuccessListener;
import com.indeed.android.jobsearch.LaunchActivity;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.v20;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk3 implements lz8.a, OnSuccessListener, n8, k.c, g8b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tk3(v20.a aVar, PlaybackException playbackException) {
        this.a = 0;
        this.b = playbackException;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        int i = this.a;
        boolean z = true;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Map map = (Map) obj;
                int i2 = LaunchActivity.e1;
                map.getClass();
                Set setEntrySet = map.entrySet();
                if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                        }
                    }
                    z = false;
                }
                GeolocationPermissions.Callback callback = launchActivity.c1;
                if (callback != null) {
                    callback.invoke(launchActivity.b1, z, false);
                }
                launchActivity.b1 = null;
                launchActivity.c1 = null;
                if (!z) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("LaunchActivity", "locationPermissionsRequestLauncher -> permissions denied.", false, null);
                } else {
                    ArrayList arrayList2 = lz2.a;
                    lz2.d("LaunchActivity", "locationPermissionsRequestLauncher -> permissions granted.", false, null);
                }
                break;
            default:
                l8c l8cVar = (l8c) obj2;
                Boolean bool = (Boolean) obj;
                int i3 = l8c.r0;
                bool.getClass();
                ((gme) l8cVar.o0).setValue(Boolean.FALSE);
                l8cVar.D();
                if (!bool.booleanValue()) {
                    Integer numC = ((kq7) cr8.p(kq7.class)).c("PushPrimer", 0, "PushNotificationDenyCount");
                    ((kq7) cr8.p(kq7.class)).a((numC != null ? numC.intValue() : 0) + 1, "PushPrimer", "PushNotificationDenyCount");
                    l8cVar.P(false);
                } else {
                    g activity = l8cVar.getActivity();
                    if (activity != null) {
                        ((e1g) cr8.p(e1g.class)).a(activity);
                    }
                    l8cVar.P(true);
                }
                break;
        }
    }

    @Override // androidx.media3.session.k.c
    public void h(androidx.media3.session.g gVar, int i) {
        gVar.G(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((v20) obj).g((PlaybackException) obj2);
                break;
            default:
                ((gdb.c) obj).p0(((l.c) obj2).c);
                break;
        }
    }

    @Override // defpackage.g8b
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionRequest permissionRequest;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        GeolocationPermissions.Callback callback;
        String str;
        vbc vbcVar = (vbc) this.b;
        ArrayList arrayList5 = vbcVar.X;
        vbcVar.W = false;
        boolean z = false;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            boolean z2 = iArr[i2] == 0;
            if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = vbcVar.f) != null && (str = vbcVar.V) != null) {
                if (z2) {
                    callback.invoke(str, true, false);
                } else {
                    callback.invoke(str, false, false);
                }
                vbcVar.f = null;
                vbcVar.V = null;
            }
            if (str2.equals("android.permission.RECORD_AUDIO")) {
                if (z2 && (arrayList4 = vbcVar.e) != null) {
                    arrayList4.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                z = true;
            }
            if (str2.equals("android.permission.CAMERA")) {
                if (z2 && (arrayList3 = vbcVar.e) != null) {
                    arrayList3.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                z = true;
            }
            if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                if (z2 && (arrayList2 = vbcVar.e) != null) {
                    arrayList2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                }
                z = true;
            }
        }
        if (z && (permissionRequest = vbcVar.d) != null && (arrayList = vbcVar.e) != null) {
            permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
            vbcVar.d = null;
            vbcVar.e = null;
        }
        if (arrayList5.isEmpty()) {
            return true;
        }
        vbcVar.a(arrayList5);
        return false;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        HiddenActivity.handleBeginSignIn$lambda$10$lambda$8((Function1) this.b, obj);
    }

    public /* synthetic */ tk3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
