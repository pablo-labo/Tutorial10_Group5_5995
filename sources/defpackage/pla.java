package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pla {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean l;
    public rla m;
    public String n;
    public String p;
    public Bundle q;
    public String t;
    public final boolean v;
    public final Notification w;

    @Deprecated
    public final ArrayList<String> x;
    public final ArrayList<mla> b = new ArrayList<>();
    public final ArrayList<t9b> c = new ArrayList<>();
    public final ArrayList<mla> d = new ArrayList<>();
    public boolean k = true;
    public boolean o = false;
    public int r = 0;
    public int s = 0;
    public int u = 0;

    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    public pla(Context context, String str) {
        Notification notification = new Notification();
        this.w = notification;
        this.a = context;
        this.t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.x = new ArrayList<>();
        this.v = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        String strB;
        sla slaVar = new sla(this);
        pla plaVar = slaVar.c;
        rla rlaVar = plaVar.m;
        if (rlaVar != null) {
            rlaVar.a(slaVar);
        }
        Notification notificationBuild = slaVar.b.build();
        if (rlaVar != null) {
            plaVar.m.getClass();
        }
        if (rlaVar != null && (bundle = notificationBuild.extras) != null && (strB = rlaVar.b()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strB);
        }
        return notificationBuild;
    }

    public final void c(int i, boolean z) {
        Notification notification = this.w;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void e(rla rlaVar) {
        if (this.m != rlaVar) {
            this.m = rlaVar;
            if (rlaVar == null || rlaVar.a == this) {
                return;
            }
            rlaVar.a = this;
            e(rlaVar);
        }
    }
}
