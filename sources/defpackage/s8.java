package defpackage;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import defpackage.o8;
import defpackage.t8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends o8<cab, List<Uri>> {
    public final int a;

    public static final class a {
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public static int a() {
            int i = Build.VERSION.SDK_INT;
            if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
                return Integer.MAX_VALUE;
            }
            return MediaStore.getPickImagesMaxLimit();
        }
    }

    public s8(int i) {
        this.a = i;
        if (i > 1) {
            return;
        }
        l5.q("Max items must be higher than 1");
        throw null;
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        ((cab) obj).getClass();
        return null;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }
        return zr4.a;
    }

    @Override // defpackage.o8
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Intent a(Context context, cab cabVar) {
        cabVar.getClass();
        boolean zC = t8.a.c();
        int i = this.a;
        if (zC) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(t8.a.b(cabVar.a));
            int iMin = Math.min(i, cabVar.b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                l5.q("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                return null;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", cabVar.d.a());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", cabVar.c);
            return intent;
        }
        if (t8.a.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(t8.a.b(cabVar.a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = t8.a.a(context);
        if (resolveInfoA == null) {
            r6.g("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(t8.a.b(cabVar.a));
        int iMin2 = Math.min(i, cabVar.b);
        if (iMin2 <= 1) {
            l5.q("Max items must be greater than 1");
            return null;
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", cabVar.d.a());
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", cabVar.c);
        return intent3;
    }
}
