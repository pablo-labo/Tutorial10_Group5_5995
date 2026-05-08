package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.canhub.cropper.CropImageActivity;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j73 {
    public final CropImageActivity a;
    public final gga b;
    public String c;
    public List<String> d;
    public Uri e;
    public final e9 f;

    public j73(CropImageActivity cropImageActivity, gga ggaVar) {
        this.a = cropImageActivity;
        this.b = ggaVar;
        String string = cropImageActivity.getString(R.string.pick_image_chooser_title);
        string.getClass();
        this.c = string;
        this.d = u63.a0("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f = (e9) cropImageActivity.t(new w8(), new i73(this, 0));
    }

    public final ArrayList a(PackageManager packageManager, String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Intent intent = str.equals("android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.d) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (wl7.b(((Intent) next).getPackage(), str2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) next;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r11, boolean r12, android.net.Uri r13) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j73.b(boolean, boolean, android.net.Uri):void");
    }
}
