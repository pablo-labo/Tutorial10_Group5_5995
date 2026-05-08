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
import defpackage.o8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t8 extends o8<cab, Uri> {

    public static final class a {
        public static ResolveInfo a(Context context) {
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public static String b(g gVar) {
            if (gVar instanceof d) {
                return "image/*";
            }
            if (gVar instanceof f) {
                return "video/*";
            }
            if ((gVar instanceof e) || (gVar instanceof c)) {
                return null;
            }
            l.g();
            return null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static boolean c() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                return true;
            }
            return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public static final a a = new a();

            @Override // t8.b
            public final int a() {
                return 0;
            }
        }

        /* JADX INFO: renamed from: t8$b$b, reason: collision with other inner class name */
        public static final class C0422b extends b {
            public static final C0422b a = new C0422b();
            public static final int b = 1;

            @Override // t8.b
            public final int a() {
                return b;
            }
        }

        public abstract int a();
    }

    public static final class c implements g {
        public static final c a = new c();
    }

    public static final class d implements g {
        public static final d a = new d();
    }

    public static final class e implements g {
    }

    public static final class f implements g {
        public static final f a = new f();
    }

    public interface g {
    }

    @Override // defpackage.o8
    public final o8.a b(Object obj, Context context) {
        ((cab) obj).getClass();
        return null;
    }

    @Override // defpackage.o8
    public final Object c(Intent intent, int i) {
        List arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            arrayList = zr4.a;
        } else {
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    Uri uri = clipData.getItemAt(i2).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            arrayList = new ArrayList(linkedHashSet);
        }
        return (Uri) z92.Q0(arrayList);
    }

    @Override // defpackage.o8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Intent a(Context context, cab cabVar) {
        cabVar.getClass();
        if (a.c()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(a.b(cabVar.a));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", cabVar.d.a());
            return intent;
        }
        if (a.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(a.b(cabVar.a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = a.a(context);
        if (resolveInfoA == null) {
            r6.g("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(a.b(cabVar.a));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", cabVar.d.a());
        return intent3;
    }
}
