package defpackage;

import android.content.res.Resources;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.media3.common.a;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes.dex */
public final class nfa implements ypf, n0d {
    public final /* synthetic */ int a;
    public Object b;

    public nfa(Resources resources) {
        this.a = 1;
        resources.getClass();
        this.b = resources;
    }

    public static String d(n95 n95Var, boolean z) {
        String str = n95Var.extension;
        if (z) {
            new StringBuilder(".temp").append(str);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // defpackage.ypf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(androidx.media3.common.a r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.a(androidx.media3.common.a):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n0d
    public void accept(Object obj, Object obj2) {
        Parcel parcelObtain;
        switch (this.a) {
            case 4:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                vf0 vf0Var = dch.k;
                ubh ubhVar = (ubh) ((hch) obj).i();
                TelemetryData telemetryData = (TelemetryData) this.b;
                parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(ubhVar.b);
                int i = hah.a;
                if (telemetryData == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    telemetryData.writeToParcel(parcelObtain, 0);
                }
                try {
                    ubhVar.a.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } finally {
                    parcelObtain.recycle();
                }
            default:
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) this.b;
                axh axhVar = new axh((TaskCompletionSource) obj2);
                ali aliVar = (ali) ((wji) obj).i();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(aliVar.b);
                int i2 = loh.a;
                parcelObtain2.writeStrongBinder(axhVar);
                parcelObtain2.writeInt(1);
                publicKeyCredentialCreationOptions.writeToParcel(parcelObtain2, 0);
                parcelObtain = Parcel.obtain();
                try {
                    aliVar.a.transact(1, parcelObtain2, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcelObtain2.recycle();
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(androidx.media3.common.a r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.d
            java.lang.String r1 = r8.b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L2b
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L2b
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            java.lang.String r2 = defpackage.vjg.a
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L2d
        L2b:
            r0 = r3
            goto L4e
        L2d:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L4e
        L4e:
            java.lang.String r8 = r7.c(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r7 = r7.e(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L68
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L67
            r1 = r3
        L67:
            r7 = r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.b(androidx.media3.common.a):java.lang.String");
    }

    public String c(a aVar) {
        Resources resources = (Resources) this.b;
        int i = aVar.f;
        int i2 = aVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = e(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = e(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? e(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public String e(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return (String) this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ nfa(t85 t85Var, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.a = 5;
        this.b = publicKeyCredentialCreationOptions;
    }

    public /* synthetic */ nfa(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
