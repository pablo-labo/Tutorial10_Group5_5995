package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.eng;
import defpackage.gng;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(eng engVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        gng gngVarM = remoteActionCompat.a;
        if (engVar.h(1)) {
            gngVarM = engVar.m();
        }
        remoteActionCompat.a = (IconCompat) gngVarM;
        CharSequence charSequenceG = remoteActionCompat.b;
        if (engVar.h(2)) {
            charSequenceG = engVar.g();
        }
        remoteActionCompat.b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.c;
        if (engVar.h(3)) {
            charSequenceG2 = engVar.g();
        }
        remoteActionCompat.c = charSequenceG2;
        Parcelable parcelableK = remoteActionCompat.d;
        if (engVar.h(4)) {
            parcelableK = engVar.k();
        }
        remoteActionCompat.d = (PendingIntent) parcelableK;
        boolean zE = remoteActionCompat.e;
        if (engVar.h(5)) {
            zE = engVar.e();
        }
        remoteActionCompat.e = zE;
        boolean zE2 = remoteActionCompat.f;
        if (engVar.h(6)) {
            zE2 = engVar.e();
        }
        remoteActionCompat.f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, eng engVar) {
        engVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        engVar.n(1);
        engVar.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        engVar.n(2);
        engVar.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.c;
        engVar.n(3);
        engVar.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.d;
        engVar.n(4);
        engVar.t(pendingIntent);
        boolean z = remoteActionCompat.e;
        engVar.n(5);
        engVar.o(z);
        boolean z2 = remoteActionCompat.f;
        engVar.n(6);
        engVar.o(z2);
    }
}
