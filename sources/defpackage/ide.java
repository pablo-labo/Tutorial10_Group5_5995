package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ide {

    public static class a {
        public final Context a;
        public final Intent b;
        public String c;
        public ArrayList<Uri> d;

        public a(Context context) {
            Activity activity;
            context.getClass();
            this.a = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.b = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        public final void a() {
            ArrayList<Uri> arrayList = this.d;
            Intent intent = this.b;
            if (arrayList == null || arrayList.size() <= 1) {
                intent.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList2 = this.d;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    intent.removeExtra("android.intent.extra.STREAM");
                    intent.setClipData(null);
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    intent.putExtra("android.intent.extra.STREAM", this.d.get(0));
                    ide.a(intent, this.d);
                }
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", this.d);
                ide.a(intent, this.d);
            }
            this.a.startActivity(Intent.createChooser(intent, this.c));
        }
    }

    public static void a(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }
}
